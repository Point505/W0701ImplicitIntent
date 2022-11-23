package kr.ac.kumohs20170334.w0701implicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.net.Uri
import kr.ac.kumohs20170334.w0701implicitintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var view:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        view= ActivityMainBinding.inflate(layoutInflater)
        setContentView(view.root)

        view.btnExplicitIntena.setOnClickListener{
            val intent = Intent(this,ImageActivity::class.java)
            startActivity(intent)
        }

        view.btnImplicitIntent.setOnClickListener {
            val uri = Uri.parse("https://www.youtube.com/results?search_query=android+developers")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }
}