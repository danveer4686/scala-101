package advance.part6zio

/**
  * Created by Danveer.
  */
object Variance extends App {

  class Animal extends AnyRef
  class Cat extends Animal
  class Dog extends Animal
  class Puppy extends Dog
//  AnyRef
//  Animal
//  Dog
//  Puppy

  //INVARIANCE
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  //COVARIANCE atMax
  class CovariantList[+A]
  val animalList: CovariantList[Dog] = new CovariantList[Puppy]

  //CONTRAVARIANCE atLeast
  class Trainer[-A <: Animal ]
  val trainer: Trainer[Dog] = new Trainer[Animal]

  // bounded types
  class Cage[A <: Animal](animal: A)
  val cage = new Cage(new Dog)

  // function currying
  def add(x:Int,y:Int) :Int = x+y
  def another_add(a:Int)(b:Int) =a+b

  def plusOne(x:Int):Int = another_add(1)(x)

  println(plusOne(10))

//  val x: Int => (Int => Int) = a => add2(a)
//
//  val y: (Int => Int, Int) => Int = (partiala,b) => partiala(b)
}
