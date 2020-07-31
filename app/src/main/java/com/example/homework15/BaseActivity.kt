package com.example.homework15

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity() {

       protected fun Web(word : String){  //(1))
        Toast.makeText(applicationContext,word, Toast.LENGTH_LONG).show()
    }

    protected fun Phone(word2 : String){   //(2)
        Toast.makeText(applicationContext,word2, Toast.LENGTH_LONG).show()
    }


}


