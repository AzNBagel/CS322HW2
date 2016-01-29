// test sub classes 
// (should print 10)
class Test {
  public static void main(String[] x) {
    B b = new B();
    b.setval(10);
    System.out.println(b.i);
  }
}

class A {
  int i;
}

class B extends A {
  int j;
  public void setval(int u) {
    i = u;
    j = i;
  }
}

