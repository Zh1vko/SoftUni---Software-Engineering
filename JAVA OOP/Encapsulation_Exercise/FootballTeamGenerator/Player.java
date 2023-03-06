package FootballTeamGenerator;

public class Player {

    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
       setName(name);
       setEndurance(endurance);
       setSprint(sprint);
       setDribble(dribble);
       setPassing(passing);
       setShooting(shooting);
    }

    private void setName(String name) {     // TODO: Validation
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    private void setEndurance(int endurance) {      // TODO: Validation
        if (endurance < 0 || endurance > 100) {
            throw new IllegalArgumentException("Endurance should be between 0 and 100.");
        }
        this.endurance = endurance;
    }

    private void setSprint(int sprint) {            // TODO: Validation
        if (sprint < 0 || sprint > 100) {
            throw new IllegalArgumentException("Sprint should be between 0 and 100.");
        }
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {          // TODO: Validation.
        if (dribble < 0 || dribble > 100) {
            throw new IllegalArgumentException("Dribble should be between 0 and 100.");
        }
        this.dribble = dribble;
    }

    private void setPassing(int passing) {          // TODO: Validation
        if (passing < 0 || passing > 100) {
            throw new IllegalArgumentException("Passing should be between 0 and 100.");
        }
        this.passing = passing;
    }

    private void setShooting(int shooting) {            // TODO: Validation
        if (shooting < 0 || shooting > 100) {
            throw new IllegalArgumentException("Shooting should be between 0 and 100.");
        }
        this.shooting = shooting;
    }

    public String getName() {
        return name;
    }

    public double overallSkillLevel() {
        double skillLevel = 0;
        skillLevel = (endurance + sprint + dribble + passing + shooting) / 5.0;

        return skillLevel;
    }
}
