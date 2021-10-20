package edu.temple.imageactivity.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import edu.temple.imageactivity.R
import kotlinx.android.synthetic.main.activity_champion.*
import kotlinx.android.synthetic.main.fragmentdisplay.*
import kotlinx.android.synthetic.main.fragmentdisplay.imageView
import kotlinx.android.synthetic.main.fragmentdisplay.textView

class FragmentDisplay : Fragment(R.layout.fragmentdisplay) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragmentdisplay, container, false)
        val name = arguments?.getString("name")
        val img = arguments?.getInt("img")
        name?.let{
            var name: String = resources.getString(R.string.championDescription) + name
            textView.text = name
        }
        img?.let{
            imageView.setImageResource(img)
        }
        return v
    }
}