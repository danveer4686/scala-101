package advance.part6zio.zioPlayGround

object Schema {

  case class User(name: String, email: String)
  val user1 = User("Danveer", "danveer4686@gmail.com")
  val user2 = User("Hilesh", "hilesh@gmail.com")
  val msg  =  "You have been subscribed successfully"

}
