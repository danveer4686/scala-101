package advance.part6zio.reader

import advance.part6zio.reader.Schema._
import cats.data.{Kleisli, Reader}
import cats.Id

object HandlerWithMonad {
  def createUser(user: User): Reader[Repo, Long] = {
    Reader(
      (repo: Repo) => {
        repo.userRepo.create(user)
      }
    )
  }

  def getUser(id: Long): Reader[Repo, User] = {
    Reader(
      (repo: Repo) => {
        repo.userRepo.get(id)
      }
    )
  }
}


object PermissionHandlerWithMonad {
  def createPermission(permission: Permission): Reader[Repo, Long] = {
    Reader(
      (repo: Repo) => {
        repo.permRepo.create(permission)
      }
    )
  }

  def getPermission(id: Long): Reader[Repo, Permission] = {
    Reader(
      (repo: Repo) => {
        repo.permRepo.get(id)
      }
    )
  }

  def searchPermissions(role: String): Reader[Repo, List[Permission]] = {
    Reader(
      (repo: Repo) => {
        repo.permRepo.search(role)
      }
    )
  }
}


object UserPermissionHandlerWithMonad {
  def getUserPermissions(id: Long): Kleisli[Id, Repo, List[Permission]] = {
    for {
      u <- HandlerWithMonad.getUser(id)
      p <- PermissionHandlerWithMonad.searchPermissions(u.role)
    } yield p
  }
}
