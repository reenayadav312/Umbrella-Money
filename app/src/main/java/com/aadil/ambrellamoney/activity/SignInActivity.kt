package com.aadil.ambrellamoney.activity


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.aadil.ambrellamoney.R
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)


        signin_btn.setOnClickListener() {

            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}