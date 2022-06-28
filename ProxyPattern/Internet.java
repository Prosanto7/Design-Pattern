package ProxyPattern;

public interface Internet {
    void connect(String url);
}

class RealInternet implements Internet {
    @Override
    public void connect(String url) {
        System.out.println("Connecting to "+url);
    }
}

class ProxyInternet implements Internet {

    private Internet realInternet;

    public ProxyInternet() {
        realInternet = new RealInternet();
    }

    @Override
    public void connect(String url) {
        if (url.contains("youtube")) {
            System.out.println("Access Denied");
        } else {
            realInternet.connect(url);
        }
    }
}
