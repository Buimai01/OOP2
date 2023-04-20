package Acess_Modifier;

public class testflashlamp {
    public static void main(String[] args) {
       Battery denPin = new Battery();
       Flashlamp denPin3 = new Flashlamp();
       denPin3.setden_pin(denPin);
       for (int i = 1; i <= 10; i++) {
           denPin3.turnOn();
           denPin3.turnOff();
       }
        System.out.println("Năng lượng còn lại trong pin: " + denPin3.getBatteryInfo());
    }
}
