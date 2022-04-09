import java.io.*; 
class Box
{
   int l,b,h;
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   public void getInput()throws Exception
   {
    System.out.println("enter length,breadth,height");
    l=Integer.parseInt(br.readLine());
    b=Integer.parseInt(br.readLine());
    h=Integer.parseInt(br.readLine());
 
   }

   public int cal_Area()
  {
   return l*b;
  }
    public int cal_Volume()
  {
   return l*b*h;
  }

  public static void main(String args[])throws Exception
 {
   Box b1=new Box();
   b1.getInput();
   int area=b1.cal_Area();
   int volume=b1.cal_Volume();
   System.out.println("area= "+area);
   System.out.println("volume= "+volume);

  }
 }