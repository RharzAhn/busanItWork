package com.project.petwalk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // 로그에 TAG로 사용할 문자열
    val TAG = "MainActivity"

    // 파이어베이스의 test 키를 가진 데이터의 참조 객체를 가져온다.
    var ref = FirebaseDatabase.getInstance().getReference("test")

   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//       플로팅버튼으로 WriteActivity로 이동-----------------------------------------

       // actionbar 의 타이틀을 "글목록" 으로 변경
       supportActionBar?.title = "글목록"

       // 하단의 floatingActionButton 이 클릭될때의 리스너를 설정한다.
       floatingActionButton.setOnClickListener {
           //Intent 생성
           val intent = Intent(this@MainActivity, WriteActivity::class.java)
           //Intent 로 WriteActivity 실행
           startActivity(intent)
       }
//       ----------------------------------------------------------------------

       // 값의 변경이 있는 경우의 이벤트 리스너를 추가한다.
       ref.addValueEventListener(object:ValueEventListener{
           // 데이터 읽기가 취소된 경우 호출된다.
           // ex) 데이터의 권한이 없는 경우
           override fun onCancelled(error: DatabaseError) {
               error.toException().printStackTrace()
           }
           // 데이터 변경이 감지 되면 호출된다.
           override fun onDataChange(snapshot: DataSnapshot) {
               // test 키를 가진 데이터 스냅샷에서 값을 읽고 문자열로 변경한다.
               val message = snapshot.value.toString()
               // 읽은 문자열을 로깅
               Log.d(TAG, message)
               // Firebase 에서 전달받은 메세지로 제목을 변경한다.
               supportActionBar?.title = message
           }
       })
    }
}