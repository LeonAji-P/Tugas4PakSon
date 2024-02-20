package Main;

public class Main {
   public static void main (String[]args){
            
       
             User leon = new User();

      // menggunakan method setter
      leon.setUsername("leon");
      leon.setPassword("eon123");

      // menggunakan method getter
      System.out.println("Username: " + leon.getUsername());
      System.out.println("Password: " + leon.getPassword());  
        }
           
     }     