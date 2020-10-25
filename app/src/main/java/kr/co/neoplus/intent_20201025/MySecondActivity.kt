package kr.co.neoplus.intent_20201025

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_second.*

class MySecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_second)

//        들어올 때 첨부한 데이터를 다시 받아내자. => 변수에 저장.
        val message = intent.getStringExtra("content")

//        받아낸 데이터를 텍스트뷰에 반영
        messageTxt.text = message
    }
}