package sr.unasat.methods.app;

import sr.unasat.methods.services.TafelService;

public class Application {

    public static void main(String[] args) {

        TafelService ts = new TafelService();
        System.out.println();
        int result = ts.printMethods();
        System.out.println(result);
        result = ts.printMethods("1 hoedjes");
        System.out.println(result);
        result = ts.printMethods("1 hoedje", "2 hoedjes");
        System.out.println(result);
        result = ts.printMethods("1 hoedje", "2 hoedjes", "3 hoedjes");
        System.out.println(result);
        result = ts.printMethods("1 hoedje", "2 hoedjes", "3 hoedjes", "4 hoedjes");
        System.out.println(result);
        result = ts.printMethods("1 hoedje", "2 hoedjes", "3 hoedjes", "4 hoedjes", "5 hoedjes");
        System.out.println(result);
        //maak 3 methods aan die respectievelijk 3, 4, 5 parameters accepteren.
        // voor elke parameter die je toev oegd dien je de paramater waarde te printen in een apparte sout

    }
}
