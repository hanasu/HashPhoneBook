import java.util.*;
import java.io.*;

class PhoneBook {
   public static void main(String []args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      in.nextLine();
      Map dict = new HashMap();
       
      for (int i = 0; i < n; i++) {
         String name = in.nextLine();
         int phone = in.nextInt();
         in.nextLine();
         dict.put(name, phone);
      }
      
      while(in.hasNext()) {
         String s = in.nextLine();
         boolean found = false;
         
         if (dict.containsKey(s)) {
            System.out.println(s + "=" + dict.get(s));
            found = true;
         }  
          
         if (found == false) {
            System.out.println("Not found");
         }
          
         found = false;
      }
   }
}

class Person {
    String name;
    Integer phone = null;
    
    public Person(String nm, int ph) {
        name = nm;
        phone = ph;
    }
}
