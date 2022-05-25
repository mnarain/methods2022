package sr.unasat.methods.app;

import sr.unasat.methods.entities.Session;
import sr.unasat.methods.services.TafelService;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) throws InterruptedException {

        //gebruiker logged succesvol in
        // er word een session object aangemaakt voor zijn inlog periode
/*        Session session = new Session(1, "Maarten", LocalDateTime.now());
        System.out.println(session.getId());
        System.out.println(session.getUsername());
        System.out.println(session.getStart());
        Thread.sleep(10000);*/

 /*       session.setEnd(LocalDateTime.now());

        System.out.println(session.getEnd());*/
        TafelService ts = new TafelService();
        //  ts.tafelVan10();
        // ts.tafelVan10While();
        // ts.tafelVan10For();
        ts.tafelVan10ForCollection();
       // ts.tafelVan10ForEach();


   /*     System.out.println();

        int result;

        result = ts.printMethods();
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
        System.out.println(result);*/
        //maak 3 methods aan die respectievelijk 3, 4, 5 parameters accepteren.
        // voor elke parameter die je toev oegd dien je de paramater waarde te printen in een apparte sout

    }
}
