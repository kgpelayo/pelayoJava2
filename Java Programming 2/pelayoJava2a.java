import java.util.*;


class pelayoJava2a {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
        
        student test = new student();
        
        System.out.println("First Name: ");
          String sfname = sc.nextLine();
          System.out.println("     "+sfname);
        
        System.out.println("Last Name: ");
          String slname = sc.nextLine();
          System.out.println("     "+slname);
        
        System.out.println("Gender: ");
          String sgender = sc.nextLine();
          System.out.println("     "+sgender);
        
        System.out.println("Email Address: ");
          String semail = sc.nextLine();
          System.out.println("     "+semail);
        
        System.out.println("Contact Number: ");
          String scontact = sc.nextLine();
          System.out.println("     "+scontact);
          
        System.out.println("Student Number: ");
          String stnum = sc.nextLine();
          System.out.println("     "+stnum);
          
        System.out.println("Course: ");
          String course = sc.nextLine();
          System.out.println("     "+course);
        
        System.out.println("Department and College: ");
          String dept = sc.nextLine();
          System.out.println("     "+dept);
        
        test.setStudent(sfname, slname);
        test.setStudentgender(sgender);
        test.setStudentContact(semail, scontact);
        test.setstudentNum(stnum);
        test.setcourse(course);
        test.setdept(dept);
        
        test.printStudentDetails();
    
  }
}
