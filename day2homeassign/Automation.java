package week3.day2homeassign;

public  class Automation extends MultipleLanguage {

	public void Selenium() {
    System.out.println("Selenium");		
	}
	
		
		
	
	public void Java() {
		System.out.println("java language");
		
	}
	@Override
	public void python() {
		System.out.println("pyton lang");
	}
	@Override
	public void ruby() {
		System.out.println("ruby lan");
	}
	public static void main(String[] args) {
		Automation at = new Automation();
		at.Selenium();
		at.java();
		at.python();
		at.ruby();
		
	
	}
}

	

	
	


