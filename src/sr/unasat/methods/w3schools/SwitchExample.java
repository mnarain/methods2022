package sr.unasat.methods.w3schools;

public class SwitchExample {

    public static void main(String[] args) {
        String choiceOfBeverage = "Test";
        switch (choiceOfBeverage) {
            case "Water":
                System.out.println("Water SRD 10.00");
                break;
            case "Pepsi":
                System.out.println("Pepsi SRD 10.00");
                break;
            case "Cola":
                System.out.println("Cola SRD 10.00");
                break;
            case "Fanta":
                System.out.println("Fanta SRD 10.00");
                break;
            case "Punch":
                System.out.println("Punch SRD 10.00");
                break;
            default:
                System.out.println("Uw keuze " + choiceOfBeverage + " komt niet voor. \nSelecteer aub een andere drank");
                break;
        }
    }


}


//ik heb een vending machine met 5 verschillende dranken
//gebruik een switch om een drank te kunnen kiezen en de prijs door te geven.