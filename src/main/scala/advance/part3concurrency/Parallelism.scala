package advance.part3concurrency

import scala.collection.parallel.CollectionConverters.ImmutableIterableIsParallelizable
import scala.concurrent.ExecutionContext.global
import scala.concurrent.Future



object Parallelism extends App{
  var a = 0
  for (i<- (1 to 1000).par ) a+=1
  println(a)

  Future{
    println("printing from future")
  }(global)


}
