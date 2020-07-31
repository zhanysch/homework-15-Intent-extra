package com.example.homework15

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        add1.setOnClickListener(this)
        add2.setOnClickListener(this)
    }


    override fun onClick(view: View?) {
        val web = Edt1.text.toString()
        val phone =Edt2.text.toString()

        when (view?.id){
            R.id.add1-> {
                Web("вход в браузер")
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://$web"))
                startActivity(intent)
            }
            R.id.add2 -> {
                Phone("вход в телефон")
                val intent=Intent(Intent.ACTION_DIAL, Uri.parse("tel: $phone"))
                startActivity(intent)
            }
        }
    }
}