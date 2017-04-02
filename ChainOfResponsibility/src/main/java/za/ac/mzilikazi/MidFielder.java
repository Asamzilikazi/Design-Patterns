package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017-04-02.
 */
public class MidFielder extends Team{
    public MidFielder() {
    }

    public String team(FootballPositions position) {
        String str = null;
        if(position == FootballPositions.MIDFIELDER) {
            return "Midfielder ";
        } else {
            if(this.team != null) {
                str = this.team.team(position);
            }

            return "Not Midfielder " + str;
        }
    }

    public String toString(String string) {
        return string;
    }
}
