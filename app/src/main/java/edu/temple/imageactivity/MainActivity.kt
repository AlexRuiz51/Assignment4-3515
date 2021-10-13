package edu.temple.imageactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onClickListener()
    }
    fun onClickListener(){
        cElise.setOnClickListener{
            startActivity(Intent(this, ChampionActivity::class.java).putExtra("name", resources.getString(R.string.championElise)).putExtra("image",R.drawable.elise))
        }
        cEvelynn.setOnClickListener{
            startActivity(Intent(this, ChampionActivity::class.java).putExtra("name", resources.getString(R.string.championEvelynn)).putExtra("image",R.drawable.evelynn))
        }
        cKayn.setOnClickListener{
            startActivity(Intent(this, ChampionActivity::class.java).putExtra("name", resources.getString(R.string.championKayn)).putExtra("image",R.drawable.kayn))
        }
        cKhazix.setOnClickListener{
            startActivity(Intent(this, ChampionActivity::class.java).putExtra("name", resources.getString(R.string.championKhaZix)).putExtra("image",R.drawable.khazix))
        }
        cNunuWill.setOnClickListener{
            startActivity(Intent(this, ChampionActivity::class.java).putExtra("name", resources.getString(R.string.championNunuandWillump)).putExtra("image",R.drawable.nunuwill))
        }
        cRammus.setOnClickListener{
            startActivity(Intent(this, ChampionActivity::class.java).putExtra("name", resources.getString(R.string.championRammus)).putExtra("image",R.drawable.rammus))
        }
        cRengar.setOnClickListener{
            startActivity(Intent(this, ChampionActivity::class.java).putExtra("name", resources.getString(R.string.championRengar)).putExtra("image",R.drawable.rengar))
        }
        cShen.setOnClickListener{
            startActivity(Intent(this, ChampionActivity::class.java).putExtra("name", resources.getString(R.string.championShen)).putExtra("image",R.drawable.shen))
        }
        cSwain.setOnClickListener{
            startActivity(Intent(this, ChampionActivity::class.java).putExtra("name", resources.getString(R.string.championSwain)).putExtra("image",R.drawable.swain))
        }
        cWarwick.setOnClickListener{
            startActivity(Intent(this, ChampionActivity::class.java).putExtra("name", resources.getString(R.string.championWarwick)).putExtra("image",R.drawable.warwick))
        }
    }
}