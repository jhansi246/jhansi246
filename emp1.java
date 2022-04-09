import java.io.*;
class employeeinfo
{
   String ename,deptname,companyname,ug,pg;
   int empid;
   float salary;
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   public void getPersonal()throws Exception
   {
   System.out.println("enter Empid,name,department,salary,organization");
   empid=Integer.parseInt(br.readLine());
   ename=br.readLine();
   deptname=br.readLine();
   salary=Float.parseFloat(br.readLine());
   companyname=br.readLine();
   }
  public void getQualification()throws Exception
   {
   System.out.println("enter ug and pg qualification");
   ug=br.readLine();
   pg=br.readLine();
   
   }

   public void displayPersonal()
  {
   System.out.println("Empid= "+empid);
   System.out.println("Name= "+ename);
   System.out.println("Department name= "+deptname);
   System.out.println("salary= "+salary);
   System.out.println("organization= "+companyname);

  }
 public void displayQualification()
  {
   System.out.println("ug= "+ug);
   System.out.println("pg= "+pg);
  }
  public static void main(String args[])throws Exception
 {
   employeeinfo s1=new employeeinfo();
   s1.getPersonal();
   s1.getQualification();
   s1.displayPersonal();
   s1.displayQualification();

  }
 }