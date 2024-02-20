package advance.part6zio.reader

object Schema {

  case class User(id: Long, name: String, role: String)
  case class Permission(id: Long, role: String, name: String)
  case class Repo(userRepo: UserRepo, permRepo: PermissionRepo)

  trait UserRepo {
    def create(user: User): Long
    def get(id: Long): User
  }

  trait PermissionRepo {
    def create(permission: Permission): Long
    def get(id: Long): Permission
    def search(role: String): List[Permission]
  }

}
