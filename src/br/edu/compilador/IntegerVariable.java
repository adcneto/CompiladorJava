package br.edu.compilador;

public class IntegerVariable extends Variable<Integer>{
	public IntegerVariable(String name)
	{
		this(name, 0);
		this.initialized = false;
		System.out.println("new integer: " + name);
	}
	
	public IntegerVariable(String name, Integer value) {
		super(name, value);
	}
	
	@Override
	public Variable<?> copy() {
		return new IntegerVariable(this.name, this.value);
	}
}
