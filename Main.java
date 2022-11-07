import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

  System.out.println("How much money do you make each year?");
  double salary = input.nextDouble();

  double[] stateThreshold = {0, 12761, 25521, 280950};
  double[] statePercentage = {3.54, 4.65, 7.65, 7.65};
  double[] stateFlat = {0, 451,70, 14582.83, 14582.83};

  double[] federalThreshold = {0, 10276, 41776, 89076, 170051, 215951, 539901};
  double[] federalPercentage = {.1, .12, .22, .24, .32, .35, .37};
  double[] federalFlat = {1027.50, 4807.50, 15213.50, 34647.50, 49355.50, 162718};

  double[] socialSecurityThreshold = {0, 1470001};
  double[] socialSecurityPercentage = {0.62, 0};
  double[] socialSecurityFlat = {0, 9114};

  double[] medicareThreshold = {0, 2000001};
  double[] medicarePercentage = {1.45, 2.35};
  double[] medicateFlat = {0,2900};


  int stateBracket = 0;

  for(int i = 0; i< stateThreshold.length; i++){
    if(stateThreshold[i] >= salary){
      stateBracket++;
    }
  }
    
  int fedBracket = 0;
    
  for(int i = 0; i < federalThreshold.length; i++){
    if(federalThreshold[i] >=salary){
      fedBracket++;
    }
  }

  int socialSecurityBracket = 0;

  for(int i = 0; i < socialSecurityThreshold.length; i++){
    if(socialSecurityThreshold[i] >= salary){
      socialSecurityBracket++;
    }
  }

  int medicareBracket = 0;

  for(int i = 0; i < medicareThreshold.length; i++){
    if(medicareThreshold[i] >= salary){
      medicareBracket++;
    }
  }

  
  }
}