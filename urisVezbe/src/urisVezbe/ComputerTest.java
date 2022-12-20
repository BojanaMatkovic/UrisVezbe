package urisVezbe;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer c = new Computer(true, "Windows", 8);
		c.OnOff();
		System.out.println(c.isPower());
		System.out.println(c);
		
		Computer c1 = new Computer();
		c1.setOs("Bojana");
		c1.setRam(10);
		c1.setPower(true);
		System.out.println(c1);
		
		
		
		

	}

}
