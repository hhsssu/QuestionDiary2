package com.istudy.questiondiary2.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.istudy.questiondiary2.databinding.FragmentRecodesBinding
import com.istudy.questiondiary2.ui.recodes.RecodesViewModel

class RecodesFragment : Fragment() {

    private lateinit var recodeViewModel: RecodesViewModel
    private var _binding: FragmentRecodesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        recodeViewModel =
            ViewModelProvider(this).get(RecodesViewModel::class.java)

        _binding = FragmentRecodesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textRecodes
        recodeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}