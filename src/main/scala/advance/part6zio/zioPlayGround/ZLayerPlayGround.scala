package advance.part6zio.zioPlayGround

import advance.part6zio.zioPlayGround.Schema._
import zio.{ExitCode, Has, ZIO, ZLayer}

object ZLayerPlayGround extends zio.App {

  val program = for {
    _ <- UserEmailer.notify(user1, msg) // the specification of the action
    _ <- UserEmailer.notify(user2, msg) // the specification of the action
  } yield ()

  override def run(args: List[String]): ZIO[zio.ZEnv, Nothing, ExitCode] = {
      program.provideLayer(UserEmailer.live) // userBackendLayer plugging in a real layer/implementation to run on
      .exitCode
  }

//  val userBackendLayer: ZLayer[Any, Nothing, Has[UserDb.Service] with  Has[UserEmailer.Service] ] =
//    UserDb.live ++ UserEmailer.live
}
