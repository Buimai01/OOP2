package Acess_Modifier;

public class Battery {
    int energy;
    Battery() {
        energy = 10;
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

