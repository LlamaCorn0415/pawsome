package com.example.hannahroseneill.pawsome

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.contact_item.view.*

/**
 * Created by hannahroseneill on 12/7/17.
 */
class ContactAdapter : RecyclerView.Adapter<ContactAdapter.ViewHolder>() {

	val contacts = ArrayList<Contact>()

	fun addContact(person: Contact) {
		contacts.add(person)
	}

	override fun onBindViewHolder(holder: ViewHolder, position: Int) {
		holder.bind(position)
	}

	override fun getItemCount(): Int {
		return contacts.size
	}

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
		return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.contact_item, parent, false))
	}

	inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
		val txtName = itemView.txtName
		val imgAvatar = itemView.imgAvatar
		val txtAddress = itemView.txtAddress
		val txtEmail = itemView.txtEmail
		val txtPhone = itemView.txtPhone

		fun bind(position: Int) {
			val person = contacts[position]
			txtName.text = person.name
			txtAddress.text = person.address
			txtEmail.text = person.email
			txtPhone.text = person.phone


		}

	}
}