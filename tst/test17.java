// test more invocations 
// (should print 10)
class Test {
  public static void main(String[] x) {
    B b = new B();
    b.i = 10;
    b.b = true;
    if (b.b)
      b.go();
  }
}

class A {
  int i;
  boolean b;
}

class B extends A {
  public void go() {
    System.out.println(i);
  }
}
