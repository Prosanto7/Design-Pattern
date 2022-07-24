package ProxyP;

public interface Internet {
    public void connect(String url);
}

class RealInternet implements Internet {

    @Override
    public void connect(String url) {
        System.out.println("Connected to " + url);
    }
}

class ProxyInternet implements Internet {
    Internet realInternet;
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
