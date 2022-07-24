package ProxyP;

public class Main {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        internet.connect("www.google.com");
        internet.connect("www.facebook.com");
        internet.connect("www.youtube.com");
    }
}
