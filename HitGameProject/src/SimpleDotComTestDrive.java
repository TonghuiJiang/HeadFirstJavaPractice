public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();

        GameHelper helper = new GameHelper();

        int randomNum = (int) (Math.random()*5);
        int locations[] = {randomNum, randomNum+1, randomNum+2};
        dot.setLocationCells(locations);
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
