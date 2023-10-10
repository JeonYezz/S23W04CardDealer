package kr.ac.kumoh.s20201023.s23w04carddealer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.s20201023.s23w04carddealer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var main: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        main = ActivityMainBinding.inflate(layoutInflater)
        setContentView(main.root)
        // 여기까지 하면 xml 파일에서 지정한 카드 이미지가 출력될텐데

        main.imgCard1.setImageResource(R.drawable.c_2_of_hearts)
        // 이 줄을 추가해줘서 이 카드 이미지가 나오는거다!
    }
}