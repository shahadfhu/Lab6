import java.rmi.*;
import java.rmi.server.*;

public class UpperImpl extends UnicastRemoteObject implements UpperInterface
{
    public UpperImpl() throws RemoteException
    {
    }

    public char toUpper(char c) throws RemoteException
    {
        return Character.toUpperCase(c);
    }
}
