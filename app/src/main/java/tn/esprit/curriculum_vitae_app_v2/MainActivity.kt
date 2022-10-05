package tn.esprit.curriculum_vitae_app_v2

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    private lateinit var fullName: String
    private lateinit var age: String
    private lateinit var email: String
    private lateinit var gender: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fullName = fullNameField.editText?.text.toString()
        age = ageField.editText?.text.toString()
        email = emailField.editText?.text.toString()

        nextButton.setOnClickListener {
            checkUserInput()
        }
    }

    private toast(message: String)
    {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun checkUserInput() {
        val fullName = fullNameField.editText?.text.toString()
        val age = ageField.editText?.text.toString()
        bitmap = profileImage.drawToBitmap()
        val email = emailField.editText?.text.toString()


        if (fullName.isEmpty()) {
            fullNameField.error = "Please enter your full name"
            fullNameField.requestFocus()
            return
        }
        if (age.isEmpty()) {
            ageField.error = "Please enter your age"
            ageField.requestFocus()
            return
        }
        if (email.isEmpty()) {
            emailField.error = "Please enter your email"
            emailField.requestFocus()
            return
        }
        if (!EMAIL_ADDRESS.matcher(email).matches()) {
            emailField.error = "Please enter a valid email"
            emailField.requestFocus()
            return
        } else {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("fullName", fullName)
            intent.putExtra("age", age)
            intent.putExtra("email", email)
            intent.putExtra("gender", gender);

            startActivity(intent)
        }
    }
}