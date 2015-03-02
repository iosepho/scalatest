
object Timer{
    val s : String = "toUpper"
   // oncePerSecond(doSomething(s))

    def oncePerSecond(callback:  => Unit): Unit =
    {
        while(true)
        {
            callback
            Thread sleep 1000
        }
    }

    def doSomething(
      name: String = "Jack",
      age: Int = 21,
      location: String = "Belfast")
    {
        println(name, age, location)
    }
}

object Drone extends App{
    val test =  Timer.doSomething(location = "Dublin")

}