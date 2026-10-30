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
      int testValue = 2521;
      int indexI = 0;
      int primes[] = {2, 3, 5, 7, 11, 13, 17, 19};
      int divisor = 2;
      while (testValue % divisor != 0 || divisor != 19) {
         if (testValue % divisor == 0){
            indexI++;
            divisor = primes[indexI];
         } else {
            testValue++;
            divisor = 2;
            indexI = 0;
         }
         
      }
      System.out.println(divisor);
      System.out.println(indexI);
      return testValue;
   }
   public static void main(String[] args){
      System.out.println("The answer to problem 1 is: " + problem1());
      System.out.println("The answer to problem 2 is: " + problem2());
   }
}