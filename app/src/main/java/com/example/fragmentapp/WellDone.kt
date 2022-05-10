package com.example.fragmentapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class WellDone : Fragment() {
    lateinit var wellDoneButton: Button
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        var v= inflater.inflate(R.layout.fragment_well_done, container, false)
        wellDoneButton = v.findViewById(R.id.next_workout_button)

        wellDoneButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_wellDoneFragment_to_exerciseFragment)
        )

        return v
    }

}