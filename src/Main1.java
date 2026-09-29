public class Main1 {

    public static void main(String[] args) {

        double springCost = 250.00;
        double summerCost = 175.50;
        double fallCost = 300.25;
        double winterCost = 450.75;

        double yearlyCost;

        yearlyCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("Spring maintenance cost: $" + springCost);
        System.out.println("Summer maintenance cost: $" + summerCost);
        System.out.println("Fall maintenance cost: $" + fallCost);
        System.out.println("Winter maintenance cost: $" + winterCost);
        System.out.println("Total yearly maintenance cost: $" + yearlyCost);
    }
}
