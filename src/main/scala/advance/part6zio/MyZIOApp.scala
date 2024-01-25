package advance.part6zio

import advance.part6zio.MyZIO.{MyConsole, MyZIO, Runtime}

object MyZIOApp extends App {

   val app : MyZIO[Unit] = for {
      _ <- MyConsole.putStrLn("#"*100)
      _ <- MyConsole.putStrLn("Enter you name:")
      name <- MyConsole.getStrLn()
      _ <- MyConsole.putStrLn(s"Hello $name")
      _ <- MyConsole.putStrLn("#"*100)
    } yield ()

    Runtime.default.unsafeRunSync(app)

    def putStrLn (line: => String): Unit=
      println(line)

    def getStrLn (): Unit =
      scala.io.StdIn.readLine()
  }
