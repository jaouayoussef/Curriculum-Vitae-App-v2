package tn.esprit.curriculum_vitae_app_v2

import android.graphics.BitmapFactory
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity3.*


class ThirdActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity3)


        val fullName = intent.getStringExtra("key_name")
        val age = intent.getStringExtra("key_age")
        val email = intent.getStringExtra("key_email")
        val gender = intent.getStringExtra("key_gender")
        val androidSeekBarValue = intent.getStringExtra("key_android_seekbar")
        val iosSeekBarValue = intent.getStringExtra("key_ios_seekbar")
        val flutterSeekBarValue = intent.getStringExtra("key_flutter_seekbar")
        val language = intent.getStringExtra("key_language")
        val hobby = intent.getStringExtra("key_hobby")
        val extras = intent.extras
        val byteArray = extras!!.getByteArray("key_profile_picture")
        val bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray!!.size)



        finalFullName.text = "NAME: " + fullName
        finalFullName.setTextColor(resources.getColor(R.color.colorPrimary))
        finalAge.text = "Age: " + age
        finalAge.setTextColor(resources.getColor(R.color.colorPrimary))
        finalEmail.text = "Email: " + email
        finalEmail.setTextColor(resources.getColor(R.color.colorPrimary))
        finalGender.text = "Gender: " + gender
        finalGender.setTextColor(resources.getColor(R.color.colorPrimary))
        finalAndroid.text = "AndroidSkill: " + androidSeekBarValue
        finalAndroid.setTextColor(resources.getColor(R.color.colorPrimary))
        finalIos.text = "IosSkill: " + iosSeekBarValue
        finalIos.setTextColor(resources.getColor(R.color.colorPrimary))
        finalFlutter.text = "FlutterSkill: " + flutterSeekBarValue
        finalFlutter.setTextColor(resources.getColor(R.color.colorPrimary))
        finalLanguages.text = "Languages: " + language
        finalLanguages.setTextColor(resources.getColor(R.color.colorPrimary))
        finalHobbies.text = "Hobbies: " + hobby
        finalHobbies.setTextColor(resources.getColor(R.color.colorPrimary))


    }


}