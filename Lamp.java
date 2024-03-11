package z01_eng.exercise2;

public class Lamp {
    
    private boolean lit;
    private int bulbBrightness;
    private Bulb bulb;

    public Lamp() {
        this.lit = false;
        this.bulbBrightness = 0;
        bulb = new Bulb();
        bulb.setState(false);
    }

    public boolean isLit() {
        boolean shine;
        if(lit && !bulb.getIsBurnt()){
            shine = true;
            System.out.println("Lamp is Lit");
        } else{
            shine = false;
            System.out.println("Lamp is not Lit");
        }
        return shine;
    }

    public void setIsLit(boolean turnedOn){
        this.lit = turnedOn;
    }

    public int getBrightnessLevel() {
        return bulbBrightness;
    }

    public void switchOn() {
        
        if(!bulb.getIsBurnt()){
            this.lit = true;
            bulb.setState(lit);
            this.bulbBrightness = 1;
            System.out.println("Lamp is Switched On");
        }
        else {
            System.out.println("Bulb is burnt");
        }
    }

    public void switchOff() {
        this.lit = false;
        bulb.setState(lit);
        this.bulbBrightness = 0;
    }
   
    public void brighten() {
        if(!bulb.getIsBurnt()){
            if (this.lit && this.bulbBrightness < 10) {
                this.bulbBrightness++;
            } else if (this.lit && this.bulbBrightness == 10) {
                this.lit = false;
                this.bulbBrightness = 0;
                bulb.setIsBurnt(true);
                System.out.println("The bulb has burned out!");
            }
        }
        else { 
            this.lit = false;
            this.bulbBrightness = 0;
            bulb.setIsBurnt(true);
            System.out.println("Bulb is burnt");
        }
    }

    public void dim() {
        if (this.lit && this.bulbBrightness > 0) {
            this.bulbBrightness--;
            if (this.bulbBrightness == 0) {
                this.lit = false;
                bulb.setState(lit);
            }
        }
    }

    public boolean replaceBulb() {
        if (!this.lit && !bulb.getState()) {
            System.out.println("Bulb replaced!");
            return true;
        } else {
            System.out.println("Please switch off the lamp first!");
            return false;
        }
    }

    public boolean isOn() {
        return this.lit && bulb.getState();
    }

    public int getIntensity() {
        return this.bulbBrightness;
    }
}
