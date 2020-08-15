import javax.swing.JOptionPane;
public class DialogBox2
{
   public static void main (String[] args)
   {
       int divisor = 0;
       int quotient = 0;
       int dividend = 100;
       boolean goodInput = true;
       int count = 0;
       
       String s = "";
       
       
       do{
           goodInput = true;
           s = JOptionPane.showInputDialog(null, "Enter an integer");
           try{
           divisor = Integer.parseInt(s);
           quotient = dividend/divisor;
        }
            catch (NumberFormatException A)
            {
                System.out.println("Please enter a number of some type.");
                goodInput = false;
            }
            
            catch (ArithmeticException A)
            {
                System.out.println("Please enter a non zero number.");
                goodInput = false;
            }  
            finally 
            {
                count = count + 1;
            }
        } while (!goodInput);
       JOptionPane.showMessageDialog(null, "The result is "+quotient + " and you got " + (count -1) + " errors while typing.");    
       
    }
}