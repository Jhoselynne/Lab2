package com.jossan.lab2

class User(nameParam: String, emailParam: String, passwordParam: String) {

    var name : String = ""
    var email : String = ""
    var password : String = ""

    // initializer
    init {
         name = nameParam
         email = emailParam
         password = passwordParam
     }
}