


public class person{
  private String fname;
  private String lname;
  private String gender;
  private String emailAdd;
  private String cpNum;
  
  public person(){}
  
  public void setfname(String fname){
    this.fname = fname;
  }
  public void setlname(String lname){
    this.lname = lname;
  }
  public void setgender(String gender){
    this.gender = gender;
  }
  public void setemailAdd(String emailAdd){
    this.emailAdd = emailAdd;
  }
  public void setcpNum(String cpNum){
    this.cpNum = cpNum;
  }
  
  public String getfname(){
    return fname;
  }
  public String getlname(){
    return lname;
  }
  public String getgender(){
    return gender;
  }
  public String getemailAdd(){
    return emailAdd;
  }
  public String getcpNum(){
    return cpNum;
  }
  
  public void printName(){
    System.out.print(fname + " " + lname);
  }
  public void printPerson(){
    System.out.println("First Name: " + fname);
    System.out.println("Last Name: " + lname);
    System.out.println("Gender: " + gender);
    System.out.println("Email Address: " + emailAdd);
    System.out.println("Contact Number: " + cpNum);
  }
}