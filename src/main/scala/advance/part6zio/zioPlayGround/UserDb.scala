package advance.part6zio.zioPlayGround

import advance.part6zio.zioPlayGround.Schema.User
import zio.{Has, Task, ZIO, ZLayer}

object UserDb {

  // service definition
  trait Service {
    def insert(user: User): Task[Unit]
  }

  // layer - service implementation
  val live: ZLayer[Any, Nothing,  Has[UserDb.Service]] = ZLayer.succeed {
    new Service {
      override def insert(user: User): Task[Unit] = Task {
        // can replace this with an actual DB SQL string
        println(s"insert into public.user values ('${user.name}', '${user.email}')")
      }
    }
  }

  // accessor
  def insert(u: User): ZIO[ Has[UserDb.Service], Throwable, Unit] = ZIO.accessM(_.get.insert(u))

}
