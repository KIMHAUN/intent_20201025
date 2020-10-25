package kr.co.neoplus.intent_20201025

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_data.*

class EditDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_data)

        okBtn.setOnClickListener {
            val inputData = newDataEdt.text.toString()

            //출발지, 목적지 x 데이터만 옮기는용
            val resultIntent = Intent()
            resultIntent.putExtra("newData", inputData)

            //확인 누른 거 맞아 resultIntent도 가지고 돌아가라.
            setResult(Activity.RESULT_OK, resultIntent)

            finish()
        }
    }
}