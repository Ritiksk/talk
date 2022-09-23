package com.unique.rough

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val GALARY_ID=100
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        img.setOnClickListener{
            val igalary=Intent(Intent.ACTION_PICK)
            igalary.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            startActivityForResult(igalary,GALARY_ID)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(resultCode== RESULT_OK){
            if (requestCode==GALARY_ID){

                img.setImageURI(data?.data)

                Toast.makeText(this,"jdskfjkdf",Toast.LENGTH_LONG).show()

            }
        }
    }
}