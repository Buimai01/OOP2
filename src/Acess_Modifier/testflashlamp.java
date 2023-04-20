package Acess_Modifier;

public class den_pin3 {
    public static void main(String[] args) {
       Battery denPin = new Battery();
       den_pin3 denPin3 = new den_pin3();
       den_pin3.setden_pin(denPin);
       for (int i = 1; i <= 0; i++) {
           den_pin3.turnOn();
           den_pin3.turnOff();
       }
        System.out.println("Năng lượng còn lại trong pin: " + denPin3.getden_pinInfo());
    }
}
