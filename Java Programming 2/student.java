

public class student{
  private String studentNum;
  public String course;
  public String dept;
  public person sample = new person();
  
  public void setstudentNum(String studentNum){
    this.studentNum = studentNum;
  }
  public void setcourse(String course){
    this.course = course;
  }
  public void setdept(String dept){
    this.dept = dept;
  }
  public void setStudent(String fname, String lname){
    this.sample.setfname(fname);
    this.sample.setlname(lname);
  }
  public void setStudentgender(String gender){
    this.sample.setgender(gender);
  }
  public void setStudentContact(String emailAdd, String cpNum){
    this.sample.setemailAdd(emailAdd);
    this.sample.setcpNum(cpNum);
  }
  
  public String getstudentNum(){
    return studentNum;
  }
  public String getcourse(){
    return course;
  }
  public String getdept(){
    return dept;
  }
  public String getsfname(){
    return this.sample.getfname();
  }
  public String getslname(){
    return this.sample.getlname();
  }
  public String getsgender(){
    return this.sample.getgender();
  }
  public String getsemailAdd(){
    return this.sample.getemailAdd();
  }
  public String getscpNum(){
    return this.sample.getcpNum();
  }
  
  public void printStudentDetails(){
    System.out.println("\n\n-----Student Details-----\n");
    System.out.println("Name: "+getsfname()+" "+getslname());
    System.out.println("Gender: "+getsgender());
    System.out.println("Email Address: "+getsemailAdd());
    System.out.println("Contact Number: "+getscpNum());
    System.out.println("Student Number: "+getstudentNum());
    System.out.println("Course: "+getcourse());
    System.out.println("Department: "+getdept());
    

    
  }
}