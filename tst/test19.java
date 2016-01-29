// test dynamic binding
// (should print 10 20)
// (10 10 if using static binding)
class Test {
  public static void main(String[] x) {
    A a = new A();
    A b = new B();
    System.out.println(a.f());
    System.out.println(b.f());
  }
}

class A {
  public int f() { return 10; }
}

class B extends A {
  public int f() { return 20; }
}
