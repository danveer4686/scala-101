package advance.part6zio.zioPlayGround

import advance.part6zio.zioPlayGround.Schema.User
import zio.{Has, Task, ZIO, ZLayer}

object UserEmailer {

  trait Service {
    def notify(user: User, message: String): Task[Unit]
  }
  // accessor
  def notify(user: User, message: String): ZIO[ Has[UserEmailer.Service], Throwable, Unit] =
    ZIO.accessM(_.get.notify(user, message))

  // layer - service implementation
  val live: ZLayer[Any, Nothing,  Has[UserEmailer.Service]] = ZLayer.succeed(
    new Service {
      def notify(user: User, message: String): Task[Unit] =
        Task { println(s"Sending '$message' to ${user.email}") }
    }
  )

}
