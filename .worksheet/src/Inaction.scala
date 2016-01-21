import scala.collection.mutable.ArrayBuffer

object Inaction {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(1072); 
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
    val tu = (1,2,3,4,"hadoop","scala");System.out.println("""tu  : (Int, Int, Int, Int, String, String) = """ + $show(tu ));$skip(7); val res$0 = 
    tu;System.out.println("""res0: (Int, Int, Int, Int, String, String) = """ + $show(res$0));$skip(49); 
    
        val (first,scon,th,four,fif,g) = tu;System.out.println("""first  : Int = """ + $show(first ));System.out.println("""scon  : Int = """ + $show(scon ));System.out.println("""th  : Int = """ + $show(th ));System.out.println("""four  : Int = """ + $show(four ));System.out.println("""fif  : String = """ + $show(fif ));System.out.println("""g  : String = """ + $show(g ));$skip(39); val res$1 = 
   
    "Hadoop".partition (_.isUpper);System.out.println("""res1: (String, String) = """ + $show(res$1));$skip(42); val res$2 = 
    "Hadoop".partition { x => x.isUpper };System.out.println("""res2: (String, String) = """ + $show(res$2));$skip(32); 
    val z1 = Array("a","b","c");System.out.println("""z1  : Array[String] = """ + $show(z1 ));$skip(26); 
    val z2 = Array(1,2,3);System.out.println("""z2  : Array[Int] = """ + $show(z2 ));$skip(24); 
    val z3 = z1.zip(z2);System.out.println("""z3  : Array[(String, Int)] = """ + $show(z3 ));$skip(37); 
    for((x,y)<-z3)
     println(x*y)}
}
