
package EmailApplication;

import java.util.Scanner;

public class Email {
   private String firsName;
   private String lastName;
   private String password;
   private String I = "IT FOR HELP";
   private String email;
   private String department;
   private int mailboxCapacity = 500;
   private String alternateEmail;
   private String Examble_Company = "IT FOR HELP.com.sa";
   
  // to bulid constructor to receive firstName, and lastName
  public Email(String firsName,String lastName ){
      this.firsName = firsName;
      this.lastName = lastName;
      System.out.println("Email Created: " + this.firsName + " "+ this.lastName + "\n" );
      
      // to call setDepartment() function.
      this.department = setDepartment();
      System.out.println("department is: " + this.department);
      
      // to call Password() function, and also we must put ((parametrs inside the function)).
      this.password = Password(0);
      
      System.out.println("your password  is: " + this.password);
      
      /* to combine element to generate email.
      this.email = this.firsName.toLowerCase() + "." + this.lastName.toLowerCase()+ " @ " + department + " " + Examble_Company;
      System.out.println("your Email is: " + this.email);
*/
    }
    
  //************here ew make the method function*************** 
  
  private String setDepartment(){
      System.out.print("Enter the department\n 1- for Seales \n 2- for Development \n 3- for Accounting \n 0- for None ");
      
      
      Scanner scan = new Scanner(System.in);
      
      int dept=scan.nextInt();
     
      
       if (dept == 1){
           
           return "Seales";
       }
        else if (dept == 2) {
            
            return "Development";
       }
        else if (dept == 3){
            
            return "Accounting";
        }
        else if (dept == 0){
            
            return "None";
        }
       return "";
  }
  
  private String Password (int length){
 
      String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
      
      // to make a Array in bellow
      char[] password = new char[length];
      
      for (int i=0; i < length; i++ ){
          int rand = (int) (Math.random() * passwordSet.length());
          password[i] = passwordSet.charAt(rand);
      }
      return new String (password);
  }
      // set the emailbox capacity
      
    public void setEmailBox(int capacity){
          
         
         this.mailboxCapacity = capacity;
         
      }
      
       // set the alternate Email

    public void setAlternate_Email(String altEmail){
        
        this.alternateEmail = altEmail;
      
  } 
    
    // set to change the password
    public void ChangePassword(String pass_word){
        
        this.password = pass_word;
    }
    
    //******** an above i made the (set) function*******
    
    // ******* an bellow i made the (get) function******
    
    public int getEmailBox(){
        return mailboxCapacity;
    }
    
    public String getAlternate_Email(){
        return alternateEmail;
    }
    
    public String getChangePassword(){
        
        return password;
}

    
    public String showInfo(){
      return "Display Your name  is :" + firsName + " " + lastName + "\n " + "Company Name:" + I + "\n"
               + " Your email:" + email + "\n Email box capacity:" + mailboxCapacity + "GB";
        
    }
}