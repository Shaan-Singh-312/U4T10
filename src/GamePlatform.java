import java.util.ArrayList;

public class GamePlatform {
    /**
     * An ArrayList of all player accounts
     */
    private ArrayList<GameAccount> allPlayers;

    // NOT PROVIDED IN THE FRQ; ADDED HERE TO ENABLE TESTING
    public GamePlatform(ArrayList<GameAccount> allPlayers) {
        this.allPlayers = allPlayers;
    }

    // NOT PROVIDED IN THE FRQ; ADDED HERE TO ENABLE TESTING
    public ArrayList<GameAccount> getAllPlayers() {
        return allPlayers;
    }

    /**
     * Returns the average age of players in allPlayers whose age
     * is between 13 and 19, inclusive
     * Preconditions: allPlayers contains at least one player
     * whose age is between 13 and 19.
     * allPlayers is not null and contains no null
     * elements.
     * Postcondition: allPlayers is unchanged.
     */
    public double avgTeenAccounts() {
        int ageSum = 0;
        int count = 0;
        for(GameAccount acc: allPlayers){
            if (acc.getAge() <= 19 && acc.getAge() >= 13){
                ageSum += acc.getAge();
                count++;
            }
        }
        return (double) ageSum/count;
    }

}