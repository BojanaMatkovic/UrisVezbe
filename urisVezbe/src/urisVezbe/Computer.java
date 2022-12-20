package urisVezbe;

public class Computer {
	
	private boolean power;
	private String os;
	private int ram;
	
	public Computer() {
		
	}
	
	public Computer(boolean power, String os, int ram) {
		this.power=power;
		this.os=os;
		this.ram=ram;
	}

	public void OnOff() {
		if(power==true) {
			power=false;
		}else {
			power=true;
		}
	}
	
	
	
	@Override
	public String toString() {
		return "power=" + power + ", os=" + os + ", ram=" + ram;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		if(os == "Linux" && os=="MacOs" && os=="Windows") {
		}
		else {
			System.out.println("Operativni sistem moze da bude samo : Linux, MacOs ili Windows");
			this.os="built-in";
		}
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		if(ram==2 || ram==4 || ram==8 || ram==16 || ram==32 || ram==64 || ram==128) {
			this.ram = ram;
		}
		else {
			System.out.println("Ram moze imati vrednosti 2,4,8,16,32,64,128");
			this.ram=4;
		}
	}
	
	

}
