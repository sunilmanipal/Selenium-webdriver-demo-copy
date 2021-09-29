package junittest;

public class Calculator {

	public int add(int a,int b){
		if(a < 0){
			throw new IllegalArgumentException();
		}
		return a + b;
	}
	
	public int mul(int a,int b){
		return a * b;
	}
	
}

