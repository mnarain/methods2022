package sr.unasat.methods.services;

public class TafelService {

    public void tafelVan10() {
        System.out.println("1 * 10 = " + 1 * 10);
        System.out.println("2 * 10 = " + 2 * 10);
        System.out.println("3 * 10 = " + 3 * 10);
        System.out.println("4 * 10 = " + 4 * 10);
        System.out.println("5 * 10 = " + 5 * 10);
        System.out.println("6 * 10 = " + 6 * 10);
        System.out.println("7 * 10 = " + 7 * 10);
        System.out.println("8 * 10 = " + 8 * 10);
        System.out.println("9 * 10 = " + 9 * 10);
        System.out.println("10 * 10 = " + 10 * 10);
    }

    // gebruik een while loop om tafel vcan 10 uit te printen
    public void tafelVan10While() {
       int multiplier = 1;
       while (multiplier <= 10){
           System.out.println( multiplier + " * 10 = " + (multiplier * 10));
           multiplier++;
       }
    }
}
