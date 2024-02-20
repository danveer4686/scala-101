package advance.part6zio.reader

import advance.part6zio.reader.Handler._
import advance.part6zio.reader.Impl._
import advance.part6zio.reader.Schema._


object AppWithMonad extends App {

  // dependencies
  val userRepo = new UserRepoImpl
  val permRepo = new PermissionRepoImpl
  val repo = Repo(userRepo, permRepo)

  // create user
  val createUserResp = HandlerWithMonad.createUser(User(1001, "lambda", "admin")).run(repo)
  println(createUserResp)

  // output
  // 1001


  // get user
  val getUserResp = HandlerWithMonad.getUser(1001).run(repo)
  println(getUserResp)

  // output
  // User(1001,lambda1001,admin)


  // create permission
  val createPermResp = PermissionHandlerWithMonad.createPermission(Permission(2001, "admin", "use_auth")).run(repo)
  println(createPermResp)

  // output
  // 2001


  // get permission
  val getPermResp = PermissionHandlerWithMonad.getPermission(1001).run(repo)
  println(getPermResp)

  // output
  // Permission(1001,legal_officer,use_archive)


  // get permissions of user
  val permissions = UserPermissionHandlerWithMonad.getUserPermissions(1001).run(repo)
  println(permissions)

  // output
  // List(Permission(1001,user,user_archive), Permission(1002,user,use_doc_storage), Permission(1005,user,use_auth))

}