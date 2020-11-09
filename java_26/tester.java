
/**
 *  Testing out the new cell and new grids
 *
 * @author (Peter Keres)
 * @version (1.0.0)
 */
public class tester {
    
    public static void main(String[] args)
    {
        
        NewGrid grid = new NewGrid(50,50,300);
        
       
        grid.open(1,1);
        grid.flag(10,10);
        System.out.println(grid);
        
        grid.open(30,30);
        
        System.out.println(grid);
        
        
        
    }
}
