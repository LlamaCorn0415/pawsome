package com.example.hannahroseneill.pawsome

import java.io.Serializable

/**
 * Created by hannahroseneill on 12/7/17.
 */
data class Contact(
		var name: String,
		var phone: String,
		var email: String,
		var address: String
) : Serializable
