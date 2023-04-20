package Acess_Modifier;

public class den_pin2 {
    boolean status;
    Battery denPin;
    den_pin2() {
        status = false;
        denPin = null;
    }
    public void setden_pin(Battery b) {
        this.denPin = b;
    }
    int getBatteryInfo() {
       return denPin.getEnergy();
    }
    void turnOn(){
      status = true;
      if(denPin.getEnergy() > 0) {
          System.out.println("Đèn sáng");
          denPin.deceaseEnergy();
      }
    }
    void turnOff() {
        status = false;
        System.out.println("Đèn tắt");

    }
    
}
