// test method call
// (should print "Go!")
class Test {
  public static void main(String[] x) {
    Body b = new Body();
    b.go();
  }
}

class Body {
  public void go() {
    System.out.println("Go!");
  }
}
