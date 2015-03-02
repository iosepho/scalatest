package com.scalaapp

import java.util.regex.Matcher

/**
 * Created by iosepholoingsigh on 2/25/15.
 * @param address A __valid__ address
 */
case class Email(val address: String) {
    var matcher: Matcher = """([\w\.]+)@([\w\.]+)""".r.pattern.matcher(address)
    if (!matcher.matches()) {
        throw new IllegalArgumentException("Email is invalid")
    }
}

object Email {
    implicit def stringToEmail(address: String): Email = Email(address)
}
