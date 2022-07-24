package BridgeP;

public interface Color {
    public String showColor();
}

class Red implements Color {

    @Override
    public String showColor() {
        return "RED";
    }
}


class Green implements Color {

    @Override
    public String showColor() {
        return "GREEN";
    }
}


class Blue implements Color {

    @Override
    public String showColor() {
        return "BLUE";
    }
}
