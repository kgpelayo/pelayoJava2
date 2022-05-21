

public class employee{
  private String empNum;
  public String position;
  public String office;
  public String salary;
  public person sample = new person();
  
  public void setefname(String fname){
    this.sample.setfname(fname);
  }
  public void setelname(String lname){
    this.sample.setlname(lname);
  }
  public void setegender(String gender){
    this.sample.setgender(gender);
  }
  public void seteemailAdd(String emailAdd){
    this.sample.setemailAdd(emailAdd);
  }
  public void setecpnum(String cpnum){
    this.sample.setcpNum(cpnum);
  }
  public void setempNum(String empNum){
    this.empNum = empNum;
  }
  public void setposition(String position){
    this.position = position;
  }
  public void setoffice(String office){
    this.office = office;
  }
  public void setsalary(String salary){
    this.salary = salary;
  }
  
  public String getefname(){
    return this.sample.getfname();
  }
  public String getelname(){
    return this.sample.getlname();
  }
  public String getegender(){
    return this.sample.getgender();
  }
  public String geteemailAdd(){
    return this.sample.getemailAdd();
  }
  public String getecpnum(){
    return this.sample.getcpNum();
  }
  public String getempNum(){
    return this.empNum;
  }
  public String getposition(){
    return this.position;
  }
  public String getoffice(){
    return this.office;
  }
  public String getsalary(){
    return this.salary;
  }
  
  public void printEmployeeDetails(){
    System.out.println("\n\n-----Employee Details-----\n");
    System.out.println("Name: "+getefname()+" "+getelname());
    System.out.println("Gender: "+getegender());
    System.out.println("Email Address: "+geteemailAdd());
    System.out.println("Contact Number: "+getecpnum());
    System.out.println("Employee Number: "+empNum);
    System.out.println("Position: "+ position);
    System.out.println("Office: "+office);
    System.out.println("Salary: "+salary);
  }
}
