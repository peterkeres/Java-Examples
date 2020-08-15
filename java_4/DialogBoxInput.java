import javax.swing.JOptionPane;
public class DialogBoxInput
{
   public static void main (String[] args)
   {
       String s = JOptionPane.showInputDialog(null, "Enter an integer");
       System.out.println("You entered "+ s);
       int n = 0;
       try
       {
       n = Integer.parseInt(s);
       }
    
        catch (NumberFormatException A)
        {
            System.out.println("Please enter a number no letters.");
        }
       System.out.println("Conversation was really successful."+"the integer is "+ n);     
     }
}
