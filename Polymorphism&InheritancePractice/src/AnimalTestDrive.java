public class AnimalTestDrive {
    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Wolf w = new Wolf();
        Dog d = new Dog();
        list.add(w);
        list.add(d);
        w.eat();
        d.eat();

        d.beFriendly();
        d.play();
    }
}
