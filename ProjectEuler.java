import java.util.ArrayList;

public class ProjectEuler {
   public static int problem1(){ // Multiple of 3 or 5
      int value = 0;
      for (int i = 999; i > 0; i--){ 
         if (i % 3 == 0 || i % 5 == 0){
            value += i;
         }
      }
      return value;
   }
   public static int problem2(){ // Smallest Multiple
      int value = 1;
      int multiplier = 2;
      int morphMultiplier = 0;
      int primes[] = {2, 3, 5, 7, 11, 13, 17, 19};
      for (int i = 0; i < 20; i++){
      morphMultiplier = multiplier;
      ArrayList<Integer> factors = new ArrayList<>();
      int factor;
      boolean hasExecuted = false;
         for (int g = 0; g < 8; g++){
            factor = primes[g];
            while (morphMultiplier % factor == 0 && !hasExecuted && factor < morphMultiplier){
               morphMultiplier /= factor;
               factors.add(factor);
               if (morphMultiplier % factor != 0){
                  hasExecuted = true;
               }
            }
            
         }
        // factors.add(multiplier);
         if (value % morphMultiplier != 0){
            value *= morphMultiplier;
         }
         if (factors.size() > 1){
            int sampleValue = value;
            for (int g = 0; g < factors.size(); g++){
               if (sampleValue % factors.get(g) == 0){
                  sampleValue /= factors.get(g);
               } else {
                  value *= factors.get(g);
               }
            }
         }
      }
      multiplier++;
      return value;
   }
   public static void main(String[] args){
      System.out.println("The answer to problem 1 is: " + problem1());
      System.out.println("The answer to problem 2 is: " + problem2());
   }
}