package com.example.hannahroseneill.pawsome

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		var adapter = ContactAdapter()
		contactList.layoutManager = LinearLayoutManager(this)
		contactList.adapter = adapter


		adapter.addContact(Contact("Catherine", "541 - 987 - 6544", "Cat@gmail.com", "123 45th St", "Cat Person"))
		adapter.addContact(Contact("Rufus", "818 - 243 - 7475", "DoofusRufus@gmail.com", "432 Sicko Ln", "Dog Person"))
		adapter.addContact(Contact("Daisy", "405 - 299 - 4853", "CrazyDaisy@gmail.com", "7250 NW Boquet Dr", "Cat Person"))
		//phone number was changed to String because it was doing subtraction... o.o


		fun prepareContactList() {
			contactList.layoutManager = LinearLayoutManager(this)
			contactList.adapter = adapter

			prepareContactList()

		}
	}
}
