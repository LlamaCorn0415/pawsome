package com.example.hannahroseneill.pawsome

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.contact_item.*

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		prepareContactList()

		adapter.addContact(Contact("Catherine", "541 - 987 - 6544", "Cat@gmail.com", "123 45th St" ))
		adapter.addContact(Contact("Rufus", "818 - 243 - 7475", "DoofusRufus@gmail.com", "432 Sicko Ln"))
		adapter.addContact(Contact("Daisy", "405 - 299 - 4853", "CrazyDaisy@gmail.com", "7250 NW Boquet Dr"))
		//phone number was changed to String because it was doing subtraction... o.o


	}

	var adapter = ContactAdapter()

	fun prepareContactList() {
		contactList.layoutManager = LinearLayoutManager(this)
		contactList.adapter = adapter

		}
	}
