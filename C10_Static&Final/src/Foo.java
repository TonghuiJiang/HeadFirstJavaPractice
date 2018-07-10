public class Foo {
    public static int x;
    private int y;

    public void go() {
        System.out.println(x);
    }
    public void go2() {
        System.out.println(y);
    }
    public void setY(int y) {
        this.y = y;
    }

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.setY(5);
        foo.go2();
        foo.go();
    }
}
