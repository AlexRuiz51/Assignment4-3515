package edu.temple.imageactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import edu.temple.imageactivity.databinding.ActivityMainBinding
import edu.temple.imageactivity.fragments.FragmentDisplay
import edu.temple.imageactivity.fragments.FragmentSelect

class MainActivity : AppCompatActivity(), DataPass {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(FragmentSelect())
        /*LEGACY
        setContentView(R.layout.activity_main)*/
        //onClickListener()
    }
    private fun replaceFragment(fragment : Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }
    fun onClickListener(){
        //cElise.setOnClickListener{
            //startActivity(Intent(this, ChampionActivity::class.java).putExtra("name", resources.getString(R.string.championElise)).putExtra("image",R.drawable.elise))
        //}
    }

    override fun passInfo(cName: String, image: Int) {

    }
}