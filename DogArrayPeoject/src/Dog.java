public class Dog {
    private String name;

    public static void main(String[] args) {
        //create Dog object
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        //create Dog adday
        Dog[] myDogs = new Dog[3];
        //put dogs
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        //modify Dog through reference
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        //myDog[2]'s name is ?
        System.out.println("Last dog's name is ");
        System.out.println(myDogs[2].name);

        int x = 0;
        while(x < myDogs.length) {
            myDogs[x].bark();
            x++;
        }
    }

    public void bark() {
        System.out.println(name + " says Ruff!");
    }
}
