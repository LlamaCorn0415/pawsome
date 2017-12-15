package com.example.hannahroseneill.pawsome

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.contact_details.*
import kotlinx.android.synthetic.main.contact_item.*

/**
 * Created by hannahroseneill on 12/11/17.
 */
class ContactDetails : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.contact_details)


			var contact = intent.getSerializableExtra("Contact")
			Log.e("Pkmmte", contact.toString())

		imgContactImage.setOnClickListener {
			var intent = Intent(this, ContactDetails::class.java)
			startActivity(intent)

		}

	}
}
