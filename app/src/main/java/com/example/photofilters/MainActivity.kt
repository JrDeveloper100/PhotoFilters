package com.example.photofilters

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.example.photofiltermodule.PhotoFilter

class MainActivity : AppCompatActivity() {
    private lateinit var imageView : ImageView
    private lateinit var selectImage : Button
    private lateinit var btnVintage : Button
    private lateinit var btnGrayscale : Button
    private lateinit var btnSepia : Button
    private lateinit var btnInvert : Button
    private lateinit var btnTangerine: Button
    private lateinit var btnCinematic : Button
    private lateinit var btnDarkBrown : Button
    private lateinit var btnMetallic : Button
    private lateinit var btnMatte : Button
    private lateinit var btnFilm : Button
    private lateinit var btnPeach : Button
    private lateinit var btnCharcoal : Button
    private val REQUEST_IMAGE_SELECTION = 1
    val photoFilter = PhotoFilter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        selectImage = findViewById(R.id.selectImage)
        imageView = findViewById(R.id.imageView)
        btnVintage = findViewById(R.id.btnVintage)
        btnGrayscale = findViewById(R.id.btnGrayscale)
        btnSepia = findViewById(R.id.btnSepia)
        btnInvert = findViewById(R.id.btnInvert)
        btnTangerine = findViewById(R.id.btnTangerine)
        btnCinematic = findViewById(R.id.btnCinematic)
        btnDarkBrown = findViewById(R.id.btnDarkBrown)
        btnMetallic = findViewById(R.id.btnMetallic)
        btnMatte = findViewById(R.id.btnMatte)
        btnFilm = findViewById(R.id.btnFilm)
        btnPeach = findViewById(R.id.btnPeach)
        btnCharcoal = findViewById(R.id.btnCharcoal)
        btnGrayscale.setOnClickListener {
            imageView.colorFilter = photoFilter.applyGrayscaleFilter()
        }
        btnSepia.setOnClickListener {
            imageView.colorFilter = photoFilter.applySepiaFilter()
        }
        btnInvert.setOnClickListener {
            imageView.colorFilter = photoFilter.applyInvertFilter()
        }
        btnTangerine.setOnClickListener {
            imageView.colorFilter = photoFilter.applyTangerineFilter()
        }
        btnCinematic.setOnClickListener {
            imageView.colorFilter = photoFilter.applyCinematicFilter()
        }
        selectImage.setOnClickListener {
            openGallery()
        }
        btnVintage.setOnClickListener {
            imageView.colorFilter = photoFilter.applyVintageFilter()
        }
        btnDarkBrown.setOnClickListener {
            imageView.colorFilter = photoFilter.applyDarkBrownFilter()
        }
        btnMetallic.setOnClickListener {
            imageView.colorFilter = photoFilter.applyMetallicFilter()
        }
        btnMatte.setOnClickListener {
            imageView.colorFilter = photoFilter.applyMatteFilter()
        }
        btnFilm.setOnClickListener {
            imageView.colorFilter = photoFilter.applyFilmFilter()
        }
        btnPeach.setOnClickListener {
            imageView.colorFilter = photoFilter.applyPeachFilter()
        }
        btnCharcoal.setOnClickListener {
            imageView.colorFilter = photoFilter.applyCharcoal()
        }
    }

    private fun openGallery() {
        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        startActivityForResult(intent, REQUEST_IMAGE_SELECTION)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQUEST_IMAGE_SELECTION && resultCode == RESULT_OK && data != null){
            val imageUri: Uri? = data.data
            imageView.setImageURI(imageUri)
        }
    }

}