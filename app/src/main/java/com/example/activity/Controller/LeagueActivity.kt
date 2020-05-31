package com.example.activity.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.activity.Utilities.EXTRA_LEAGUE
import com.example.activity.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onmensbtnClicked(view:View)
    {
        Womensbtn.isChecked = false
        coedbtn.isChecked = false
        selectedLeague = "Mens"
    }
    fun onwomensbtnClicked(view:View)
    {
        mensbtn.isChecked = false
        coedbtn.isChecked = false
        selectedLeague = "Womens"
    }
    fun oncoedbtnClicked(view:View)
    {
        mensbtn.isChecked = false
        Womensbtn.isChecked = false
        selectedLeague = "Coed"
    }

    fun onnxtbtnClicked(view:View){

        if(selectedLeague == "")
        {
            Toast.makeText(this,"Please Select a league",Toast.LENGTH_SHORT).show()
        }
        else{

            val lagueIntent = Intent(this, SkillActivity::class.java)
            lagueIntent.putExtra(EXTRA_LEAGUE,selectedLeague)
            startActivity(lagueIntent)
        }
    }
}
