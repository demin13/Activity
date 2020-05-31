package com.example.activity.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.activity.Utilities.EXTRA_LEAGUE
import com.example.activity.R
import com.example.activity.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*


class SkillActivity : BaseActivity() {
    var league = ""
    var selectedcat = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        league= intent.getStringExtra(EXTRA_LEAGUE)
        setContentView(R.layout.activity_skill)

    }
    fun onbeginbtnClicked(view: View)
    {
        Ballerbtn.isChecked = false
        selectedcat = "Beginner"
    }
    fun onballbtnClicked(view:View)
    {
        Beginnerbtn.isChecked = false
        selectedcat = "Baller"
    }
    fun onskillfinishClicked(view: View)
    {
        if(selectedcat != "")
        {
            val finishactivity = Intent(this,FinishActivity::class.java)
            finishactivity.putExtra(EXTRA_LEAGUE,league)
            finishactivity.putExtra(EXTRA_SKILL,selectedcat)
            startActivity(finishactivity)
        }
        else
        {
            Toast.makeText(this,"Please Select a skill", Toast.LENGTH_SHORT).show()
        }
    }



}
