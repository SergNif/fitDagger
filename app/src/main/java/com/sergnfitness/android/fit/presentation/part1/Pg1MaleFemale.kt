package com.sergnfitness.android.fit.presentation.part1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.sergnfitness.android.fit.R
import com.sergnfitness.android.fit.app.App
import com.sergnfitness.android.fit.databinding.Pg1FragmentMaFemale1Binding


import com.sergnfitness.android.fit.presentation.controlUI.ChangeFonButtonPage5
import com.sergnfitness.android.fit.presentation.controlUI.ChangeFonButtonPage5NoPress
import com.sergnfitness.android.fit.presentation.viewModelPart1.Pg1MaleFemaleViewModel
import com.sergnfitness.android.fit.presentation.viewModelPart1.Pg1MaleFemaleViewModelFactory
import javax.inject.Inject


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Pg1MaleFemale.newInstance] factory method to
 * create an instance of this fragment.
 */
class Pg1MaleFemale : Fragment() {

    // TODO: Rename and change types of parameters
    var param1: String? = null
    var param2: String? = null

    val TAG = "Fragment Page1 MaFemale1 "
    lateinit var binding: Pg1FragmentMaFemale1Binding

    @Inject
    lateinit var vmFactory: Pg1MaleFemaleViewModelFactory
    lateinit var viewModel: Pg1MaleFemaleViewModel

//    lateinit var viewModelFactory: Pg1MaleFemaleViewModelFactory
    val changeFonButtonPage5 = ChangeFonButtonPage5()

    val changeFonButtonPage5NoPress = ChangeFonButtonPage5NoPress()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.pg1_fragment_ma_female1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = Pg1FragmentMaFemale1Binding.bind(view)

        (requireActivity().applicationContext as App).appComponent.inject(this)

        viewModel = ViewModelProvider(this, vmFactory)[Pg1MaleFemaleViewModel::class.java]

        viewModel.resultLive.observe(viewLifecycleOwner) {
            binding.textPage1.text = it
        }

        binding.imageViewBoy.setOnClickListener {
//            val textv = binding.editTextPage1.t ext
            viewModel.save(binding.editTextPage1.text.toString())
            binding.imageViewGirl.setBackgroundResource(changeFonButtonPage5.execute())
            binding.imageViewBoy.setBackgroundResource(changeFonButtonPage5NoPress.execute())
        }

        binding.imageViewGirl.setOnClickListener {
//            val userName: User = getUserNameUseCase.execute()

            viewModel.load()  // "Save ${userName.email} = ${userName.password}"
            binding.imageViewBoy.setBackgroundResource(changeFonButtonPage5.execute())
            binding.imageViewGirl.setBackgroundResource(changeFonButtonPage5NoPress.execute())
        }


    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MaFemale1.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Pg1MaleFemale().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}