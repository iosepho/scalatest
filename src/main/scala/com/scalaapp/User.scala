package com.scalaapp

/**
 * Created by iosepholoingsigh on 2/25/15.
 */
case class User(val email: Email) {

    override def toString(): String = s"[Email: ${email.address}]"
}
