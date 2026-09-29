void main()
{

    double purchasePrice = 10.75;
    final double SALES_TAX_RATE = .05;
    double salesTax = 0;
    double total = 0;

    salesTax = purchasePrice * SALES_TAX_RATE;
    total = purchasePrice + salesTax;
    System.out.println("The sales tax on " + purchasePrice + " is " + salesTax);
    System.out.println("The total cost plus tax is " + total);

}