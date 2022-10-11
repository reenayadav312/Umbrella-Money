package com.aadil.ambrellamoney.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.aadil.ambrellamoney.R
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_sign_up.*


class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)


        signup_btn.setOnClickListener() {

            showMoreDialog()
        }
    }
        private fun showMoreDialog() {
            val view: View = (this)!!.layoutInflater.inflate(R.layout.bottom_sheet_otp_dialog, null)
            val dialog = this?.let { it1 -> BottomSheetDialog(it1) }
            dialog!!.setContentView(view)

            val confirm_otp = dialog.findViewById<Button>(R.id.confirm_otp)


            confirm_otp!!.setOnClickListener(View.OnClickListener {
                val intent = Intent(this, SignInActivity::class.java)
                startActivity(intent)
                dialog.dismiss()
            })
            dialog.show()
            }
        }
