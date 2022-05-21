package sr.unasat.methods.w3schools;

public class IfExamples {

    public static void main(String[] args) {
        int pincode = 1234;
        int ingvoerdePincode = 1234;
        double pinBedrag = 1000;

        if (pincode == ingvoerdePincode) {
            //indien de pincode correct is controlleer of het gevraagde bedrag maximaal 1000srd is
            if (pinBedrag <= 1000) {
                System.out.println("Het aangevraagde bedrag van: " + pinBedrag + " wordt verstrekt");
            } else {
                //indien het bedrag groter dan 1000srd is geef aan dat dit bedrag niet is toegestaan
                System.out.println("Het aangevraagd bedrag van: " + pinBedrag + " is meer dan het toegestaan bedrag van 1000");
            }
        } else {
            //geef hier aan aat de pincode fout is
            System.out.println("Uw pincode is incorrect");
        }


    }
}


// Er is een atm
// als  de pin code correct is ingevoerd mag men een bedrag aanvragen tot 1000srd
// verwerk dit in een if else statement
