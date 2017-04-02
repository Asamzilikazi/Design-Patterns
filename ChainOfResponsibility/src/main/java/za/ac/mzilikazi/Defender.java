package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017-04-02.
 */
public class Defender extends Team{
    public Defender() {
    }

    public String team(FootballPositions position) {
        String str = null;
        if(position == FootballPositions.DEFENDER) {
            return "Defender ";
        } else {
            if(this.team != null) {
                str = this.team.team(position);
            }

            return "Not Defender " + str;
        }
    }

    public String toString(String string) {
        return string;
    }
}
