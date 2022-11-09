import java.util.*;
// Import all the things in the java.util library
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Setup a new scanner and take scanner input from the user
    System.out.println("How much money do you make each year?");
    double salary = input.nextDouble();
    // Setup state, Federal, Social Secuirty, and Medicare Arrays
    // Setup Thresholds ($ amount), Percentages, and Flat Rates in each of the arrays
    double[] stateThreshold = { 0, 12761, 25521, 280950 };
    double[] statePercentage = { 0.0354, 0.0465, 0.053, 0.0765 };
    double[] stateFlat = { 0, 451.70 , 1045.04, 14582.83};

    double[] federalThreshold = { 0, 10276, 41776, 89076, 170051, 215951, 539901 };
    double[] federalPercentage = { .1, .12, .22, .24, .32, .35, .37 };
    double[] federalFlat = { 0, 1027.50, 4807.50, 15213.50, 34647.50, 49355.50, 162718.0 };

    double[] socialSecurityThreshold = { 0, 1470001 };
    double[] socialSecurityPercentage = { 0.062, 0 };
    double[] socialSecurityFlat = { 0, 9114 };

    double[] medicareThreshold = { 0, 2000001 };
    double[] medicarePercentage = { 0.0145, 0.0235 };
    double[] medicareFlat = { 0, 2900 }; 

    // Setup state for loop. Sarts at 1 and continues as long as index is less than stateThreshold
    // If slary is greater than the state Threshold the state bracket increments by 1
    int stateBracket = 0;

    for (int i = 1; i < stateThreshold.length; i++) {
      if (salary >= stateThreshold[i]) {
        stateBracket++;
      }
    }

    // Setup federal for loop. Sarts at 1 and continues as long as index is less than federalThreshold
    // If slary is greater than the federal Threshold the state bracket increments by 1
    int fedBracket = 0;

    for (int i = 1; i < federalThreshold.length; i++) {
      if (salary >= federalThreshold[i]) {
        fedBracket++;
      }
    }
    // Setup Social Security for loop. Sarts at 1 and continues as long as index is less than socialSecurity Threshold
    // If slary is greater than the Social Security Threshold the state bracket increments by 1
    int socialSecurityBracket = 0;

    for (int i = 1; i < socialSecurityThreshold.length; i++) {
      if (salary >= socialSecurityThreshold[i]) {
        socialSecurityBracket++;
      }
    }
    // Setup medicare for loop. Sarts at 1 and continues as long as index is less than medicareThreshold
    // If slary is greater than the medicare Threshold the state bracket increments by 1
    int medicareBracket = 0;

    for (int i = 1; i < medicareThreshold.length; i++) {
      if (salary >= medicareThreshold[i]) {
        medicareBracket++;
      }
    }  

    // Calculate federal, state, Medicare and Social Security Tax 
    // Salary - Thresholds with the Brackets * the Percentage with the bracket + Flat rate with the bracket value
    double stateTax = (((salary - stateThreshold[stateBracket]) * statePercentage[stateBracket]) + stateFlat[stateBracket]);
    System.out.println("State Taxed Amount "+stateTax);
    double federalTax = (((salary - federalThreshold[fedBracket]) * federalPercentage[fedBracket]) + federalFlat[fedBracket]);
    System.out.println("Federal Taxed Amount "+ federalTax);
    double socialSecurityTax =(((salary - socialSecurityThreshold[socialSecurityBracket]) * socialSecurityPercentage[socialSecurityBracket]) + socialSecurityFlat[socialSecurityBracket]);
    System.out.println("Social Security Amount Taxed:" + socialSecurityTax);
    double medicareTax = (((salary - medicareThreshold[medicareBracket])* medicarePercentage[medicareBracket]) + medicareFlat[medicareBracket]);
    System.out.println("Medicare amount Tax:" + medicareTax);

    // Print out your income after taxes to the console
    double total = salary - (stateTax + federalTax + socialSecurityTax + medicareTax);
    System.out.println("Your total income, after taxes " + total + " Dollars");
  }
}