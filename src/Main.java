public class Main {
    public static void main(String[] args) {


        String carMake = "Ford";
        int doors = 4;


        if (carMake.equals("Ford")) {
            if (doors == 4) {
                System.out.println("Auto ima cetvoro vrata.");}
            else if (doors != 4) {
                System.out.println("Auto nije porodicni.");}
        }
        else {
            System.out.println("Proizvodjac nije Ford.");
        }

    }
}