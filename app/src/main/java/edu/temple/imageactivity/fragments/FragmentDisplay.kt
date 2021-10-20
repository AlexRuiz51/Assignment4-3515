package edu.temple.imageactivity.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import edu.temple.imageactivity.R

class FragmentDisplay : Fragment(R.layout.fragmentdisplay) {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val champN = this.arguments?.getString("name");
        val champImg = this.arguments?.getInt("img");
    }
}