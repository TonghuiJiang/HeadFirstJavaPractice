public class Animal {
    String name;

    public String getName() {
        return this.name;
    }
    public Animal(String theName) {
        this.name = theName;
    }
    public void sleep() {
        System.out.println("The animal is sleeping...");
    }
}
