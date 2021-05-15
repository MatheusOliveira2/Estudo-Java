package br.com.math.app.calc;
import br.com.math.app.calc.local.*;

public class Calculator {

	private Operations op = new Operations();

	public double sum(double... nums) {
		return op.sum(nums);
	}
	
	
}
