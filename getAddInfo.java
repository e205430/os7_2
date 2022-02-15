import java.net.*;

public class getAddInfo
{
    public static void main (String[] args)
    {
        try {
            InetAddress hostadr = InetAddress.getLocalHost();
            String Hosname= hostadr.getHostName();
            InetAddress[] adr_list = InetAddress.getAllByName(Hosname);            System.out.println(Hosname);
            for (InetAddress adr : adr_list)
            {
                System.out.println(adr);
            }
        }
        catch(UnknownHostException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("END");
        }
    }
}
