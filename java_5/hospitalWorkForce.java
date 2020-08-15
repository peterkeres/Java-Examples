
/**
 * this is the tester class for the hopstial employee paretn class and all the child classes
 *
 * @author (Peter Keres)
 * @version (4 7 2018)
 */

import java.util.Scanner;


public class hospitalWorkForce
{
   public static void main(String[] args)
   {
      //var
      int userPick, number;
      String name;
      
      //objects
      Scanner scan = new Scanner(System.in);
      
      
      //greeting user and figuring out what employee they have
      System.out.println("Welcome to the work force program." + "\n" + "Please answer the following the questions.");
      System.out.println("What is the name of the employee?");
      name = scan.next();
      System.out.println("What is " + name + "'s number?");
      number = scan.nextInt();
      System.out.println("What is " + name + "'s job titel? Please use the following char.");
      System.out.println("1: doctor     2: nurse    3: administrator    4: receptionist     5: surgeon      6: janitor");
      userPick = scan.nextInt();
      
      if (userPick == 1)        //for doctor
      {
          String speciality;
          
          System.out.println("What type of doctor is " + name + "?");
          speciality = scan.next();
          
          doctor employee = new doctor (name, number, speciality);
          
          
          //printing
          System.out.println("");
          System.out.println("");
          System.out.println("You have the following employee's." + "\n" + employee.dignose());
       }
      else if (userPick == 2)
      {
          int numPatients;
          
          System.out.println("How many patients does " + name+ " look over?");
          numPatients = scan.nextInt();
          
          nurse employee = new nurse(name, number, numPatients);
          
          
          System.out.println("");
          System.out.println("");
          System.out.println("You have the following employee's." + "\n" + employee.assist());
        }
      else if (userPick == 3)
      {
          String deparmentHead;
          
          System.out.println("What deparment is " + name + " in charge over?");
          deparmentHead = scan.next();
          
          administrator employee = new administrator(name, number, deparmentHead);
          
          System.out.println("");
          System.out.println("");
          System.out.println("You have the following employee" + "\n" + employee.chargeOf());
        }
      else if (userPick == 4)
      {
          String building, phone;
          
          
          System.out.println("What building does " + name + " work at?");
          building = scan.next();
          System.out.println("do they answer the phone? y for yes and a n for no.");
          phone = scan.next();
          
          if (phone.equalsIgnoreCase("y"))
          {
              receptionist employee = new receptionist(name,number,building,true);
              
              
              System.out.println("");
              System.out.println("");
              System.out.println("You have the following employee" + "\n" + employee.area());
          }
          else
          {
              receptionist employee = new receptionist(name,number,building,false);
              
              System.out.println("");
              System.out.println("");
              System.out.println("You have the following employee" + "\n" + employee.area());
            }
            
       }
       else if ( userPick == 5)
       {
           String organ;
           
           System.out.println("What type of surgeon is " + name + "?");
           organ = scan.next();
           
          surgeon employee = new surgeon(name, number, organ);
           
          System.out.println("");
          System.out.println("");
          System.out.println("You have the following employee" + "\n" + employee.job());
        }
        else
        {
            String masterKey, portableMopStation;
            boolean bMasterKey, bPortableMopStation;
            
            System.out.println("does " + name + " have a master key? a y for yes and a n for no");
            masterKey = scan.next();
            System.out.println("does "+ name+ " have a mop station? a y for yes and a n for no");
            portableMopStation = scan.next();
            
            if (masterKey.equalsIgnoreCase("y"))
                bMasterKey = true;
            else
                bMasterKey = false;
                
            if (portableMopStation.equalsIgnoreCase("y"))
                bPortableMopStation = true;
            else
                bPortableMopStation = false;
                
            janitor employee = new janitor(name, number, bMasterKey, bPortableMopStation);
            
            
            
           System.out.println("");
           System.out.println("");
           System.out.println("You have the following employee" + "\n" + employee.ability());
        }     
            
            
    }
}