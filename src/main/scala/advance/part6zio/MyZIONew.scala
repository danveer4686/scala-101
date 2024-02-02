package advance.part6zio

object MyZIO {

  final case class MyZIO[A](func: () => A) {

    val strList : List[String] = List(11,12,13,14).map(_.toString)                   //List(11, 12, 13, 14)
    val strList2: List[String] = List(11,12,13,14).flatMap(x => List(x.toString) )   //List(11, 12, 13, 14)

    def map[B](ab : A => B) : MyZIO[B] = {
      MyZIO.succeed{
        val a : A = func()
        val b : B = ab(a)
        b
      }
    }

    def flatMap[B](ab : A => MyZIO[B]) : MyZIO[B] = {
      MyZIO.succeed{
        val a : A = func()
        val mzb : MyZIO[B] = ab(a)
        val b : B = mzb.func()
        b
      }
    }

  }

  object MyZIO {
    def succeed[A](a : =>  A): MyZIO[A] = MyZIO(() => a)
  }

  object MyConsole {
        def putStrLn (line: => String): MyZIO[Unit] =
          MyZIO.succeed(println(line))

        def getStrLn (): MyZIO[String] =
          MyZIO.succeed(scala.io.StdIn.readLine())
  }

  object Runtime {
    object default {
      def unsafeRunSync[A](myzio: => MyZIO[A]): A  = myzio.func()
    }
  }
}


