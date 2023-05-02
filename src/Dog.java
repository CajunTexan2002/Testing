
public class Dog {
	
	String name;
	boolean isCute;
	
	public Dog(String name, boolean isCute) {
		super();
		this.name = name;
		this.isCute = isCute;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isCute() {
		return isCute;
	}
	public void setCute(boolean isCute) {
		this.isCute = isCute;
	}
	
	public boolean isCuteDog(Dog d) {
		if(d.isCute() == true) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
