public class Mixed2 {
        public static void main(String[] args) {
            A a = new A();
            B b = new B();
            C c = new C();
            A a2 = new C();

            //case1
            System.out.println("Here is case 1: ");
            b.m1();
            c.m2();
            a.m3();

            System.out.println("Here is case 2: ");
            c.m1();
            c.m2();
            c.m3();

            System.out.println("Here is case 3: ");
            a.m1();
            b.m2();
            c.m3();

            System.out.println("Here is case 4: ");
            a2.m1();
            a2.m2();
            a2.m3();
        }

}
