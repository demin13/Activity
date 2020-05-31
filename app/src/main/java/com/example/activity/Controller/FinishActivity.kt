package com.example.activity.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activity.R
import com.example.activity.Utilities.EXTRA_LEAGUE
import com.example.activity.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val league= intent.getStringExtra(EXTRA_LEAGUE)
        val selectedcat = intent.getStringExtra(EXTRA_SKILL)

        searchLeagueText.text = "Looking For a $league $selectedcat league near you..."

    }
}
