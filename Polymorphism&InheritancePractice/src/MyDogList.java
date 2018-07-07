public class MyDogList {
    private Dog [] dogs = new Dog[5];
    private int nextIndex = 0;

    public void add(Dog d) {
        if (nextIndex < dogs.length) {
            dogs[nextIndex] = d;
            System.out.println("Dog added at " + nextIndex);
            System.out.println("The dog's name is " + d.getName());
            nextIndex++;
        }
    }

    public static void main(String[] args) {
        MyDogList dogList = new MyDogList();
        Dog d = new Dog();
        d.setName("Husky");
        dogList.add(d);


    }
}
