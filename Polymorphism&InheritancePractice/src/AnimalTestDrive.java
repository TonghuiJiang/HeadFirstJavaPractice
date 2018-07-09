public class AnimalTestDrive {
    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Wolf w = new Wolf();
        Dog d = new Dog();
        list.add(w);
        list.add(d);
        Object o = list.get(0);
        Wolf awolf = (Wolf) o;
        awolf.eat();
        w.eat();
        d.eat();
    }
}
