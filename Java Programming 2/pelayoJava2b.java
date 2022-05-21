
import java.util.*;

class pelayoJava2b {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    employee sample = new employee();
        
        System.out.println("First Name: ");
          String efname = sc.nextLine();
          System.out.println("     "+efname);
        
        System.out.println("Last Name: ");
          String elname = sc.nextLine();
          System.out.println("     "+elname);
        
        System.out.println("Gender: ");
          String egender = sc.nextLine();
          System.out.println("     "+egender);
        
        System.out.println("Email Address: ");
          String eemail = sc.nextLine();
          System.out.println("     "+eemail);
        
        System.out.println("Contact Number: ");
          String econtact = sc.nextLine();
          System.out.println("     "+econtact);
          
        System.out.println("Employee Number: ");
          String empNum = sc.nextLine();
          System.out.println("     "+empNum);
          
        System.out.println("Position:");
          String position = sc.nextLine();
          System.out.println("     "+position);
        
        System.out.print("Office: ");
          String office = sc.nextLine();
          System.out.println("     "+office);
        
        System.out.println("Salary: ");
          String salary = sc.nextLine();
          System.out.println("     "+salary);
        
      sample.setefname(efname);
      sample.setelname(elname);
      sample.setegender(egender);
      sample.seteemailAdd(eemail);
      sample.setecpnum(econtact);
      sample.setempNum(empNum);
      sample.setposition(position);
      sample.setoffice(office);
      sample.setsalary(salary);
      
      sample.printEmployeeDetails();
        
    
    
  }
}
