package com.scalaapp

/**
 * Created by iosepholoingsigh on 2/25/15.
 */
object ScalaApp
{
    def main(args: Array[String])
    {

        println(
            """
              |Hello, this is a sample Scala Application.
            """.stripMargin)

        val user: User = User("ioseph.oloingsigh@gmail.com")

        val nullable: Option[User] = Some(user)

        nullable.map((user: User) => {
            print("Found user: %s".format(user))
        })
    }
}