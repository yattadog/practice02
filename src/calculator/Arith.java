package calculator;

public abstract class Arith {
	private int lValue;
	private int rValue;
	
	public int getlValue() {
		return lValue;
	}

	public void setlValue(int lValue) {
		this.lValue = lValue;
	}

	public int getrValue() {
		return rValue;
	}

	public void setrValue(int rValue) {
		this.rValue = rValue;
	}

	public void setValue( int lValue, int rValue ) {
		this.lValue = lValue;
		this.rValue = rValue;
	}
	
	public abstract int calculate();
}
