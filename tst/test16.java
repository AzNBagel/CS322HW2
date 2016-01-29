// test inheritance 
// (should print 2)
class Test {
  public static void main(String[] x) {
    B b = new B();
    System.out.println(b.go());
  }
}

class A {
  public int echo(int a) {
    return a;
  }
}

class B extends A {
  public int go() {
    return echo(2);
  }
}
