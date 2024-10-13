
public class Sum {
private int a, b;
private boolean setA, setB;


public Sum() {
	setA = false; 
	setB = false;
}

/**
 * @return the a
 */
public int getA() {
	return this.a;
}

/**
 * @param a the a to set
 */
public void setA(int a) {
	this.a = a;
	setA = true;
}

/**
 * @return the b
 */
public int getB() {
	return this.b;
}

/**
 * @param b the b to set
 */
public void setB(int b) {
	this.b = b;
	setB = true;
}

public int sum() throws Exception{
	if(setA && setB) {
		return this.a + this.b;
	}
	throw new Exception();
}


}
