/**
 * assignment 5 , making the insert coin method and the enter label method
 *
 * Just testing out that all the objects work as intended
 *
 * @author (Peter Keres)
 * @version (1.0.0)
 */
public class Tester {
    
    
    public static void main(String[] args)
    {
        
        System.out.println("PROGRAM START");
        
        VendingMachine testM = new VendingMachine();
        
        
        System.out.println(testM);
        
        
        testM.insert(new Coin(25));
        
        System.out.println(testM);
        
        testM.enterLabel("A1");
        
        
        System.out.println(testM);
        
        System.out.println("PROGRAM END");
        
        
    }
}
