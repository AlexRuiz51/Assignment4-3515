package edu.temple.imageactivity.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import edu.temple.imageactivity.R

class FragmentSelect : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v =  inflater.inflate(R.layout.fragmentselect, container, false)

        val context = activity as AppCompatActivity
        val card: CardView = v.findViewById(R.id.cElise)

        card.setOnClickListener {
            val bundle = Bundle()
            val champName = R.string.championElise
            val champImg = R.drawable.elise
            bundle.putString("name", champName.toString())
            bundle.putInt("img", champImg)
            val fragment = FragmentDisplay()
            fragment.arguments = bundle
            context.replaceFragment(fragment)
        }
        return v
    }
}

private fun AppCompatActivity.replaceFragment(fragment: FragmentDisplay) {
    val fragmentManager = supportFragmentManager
    val transaction = fragmentManager.beginTransaction()
    transaction.replace(R.id.fragmentContainer, fragment)
    transaction.addToBackStack(null)
    transaction.commit()
}