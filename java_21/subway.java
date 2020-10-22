
/**This class will hold all the route objects for this subway system
 *Peter Keres
 * 9-12-18
 * f@ck Cancer
 */

import java.util.*;

public class subway {
    
    ArrayList<route> routeList = new ArrayList<route>();
    
    /**
     * this constructor will add the default routes to the list of routes in the subway object
     * @param r1   is a route object that will be the first default route
     * @param r2   is a route object that will be the second default route
     * @param r3   is a route object that will be the third default route
     */
    public subway (route r1, route r2, route r3)
    {
        routeList.add(r1);
        routeList.add(r2);
        routeList.add(r3);
    }
    
    /**
     * this will add a new route object to the subway's route list
     * @param name     is a string of what the name of the new route will be
     */
    public void addRoute(String name)
    {
        route x = new route(name);
        routeList.add(x);
    }
    
    /**
     * will remove a route from the subway's routes
     * @param s   a string of the name of what route to remove 
     */
    public void removeRoute(String s)
    {
        route x = new route(s);
        //to get out of an exception of delete an item from the list while searching it at same time
        //using a dummy object route called delete to hold the route i want to delete
        route delete = new route("delete");
        //on the strange occurrence someone would name a route "delete"
        boolean deleteFlag = false;
        
        for (route z : routeList)
        {
            //if it finds that route wanting to delete, put a copy of that route in delete
            if (z.getNameRoute().equalsIgnoreCase(x.getNameRoute()))
            {
                delete = z;
                deleteFlag = true;
            }
        }
        
        if (deleteFlag)
            routeList.remove(delete);         
    }
    
