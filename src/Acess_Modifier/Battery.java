package Acess_Modifier;

public class den_pin {
    int energy;
    den_pin() {
        energy = 100;
    }
    public void setEnergy( int energy) {
        this.energy= energy;
    }
    public int getEnergy() {
        return energy;
    }
    public void deceaseEnergy() {
        if (this.energy > 0) {
            this.energy--;
        }
    }
}

