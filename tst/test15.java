// test sub class
// (should print 10, 20)
class Test {
  public static void main(String[] x) {
    B b = new B();
    b.setval(10, 20);
    System.out.println(b.i);
    System.out.println(b.j);
  }
}

class A {
  int i;
}

class B extends A {
  int j;
  public void setval(int u, int v) {
    i = u;
    j = v;
  }
}
