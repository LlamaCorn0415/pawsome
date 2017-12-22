package com.example.hannahroseneill.pawsome

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.add_contact_activity.*

/**
 * Created by hannahroseneill on 12/14/17.
 */
class AddContactActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.add_contact_activity)


		btnSaveContact.setOnClickListener {
			var name = editName.text.toString()
			var phone = editPhone.text.toString()
			var email = editEmail.text.toString()
			var address = editAddress.text.toString()

			var contact = Contact(name, phone, email, address)
			var intent = Intent()
			intent.putExtra("Contact", contact)
			setResult(Activity.RESULT_OK, intent)
			finish()


		}
	}
}