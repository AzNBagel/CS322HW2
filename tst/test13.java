// test method invocation
// (should print 10)
class Test {
  public static void main(String[] x) {
    Body b = new Body();
    System.out.println(b.go());
  }
}

class Body {
  public int echo(int i) {
    return i;
  }
  public int go() {
    return this.echo(10);
  }
}
