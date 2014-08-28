package com.yhd.scala

class First {

  First.test(1, 2);

}

/**
 * 定义的是静态方法
 */
object First {

  def main(args: Array[String]) {

    println("hello");

  }

  def test(x: Int, y: Int) {
    print(x + "" + y);
  }
}

abstract class People {
  def talck;
}

class children extends People {
  def talck {
    print("继承实现");
  }
}

class ter extends App {

}

