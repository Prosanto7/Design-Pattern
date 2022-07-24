package FacadePattern;


public class Engine 
{
    AirFlowController afc=new AirFlowController();
    CoolingController cc= new CoolingController();
    FuelInjector fi= new FuelInjector();
    
    public void start()
    {
        afc.airFlowStart();
        cc.onCooling();
        cc.executeCooling();
        fi.fuelInjectStart();
    }
    
    public void end()
    {
        afc.airFlowEnd();
        cc.endCooling();
        fi.fuelInjectEnd();
    }
    
}
