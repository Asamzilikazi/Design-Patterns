package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017-04-02.
 */
public class GoalKeeper extends Team {
    public GoalKeeper() {
    }

    public String team(FootballPositions position) {
        String str = null;
        if(position == FootballPositions.GOALKEEPER) {
            return "Goalkeeper ";
        } else {
            if(this.team != null) {
                str = this.team.team(position);
            }

            return "Not GoalKeeper " + str;
        }
    }

    public String toString(String string) {
        return string;
    }
}
