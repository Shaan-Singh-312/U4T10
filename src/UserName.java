import java.util.ArrayList;

public class UserName {

    // The list of possible usernames, based on a user’s first and last
    // names and initialized by the constructor.
    private ArrayList<String> possibleNames;

    /** Constructs a UserName object as described in part (a).
     * Precondition: firstName and lastName have length greater than 0
     * and contain only uppercase and lowercase letters.
     */
    public UserName(String firstName, String lastName) {
        possibleNames = new ArrayList<>();
        for(int i = 1; i<= firstName.length(); i++){
            possibleNames.add(lastName+firstName.substring(0,i));
        }
    }

    public ArrayList<String> getPossibleNames() {
        return possibleNames;
    }

    /** Returns true if arr contains name, and false otherwise. */
    public boolean isUsed(String name, String[] arr) {
        for(String str: arr){
            if(str.equals(name)) return true;
        }
        return false;
    }

    /** Removes strings from possibleNames that are found in usedNames
     as described in part (b). Your solution must call isUsed for full credit.
     */
    public void setAvailableUserNames(String[] usedNames) {
            for(int i = 0; i < possibleNames.size(); i++){
                if (isUsed(possibleNames.get(i),usedNames)){
                    possibleNames.remove(i);
                    i--;
                }
            }
    }
}
