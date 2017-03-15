import java.rmi.*;
import java.rmi.server.*;

public class Rmi_Implementation extends UnicastRemoteObject implements Rmi_Interface
{  
 Rmi_Implementation() throws RemoteException
  {
   super(); 
  }
public int add(int a, int b)
 {  
  return (a+b);
 }
}

