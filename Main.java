import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("How much money do you make each year?");
    double salary = input.nextDouble();

    double[] stateThreshold = { 0, 12761, 25521, 280950 };
    double[] statePercentage = { 0.0354, 0.0465, 0.53, 0.0765 };
    double[] stateFlat = { 0, 451.70 , 1045.04, 14582.83 };

    double[] federalThreshold = { 0, 10276, 41776, 89076, 170051, 215951, 539901 };
    double[] federalPercentage = { .1, .12, .22, .24, .32, .35, .37 };
    double[] federalFlat = { 0, 1027.50, 4807.50, 15213.50, 34647.50, 49355.50, 162718.0 };

    double[] socialSecurityThreshold = { 0, 1470001 };
    double[] socialSecurityPercentage = { 0.62, 0 };
    double[] socialSecurityFlat = { 0, 9114 };

    double[] medicareThreshold = { 0, 2000001 };
    double[] medicarePercentage = { 0.0145, 0.0235 };
    double[] medicateFlat = { 0, 2900 };

    int stateBracket = 0;

    for (int i = 1; i < stateThreshold.length; i++) {
      if (salary >= stateThreshold[i]) {
        stateBracket++;
      }
    }

    int fedBracket = 0;

    for (int i = 1; i < federalThreshold.length; i++) {
      if (salary >= federalThreshold[i]) {
        fedBracket++;
      }
    }

    int socialSecurityBracket = 0;

    for (int i = 1; i < socialSecurityThreshold.length; i++) {
      if (salary >= socialSecurityThreshold[i]) {
        socialSecurityBracket++;
      }
    }

    int medicareBracket = 0;

    for (int i = 1; i < medicareThreshold.length; i++) {
      if (salary >= medicareThreshold[i]) {
        medicareBracket++;
      }
    }  

    double stateTax = (((salary - stateThreshold[stateBracket]) * statePercentage[stateBracket]) + stateFlat[stateBracket]);
    System.out.println("State Taxed Amount "+stateTax);
    double federalTax = (((salary - federalThreshold[fedBracket]) * federalPercentage[fedBracket]) + federalFlat[fedBracket]);
    System.out.println("Federal Taxed Amount "+ federalTax);
    double socialSecurityTax =(((salary - socialSecurityThreshold[socialSecurityBracket]) * socialSecurityPercentage[socialSecurityBracket]) + socialSecurityFlat[socialSecurityBracket]);
    
    
  }
}