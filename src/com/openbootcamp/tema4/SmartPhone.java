package com.openbootcamp.tema4;

public class SmartPhone extends SmartDevice{
	boolean doubleSim;
	int cores;
	int generation;

	public SmartPhone(){
	}
	public SmartPhone(	String marca, 
						String modelo, 
						boolean wifi, 
						float displaySize, 
						boolean doubleSim, 
						int cores,
						int generation){
		super(marca,  modelo,  wifi, displaySize);
		this.doubleSim = doubleSim;
		this.cores = cores;
		this.generation = generation;
	}
	@Override
	public String toString() {
		return " marca: " + marca + "\n modelo: "+ modelo+ "\n wifi: "+ wifi+ 
				"\n displaySize: "+ displaySize + "\n doubleSim: " + doubleSim +
				"\n cores: "+ cores + "\n generation: "+generation;
		
	}
}
