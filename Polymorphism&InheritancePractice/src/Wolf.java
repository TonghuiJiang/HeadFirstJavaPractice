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

    @Override
    public void roam() {
        System.out.println("wolf is roaming...");
    }

    public static void main(String[] args) {
        Canine w = new Wolf();
        w.makeNoise();
        w.roam();
        w.eat();
        w.sleep();
    }
}
