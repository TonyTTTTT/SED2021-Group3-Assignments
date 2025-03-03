package q9;

/**
 * @author Shine Chang
 */
public class Team {
    private HashMap<Integer, Players[]> players = new HashMap<>();

    public Player getPlayersByYear(Integer year) {
        return players.get(year);
    }

    public void addPlayer(Integer year ,Player player) {
        players.put(year, player);
    }
}
