package com.creacional.ejemplo1.prototype;

import java.util.HashMap;

import com.creacional.ejemplo1.entity.LCD;
import com.creacional.ejemplo1.entity.Plasma;

public class TelevisionPrototype {
	private HashMap<String, TelevisionGenerica> prototipos = new HashMap<>();

	public TelevisionPrototype() {
		Plasma plasma = new Plasma("Sony", 21, "Plateado", 399.99, 90, 0.05);
		LCD lcd = new LCD("Panasonic", 42, "Plateado", 599.99, 290);
		
		prototipos.put("Plasma", plasma);
		prototipos.put("LCD", lcd);
	}
	
	public Object getPrototipo(String tipo) throws CloneNotSupportedException {
		Object ob = prototipos.get(tipo).clone();
		return ob;
	}
}
