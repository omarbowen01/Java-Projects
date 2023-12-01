import java.util.Scanner;

public class Main {
  public static void main(String[] args)
{
  int number = 600;
if (number < 200) 
{ 
   System.out.println("Low spender"); 
}
else if (number < 500) 
{ 
   System.out.println("Spending in moderation"); 
}
else if (number < 1000) 
{ 
   System.out.println("Above average!"); 
}
else 
{ 
   System.out.println("High Roller!"); 
}
}
}
  