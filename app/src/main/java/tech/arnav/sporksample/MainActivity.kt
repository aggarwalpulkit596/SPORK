package tech.arnav.sporksample

import tech.arnav.spork.Spork
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appPrefs = Spork.create(this, AppPrefs::class)

        btnSave.setOnClickListener {
            appPrefs.fooBar = inpFooBar.text.toString()
        }
        btnRestore.setOnClickListener {
            inpFooBar.setText(appPrefs.fooBar)
        }

    }
}
