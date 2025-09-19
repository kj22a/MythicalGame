public class Population {
    int mageVal;
    int archerVal;
    int halberdierVal;
    int cavalryVal;

    Population(int mageVal, int archerVal, int halberdierVal, int cavalryVal) {
        this.mageVal = mageVal;
        this.archerVal = archerVal;
        this.halberdierVal = halberdierVal;
        this.cavalryVal = cavalryVal;
    }
    int[] mage() {
        int health = 50;
        int attack = 10;
        return new int[] {health * mageVal, attack * mageVal};

    }

    int[] archers() {
        int health = 100;
        int attack = 5;
        return new int[] {health * archerVal, attack * archerVal};
    }

    int[] halberdier() {
        int health = 250;
        int attack = 4;
        return new int[] {health * halberdierVal, attack * halberdierVal};
    }

    int[] cavalry() {
        int health = 400;
        int attack = 2;
        return new int[] {health * cavalryVal, attack * cavalryVal};
    }
}
