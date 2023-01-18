package programs.part5_dp

object p3_divisor_game extends App {
  def divisorGame(n: Int): Boolean = {
    val dp:Array[Int] =  Array.fill(n+1)(-1)

    if (n==1) return false
    if (dp(n) != -1) dp(n)
    else
      for (i <- 1 to Math.sqrt(n).toInt) {
        if ( n%i==0 && divisorGame(n-i)==false )  {
          dp(i)= 1
          return true
        }}
     false

  }

}
