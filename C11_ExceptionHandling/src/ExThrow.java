public class ExThrow {
//    public void takeRisk() throws BadException {
//        if (abandonAllHope) {
//            throw new BadException();
//        }
//    }
//
//    public void crossFingers() {
//        try {
//            anObject.takeRisk();
//        } catch (BadException ex) {
//            System.out.println();("Aaargh!");
//            ex.printStackTrace();
//        }
//    }
        public static int takeRisk() throws Exception {
        if (1+1==2) {
            throw new Exception();
        }
        else
            return 1;
    }

    public static void main(String[] args) {
        try {
            int i = takeRisk();
            System.out.println(i);
        } catch (Exception ex) {
            System.out.println("Failed");
        }
        System.out.println("We made it!");

    }
}