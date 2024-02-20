package advance.part6zio.reader

import advance.part6zio.reader.Schema._

import scala.util.Random

object Impl {

  class UserRepoImpl extends UserRepo {
    override def create(user: User): Long = {
      println(s"user created $user")
      user.id
    }

    override def get(id: Long): User = {
      println(s"get user $id")
      val roles = List("admin", "manager", "legal_officer", "user")
      User(id, s"lambda$id", Random.shuffle(roles).head)
    }
  }

  class PermissionRepoImpl extends PermissionRepo {
    override def create(permission: Permission): Long = {
      println(s"permission created $permission")
      permission.id
    }

    override def get(id: Long): Permission = {
      println(s"get permission $id")
      val roles = List("admin", "manager", "legal_officer", "user")
      val perms = List("use_archive", "use_doc_storage", "use_schema", "use_auth")
      Permission(id, Random.shuffle(roles).head, Random.shuffle(perms).head)
    }

    override def search(role: String) = {
      List(
        Permission(1001, role, "user_archive"),
        Permission(1002, role, "use_doc_storage"),
        Permission(1005, role, "use_auth")
      )
    }
  }

}
