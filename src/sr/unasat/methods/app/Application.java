package sr.unasat.methods.app;

import sr.unasat.methods.services.TafelService;

public class Application {

    public static void main(String[] args) {

        TafelService ts = new TafelService();
        ts.printMethods();
        ts.printMethods("Er is 1 method in de tafelservice class");

    }
}
