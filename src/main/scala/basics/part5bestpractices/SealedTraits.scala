package basics.part5bestpractices

object SealedTraits extends App {

  //function with return type of sealed traits
  //guides user to consider all the possible outcomes at compile time
  sealed trait Result
  case class Success(value: String) extends Result
  case class InvalidInput(value: String, msg: String) extends Result
  case class SubprocessFailed(return_code: Int, stderr: String) extends Result

  def getResult(): Result = {
    InvalidInput("400", "BadInput")
  }

  def program():Unit ={
    val myResult:Result = getResult()
    myResult match {
      case Success(x) => println(x)
      //case SubprocessFailed(x,y) => println("SubprocessFailed")
      case InvalidInput(x,y) => println("InvalidInput")
      //case _ =>  println("something_else")
    }
  }
  program()
}
