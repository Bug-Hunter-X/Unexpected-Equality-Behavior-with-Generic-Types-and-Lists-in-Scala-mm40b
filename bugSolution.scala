```scala
class MyClass[T](val value: T) {
  def myMethod(x: T): T = {
    if (x match{
      case list1: List[Int] =>
        value match {
          case list2:List[Int] => list1.sameElements(list2)
          case _ => false
        }
      case _ => x == value
    }) {
      value 
    } else {
      x
    }
  }
}

val myObj = new MyClass(List(1,2,3))
val sameList = List(1,2,3)
sameList == myObj.value //This will still return false
myObj.myMethod(sameList) //This will now return List(1,2,3)
```