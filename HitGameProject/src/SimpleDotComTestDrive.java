import java.util.ArrayList;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        DotCom dot = new DotCom();

        GameHelper helper = new GameHelper();

        int randomNum = (int) (Math.random()*5);
        String location1 = Integer.toString(randomNum);
        String location2 = Integer.toString(randomNum + 1);
        String location3 = Integer.toString(randomNum + 2);

        ArrayList<String> locs = new ArrayList<String>();
        locs.add(location1);
        locs.add(location2);
        locs.add(location3);

        dot.setLocationCells(locs);
        int numOfGuess = 0;
        boolean isAlive = true;

        while(isAlive) {
            String guess = helper.getUserInput("Enter a number: ");
            String result = dot.checkYourself(guess);
            numOfGuess++;
            if(result.equals("kill")) {
                System.out.println("You took: " + numOfGuess + " guesses");
                isAlive = false;
            }
        }
    }
        //user input

}
