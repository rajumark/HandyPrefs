package raju.shingadiya.samplesharedpreferences

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import raju.shingadiya.handyprefs.HandyPrefs
import raju.shingadiya.samplesharedpreferences.Prefs.Age
import raju.shingadiya.samplesharedpreferences.Prefs.userName
import raju.shingadiya.samplesharedpreferences.Prefs.userid
import raju.shingadiya.samplesharedpreferences.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initView()

    }

    private fun initView() {
        with(binding) {

            //save value
            buttonSave click {
                userid = edtInput.text.toString()
                toast("Saved")
            }

            //fetch value and set
            buttonFetch click {
                tvShow.text = userid
            }

            //clear shared prefs
            buttonClear click {
                HandyPrefs.clear()
                toast("cleared")
                buttonFetch.performClick()
            }


        }

    }
}