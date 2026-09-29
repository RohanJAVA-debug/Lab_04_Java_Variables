public class Main2 {

    public static void main(String[] args) {

        double balance = 5000.00;
        double interestRate = 0.17;

        double monthOneInterest;
        double monthOneBalance;
        double monthTwoInterest;
        double monthTwoBalance;

        monthOneInterest = balance * interestRate;
        monthOneBalance = balance + monthOneInterest;

        monthTwoInterest = monthOneBalance * interestRate;
        monthTwoBalance = monthOneBalance + monthTwoInterest;

        System.out.println("Starting balance: $" + balance);
        System.out.println("Interest after one month: $" + monthOneInterest);
        System.out.println("Balance after one month: $" + monthOneBalance);
        System.out.println("Interest after two months: $" + monthTwoInterest);
        System.out.println("Balance after two months: $" + monthTwoBalance);
    }
}