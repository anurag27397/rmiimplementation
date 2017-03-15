import java.rmi.*;
import java.rmi.registry.*;

public class Rmi_Server
{    
 public static void main( String args[])
  {   
  try
   {  
   Rmi_Implementation obj=new Rmi_Implementation();
   Naming.rebind( "A", obj);
   System.out.println("Inside Rmi_Server ");  
   } 
  catch(Exception e)
  {
   System.out.println(e);
   }

   } 
}
