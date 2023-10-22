public class BinarySearch {
    static final int[] felder = new int[7];
    public int findeMich(int anfang, int ende, int ziel){
            if(anfang > ende){
                System.out.println("Nicht gefunden im Array!");
            }
            final int mitte = ((anfang + ende) / 2);
            if(felder[mitte] == ziel){
                System.out.println("Gefunden beim Index " + mitte);
            }
            if(felder[mitte] > ziel){
                return findeMich(anfang, ende, mitte - 1);
            }
            if(felder[mitte] < ziel){
                return findeMich(anfang, ende, mitte + 1);
            }
            return 1;
        }
    }
