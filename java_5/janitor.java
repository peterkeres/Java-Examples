
/**
 * this is for child janitor class, which will have the parent class of hopsital employee
 *
 * @author (Peter Keres)
 * @version (4 6 2018)
 * f@ck Cancer
 */
public class janitor extends hospitalEmployee
{
   //var
   private boolean masterKey;
   private boolean portableMopStation;
   
   //con
   public janitor (String bName, int bNumber, boolean bMasterKey, boolean bPortableMopStation)
   {
       super(bName,bNumber);
       masterKey = bMasterKey;
       portableMopStation = bPortableMopStation;
   }
    
   
   //setters
   public void setMasterKey (boolean bMasterKey)
   {
       masterKey = bMasterKey;
    }
  
   public void setPortableMopStation (boolean bPortableMopStation)
   {
       portableMopStation = bPortableMopStation;
    }
    
    
   //getters
   public boolean getMasterKey ()
   {
       return masterKey;
    }
    
   public boolean getPortableMopStation ()
   {
       return portableMopStation;
    }
    
   
   //ability or the "toString"
   public String ability ()
   {
       if ((masterKey == true) && (portableMopStation == true))
       {
           return super.work() + "\n" + "They are a janitor with a masterkey and a portable mop station.";
       }
       else if ((masterKey == true) && (portableMopStation == false)) 
       {
           return super.work() + "\n" + "They are a janitor with a masterkey.";
        }
        else if ((masterKey == false) && (portableMopStation == true))
        {
            return super.work() + "\n" + "they are a janitor with a portable mop station.";
        }
        else
        {
            return super.work() + "\n" + "They are a janitor.";
        }
    }
   
}
