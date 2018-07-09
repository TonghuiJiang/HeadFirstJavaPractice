abstract public class Animal {
    private String picture;
    private String food;
    private int hunger;
    private int boundaries;
    private int location;

    public void makeNoise() {
        System.out.println("Making noise! ");
    }

    public void eat() {
        System.out.println("Eating some food! ");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }

    public void roam() {
        System.out.println("Walking around..");
    }
}
