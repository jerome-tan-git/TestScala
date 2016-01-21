

import scala.collection.mutable.ArrayBuffer

object aaasafasf {
  def main(args: Array[String]): Unit = {
    val a = new Array[String](10)
    val s = Array("hello", "world")
    s(0) = "Good bye"
    
    for(elem <- s if elem != "world")
      println(elem)
      
    val b = ArrayBuffer[Int]()
    def test:(Int,String)=(1,"s")
//    (x,y)<-test
//    for((k,v)<=test)
//    {
//      
//    }
    val pa = test
    
    print(pa._1)
    val score = scala.collection.mutable.Map("Scala" -> 7, "Hadoop" -> 8, "Spark" -> 9)
    score.getOrElse("Hadoop", 1)
    val tu = (1,2,3,4,"hadoop","scala")
    val (first,scon) = test
    println(first)
    "Hadoop".partition { x => x.isUpper }
  }
  
  
}