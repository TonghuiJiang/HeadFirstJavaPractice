public class SimpleDotCom {
    private int[] locationCells;
    private int numOfHits = 0;


    public void setLocationCells(int[] locs) {
        this.locationCells = locs;
    }

    public String checkYourself(String userGuess) {

        int guess = Integer.parseInt(userGuess);
        String result = "miss";

        for(int cell : locationCells) {
            if(cell == guess) {
                result = "hit";
                numOfHits++;
                break;
            }
        }

        if(numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}
