```scala
class MyClass[T](val value: T) {
  def myMethod(x: T): T = {
    if (x == value) {
      value //This line is problematic when T is a reference type.
    } else {
      x
    }
  }
}

val myObj = new MyClass(List(1,2,3))
val sameList = List(1,2,3)
sameList == myObj.value //This returns false even though the lists are identical
```