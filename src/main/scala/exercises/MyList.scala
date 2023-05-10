//package exercises
//
//trait MyPredicate[-T]{
//  def test[T]: Boolean
//}
//
//trait MyTransformer[-A,B]{
//  def transformer(element: A): B
//}
//
//abstract class MyList[+A]{
//
//  def head(): A
//  def tail(): MyList[A]
//  def isEmpty(): Boolean
//  def add[B >: A](element: B): MyList[B]
//  def printElements: String
//  override def toString: String = "[" + printElements + "]"
//
//  def map[B](transformer: MyTransformer[A,B]): MyList[B]
//  def flatMap[B](transformer: MyTransformer[A, MyList[B]]): MyList[B]
//  def filter(predicate: MyPredicate[A]): MyList[A]
//}
//
//object Empty extends MyList[Nothing] {
//  def head(): Nothing = throw new NoSuchElementException
//  def tail(): MyList[Nothing] = throw new NoSuchElementException
//  def isEmpty(): Boolean = true
//  def add[B >: Nothing](element: B): MyList[B] = new Cons(element , Empty)
//  def printElements: String = ""
//
//  def map[B](transformer: MyTransformer[Nothing, B]): MyList[B] = Empty
//  def flatMap[B](transformer: MyTransformer[Nothing, MyList[B]]): MyList[B] = Empty
//  def filter(predicate: MyPredicate[A]): MyList[Nothing] = Empty
//}
//
//class Cons[+A](h: A , t: MyList[A]) extends MyList[A] {
//
//  def head: A = h
//  def tail: MyList[A] = t
//  def isEmpty: Boolean = false
//  def add[B >: A](element: B): MyList[B] = new Cons(element, this)
//  def printElements: String = if (t.isEmpty) "" + h else h + " " + t.printElements
//
//  override def filter(predicate: MyPredicate[A]): MyList[A] = {
//    if (predicate.test(h)) new Cons(h, t.filter(predicate))
//    else t.filter(predicate)
//  }
//
//  override def map[B](transformer: MyTransformer[A, B]): MyList[B] = {
//    new Cons(transformer.transformer(h), t.map(transformer))
//  }
//}
//
//object ListTest extends App {
//  val list = new Cons(1,new Cons(2 , new Cons(3, new Cons(4, Empty))))
//
//  println(list.head)
//  println(list.tail.head)
//
//  println(list.add(5).head)
//  println(list.isEmpty)
//
//  println(list.toString)
//
//  println(list.map(new MyTransformer[Int, Int] {
//    override def transformer(element: Int): Int = element * 2
//
//  }))
//}
