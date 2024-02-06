package advance.part6zio

object MyZIO {

  final case class MyZIO[E, A](func: () => Either [E, A]) {

    val strList : List[String] = List(11,12,13,14).map(_.toString)                   //List(11, 12, 13, 14)
    val strList2: List[String] = List(11,12,13,14).flatMap(x => List(x.toString) )   //List(11, 12, 13, 14)

    def map[B](ab : A => B) : MyZIO[E, B] = {
      MyZIO{ ()=>
        val errorOrA : Either[E, A] = func()
        val errorOrB = errorOrA match {
          case Right(a) => Right(ab(a))
          case Left(e) => Left(e)
        }
        errorOrB
      }
    }

    def flatMap[B](ab : A => MyZIO[E, B]) : MyZIO[E, B] = {
      MyZIO{ () =>
        val errorOrA : Either[E, A] = func()
        val zErrorOrB = errorOrA match {
          case Right(a) => ab(a)
          case Left(e) => MyZIO.fail(e)
        }
        val b : Either[E, B] = zErrorOrB.func()
        b
      }
    }

  }

  object MyZIO {
    def succeed[A](a : =>  A): MyZIO[Nothing, A] = MyZIO(() => Right(a))
    def fail[E](e : =>  E): MyZIO[E, Nothing] = MyZIO(() => Left(e))
  }

  object MyConsole {
    def putStrLn (line: => String): MyZIO[Nothing,Unit] =
      MyZIO.succeed(println(line))

    def getStrLn (): MyZIO[Nothing, String] =
      MyZIO.succeed(scala.io.StdIn.readLine())
  }

  object Runtime {
    object default {
      def unsafeRunSync[E, A](myzio: => MyZIO[E, A]): Either[E, A]  = myzio.func()
    }
  }
}


