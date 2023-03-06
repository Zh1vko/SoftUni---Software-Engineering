package FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;
    private List<Player> players;

    public Team(String name) {
        setName(name);
        players = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.trim().isEmpty() || name == null) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(String playerName) {
        if (players.stream().anyMatch(e -> e.getName().equals(playerName))) {
            for (Player player : players) {
                if (player.getName().equals(playerName)) {
                    players.remove(player);
                    break;
                }
            }
        }
        else {
            throw new IllegalArgumentException("Player " + playerName + " is not in " + getName() + " team." );
        }
    }



    public double getRating() {
        double skillRatingSum = players.stream().mapToDouble(Player::overallSkillLevel).sum();
        return skillRatingSum / players.size();
    }

}
