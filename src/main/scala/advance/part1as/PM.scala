package advance.part1as


object PM extends App {

  class Person(val name: String, val age: Int)
  object ~~ {
//    def unapply(person: Person): Option[String] =
//      Some(person.name)
    def unapply(person: Person): Option[(String, Int)] =
       Some((person.name, person.age))
  }
  val p1 = new Person("aaa", 20)

  p1 match {
//    case x @ ~~(name) => println(s"name is $name and age is not known")
    case x @ name ~~ age => println(s"name is $name and age is $age")
    case x @ ~~ (name, age) => println(s"name is $name and age is $age")
  }

}
