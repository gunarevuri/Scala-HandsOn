import scala.collection.mutable.ListBuffer

object ListBufferExample {
  def main(args:Array[String]): Unit ={
    var lb = ListBuffer[String]()
    lb += "array1"
    lb += "array-"
    lb += "array2"
    println("here the listbuffer +"+lb)
  }

}
