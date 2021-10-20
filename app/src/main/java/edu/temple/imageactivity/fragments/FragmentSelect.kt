package edu.temple.imageactivity.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer
import edu.temple.imageactivity.Communicator
import edu.temple.imageactivity.R
import edu.temple.imageactivity.databinding.FragmentselectBinding
import kotlinx.android.synthetic.main.activity_champion.*
import kotlinx.android.synthetic.main.fragmentselect.*
import java.util.zip.Inflater
import android.R




class FragmentSelect : Fragment(R.layout.fragmentselect){
    private lateinit var comm: Communicator
    private var fragmentselectBinding: FragmentselectBinding? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val bundle = Bundle()
        val champName = edu.temple.imageactivity.R.string.championElise
        val champImg = edu.temple.imageactivity.R.drawable.elise
        bundle.putString("name", champName.toString())
        bundle.putInt("img", champImg)
        //TODO HERE BUNDLING
        //val fragInfo = FragmentClass()
        //fragInfo.setArguments(bundle)
        //transaction.replace(R.id.fragment_single, fragInfo)
        //transaction.commit()


        val binding = FragmentselectBinding.inflate(inflater,container,false)
        fragmentselectBinding = binding
        comm = requireActivity() as Communicator
        binding.cElise.setOnClickListener{
            comm.passInfo(binding.input)
        }
        binding.cEvelynn.setOnClickListener{
            comm.passInfo(binding.inputchampionElise)
        }
        binding.cKayn.setOnClickListener{
            comm.passInfo(binding.championElise)
        }
        binding.cKhazix.setOnClickListener{
            comm.passInfo(binding.championElise)
        }
        binding.cNunuWill.setOnClickListener{
            comm.passInfo(binding.championElise)
        }
        binding.cRammus.setOnClickListener{
            comm.passInfo(binding.championElise)
        }
        binding.cRengar.setOnClickListener{
            comm.passInfo(binding.championElise)
        }
        binding.cShen.setOnClickListener{
            comm.passInfo(binding.championElise)
        }
        binding.cSwain.setOnClickListener{
            comm.passInfo(binding.championElise)
        }
        binding.cWarwick.setOnClickListener{
            comm.passInfo(binding.championElise)
        }
        return binding.root
    }
    /*
    fun onClickListener(){
        cElise.setOnClickListener{

        }
        cEvelynn.setOnClickListener{

        }
        cKayn.setOnClickListener{

        }
        cKhazix.setOnClickListener{

        }
        cNunuWill.setOnClickListener{

        }
        cRammus.setOnClickListener{

        }
        cRengar.setOnClickListener{

        }
        cShen.setOnClickListener{

        }
        cSwain.setOnClickListener{

        }
        cWarwick.setOnClickListener{

        }
    }*/
}