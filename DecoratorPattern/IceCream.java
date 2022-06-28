//package DecoratorPattern;
//
//public interface IceCream {
//    double getPrice();
//    String getType();
//}
//
//abstract class IceCreamDecorator implements IceCream {
//
//    IceCream iceCream;
//
//    public IceCreamDecorator(IceCream iceCream) {
//        this.iceCream = iceCream;
//    }
//
//
//
//}
//
//class Vanilla implements IceCream {
//    @Override
//    public double getPrice() {
//        return 100;
//    }
//
//    @Override
//    public String getType() {
//        return "Vanilla";
//    }
//}
//
//class StrawBerry implements IceCream {
//    @Override
//    public double getPrice() {
//        return 150;
//    }
//
//    @Override
//    public String getType() {
//        return "StrawBerry";
//    }
//}
//
//class Chocolate extends IceCreamDecorator {
//    public Chocolate(IceCream iceCream) {
//        super(iceCream);
//    }
//
//    @Override
//    public int getPrice() {
//        return 0;
//    }
//
//    @Override
//    public String getFlavour() {
//        return "Chocolate";
//    }
//
//
//}
//
//class Nuts extends IceCreamDecorator {
//    public Nuts(IceCream iceCream) {
//        super(iceCream);
//    }
//
//    @Override
//    public int getPrice() {
//        return 0;
//    }
//
//    @Override
//    public String getFlavour() {
//        return "Nuts";
//    }
//}
//
//class Wafer extends IceCreamDecorator {
//    public Wafer(IceCream iceCream) {
//        super(iceCream);
//    }
//
//    @Override
//    public int getPrice() {
//        return 0;
//    }
//
//    @Override
//    public String getFlavour() {
//        return "Wafer";
//    }
//}