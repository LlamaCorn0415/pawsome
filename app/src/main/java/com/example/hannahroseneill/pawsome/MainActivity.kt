package com.example.hannahroseneill.pawsome

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.add_contact_activity.*
import kotlinx.android.synthetic.main.contact_item.*

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		prepareContactList()



		addContactButton.setOnClickListener {
			var intent = Intent(this, AddContactActivity::class.java)
			startActivityForResult(intent, 3)
		}

	}

	override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
		super.onActivityResult(requestCode, resultCode, data)
		if (resultCode == RESULT_OK) {
			if (data != null) {
				var contact = data.getSerializableExtra("Contact") as Contact
				Log.e("Special", contact.toString())
				adapter.addContact(contact)
				adapter.notifyDataSetChanged()
			}

		}
	}

	var adapter = ContactAdapter()

	fun prepareContactList() {
		contactList.layoutManager = LinearLayoutManager(this)
		contactList.adapter = adapter

	}
}
