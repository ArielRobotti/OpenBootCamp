package com.openbootcamp.tema4;

public class SmartWatch extends SmartDevice{
	boolean gps;

	public SmartWatch(){
	}
	public SmartWatch(	String marca, 
						String modelo, 
						boolean wifi, 
						float displaySize, 
						boolean gps){
		super(marca,  modelo,  wifi, displaySize);
		this.gps = gps;
	}
	@Override
	public String toString() {
		return " marca: " + marca + "\n modelo: "+ modelo+ "\n wifi: "+ wifi+ 
				"\n displaySize: "+ displaySize + "\n gps: "+gps;
	}
}
