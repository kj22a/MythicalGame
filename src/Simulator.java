public class Simulator extends Bonus {
    int level;

    Simulator(int mageVal, int archerVal, int halberdierVal, int cavalryVal, char civ, int level) {
        super(mageVal, archerVal, halberdierVal, cavalryVal, civ);
        this.level = level;
    }

    int[] CPU() {
        if (level > 20) {
            return new int[] {};
        }
        int health = 100000 + level * 10000;
        int attack = 3250 + level * 200;
        return new int[] {health, attack};
    }

    String gameplay() {
        int[] computer = CPU();
        int[] player = new Bonus(mageVal, archerVal, halberdierVal, cavalryVal, civ).calculator();
        int days = 0;

        while (true) {
            computer[0] -= player[1];
            player[0] -= computer[1];
            days += 1;

            if (player[0] < 0 && computer[0] < 0) {
                return "You have self sacriced to invade the kingdom in " + days + " days!";
            } else if (player[0] < 0) {
                return "You have failed to invade the kingdom in " + days + " days!";
            } else if (computer[0] < 0) {
                return "You have successfully invaded the kingdom in " + days + " days!";
            }
        }
    }

}
