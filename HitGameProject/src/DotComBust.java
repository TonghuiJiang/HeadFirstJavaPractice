import java.util.*;

public class DotComBust {
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private GameHelper helper = new GameHelper();
    private int numOfGuess = 0;

    private void setUpGame() {
        DotCom one = new DotCom();
        one.setName("abc.com");
        DotCom two = new DotCom();
        one.setName("jpg.com");
        DotCom three = new DotCom();
        one.setName("xyz.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);
        System.out.println("DotCom items have been added...");
        System.out.println("Including abc.com, jpg.com, xyz.com");

        for(DotCom dotComItem : dotComList) {
            ArrayList<String> location = this.helper.placeDotCom(3);
            dotComItem.setLocation(location);
        }
        System.out.println("DotCom items have been placed to...");
        one.getLocation();
        two.getLocation();
        three.getLocation();
        //set DotCom objects with names and locations
        //give instructions to player
    }
    private void startPlaying() {
        while(!dotComList.isEmpty()) {
            String userGuess = helper.getUserInput("Please input your guess: ");
            this.checkUserGuess(userGuess);
        }
        this.finishGame();
        //ask play to guess
        //call checkUserGuess() until all DotCom objects are removed
    }
    private void checkUserGuess(String userGuess) {
        numOfGuess++;
        String result = "miss";
        for(DotCom dotComItem : dotComList) {
            result = dotComItem.checkYourself(userGuess);
            if(result.equals("hit")) {
                break;
            } else if(result.equals("kill")) {
                dotComList.remove(dotComItem);
                break;
            }
        }
        System.out.println(result);
        //call checkYourself()
    }

    private void finishGame() {
        System.out.println("Game over!");
        if(numOfGuess > 15) {
            System.out.println("You have tried so many times!");
        } else {
            System.out.println("Good job!");
            System.out.println("You have tried " + numOfGuess + " times!");
        }
        //prints message about player's performance
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
