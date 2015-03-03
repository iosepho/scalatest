package com.scalaapp

import org.scalatest.FunSuite

class EmailTest extends FunSuite{
    test("Email with valid address")
    {
        val email = Email("test@valid.com")
        assert(email.address != null)
    }

    test("Email with invalid address")
    {
        intercept[IllegalArgumentException] {
            Email("asdadssdasd...")
        }
    }
}
