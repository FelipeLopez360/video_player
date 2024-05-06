package com.example.video_player

import android.net.Uri
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.example.video_player.databinding.ActivityMainBinding
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_main)

//Find the VideoView class by its id

        val videoView = findViewById<VideoView>(R.id.testView)

//Creating MediaController

        val mediaController = MediaController(this)

        mediaController.setAnchorView(videoView)

//specify the location of media file

        val uri:Uri = Uri.parse(

            "android.resource://" + packageName

                    + "/raw/test"

        )

//Setting MediaController and URI, then starting the videoView

        videoView.setMediaController(mediaController)

        videoView.setVideoURI(uri)

        videoView.requestFocus()

        videoView.start()
    }
}