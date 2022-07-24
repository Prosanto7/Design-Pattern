package DecoratorP;

public interface IceCream {
    public int getPrice();
    public String prepare();
}

class  Vanilla implements IceCream {

    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public String prepare() {
        return "Vanilla ";
    }
}
