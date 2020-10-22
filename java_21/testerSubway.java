
/**This is the "main class" for the subway, aka my tester 
 *Peter Keres
 * 9/12/18
 * f@ck cancer
 */

import java.util.Scanner;
import java.util.*;

      
public class testerSubway 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        List<station> printList = new ArrayList<>();
        String again = "yes";
        
        
        //creating the default routes
        route route1 = new route("route1");
        route route2 = new route("route2");
        route route3 = new route("route3");
        //creating the default stations for route 1
        route1.addStation("140");
        route1.addStation("134");
        route1.addStation("Unicentro");
        route1.addStation("100");
        route1.addStation("30");
        route1.addStation("R");
        route1.addStation("Marsella");
        route1.addStation("Mu");
        route1.addStation("Bosa");
        //creating the default stations for route 2
        route2.addStation("Germanla");
        route2.addStation("19");
        route2.addStation("Sabana");
        route2.addStation("R");
        route2.addStation("Espec");
        route2.addStation("F");
        //creating the default stations for route 3
        route3.addStation("Gu");
        route3.addStation("Santiago");
        route3.addStation("SENA");
        route3.addStation("Mu");
        route3.addStation("Timiza");
        //creating the default subway with the default routes
        subway subwayMain = new subway(route1, route2, route3);
        
        //getting input from the user 
        System.out.println("Hello, this program will tell you what stations you need to travel in order to get to your destination.");
        while (again.equalsIgnoreCase("yes") || again.equalsIgnoreCase("y"))
        {
            System.out.print("please enter the name of the station you are starting at: ");
            station start = new station (scan.next());
            System.out.print("Great! Now please enter the destination station: ");
            station destination = new station (scan.next());

            printList = subwayMain.getRouteBetweenStations(start, destination);

            if (printList == null)
            {
                System.out.println("Sorry you must have miss spelled something. Those stations is not in the subway");
                System.out.print("Would you like to try again? If so, enter yes: ");
            }
            else
            {
                System.out.println("here are the stations you need to travel.");
                for (station x : printList)
                {
                    System.out.println(x.getNameStation() + " ");
                }
                System.out.print("would you like to do another set of stations? If so, enter yes: ");
            }
            again = scan.next();
        }
        
        System.out.println("Thanks for using this program. Have a great day!");
        System.out.println("PROGRAM TERMINATING");
        
        
    }
    
   
}
