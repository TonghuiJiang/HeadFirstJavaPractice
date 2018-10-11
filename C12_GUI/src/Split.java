public class Split {
    public static void main(String[] args) {
        String toTest = "Who is your teacher?";
        String[] result = toTest.split(" ");
        for (int i = result.length - 1; i>=0; i--) {
            System.out.println(result[i]);
        }
    }
}
