import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/**
 * Code for HW6
 * @author James Hines
 */
/**
   A table for lookups and reverse lookups
*/
public class LookupTable
{ 
   private ArrayList<Item> byKey;
   private ArrayList<Item> byValue;

   /**
      Constructs a LookupTable object.
   */
   public LookupTable()
   { 
      byKey = new ArrayList<Item>();
      byValue = new ArrayList<Item>();
   }
   
   /**
      Reads key/value pairs.
      @param in the scanner for reading the input
   */
   public void read(Scanner in) 
   { 
      while (in.hasNext()) {
    	  String zip = in.next();
    	  String city = in.next();
    	  byKey.add(new Item(zip,city));
    	  byValue.add(new Item(city,zip));

    	  	

    	  	
      }
   }
   
   /**
      Looks up an item in the table.
      @param k the key to find
      @return the value with the given key, or null if no
      such item was found.
   */
   public String lookup(String k)
   { 
	   String city = null;
	   int location = Collections.binarySearch(byKey, (new Item(k, null)));
	   if (location >= 0) {
		   city = byKey.get(location).getValue();
	   }

	return city;
   }

   /**
      Looks up an item in the table.
      @param v the value to find
      @return the key with the given value, or null if no
      such item was found.
   */
   public String reverseLookup(String v)
   { 
	   String zip = null;
	   int location = Collections.binarySearch(byValue, (new Item(v, null)));
	   if (location >= 0) {
		   zip = byValue.get(location).getValue();
	   }
	   return zip;
   }
}
