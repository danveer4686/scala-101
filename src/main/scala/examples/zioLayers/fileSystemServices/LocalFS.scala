package examples.zioLayers.fileSystemServices

import examples.zioLayers.Schema._
import zio.{Has, Task, ZIO, ZLayer}

object LocalFS {

  trait LocalService {
    def write(user: List[User]): Task[Unit]

    def read(local_csv_path: String): Task[List[User]]
  }

  // layer - service implementation
  val live: ZLayer[Any, Nothing, Has[LocalFS.LocalService]] = ZLayer.succeed {
    new LocalService {
      override def write(user: List[User]): Task[Unit] = Task {
        println(s"writing data on GCS path: ")
      }

      override def read(local_csv_path: String): Task[List[User]] = Task {
        println(s"reading data from GCS path: ")
        List(user1,user2,user3,user4,user5,user6)
      }
    }
  }

  // accessor
  def write(users: List[User]): ZIO[Has[LocalFS.LocalService], Throwable, Unit] = ZIO.accessM(_.get.write(users))

  def read(path: String): ZIO[Has[LocalFS.LocalService], Throwable, List[User]] = ZIO.accessM(_.get.read(path))

}
