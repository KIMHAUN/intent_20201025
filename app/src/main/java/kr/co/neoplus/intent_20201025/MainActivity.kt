package kr.co.neoplus.intent_20201025

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    클래스 정의부분 바로 밑에 적는 변수 : 멤버변수
//    function 안에서 적는 변수 : 지역변수(로컬변수)

//    1000 숫자만으로는 의미 파악 x. 1000을 변수에 담아서 의미를 이해할 수 있게 돕자.
    val REQ_FOR_DATA = 1000


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveToOtherActivityBtn.setOnClickListener {
//            다른 화면(MyFirstActivity) 으로 이동
            val myIntent = Intent(this, MyFirstActivity::class.java)
            startActivity(myIntent)
        }

        sendDataBtn.setOnClickListener {
//            다른 화면(MySecondActivity)로 이동.
//            가는길에 데이터(입력한 내용)를 들고 이동
//            편도티켓

            val inputContent = contentEdt.text.toString()
            //여행 티켓
            val myIntent = Intent(this, MySecondActivity::class.java)
            //짐을 들게해줌
            myIntent.putExtra("content", inputContent);

            //실제 탑승
            startActivity(myIntent)
        }

//        문구 변경 버튼
        changeTextBtn.setOnClickListener {
            val myIntent = Intent(this, EditDataActivity::class.java)
//            왕복티켓
            startActivityForResult(myIntent, REQ_FOR_DATA)




        }
    }
}