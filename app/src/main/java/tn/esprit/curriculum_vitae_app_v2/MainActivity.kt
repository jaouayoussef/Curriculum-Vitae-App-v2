package tn.esprit.curriculum_vitae_app_v2

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.util.Patterns.EMAIL_ADDRESS
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var fullName: Editable
    private lateinit var age: Editable
    private lateinit var email: Editable
    private lateinit var gender: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fullName = fullNameField.editText?.text!!
        age = ageField.editText?.text!!
        email = emailField.editText?.text!!

        nextButton.setOnClickListener {
            checkUserInput()

        }
    }

    private fun checkSelectedGender(): String {

        if (maleRadioButton.isChecked) {

            gender = maleRadioButton.text.toString()

        }
        if (femaleRadioButton.isChecked) {
            gender = femaleRadioButton.text.toString()

        }

        return gender


    }

    private fun Toast(message: String) {

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

    }

    private fun checkUserInput() {
        if (fullName.isEmpty()) {
            fullNameField.error = "Please enter your full name"
            return
        }
        if (age.isEmpty()) {
            ageField.error = "Please enter your age"
            return
        }
        if (email.isEmpty()) {
            emailField.error = "Please enter your email"
            return
        }
        if (!EMAIL_ADDRESS.matcher(email).matches()) {
            emailField.error = "Please enter a valid email"
            return
        }
        if (!maleRadioButton.isChecked && !femaleRadioButton.isChecked) {
            Toast("please select your gender")
        } else {


            val i = Intent(this, SecondActivity::class.java)

            i.putExtra("key_name", fullName.toString())
            i.putExtra("key_age", age.toString())
            i.putExtra("key_email", email.toString())
            i.putExtra("key_gender", checkSelectedGender())

            startActivity(i)
        }
    }
}