package basics.part5bestpractices

object SealedTraits extends App {

  //function with return type of sealed traits
  //guides user to consider all the possible outcomes at compile time
  sealed trait Result
  case class Success(empName: String) extends Result
  case class InvalidInput(return_code: Int, msg: String) extends Result
  case class SubprocessFailed(return_code: Int, msg: String) extends Result

  def getEmpName(userId:Int): Result = {
    if (userId==13)                     SubprocessFailed(404, "Not Found")
    else if (userId<=100 && userId>=1)  Success("SomeName")
    else                                InvalidInput(400, "Bad Input")
  }

  def program():Unit ={
    val myResult:Result = getEmpName(101)
    myResult match {
      case Success(x) => println(x)
      //case SubprocessFailed(_,_) => println("SubprocessFailed")
      case InvalidInput(_,_) => println("InvalidInput")
    }
  }
  program()
}
