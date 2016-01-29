// test parameter passing
// (should print 3)
class Test {
  public static void main(String[] x) {
    Body b = new Body();
    int i = b.go(1,2,3);
    System.out.println(i);
  }
}

class Body {
  public int go(int i, int j, int k) {
    return k;
  }
}
