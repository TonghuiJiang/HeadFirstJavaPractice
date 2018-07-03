import java.util.ArrayList;

public class DotCom {
        private ArrayList<String> locationCells;
//        private int numOfHits = 0;


        public void setLocationCells(ArrayList<String> locs) {
            this.locationCells = locs;
        }

        public String checkYourself(String userGuess) {
            String result = "miss";

            int index = locationCells.indexOf(userGuess);

            if(index >= 0) {
                locationCells.remove(userGuess);
                if(locationCells.isEmpty()) {
                    result = "kill";
                } else {
                    result = "hit";
                }
            }
            System.out.println(result);
            return result;
        }
    }


