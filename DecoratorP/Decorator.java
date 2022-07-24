package DecoratorP;

public abstract class Decorator implements IceCream{
    IceCream iceCream;
    
    Decorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public int getPrice() {
        return iceCream.getPrice();
    }

    public String prepare() {
        return iceCream.prepare();
    }
}

class Wafer extends Decorator {

    Wafer(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 150;
    }

    @Override
    public String prepare() {
        return super.prepare() + " Wafer ";
    }
}


class Chocolate extends Decorator {

    Chocolate(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 350;
    }

    @Override
    public String prepare() {
        return super.prepare() + " Chocolate ";
    }
}

