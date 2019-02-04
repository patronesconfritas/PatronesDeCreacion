package com.creacional.ejemplo1.entity;

import com.creacional.ejemplo1.prototype.TelevisionGenerica;

public class LCD extends TelevisionGenerica {

	private double costoFabricacion;

	public LCD(String marca, int pulgadas, String color, double precio, double costoFabricacion) {
		super(marca, pulgadas, color, precio);
		this.costoFabricacion=costoFabricacion;
	}

	public double getCostoFabricacion() {
		return costoFabricacion;
	}

	public void setCostoFabricacion(double costoFabricacion) {
		this.costoFabricacion = costoFabricacion;
	}

}
