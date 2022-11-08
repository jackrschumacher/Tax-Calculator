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
    double[] federalFlat = { 1027.50, 4807.50, 15213.50, 34647.50, 49355.50, 162718.0 };

    double[] socialSecurityThreshold = { 0, 1470001 };
    double[] socialSecurityPercentage = { 0.62, 0 };
    double[] socialSecurityFlat = { 0, 9114 };

    double[] medicareThreshold = { 0, 2000001 };
    double[] medicarePercentage = { 1.45, 2.35 };
    double[] medicateFlat = { 0, 2900 };

    int stateBracket = 0;

    for (int i = 1; i < stateThreshold.length; i++) {
      if (stateThreshold[i] <= salary[i]) {
        stateBracket++;
      }
    }

    int fedBracket = 0;

    for (int i = 1; i < federalThreshold.length; i++) {
      if (federalThreshold[i] <= salary[i]) {
        fedBracket++;
      }
    }

    int socialSecurityBracket = 0;

    for (int i = 1; i < socialSecurityThreshold.length; i++) {
      if (socialSecurityThreshold[i] <= salary[i]) {
        socialSecurityBracket++;
      }
    }

    int medicareBracket = 0;

    for (int i = 1; i < medicareThreshold.length; i++) {
      if (medicareThreshold[i] <= salary[i]) {
        medicareBracket++;
      }
    }  

    double stateTax = (((salary - stateThreshold[stateBracket]) * statePercentage[stateBracket]) + stateFlat[stateBracket]);
    System.out.println(stateTax);
  }
}