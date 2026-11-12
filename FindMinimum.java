public class FindMinimum{
   public static int findMin(){
      int min = 10000;
      int randInt = 0;
      for (int i = 0; i < 10; i++){
         randInt = (int) (Math.random() * 100);
         if (randInt < min){
            min = randInt;
         }
      }
      return min;
   }
   
   public static void main(String[] args){
      System.out.println("findMin smallest integer: " + findMin());
   }
}