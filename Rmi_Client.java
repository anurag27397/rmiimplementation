import java.rmi.*;
public class Rmi_Client
{
public static void main( String args[])
{  
try
{ 
Rmi_Interface obj=(Rmi_Interface)Naming.lookup("A");
System.out.println("Client workng");
System.out.println(obj.add(10,15));
} 
catch( Exception e)
{
System.out.println(e);
}
}
}
