import java.util.Scanner;

class mainMenu
{
   public static void main(String[] args)
   {
      System.out.println("Welcome to Mastermind!");
      System.out.println("Type the following number to decide:");
      System.out.println("1:Player vs Computer");
      System.out.println("2:Computer vs Player");
      System.out.println("3:Statistics");
      System.out.println("4:Help");
      System.out.println("5:Exit");
      
      Scanner keyboard = new Scanner(System.in);
      
      int menuChoice = keyboard.nextInt();
      
      System.out.println(menuChoice);
      
      if (menuChoice == 1)
      {
         //Player v Computer 
         System.out.println("choice 1");
      }
      else if (menuChoice == 2)
      {
         //Computer v Player
         System.out.println("Choice 2");
      }
      else if (menuChoice == 3)
      {
         //Stat
         System.out.println("Choice 3");
      }
      else if (menuChoice == 4)
      {
         //Help
         System.out.println("Choice 4");
      }
      else if (menuChoice == 5)
      {
         //Exit
         System.out.println("Choice 5");
      }
      
   }
}