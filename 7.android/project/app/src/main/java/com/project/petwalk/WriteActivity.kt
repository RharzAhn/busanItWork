package com.project.petwalk

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ServerValue
import com.google.firebase.database.ServerValue.TIMESTAMP
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_write.*
import kotlinx.android.synthetic.main.card_background.view.*
import java.sql.Types.TIMESTAMP
import java.text.SimpleDateFormat
import java.util.*

class WriteActivity : AppCompatActivity() {
//    배경 리스트 데이터
//    res/drawable 디렉토리에 있는 배경 이미지를 uri 주소로 사용한다.
//    uri 주소로 사용하면 추후 웹에 있는 이미지 URL 도 바로 사용이 가능하다.
    val bgList = mutableListOf(
    "android.resource://com.project.petwalk/drawable/default_bg",
    "android.resource://com.project.petwalk/drawable/bg2",
    "android.resource://com.project.petwalk/drawable/bg3",
    "android.resource://com.project.petwalk/drawable/bg4",
    "android.resource://com.project.petwalk/drawable/bg5",
    "android.resource://com.project.petwalk/drawable/bg6",
    "android.resource://com.project.petwalk/drawable/bg7",
    "android.resource://com.project.petwalk/drawable/bg8",
    "android.resource://com.project.petwalk/drawable/bg9"
    )

//    현재 선택된 배경이미지의 포지션을 저장하는 변수
    var currentBgPosition = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_write)

        // actionbar 의 타이틀을 "글쓰기"로 변경
        supportActionBar?.title = "글쓰기"

        // recyclerView 에서 사용할 레이아웃 매니저를 생성한다.
        val layoutManager = LinearLayoutManager(this@WriteActivity)
        // recyclerView 를 횡으로 스크롤 할것이므로 layManager 의 방향을 HORIZONTAL로 설정한다.
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL

        // recyclerView 에 레이아웃 매니저를 방금 생성한 layoutManager 로 설정한다.
        recyclerView.layoutManager = layoutManager
        // recyclerView 에 adapter 를 설정한다.
        recyclerView.adapter = MyAdapter()

        // 공유하기 버튼이 클릭된 경우에 이벤트리스너를 설정한다.
        sendButton.setOnClickListener {
            // 메세지가 없는 경우 토스트 메세지로 알림.
            if(TextUtils.isEmpty(input.text)){
                Toast.makeText(applicationContext, "메세지를 입력하세요.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            // Post 객체 생성
            val post = Post()
            // Firebase 의 Posts 참조에서 객체를 저장하기 위한 새로운 키를 생성하고 참조를 newRef 에 저장
            val newRef = FirebaseDatabase.getInstance().getReference("Posts").push()
            // 글이 쓰여진 시간은 Firebase 서버의 시간으로 설정
            val time = System.currentTimeMillis()
            val dateFormat = SimpleDateFormat("yyyy-MM-dd hh:mm")
            val curTime = dateFormat.format(Date(time)).toString()

            post.writeTime = curTime
            //post.writeTime = SimpleDateFormat("yyyy-MM-dd hh:mm")
            // 배경 Uri 주소를 현재 선택된 배경의 주소로 할당
            post.bgUri = bgList[currentBgPosition]
            // 메세지는 input EditText 의 텍스트 내용을 할당
            post.message = input.text.toString()
            // 글쓴 사람의 ID 는 디바이스의 아이디로 할당
            post.writerId = getMyId()
            // 글의 ID 는 새로 생성된 파이어베이스 참조의 키로 할당
            post.postId = newRef.key.toString()
            // Post 객체를 새로 생성한 참조에 저장
            newRef.setValue(post)
            // 저장성공 토스트 알림을 보여주고 Activity 종료
            Toast.makeText(applicationContext, "공유되었습니다", Toast.LENGTH_SHORT).show()
            finish()
        }
    }

    // 디바이스의 ID 를 반환하는 메소드
    // 글쓴 사람의 ID 를 인식합니다
    fun getMyId(): String {
        return Settings.Secure.getString(this.contentResolver, Settings.Secure.ANDROID_ID)
    }

    // RecyclerView 에서 사용하는 View 홀더 클래스
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView = itemView.imageView
    }

    // RecyclerView 의 어댑터 클래스
    inner class MyAdapter : RecyclerView.Adapter<MyViewHolder>(){
        // RecyclerView 에서 각 Row(행)dptj rmflf ViewHoler 를 생성할때 불리는 메소드
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            //RecyclerView 에서 사용하는 ViewHolder 클래스를 card_background 레이아웃 리소스 파일을 사용하도록 생성한다.
            return MyViewHolder(LayoutInflater.from(this@WriteActivity).inflate(R.layout.card_background,parent,false))
        }

    // 각 행의 포지션에서 그려야할 ViewHolder UI 에 데이터를 적용하는 메소드
        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            // 이미지 로딩 라이브러리인 피카소 객체로 뷰홀더에 존재하는 imageView 에 이미지 로딩
            Picasso.get()
                .load(Uri.parse(bgList[position]))
                .fit()
                .centerCrop()
                .into(holder.imageView)

            // 각 배경화면 행이 클릭된 경우에 이벤트 리스너 설정
            holder.imageView.setOnClickListener{
                // 이미지 로딩 라이브러리인 피카소 객체에 뷰홀더에 존재하는 글쓰기 배경 이미지뷰에 이미지 로딩
                Picasso.get()
                    .load(Uri.parse(bgList[position]))
                    .fit()
                    .centerCrop()
                    .into(writeBackground)
            }
        }
        //        RecyclerView 에서 몇개의 행을 그릴지 기준이 되는 메소드
        override fun getItemCount(): Int {
            //
            return bgList.size
        }

    }

    }
