// test field var access
// (should print 10)
class Test {
  public static void main(String[] x) {
    A a = new A();
    a.i = 10;
    System.out.println(a.i);
  }
}

class A {
  int i;
}
