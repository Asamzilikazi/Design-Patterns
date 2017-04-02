package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017-04-02.
 */
public class Forward extends Team{
        public Forward() {
        }

        public String team(FootballPositions position) {
            String str = null;
            if(position == FootballPositions.FORWARD) {
                return "Forward ";
            } else {
                if(this.team != null) {
                    str = this.team.team(position);
                }

                return "Not Forward " + str;
            }
        }

        public String toString(String string) {
            return string;
        }
}


