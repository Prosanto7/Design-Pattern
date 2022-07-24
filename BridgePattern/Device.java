
package BridgePattern;


public interface Device
{
    public boolean getPowerStatus();
    public void setPowerStatus(boolean power);
    public void setVolume(int volume);
    public int getVolume();
    public void setChannel(int channel);
    public int getChannel();
       
}
