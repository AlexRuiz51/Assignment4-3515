package edu.temple.imageactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_champion.*

class ChampionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_champion)

        val intent: Intent = intent
        var image:Int = intent.getIntExtra("image", 0)
        var name: String = resources.getString(R.string.championDescription) + intent.getStringExtra("name")!!
        imageView.setImageResource(image)
        textView.text = name
    }
}