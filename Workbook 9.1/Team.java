import java.util.HashMap;
import java.util.Map;

public class Team {

    private String name;
    private Map<String, String> players;

    public Team(String name) {
      this.name = name;
      players = new HashMap<>();

    }

    public String getName() {
        return new String(name);
    }

    public void setName(String name) {
        this.name = new String(name);
    }

    public String getPlayer(String position) {
        return players.get(new String(position));
    }

    public void setPlayer(String position, String player) {
        players.put(new String(position), new String(player));
    }


}
