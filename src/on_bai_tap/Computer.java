package on_bai_tap;

public class Computer {
    private String id;
    private String name;
    private double mass;
    private double ram;
    private int harddrive;
    private int price;
    private String cpu;
    private String operatingsystem;

    public Computer() {
        this.id = "MT0001";
        this.name = "Máy tính mặc định";
        this.mass = 2;
        this.ram = 8;
        this.harddrive = 128;
        this.price = 1000000;
        this.cpu = "i3 9100f";
        this.operatingsystem = "Window";
    }

    public Computer(String id) {
        this.id = this.id;
    }

    public Computer(String id, String name) {
        this.id = this.id;
        this.name = this.name;
    }

    public Computer(String id, String name, double mass) {
        this.id = this.id;
        this.name = this.name;
        this.mass = this.mass;
    }

    public Computer(String id, String name, double mass, double ram) {
        this.id = this.id;
        this.name = this.name;
        this.mass = this.mass;
        this.ram = this.ram;
    }

    public Computer(String id, String name, double mass, double ram, int harddrive) {
        this.id = this.id;
        this.name = this.name;
        this.mass = this.mass;
        this.ram = this.ram;
        this.harddrive = this.harddrive;
    }
    public Computer(String id, String name, double mass, double ram, int harddrive, int price) {
        this.id = this.id;
        this.name = this.name;
        this.mass = this.mass;
        this.ram = this.ram;
        this.harddrive = this.harddrive;
        this.price = this.price;
    }
    public Computer(String id, String name, double mass, double ram, int harddrive, int price, String cpu) {
        this.id = this.id;
        this.name = this.name;
        this.mass = this.mass;
        this.ram = this.ram;
        this.harddrive = this.harddrive;
        this.price = this.price;
        this.cpu = this.cpu;
    }
    public Computer(String id, String name, double mass, double ram, int harddrive, int price, String cpu, String operatingsystem) {
        this.id = this.id;
        this.name = this.name;
        this.mass = this.mass;
        this.ram = this.ram;
        this.harddrive = this.harddrive;
        this.price = this.price;
        this.cpu = this.cpu;
        this.operatingsystem = this.operatingsystem;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    public double getRam() {
        return ram;
    }

    public int getHarddrive() {
        return harddrive;
    }

    public int getPrice() {
        return price;
    }

    public String getCpu() {
        return cpu;
    }

    public String getOperatingsystem() {
        return operatingsystem;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public void setHarddrive(int harddrive) {
        this.harddrive = harddrive;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setOperatingsystem(String operatingsystem) {
        this.operatingsystem = operatingsystem;
    }
}
class AppComputer {
    public static void main(String[] args) {
        Computer objMT1 = new Computer();
        objMT1.setName("Dell");
        objMT1.setPrice(2000000);
        System.out.println("Computer Id:" + objMT1.getId());
        System.out.println("Computer Name:" + objMT1.getName());
        System.out.println("Computer Mass:" + objMT1.getMass());
        System.out.println("Computer Ram:" + objMT1.getRam());
        System.out.println("Computer Harddrive:" + objMT1.getHarddrive());
        System.out.println("Computer Cpu:" + objMT1.getCpu());
        System.out.println("Computer OperatingSystem:" + objMT1.getOperatingsystem());
        System.out.println("Computer Price:"+ objMT1.getPrice());
        Computer objMT2 =  new Computer("MT0002", "Macbook", 1.4);
        objMT2.setRam(16);
        System.out.println("Computer Id:" + objMT2.getId());
        System.out.println("Computer Name:" + objMT2.getName());
        System.out.println("Computer Mass:" + objMT2.getMass());
        System.out.println("Computer Ram:" + objMT2.getRam());
        System.out.println("Computer Harddrive:" + objMT2.getHarddrive());
        System.out.println("Computer Cpu:" + objMT2.getCpu());
        System.out.println("Computer OperatingSystem:" + objMT2.getOperatingsystem());
        System.out.println("Computer Price:"+ objMT2.getPrice());
    }
}
class CyberGame {
   private String id;
   private String name;
   private String address;
   private Computer [] newComputer;
   private int quantity;
   public CyberGame() {
       this.id = "CBG0001";
       this.name = "Cybergame";
       this.address = "Hà Nội";
       this.newComputer = new Computer[200];
       this.quantity = 0;
   }
   public CyberGame (int quantity) {
       this.newComputer = new Computer[quantity];
       this.quantity = 0;
   }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Computer[] getNewComputer() {
        return newComputer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNewComputer(Computer[] newComputer) {
        this.newComputer = newComputer;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
class Computerlist {
    public Computer [] listcomputer;
    public int numberofcomputer;
    public Computerlist () {
        listcomputer = new Computer[0];
        this.numberofcomputer = 0;
    }
    public boolean addComputer( Computer newComputer ) {
        int currentlistcomputerlenght = listcomputer.length;
        Computer[] newlistcomputer = new Computer [currentlistcomputerlenght +1];
        for (int i = 0; i < currentlistcomputerlenght; i++) {
            newlistcomputer[i] = listcomputer [i];
        }
        newlistcomputer [currentlistcomputerlenght] = newComputer;
        numberofcomputer++;
        listcomputer = newlistcomputer;
        return  true;
    }
}
