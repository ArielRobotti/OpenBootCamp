package com.openbootcamp.tema4;

public abstract class SmartDevice {
	protected String marca;
	protected String modelo;
	protected boolean wifi;
	protected float displaySize;
	public SmartDevice(){
	}
	public SmartDevice(String marca, String modelo, boolean wifi, float displaySize){
		this.marca = marca;
		this.modelo = modelo;
		this.wifi = wifi;
		this.displaySize = displaySize;
	}
}