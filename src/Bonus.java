public class Bonus extends Population {
    char civ;

    Bonus(int mageVal, int archerVal, int halberdierVal, int cavalryVal, char civ) {
        super(mageVal, archerVal, halberdierVal, cavalryVal);
        this.civ = civ;
    }

    int[] calculator() {
        int[] cavTuple = new Population(mageVal, archerVal, halberdierVal, cavalryVal).cavalry();
        int[] arcTuple = new Population(mageVal, archerVal, halberdierVal, cavalryVal).archers();
        int[] halTuple = new Population(mageVal, archerVal, halberdierVal, cavalryVal).halberdier();
        int[] magTuple = new Population(mageVal, archerVal, halberdierVal, cavalryVal).mage();

        if (civ == 'A' || civ == 'a') {
            cavTuple[0] *= 2;
            cavTuple[1] *= 2;
            return new int[] {cavTuple[0] + arcTuple[0] + halTuple[0] + magTuple[0], cavTuple[1] + arcTuple[1] + halTuple[1] + magTuple[1]};
        } else if(civ == 'B' || civ == 'b') {
            magTuple[0] *= 2;
            magTuple[1] *= 2;
            return new int[] {cavTuple[0] + arcTuple[0] + halTuple[0] + magTuple[0], cavTuple[1] + arcTuple[1] + halTuple[1] + magTuple[1]};
        }
        else if(civ == 'M' || civ == 'm') {
            arcTuple[0] *= 2;
            arcTuple[1] *= 2;
            return new int[] {cavTuple[0] + arcTuple[0] + halTuple[0] + magTuple[0], cavTuple[1] + arcTuple[1] + halTuple[1] + magTuple[1]};
        } else {
            halTuple[0] *= 2;
            halTuple[1] *= 2;
            return new int[] {cavTuple[0] + arcTuple[0] + halTuple[0] + magTuple[0], cavTuple[1] + arcTuple[1] + halTuple[1] + magTuple[1]};
        }
    }
}