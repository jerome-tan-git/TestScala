import scala.collection.mutable.ArrayBuffer

object Inaction {
/*
  println("Welcome to the Scala worksheet")
  val s = Array("hello", "world")
    s(0) = "Good bye"
    
    for(elem <- s if elem != "world")
      println(elem)
      
  	val b = ArrayBuffer[Int]()
  	b += 8
  	b +=(1,2,3,4,5)
  	b ++=Array(10,11)
  	b
  	
  b.trimEnd(2)
  b
  b.insert(3,0)
  b
  b.remove(2)
  b
  b.remove(2,2)
  b
  val c = b.toArray
  val result = for(elem <- c) yield elem * 2
  
  val result1 = for(elem <- c if elem % 2 ==0 ) yield elem * 2
  c.filter( _%2==0).map(2*_).sorted
  c.mkString("<"," and ",">")
  val matrix = Array.ofDim[Double](2,3)
    matrix(1)(2)=1.2
    matrix
  val tan = new Array[Array[Int]](10)
  for(i<-0 until tan.length)
  tan(i) = new Array[Int](i+1)
  tan
  val ma = Map("book"->10,"gun"->12,"ipad"->22)
  for((k,v)<-ma) yield (k, v*0.9)
     val score = scala.collection.mutable.Map("Scala" -> 7, "Hadoop" -> 8, "Spark" -> 9)
    score.getOrElse("Hadoo1p", 1)
    score +=("R"->100)
    score -="Hadoop"
    */
    val tu = (1,2,3,4,"hadoop","scala")           //> tu  : (Int, Int, Int, Int, String, String) = (1,2,3,4,hadoop,scala)
    tu                                            //> res0: (Int, Int, Int, Int, String, String) = (1,2,3,4,hadoop,scala)
    
        val (first,scon,th,four,fif,g) = tu       //> first  : Int = 1
                                                  //| scon  : Int = 2
                                                  //| th  : Int = 3
                                                  //| four  : Int = 4
                                                  //| fif  : String = hadoop
                                                  //| g  : String = scala
   
    "Hadoop".partition (_.isUpper)                //> res1: (String, String) = (H,adoop)
    "Hadoop".partition { x => x.isUpper }         //> res2: (String, String) = (H,adoop)
    val z1 = Array("a","b","c")                   //> z1  : Array[String] = Array(a, b, c)
    val z2 = Array(1,2,3)                         //> z2  : Array[Int] = Array(1, 2, 3)
    val z3 = z1.zip(z2)                           //> z3  : Array[(String, Int)] = Array((a,1), (b,2), (c,3))
    for((x,y)<-z3)
     println(x*y)                                 //> a
                                                  //| bb
                                                  //| ccc
}