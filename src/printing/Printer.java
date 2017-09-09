package printing;

public class Printer {
	public boolean isOn;
	public String modelNumber;
	
	public Printer(){
		
	}
	
	public Printer(boolean isOn, String modelNumber) {
		this.isOn = isOn;
		this.modelNumber = modelNumber;
		
		if(isOn){
			print();
		}
	}
	
	public void print() {
		System.out.println(isOn);
		System.out.print(modelNumber);	
		
		String[] colors = new String[] {"blue", "red", "green", "yellow", "orange"};
		
		for (String color : colors)
		{
			System.out.println(color);
		}
		
	}
	
	public void print(String text) {
		System.out.print(text);
	}
}
