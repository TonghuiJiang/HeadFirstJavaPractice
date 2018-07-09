public class Dog extends Feline implements Pet{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void beFriendly() {
        System.out.println("The dog is a friendly pet!");
    }

    @Override
    public void play() {
        System.out.println("The pet dog is playing with me!");
    }
}
