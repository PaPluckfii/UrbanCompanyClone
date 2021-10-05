package com.sumeet.commercialapp.ui.bookings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.sumeet.commercialapp.databinding.FragmentBookingsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BookingsFragment : Fragment() {

    private val bookingsViewModel: BookingsViewModel by viewModels()
    private lateinit var binding : FragmentBookingsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBookingsBinding.inflate(inflater, container, false)
        return binding.root
    }

}