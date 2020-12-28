import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] restaurants = new String[4];

        // Assigning values to the test array
        restaurants = new String[]{"KFC", "Hungry Lion", "Nandos", "Eaterly"};

        // Iterating through the array
        for(String name:restaurants) {
            System.out.println(name);
        }

        Restaurant KFC = new Restaurant();

        // Assign values to restaurant fields
        KFC.location = "Kabulonga";
        KFC.name = "KFC Centro Mall";
        KFC.parking = true;
        KFC.bathroom = "Two bathrooms";
        KFC.type = "Fast food";
        KFC.variation = "Chicken";

        System.out.println(KFC.location);

        //Arraylist
        ArrayList<String> smallRestaurants = new ArrayList<>();

        smallRestaurants.add("Chicken Inn");
        smallRestaurants.add("Sun chicken");
        smallRestaurants.add("Hen bulk");

        System.out.println("The small chicken restaurants are: " + smallRestaurants);
    }
}
