import java.rmi.*;

public interface Rmi_Interface extends Remote
{
 public int add(int a, int b) throws RemoteException;  
}
