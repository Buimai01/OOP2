package mobile;

public abstract class Mobile {
    public void downloadApp() {
    }
}
class Iphone extends Mobile {
    @Override
    public void downloadApp() {
        System.out.println("Download from Appstore");
    }
}
class Nokia extends Mobile {
    @Override
    public void downloadApp() {
        System.out.println(" Download from CHPlay");
    }
}
 class Test {
    public static void main(String[] args) {
        Nokia Nokia  =new Nokia();
        Iphone Iphone = new Iphone();
        Nokia.downloadApp();
        Iphone.downloadApp();
    }
}
