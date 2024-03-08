package examples.zioLayers

import zio.{ExitCode, ZIO}
import examples.zioLayers.Schema._
import examples.zioLayers.fileSystemServices.GCSFS._
//import examples.zioLayers.fileSystemServices.LocalFS._
//import examples.zioLayers.databaseService.BQ._
//import examples.zioLayers.databaseService.SQLLite._

object AnotherZIOApp extends zio.App {

  val program = for {
    _ <- write(List(user1,user2,user3,user4,user5,user6))
    _ <- read("")
  } yield ()

  override def run(args: List[String]): ZIO[zio.ZEnv, Nothing, ExitCode] = {
      program.provideLayer(live)
      .exitCode
  }
}