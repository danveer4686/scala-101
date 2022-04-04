package advance.part3concurrency

import scala.collection.parallel.CollectionConverters.ImmutableIterableIsParallelizable
import scala.concurrent.ExecutionContext.global
import scala.concurrent.duration.DurationInt
import scala.concurrent.{Await, Future}



object Parallelism extends App{

  implicit val g = global
  def testParallel(): Unit ={
    var a = 0
    for (i<- (1 to 1000).par ) a+=1
    println(a)

    Future{
      println("printing from future")
    }(global)
  }

  def testAwait():Unit={

    def fib(n:Int):Int = if (n<=2) n else fib(n-2)+fib(n-1)
    val process = Future{for (i<-(1 to 30) ) println(s"fib of $i is: " + fib(i)) }
    //  process.onComplete(println)       //nonBlocking: function inside onComplete runs when process is completed
    Await.result(process, 5.seconds)      //Blocking: Blocks the main thread and
    //  Thread.sleep(5000)                //Keeping main thread alive so that process will complete
  }

  def createThreads(maxThread:Int , i:Int =1): Thread =
    new Thread ( () => {
      if(i<maxThread) {
        val newThread  = createThreads(maxThread,i+1)
        newThread.start()
        newThread.join()
      }
      println(s"printing from thread $i")
    }
    )
//  createThreads(50).start()

  class SimpleContainer{
    private var value = 0
    def isEmpty(): Boolean = value==0
    def set(x:Int): Unit = value = x
    def get():Int = {
      val x = value
      value=0
      x
    }
  }

  def prodCons(): Unit ={

    val container  = new SimpleContainer()

    val cons = new Thread(()=>{

      for(i<-1 to 10 ){
        while(container.isEmpty()){
          Thread.sleep(50)
//          println(s"[consumer] waiting..")
        }
        println(s"[consumer] I just found value: ${container.get()}")
      }

    })

    val prod = new Thread(()=>{

      for(i<-1 to 10 ){
        Thread.sleep(100)
        container.set(i)
        println(s"[producer] sending msg with value: $i")
      }

    })
    cons.start()
    prod.start()
  }

  prodCons()


}
