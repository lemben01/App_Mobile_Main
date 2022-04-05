package ca.qc.cstj.s08bottomnavigation.presentation.ui.settings

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.viewbinding.library.fragment.viewBinding
import androidx.fragment.app.viewModels
import ca.qc.cstj.s08bottomnavigation.R
import ca.qc.cstj.s08bottomnavigation.databinding.FragmentSearchBinding
import ca.qc.cstj.s08bottomnavigation.databinding.FragmentSettingsBinding
import ca.qc.cstj.s08bottomnavigation.presentation.ui.search.SearchViewModel

class SettingsFragment : Fragment(R.layout.fragment_settings) {

    private val binding: FragmentSettingsBinding by viewBinding()
    private val viewModel: SettingsViewModel by viewModels()

    //Dans l'activite la majorite de code est dans onCreate() => onViewCreated()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        //viewLifecycleOwner = this dans un activity
        viewModel.count.observe(viewLifecycleOwner) {
            binding.txvCount.text = it.toString()
        }

        binding.btnAdd.setOnClickListener{
            viewModel.add()
        }
    }
}