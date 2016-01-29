// test dynamic binding
// (should print 22 11)
// (11 11 if using static binding)
class Test {
  public static void main(String[] x) {
    B b = new B();
    A a = b;
    b.x = 11;
    b.y = 22;
    System.out.println(a.f());
    System.out.println(a.g());
  }
}

class A {
  int x;
  public int f() { return x; }
  public int g() { return x; }
}

class B extends A {
  int y;
  public int f() { return y; }
}
