
package BridgePattern;

public class Tv implements Device 
{

   boolean power;
   int volume;
   int channel;
   Tv()
   {
       power=true;
       volume=1;
       channel=12;
   }
    public boolean getPowerStatus() 
    {
        return  power;    
    }

   
    public int getVolume() 
    {
        return volume;
    }

    
    public int getChannel() 
    {
        return channel;
       
    }

    @Override
    public void setPowerStatus(boolean power)
    {
       this.power=power;
    }

    @Override
    public void setVolume(int volume) 
    {
        this.volume=volume;
    }

    @Override
    public void setChannel(int channel) 
    {
        this.channel=channel;
    }
    public String toString()
    {
        return "Power status: "+this.power+"\nvolume: "+this.volume+"\nChannel: "+this.channel;
    }
    
}
