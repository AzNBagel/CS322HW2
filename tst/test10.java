// test instance var access
// (should print 10)
class Test {
  public static void main(String[] x) {
    Body b = new Body();
    b.go();
  }
}

class Body {
  int i;
  public void go() {
    i = 10;      
    System.out.println(i);
  }
}
