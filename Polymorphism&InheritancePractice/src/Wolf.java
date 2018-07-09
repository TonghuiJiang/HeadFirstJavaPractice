public class Wolf extends Canine{

    @Override
    public void makeNoise() {
        System.out.println("This is wolf's noise");
    }

    @Override
    public void eat() {
        //super.eat();
        System.out.println("This is wolf's eating...");
    }

    public static void main(String[] args) {
        Wolf w = new Wolf();
        w.makeNoise();
        w.roam();
        w.eat();
        w.sleep();
    }
}
