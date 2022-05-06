package com.example.project14

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts
import com.example.project14.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val requestGalleryLauncher=registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ) {
            try {
                val calRatio = calculateInSamplesize(
                    it.data!!.data!!,
                    resources.getDimensionPixelSize(R.dimen.imgSize),
                    resources.getDimensionPixelSize(R.dimen.imgSize)
                )
                val option = BitmapFactory.Options()
                option.inSampleSize = calRatio

                var inputStream = contentResolver.openInputStream(it.data!!.data!!)
                val bitmap = BitmapFactory.decodeStream(inputStream, null, option)
                inputStream!!.close()
                inputStream = null
                bitmap?.let {
                    binding.imageView.setImageBitmap(bitmap)
                } ?: let {
                    //널이면? 이라는뜻. 널일시 로그만 하나 찍어준다.
                    Log.d("pgm", "bitmap null")
                }

            }catch (e:Exception){
                e.printStackTrace()
            }
        }
        binding.galleryButton.setOnClickListener {
            val intent= Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            intent.type="image/*"
            requestGalleryLauncher.launch(intent)
        }

    }
    private fun calculateInSamplesize(fileUri:Uri,reqWidth:Int,reqHeight:Int):Int{
        val options= BitmapFactory.Options()
        options.inJustDecodeBounds=true
        try {
            var inputStream=contentResolver.openInputStream(fileUri)
            BitmapFactory.decodeStream(inputStream, null, options)
            inputStream!!.close() //느낌표두개는 널을 허용하지 않겠다는 뜻
            inputStream=null
        }catch (e:Exception){
            e.printStackTrace()

        }
        val(height:Int, width:Int)=options.run { outHeight to outWidth }
        var inSampleSize=1

        if(height > reqHeight || width > reqWidth){
            val halHeight:Int=height/2
            val halfWidth:Int=width/2
            while (halHeight/inSampleSize >= reqHeight && halfWidth/inSampleSize >= reqWidth){
                inSampleSize *=2
            }
        }
        return inSampleSize
    }
}