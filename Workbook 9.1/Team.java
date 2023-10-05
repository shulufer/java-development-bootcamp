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
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayer(String position) {
        // TODO
        return null;
    }

    public void setPlayer(String position, String player) {
        // TODO
    }


}
