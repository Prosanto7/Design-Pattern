package ProxyPattern;

public class Main {
    public static void main(String[] args) {
        Internet proxyInternet = new ProxyInternet();
        proxyInternet.connect("www.google.com");
        proxyInternet.connect("www.youtube.com");
        proxyInternet.connect("www.facebook.com");
    }
}
