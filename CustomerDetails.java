package hashMap;

public class CustomerDetails {
  private	String name;
  private	int age;
  private	String email;
  private	long aadharNumber;
  private	int amountavaiable;
  private	boolean isMale;
  
  public void setName(String name) {
	  this.name=name;
  }
  public String getName() {
	  return name;
  }
  public void setAge(int age) {
	  this.age=age;
  }
  public int getAge() {
	  return age;
  }
  public void setEmail(String email) {
	  this.email=email;
  }
  public String getEmail() {
	  return email;
  }
  public void setAadharNumber(long aadharNumber) {
	  this.aadharNumber=aadharNumber;
  }
  public long getAadharNumber() {
	  return aadharNumber;
  }
  public void setAmountavaiable( int amountavaiable) {
	  this.amountavaiable=amountavaiable;
  }
  public int getAmountavaiable() {
	  return amountavaiable;
  }
public boolean getisMale() {
	return isMale;
}
public void setMale(boolean isMale) {
	this.isMale = isMale;
}
public CustomerDetails(String name,int age,String email,long aadharNumber,int amountavaiable,boolean isMale) {
	this.name=name;
	this.age=age;
	this.email=email;
	this.aadharNumber=aadharNumber;
	this.amountavaiable=amountavaiable;
	this.isMale=isMale;

}
public String toString() {
	return name+" "+age+" "+email+" "+aadharNumber+" "+amountavaiable+" "+isMale;
}

}
