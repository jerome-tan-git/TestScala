

class Teacher {
  var name:String = _
  private var age = 27
  private[this] val gender = "male"
  
  def this(name:String)
  {
    this
    this.name = name
  }
  
  def sayHello()
  {
    println("name: "+this.name + "age: " + this.age + " gender: " + this.gender) 
  }
}


class Teacher1 private (val name:String, val age:Int)
{
  println("this is the private constructure")
  var gender:String = _
  println(gender)
  def this(name:String, age:Int, gender:String)
  {
    this(name, age)
    this.gender = gender
  }
}


class Outer (val name:String)
{
  outer  =>
    class Inner(val name:String)
    {
      def foo(b:Inner)= println("Outer: " + outer.name + " Inner: " + b.name)
    }
}

class ApplyTest
{
  def apply() = println("I am in apply test class")
  def say
  {
    println("say hello")
  }
  
}

abstract class SuperTeacher(val name:String)
{
  var id:Int
  var age:Int
  def teach
}

class TeacherMath(name:String) extends SuperTeacher(name)
{
  override var id = name.hashCode()
  override var age = 32;
  override def teach = println("I am math")
}

trait logger 
{
  def log(msg:String){}
}

trait log
{
  def log(msg:String){}
}
class creatLog extends logger
{
  override def log(msg:String) = println("Log: " + msg)
  def newLog()
  {
    log("my new log")
  }
}

trait newLog extends logger
{
  override def log(msg:String) = println("Cool log: " + msg)
}

trait alog extends logger
{
  override def log(msg:String) = println("a log: " + msg)
}
object ApplyTest
{
  def apply()=
  {
    println("I am in apply object")
    new ApplyTest
  }
}
class University(val name:String)
{
  val id = University.newStudent
}
object University
{
  private var studentNo = 0
  def newStudent = 
  {
    studentNo += 1
    studentNo
  }
}

object test 
{
  def main(args:Array[String])
  {
//    val a = new Teacher1("spark", 11)
//    val b = new Teacher1("hadoop", 12, "male")
//    println(b.gender)
//    val out1 = new Outer("Hadoop")
//    val out2 = new Outer("Spark")
//    val inner1 = new out1.Inner("Scala")
//    val inner2 = new out2.Inner("java")
//    
//    inner1.foo(inner1)
//    inner2.foo(inner2)
//    
//    println(University.newStudent)
//    println(University.newStudent)
//    val u = new University("aaa")
//    println(u.id)
//    val ap = new ApplyTest()
//    println(ap())
    //a.sayHello()
//    val l = new creatLog
//    l.newLog()
    val l = List(1,2,3,4,5,6,8,9,10)
    var p = (x:Int) =>  if(x>3) println(x)
    val f = (_:Int)+1
    l.filter { _ > 2 }.foreach { p(_) }
    (1 to 9).map("a"*_).foreach(println)
    val pp = (x:Int, y:Int) =>
    {
      println(x+"-" + y)
      x-y
    }
    println((1 to 3).reduceRight((x,y)=>pp(x,y)))
    println((1 to 3).reduceRight(_-_))
    println((1 to 3).reduceLeft(_-_))
//    println() 
    val fun  = Math.ceil _ 
    Array(2.1,12.3,123.4).map(fun).foreach(println)
    
    def myF(f:((Double)=>Unit),x:Int) = f(x)  
    println(myF(println,311111))
    
    def mBy(fa:Double)=(x:Double)=>fa*x
    def myB = mBy(2)
    println(myB(22))
    val ff = 2*(_:Double)
    val ff1 = (_:Double)*2
    //def myF1((f:(Double),x:Int)=>Unit) = f(0.23)
  }
}