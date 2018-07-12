public class TestBox {

    static int j = 42;
    static double i = 35.5;
    static String str;

    public static void main(String[] args) {
        String intString = "" + TestBox.j;
        System.out.println(intString);

        String doubleString = Double.toString(i);
        System.out.println(doubleString);
        TestBox box = new TestBox();
        System.out.println(str);

    }


}
