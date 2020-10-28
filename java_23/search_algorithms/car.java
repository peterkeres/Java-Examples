
package search_algorithms;

/**
 * this class will be the base for all car objects 
 * @author peter keres
 * date: Nov 15 2018
 * f@ck cancer
 */


public class car implements Comparable<car> {
    public String cityMPG,classification,driveLine,eType,fType,
            height,highMPG,horse,hybrid,ID,length,make,
            modelY,gears,torque,tran,width,year;
    /**
     * this gets the data about each car and puts it in the object
     * @param A
     * city mpg
     * @param B
     * classification 
     * @param C
     * driveline
     * @param D
     * engine type
     * @param E
     * fuel type
     * @param F
     * height
     * @param G
     * highway mpg
     * @param H
     * horsepower
     * @param I
     * hybrid
     * @param J
     * id
     * @param K
     * length
     * @param L
     * make
     * @param M
     * model year
     * @param N
     * gears
     * @param O
     * torque
     * @param P
     * trans
     * @param Q 
     * width
     * @param R
     * year
     */
    public car(String A,String B,String C,String D,
            String E,String F,String G,String H,
            String I,String J,String K,String L,
            String M,String N,String O,String P,
            String Q,String R){
        
        this.cityMPG = A;
        this.classification = B;
        this.driveLine = C;
        this.eType = D;
        this.fType = E;
        this.height = F;
        this.highMPG = G;
        this.horse = H;
        this.hybrid = I;
        this.ID = J;
        this.length = K;
        this.make = L;
        this.modelY = M;
        this.gears = N;
        this.torque = O;
        this.tran = P;
        this.width = Q;
        this.year = R;
    }
    
    
    /**
     * this toString returns all values of this car object with titles
     * @return 
     * a sting of every item this object holds
     */
    @Override
    public String toString(){
        
        return "city mpg: " + this.cityMPG +
                "/ class: " + this.classification +
                "/ driveline: " + this.driveLine +
                "/ engine type: " + this.eType +
                "/ fuel type: " + this.fType +
                "/ Height: " + this.height +
                "/ highway mpg: " + this.highMPG +
                "/ Horse power: " + this.horse +
                "/ Hybrid: " + this.hybrid +
                "/ ID: " + this.ID +
                "/ Length: " + this.length +
                "/ Make: " + this.make +
                "/ Model year: " + this.modelY +
                "/ num gears: " + this.gears +
                "/ Torque: " + this.torque +
                "/ Transmission: " + this.tran +
                "/ Width: " + this.width + 
                "/ year: " + this.year;
    }
    
    
    /**
     * this compares 2 car objects based on the ID of the car object
     * @param o
     * the other car object 
     * @return 
     * a call to the compareTO string method passing it the ID field
     */
    @Override
    public int compareTo(car o){
        
        return this.ID.compareTo(o.ID);
    }
}
