public class GuessGame {
    Player p1;
    Player p2;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();

        p1.guess();
        p2.guess();

        int p1guess = p1.number;
        int p2guess = p2.number;



        int targetNumber = (int) (Math.random()*10);
        System.out.println("My target number is: " + targetNumber);
        while(true) {
            System.out.println("I'm guessing p1 is: " + p1guess);
            System.out.println("I'm guessing p2 is: " + p2guess);

            if(targetNumber == p1guess || targetNumber == p2guess) {
                System.out.println("I guess the correct number!");
                if(p1guess == targetNumber) {
                    System.out.println("p1 is correct!");
                }
                if(p2guess == targetNumber) {
                    System.out.println("p2 is correct!");
                }
                break;
            }
            else {
                System.out.println("I guess the wrong number, try again!");
                //do nothing and start looping again.
            }
        }
    }
}
