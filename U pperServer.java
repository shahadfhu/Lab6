import java.rmi.registry.*;

public class UpperServer
{
    public static void main(String[] args) throws Exception
    {
        UpperImpl temp = new UpperImpl();
        Registry reg = LocateRegistry.createRegistry(1900);
        reg.rebind("myapp", temp);
        System.out.println("Server is running, binding is complete ...\n");
    }
}
