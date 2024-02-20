package advance.part6zio.zioPlayGround

import zio.{ExitCode, Runtime, URIO, ZIO}
import zio.console._

object ZIOPlayGround extends zio.App {

  val favNumber = ZIO.succeed(77)
  val aFailure = ZIO.fail("Something went wrong")

  val greeting = for {
    _ <- putStrLn("Hello, What is your name?")
    name <- getStrLn
    _ <- putStrLn(s"Hello $name ")
  } yield ()

  override def run(args: List[String]): URIO[zio.ZEnv, ExitCode] = {
    greeting.exitCode
  }

  //Runtime.default.unsafeRunSync(greeting)

  }
