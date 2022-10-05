package tn.esprit.curriculum_vitae_app_v2
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper


class splashscreen : appcompatactivity() {
    override fun onCreate(savedInstanceState: bundle?) {
        super.oncreate(savedInstanceState)
        setcontentview(R.layout.splashscreen)
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}


}
}