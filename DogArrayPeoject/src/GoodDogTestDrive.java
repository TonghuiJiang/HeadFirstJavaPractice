public class GoodDogTestDrive {
    public static void main(String[] args) {
        GoodDog dog1 = new GoodDog();
        dog1.setSize(62);
        System.out.println("Dog1's size is: " + dog1.getSize());
        GoodDog dog2 = new GoodDog();
        dog2.setSize(12);
        System.out.println("Dog2's size is: " + dog2.getSize());

        System.out.println("Dog1 is barking: ");
        dog1.bark();

        System.out.println("Dog2 is barking: ");
        dog2.bark();

    }
}
