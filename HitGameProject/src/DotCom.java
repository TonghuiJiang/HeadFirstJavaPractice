import java.util.*;

public class DotCom {
        private String name;
        private ArrayList<String> locations;



        public void setName(String dotComName) {
            this.name = dotComName;
        }
        public void setLocation(ArrayList<String> locs) {
            this.locations = locs;
        }
        public void getLocation() {
            System.out.println(locations);
        }

        public String checkYourself(String userGuess) {
            String result = "miss";

            int index = locations.indexOf(userGuess);

            if(index >= 0) {
                locations.remove(userGuess);

                if(locations.isEmpty()) {
                    result = "kill";
                    System.out.println("Ouch! You sunlk " + this.name + " :( ");
                } else {
                    result = "hit";
                }
            }

            return result;
        }


    }


