public class MyAnimalList {
    private Animal[] animals = new Animal[5];
    private int nextIndex = 0;

    public void add(Animal a) {
        if(nextIndex < animals.length) {
            animals[nextIndex] = a;
            System.out.println("Animal added at: " + nextIndex);
            nextIndex++;
        }
    }

    public Object get(int index) {
        if(index < 5) {
            return animals[index];
        } else {
            return animals[0];
        }
    }
}
