package Encapsulation;

public class Encapulation {
	
	
private int sr;
private String name;
private String dept;


	/**
 * @return the sr
 */
public int getSr() {
	return sr;
}


/**
 * @param sr the sr to set
 */
public void setSr(int sr) {
	this.sr = sr;
}


/**
 * @return the name
 */
public String getName() {
	return name;
}


/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}


/**
 * @return the dept
 */
public String getDept() {
	return dept;
}


/**
 * @param dept the dept to set
 */
public void setDept(String dept) {
	this.dept = dept;
}


	public static void main(String[] args) {
		Encapulation e =new Encapulation();
		e.setSr(101);
		e.setName("somanath");
		e.setDept("test");
		
		System.out.println(e.getSr()+" "+e.getName()+" "+e.getDept()+" ");

	}

}
