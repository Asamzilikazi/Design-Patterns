package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017-04-02.
 */
public abstract class Team {
    Team team;

    public Team() {
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public abstract String team(FootballPositions var1);
}
