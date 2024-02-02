package basics.part5bestpractices

object AvoidNPE extends App {

  betterProgram()
  //program()

  def program():Unit ={
    val myPath:String = getDataPath().substring(5,5)
    println (myPath)
  }

  def betterProgram():Unit ={
    val myPathOption:Option[String] = getDataPathSafely()
    val myPath  = myPathOption match {
      case Some(x) => x.substring(5,5)
      case None => "default_value"
    }
    println (myPath)
  }

  def getDataPath():String = {
  //read a table from DB and return the path
  //there is possibility of getting null values
    null
  }

  def getDataPathSafely():Option[String] = {
    //read a table from DB and return the path
    //there is possibility of getting null values
    //better return Option of string
    Option(null)
  }

}
