
package BridgePattern;

public class Main 
{
    public static void main(String[]args)
    {
        Device device= new Tv();
        
        Remote remote=new Basic_remote(device);
        remote.increaseVolume();
        remote.increaseChannel();
        remote.togglePower();
        System.out.println(device);
    }
    
}
