import java.net.*;


class DatagramClient 
{
    public static void main(String args[]) throws Exception
    {
        DatagramSocket ds=new DatagramSocket(2001);
        String msg="Hello world";
        DatagramPacket dp=new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localhost"),2000);
        ds.send(dp);
        byte b[]=new byte[1024];
        dp=new DatagramPacket(b,1024);
        ds.receive(dp);
        msg=new String(dp.getData()).trim();
        System.out.print("From server "+msg);
        ds.close();
    }
}