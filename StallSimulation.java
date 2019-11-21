public class StallSimulation
{
   public static final int STALL_NUMBER = 10; //The number of stalls

   public static void main(String[] args)
   {
      boolean[] stalls = new boolean[STALL_NUMBER];
      for (int i = 0; i < stalls.length; i++)
      {
         stalls[nextStall(stalls)] = true;
         printStalls(stalls);
      }
   }//main
   
   /**
      Prints arrays such that _ if element is false and X if element is true
      @param stalls array of boolean inputs
   */
   public static void printStalls(boolean[] stalls)
   {
      for (int i = 0; i < stalls.length; i++)
      {
         if (stalls[i])
         {
            System.out.print("X ");
         }
         else
         {
            System.out.print("_ ");
         }
      }
      System.out.println();
   }//printStalls

   /**
      Calculates the index in the middle of the longest run of "false"s
      @param stalls array indicating if a stall is occupied
      @return index of middle of longest run of falses in stalls
   */
   public static int nextStall(boolean[] stalls)
   {
      int longestIndex = -1;
      int longestRun = 0;
      int currentIndex = -1;
      int currentRun = 0;
      boolean inRun = false;
      
      //Don't forget return statement
   }//nextStall

}//class