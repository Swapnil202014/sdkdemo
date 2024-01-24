package com.app.onlineorder

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.app.coforgelib.SampleToast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById(R.id.restaurantImageView)

        var loadImageButton: Button = findViewById(R.id.btnLocateImage)
        loadImageButton.setOnClickListener {
            loadImage()
            val sampleToast = SampleToast()
            sampleToast.showSimpleToast(this, "Test")
        }
    }

    private fun loadImage() {
        var imageURL = "https://www.coforge.com/hubfs/Best%20Workplaces.png"
        Glide.with(this)
            .load(imageURL)
            .apply(RequestOptions().centerCrop())
            .into(imageView)
    }
}