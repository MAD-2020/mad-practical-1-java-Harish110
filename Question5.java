import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter number of inputs ");
    int num = in.nextInt();

    ArrayList<Integer> numList = new ArrayList<Integer>(); 

    for(int i = 0; i < num; i++)
    {
      System.out.print("Enter n integer: "); 
      int value = in.nextInt();
      numList.add(value);
    }
    in.close(); 

    int mode = 0; 
    int total = 0; 

    for(int j = 0; j < num; j++)
    {
      int counter = 0;
      for(int k = 0; k < num; k++)
      {
        if(numList.get(k) == numList.get(j))
        {
          counter += 1;
        }
      }
      if(counter > total) 
      {
        total = counter;
        mode = numList.get(j);
      }
    }
    System.out.println(mode);
    
  }
}
