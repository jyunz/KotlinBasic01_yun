package com.example.kotlinbasic01_yun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickBtn.setOnClickListener {
//         이 중괄호 안에 있는 코드만 버튼이 눌렸을때 실행
            Log.d("메인화면","클릭용 버튼 눌림")
//            tag는 종류를 나눌때 씀.
            Log.e("메인화면로그","에러관련로그")
        }
    }
}