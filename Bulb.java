package z01_eng.exercise2;

public class Bulb {
    
    private boolean isBurnt;
    private boolean bulbLit;

    public Bulb() {
		bulbLit = false;
        isBurnt = false;
	}

    public boolean getState()
	{
		return bulbLit;
	}

    public void setState(boolean on)
	{
		bulbLit = on;
	}

    public boolean getIsBurnt()
	{
		return isBurnt;
	}

    public void setIsBurnt(boolean burnt)
	{
		isBurnt = burnt;
	}

	public String getStateText()
	{
		if (getState() == true)
		{
			return "bulb is on";
		}
		else
		{
			return "bulb is off";
		}
	}

	public void switchOn() {
		if (!getIsBurnt()) {
			setState(true);
			System.out.println("Bulb is switched on.");
		} else {
			System.out.println("Cannot switch on burnt out bulb.");
		}
	}
	
	public void brighten() {
		if (getState()) {
			System.out.println("Bulb has brightened.");
		} else {
			System.out.println("Cannot brighten off bulb.");
		}
	}
	
	public void dim() {
		if (getState()) {
			System.out.println("Bulb has dimmed.");
		} else {
			System.out.println("Cannot dim off bulb.");
		}
	}
	
	public void replaceBulb() {
		setIsBurnt(false);
		setState(false);
		System.out.println("Bulb has been replaced and is now off.");
	}
	
}
