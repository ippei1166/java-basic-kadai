package kadai_017;

public abstract class Kato_Chapter17 {
	public String familyName;
	public String givenName;
	public String address;
	
	
	public void commonIntroduce() {
		System.out.println("私の名前は" + familyName  + givenName + "です。住所は" + address + "です。");
		
	}
	 public abstract void eachIntroduce();
		
	public void execIntroduce() {
		commonIntroduce();  
        eachIntroduce();    
	}
}