    /**
     * this will take 2 stations, will give a list of stations needed to cross to get from a to b 
     * If following the code, please look at the comments. they help section it up
     * @param a     is the station where you are starting from 
     * @param b     is the station that you want to end at
     * @return      will return a list of stations needed to take inorder to get from a to b
     *              if ether station is not in the subway, it will return null
     */
    public List<station> getRouteBetweenStations(station a, station b)
    {
        // finding out what routes each station are in 
        route aRoute = findRoute(a);
        route bRoute = findRoute(b);
        // if ether station are not in the subway, return null
        if (aRoute == null || bRoute == null)
        {
            return null;
        }
      
        int aIndex, bIndex;
        station crossR = new station("R");
        station crossMu = new station("Mu");
        List<station> returnList = new ArrayList<station>();
        
        // this is look to see if station a is in same route as station b
        // if so, will return a list of stations between the "station a" and "station b"
        for (station x : aRoute.stationsList)
        {
            if ( x.getNameStation().equalsIgnoreCase(b.getNameStation()))
            {
                aIndex = findIndex(a,aRoute);
                bIndex = findIndex(b,aRoute);
                
                if (aIndex >= bIndex)
                {
                    for (int i = aIndex; i >= bIndex; i--)
                    {
                        returnList.add(aRoute.stationsList.get(i));
                    }
                }
                else
                {
                    for (int i = aIndex; i <= bIndex; i++)
                    {
                        returnList.add(aRoute.stationsList.get(i));
                    }
                }
                return returnList;
            }   
        }
        
        // this is to return a station list when the stations are in 2 different routes
        // when "station a" is in "route1"
        //      will have 2 cases, if "station b" is in "route 2" or "route 3"
        if (aRoute.getNameRoute().equalsIgnoreCase("route1"))
        {
            aIndex = findIndex(a, aRoute);
            
            // when "station b" is in "route2"
            if (bRoute.getNameRoute().equalsIgnoreCase("route2"))
            {
                bIndex = findIndex(b,bRoute);
                // getting everything from "station a" to cross point "r"
                if (aIndex <= findIndex(crossR, aRoute))
                {
                    for (int i = aIndex; i <= findIndex(crossR, aRoute); i++)
                    {
                        returnList.add(aRoute.stationsList.get(i));
                    }
                }
                if (aIndex > findIndex(crossR, aRoute))
                {
                    for (int i = aIndex; i >= findIndex(crossR, aRoute); i--)
                    {
                        returnList.add(aRoute.stationsList.get(i));
                    }
                }
                // getting everything from cross point "r" to "station b"
                if (bIndex < findIndex(crossR, bRoute))
                {
                    for (int i = (findIndex(crossR, bRoute) - 1); i >= bIndex; i--)
                    {
                        returnList.add(bRoute.stationsList.get(i));
                    }
                }
                if (bIndex > findIndex(crossR, bRoute))
                {
                    for (int i = (findIndex(crossR, bRoute) + 1); i <= bIndex; i++)
                    {
                        returnList.add(bRoute.stationsList.get(i));
                    }
                }
                return returnList;
            }
            
            // when "station b" is in "route3"
            if (bRoute.getNameRoute().equalsIgnoreCase("route3"))
            {
                bIndex = findIndex(b,bRoute);
                // getting everything from "station a" to the cross point "Mu"
                if (aIndex <= findIndex(crossMu, aRoute))
                {
                    for (int i = aIndex; i <= findIndex(crossMu, aRoute); i++)
                    {
                        returnList.add(aRoute.stationsList.get(i));
                    }
                }
                if (aIndex > findIndex(crossMu, aRoute))
                {
                    for (int i = aIndex; i >= findIndex(crossMu, aRoute); i--)
                    {
                        returnList.add(aRoute.stationsList.get(i));
                    }
                }
                
                //getting everything from cross point "Mu" to "station b"
                if (bIndex < findIndex(crossMu, bRoute))
                {
                    for (int i = (findIndex(crossMu, bRoute) - 1); i >= bIndex; i--)
                    {
                        returnList.add(bRoute.stationsList.get(i));
                    }
                }
                if (bIndex > findIndex(crossMu, bRoute))
                {
                    for (int i = (findIndex(crossMu, bRoute) + 1); i  <= bIndex; i++)
                    {
                        returnList.add(bRoute.stationsList.get(i));
                    }
                }
                
                return returnList;
            }
        }
        
        // when "station a" is in "route 2"
        //      will have 2 cases, if "station b" is in "route 1" or in "route 3"
        if (aRoute.getNameRoute().equalsIgnoreCase("route2"))
        {
            aIndex = findIndex(a,aRoute);
            //when "station b" is in "route1"
            if (bRoute.getNameRoute().equalsIgnoreCase("route1"))
            {
                bIndex = findIndex(b,bRoute);
                //getting everything from "station a" to cross point "r"
                if (aIndex <= findIndex(crossR, aRoute))
                {
                    for (int i = aIndex; i <= findIndex(crossR, aRoute); i ++)
                    {
                        returnList.add(aRoute.stationsList.get(i));
                    }
                }
                if (aIndex > findIndex(crossR, aRoute))
                {
                    for (int i = aIndex; i >= findIndex(crossR, aRoute); i--)
                    {
                        returnList.add(aRoute.stationsList.get(i));
                    }
                }
                //getting everything from cross point "r" to "station b"
                if (bIndex < findIndex(crossR, bRoute))
                {
                    for (int i = (findIndex(crossR, bRoute) - 1); i >= bIndex; i--)
                    {
                        returnList.add(bRoute.stationsList.get(i));
                    }
                }
                if (bIndex > findIndex(crossR, bRoute))
                {
                    for (int i = (findIndex(crossR, bRoute) + 1); i <= bIndex; i++)
                    {
                        returnList.add(bRoute.stationsList.get(i));
                    }
                }
                return returnList;
            }
            
            // When "station b" is in "route3"
            if (bRoute.getNameRoute().equalsIgnoreCase("route3"))
            {
                bIndex = findIndex(b,bRoute);
                // getting everything from "station a" to cross point "r"
                if (aIndex <= findIndex(crossR, aRoute))
                {
                    for (int i = aIndex; i <= findIndex(crossR, aRoute); i++)
                    {
                        returnList.add(aRoute.stationsList.get(i));
                    }
                }
                if (aIndex > findIndex(crossR, aRoute))
                {
                    for (int i = aIndex; i >= findIndex(crossR, aRoute); i--)
                    {
                        returnList.add(aRoute.stationsList.get(i));
                    }
                }
                
                // getting everything between cross point "r" and "mu"
                for (int i = (findIndex(crossR, routeList.get(0)) + 1); i <= findIndex(crossMu, routeList.get(0)) ; i++)
                {
                    returnList.add(routeList.get(0).stationsList.get(i));
                }
                
                // getting everything from cross point "mu" to "station b"
                if (bIndex < findIndex(crossMu, bRoute))
                {
                    for (int i = (findIndex(crossMu, bRoute) - 1); i >= bIndex; i--)
                    {
                        returnList.add(bRoute.stationsList.get(i));
                    }
                }
                if (bIndex > findIndex(crossMu, bRoute))
                {
                    for (int i = (findIndex(crossMu, bRoute) + 1); i <= bIndex; i++)
                    {
                        returnList.add(bRoute.stationsList.get(i));
                    }
                }
                            
                return returnList;        
            }
        }
        
        // when "station a" is in "route3"
        //      will have 2 cases, if "station b" is in "route 1" or in "route 2"
        if (aRoute.getNameRoute().equalsIgnoreCase("route3"))
        {
            aIndex = findIndex(a,aRoute);
            
            // when "station b is in "route 1"
            if (bRoute.getNameRoute().equalsIgnoreCase("route1"))
            {
                bIndex = findIndex(b,bRoute);
                // getting everything from "station a" to cross point "mu"
                if (aIndex <= findIndex(crossMu, aRoute))
                {
                    for (int i = aIndex; i <= findIndex(crossMu, aRoute); i++)
                    {
                        returnList.add(aRoute.stationsList.get(i));
                    }
                }
                if (aIndex > findIndex(crossMu, aRoute))
                {
                    for (int i = aIndex; i >= findIndex(crossMu, aRoute); i--)
                    {
                        returnList.add(aRoute.stationsList.get(i));
                    }
                }
                
                // getting everything from cross point "mu" to "station b"
                if (bIndex < findIndex(crossMu, bRoute))
                {
                    for (int i = (findIndex(crossMu, bRoute)-1); i >= bIndex; i--)
                    {
                        returnList.add(bRoute.stationsList.get(i));
                    }
                }
                if (bIndex > findIndex(crossMu, bRoute))
                {
                    for (int i = (findIndex(crossMu, bRoute) +1); i <= bIndex; i++)
                    {
                        returnList.add(bRoute.stationsList.get(i));
                    }
                }
                return returnList;
            }
            
            // when "station b" is in "route 2"
            if (bRoute.getNameRoute().equalsIgnoreCase("route2"))
            {
                bIndex = findIndex(b,bRoute);
                // getting everything from "station a" to cross point "mu"
                if (aIndex <= findIndex(crossMu, aRoute))
                {
                    for (int i = aIndex; i <= findIndex(crossMu, aRoute); i++)
                    {
                        returnList.add(aRoute.stationsList.get(i));
                    }
                }
                if (aIndex > findIndex(crossMu, aRoute))
                {
                    for (int i = aIndex; i >= findIndex(crossMu, aRoute); i--)
                    {
                        returnList.add(aRoute.stationsList.get(i));
                    }
                }
                
                // getting everything between crossing "mu" and "r"
                for (int i = (findIndex(crossMu, routeList.get(0)) - 1); i >= findIndex(crossR, routeList.get(0)) ; i--)
                {
                   returnList.add(routeList.get(0).stationsList.get(i));
                }
                
                // getting everything from crossing "r" to "station b"
                if (bIndex < findIndex(crossR, bRoute))
                {
                    for (int i = (findIndex(crossR, bRoute) - 1); i >= bIndex; i--)
                    {
                        returnList.add(bRoute.stationsList.get(i));
                    }
                }
                if (bIndex > findIndex(crossR, bRoute))
                {
                    for (int i = (findIndex(crossR, bRoute) + 1); i <= bIndex; i++)
                    {
                        returnList.add(bRoute.stationsList.get(i));
                    }
                }
                
                return returnList;
            }
        }

        return null;
    }
    
    /**
     * this will find the index of a station object in the route that is sent 
     * @param a   is the station we are trying to find the index of
     * @param aRoute    is the route in which we are searching for the station
     * @return   will return the index of the station, if not found will return -1
     */
    public int findIndex (station a, route aRoute)
    {
        int index = -1;
        
        for ( station x : aRoute.stationsList)
        {
            index += 1;
            if (x.getNameStation().equalsIgnoreCase(a.getNameStation()))
            {
                return index;
            }
        }
        return index;
    }
    
    /**
     * this is to find what route the station that is sent belongs too
     * @param a  is the station we are trying to find the route of
     * @return   returns a route object that the station we send it is in 
     */
    public route findRoute (station a)
    {
        for (route x : routeList)
        {
            for (station y : x.stationsList)
            {
                if (a.getNameStation().equalsIgnoreCase(y.getNameStation()))
                {
                    return x;
                }
            }
        } 
        return null;
    }
    
}
