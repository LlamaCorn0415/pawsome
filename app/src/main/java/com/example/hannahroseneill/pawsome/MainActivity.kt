package com.example.hannahroseneill.pawsome

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*


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
		if (resultCode == RESULT_OK){
			if(requestCode == 3){
				if (data != null) {
					var contact = data.getSerializableExtra("Contact") as Contact
					Log.e("Special", contact.toString())
					adapter.addContact(contact)
					adapter.notifyDataSetChanged()

				}
			}else if(requestCode == 225){
				if (data != null){
					var remove = data.getBooleanExtra("Remove", false)

					if (remove == true){
						var contact = data.getSerializableExtra("Contact") as Contact
						adapter.removeContact(contact)
						adapter.notifyDataSetChanged() 
					}
				}
			}

		}
	}

	var adapter = ContactAdapter(this)

	fun prepareContactList() {
		contactList.layoutManager = LinearLayoutManager(this)
		contactList.adapter = adapter

	}

}
