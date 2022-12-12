package petroleum;

public class Petrol {
    public static void main(String[] args) {

        PetrolPurchase sherifPetrolPurchase = new PetrolPurchase("No. 5 Sabo Idi-ape Energy Oil Station", "Diesel", 50, 800 );

        sherifPetrolPurchase.setStationLocation("No. 5 Holland Idi-ape Energy Oil Station");
        String location = sherifPetrolPurchase.getStationLocation();
        System.out.printf("Sherif bought his petroleum in station location: %s%n",location);

        sherifPetrolPurchase.setPetrolType("Diesel");
        System.out.printf("He bought %s not PMS%n", sherifPetrolPurchase.getPetrolType());

        sherifPetrolPurchase.setQuantity(55);
        System.out.printf("He bought %s of %d liters %n", sherifPetrolPurchase.getPetrolType(), sherifPetrolPurchase.getQuantity());

        sherifPetrolPurchase.setPercentageDiscount(0.5);
        System.out.printf("They gave him %.2f naira discount per liter he bought%n", sherifPetrolPurchase.getPercentageDiscount());

        sherifPetrolPurchase.setPricePerLiters(800);
        System.out.println("The " +sherifPetrolPurchase.getPetrolType() + " was "+ sherifPetrolPurchase.getPricePerLiters() + " naira at " + sherifPetrolPurchase.getPercentageDiscount() +" naira discount.");


        System.out.printf("Because of the discount he paid %.2f naira in cash instead of %.2f and he exited the Petrol station.", sherifPetrolPurchase.getPurchaseAmount(), sherifPetrolPurchase.getQuantity() * sherifPetrolPurchase.getPricePerLiters());



    }
}
