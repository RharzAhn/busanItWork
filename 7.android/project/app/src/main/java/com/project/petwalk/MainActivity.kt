package com.project.petwalk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.content.Intent
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.floatingActionButton as floatingActionButton1

class MainActivity : AppCompatActivity() {

    val posts: MutableList<Post> = mutableListOf()

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
       floatingActionButton1.setOnClickListener {
           //Intent 생성
           val intent = Intent(this@MainActivity, WriteActivity::class.java)
           //Intent 로 WriteActivity 실행
           startActivity(intent)
       }
//       ----------------------------------------------------------------------

       // RecyclerView 에 LayoutManager 설정
       val layoutManager = LinearLayoutManager(this@MainActivity)

       // 리싸이클러뷰의 아이템을 역순으로 정렬하게 함
       layoutManager.reverseLayout = true

       // 리싸이클러뷰의 아이템을 쌓는 순서를 끝부터 쌓게 함
       layoutManager.stackFromEnd = true

       recyclerView.layoutManager = layoutManager
//       recyclerView.adapter = WriteActivity.MyAdapter()


//       글 목록을 가져오는 부분 -----------------------------------------------

       // Firebase 에서 Post 데이터를 가져온 후 posts 변수에 저장
       FirebaseDatabase.getInstance().getReference("/Posts")
           .orderByChild("writeTime").addChildEventListener(object : ChildEventListener {
               // 글이 추가된 경우
               override fun onChildAdded(snapshot: DataSnapshot, previousChildName: String?) {
                   snapshot?.let { snapshot ->
                       // snapshot의 데이터를 Post 객체로 가져옴
                       val post = snapshot.getValue(Post::class.java)
                       post?.let {
                           // 새 글이 마지막 부분에 추가된 경우
                           if (previousChildName == null){
                               // 글 목록을 저장하는 변수에 post 객체 추가
                               posts.add(it)
                               // RecyclerView 의 adapter 에 글이 추가된 것을 알림
                               recyclerView.adapter?.notifyItemInserted(posts.size - 1)
                           } else {
                               // 글이 중간에 삽입된 경우 prevChildKey 로 한단계 앞의 데이터의 위치를 찾은 뒤 데이터를 추가한다.
                               val prevIndex = posts.map { it.postId }.indexOf(previousChildName)
                               posts.add(prevIndex + 1, post)
                               // RecyclerView 의 adapter 에 글이 추가된 것을 알림
                               recyclerView.adapter?.notifyItemInserted(prevIndex + 1)
                           }
                       }
                   }
               }
               // 글이 변경된 경우
               override fun onChildChanged(snapshot: DataSnapshot, previousChildName: String?) {
                   snapshot?.let { snapshot ->
                       //snapshot 의 데이터를 Post 객체로 가져옴
                       val post = snapshot.getValue(Post::class.java)
                       post?.let { post ->
                           // 글이 변경된 경우 글의 앞의 데이터 인덱스에 데이터를 변경한다.
                           val prevIndex = posts.map { it.postId }.indexOf(previousChildName)
                           posts[prevIndex + 1] = post
                           recyclerView.adapter?.notifyItemChanged(prevIndex + 1)
                       }
                   }
               }

               override fun onChildRemoved(snapshot: DataSnapshot) {
                   TODO("Not yet implemented")
               }

               override fun onChildMoved(snapshot: DataSnapshot, previousChildName: String?) {
                   TODO("Not yet implemented")
               }

               override fun onCancelled(error: DatabaseError) {
                   TODO("Not yet implemented")
               }

           })



//       --------------------------------------------------------------

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