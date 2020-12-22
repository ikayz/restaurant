public class Main {
    public static void main(String[] args) {
        String[] restaurants = new String[4];

        restaurants = new String[]{"KFC", "Hungry Lion", "Nandos", "Eaterly"};

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
    }
}
