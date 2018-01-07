// import java.util.Collections;
// import java.util.HashMap;
import java.util.*;

class Main{

  public static void main(String[] args) {

    HashMap<Character, Integer> map = new HashMap<Character, Integer>();

    map.put('c',25);
    map.put('a',29);
    map.put('b',15);
    map.put('d',2);
    map.put('f',5);

    Collections.sort(map);

    Set set = map.entrySet();
    // Get a set of the entries

       // Get an iterator
       Iterator i = set.iterator();

       // Display elements
       while(i.hasNext()) {
          Map.Entry me = (Map.Entry)i.next();
          System.out.print(me.getKey() + ": ");
          System.out.println(me.getValue());
       }
  }
}
