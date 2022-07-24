
package BridgePattern;

public class Basic_remote implements Remote{

    Device device;
    Basic_remote(Device device)
    {
        this.device=device;
    }
    @Override
    public void togglePower()
    {
       device.setPowerStatus(!device.getPowerStatus());
    }

    @Override
    public void increaseVolume() 
    {
        device.setVolume(device.getVolume()+1);
    }

    @Override
    public void decreaseVolume() 
    {
        device.setVolume(device.getVolume()-1);
    }

    @Override
    public void increaseChannel() 
    {
        device.setChannel(device.getChannel()+1);
    }

    @Override
    public void decreaseChannel() 
    {
        device.setChannel(device.getChannel()-1);
    }
    
}
