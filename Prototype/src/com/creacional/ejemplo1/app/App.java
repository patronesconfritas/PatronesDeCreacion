package com.creacional.ejemplo1.app;

import com.creacional.ejemplo1.entity.LCD;
import com.creacional.ejemplo1.prototype.TelevisionGenerica;
import com.creacional.ejemplo1.prototype.TelevisionPrototype;

public class App {

	public static void main(String[] args) throws CloneNotSupportedException {
		TelevisionPrototype tvp = new TelevisionPrototype();
		
		TelevisionGenerica tvGenerica = (LCD) tvp.getPrototipo("LCD");
		
		TelevisionGenerica tvGenerica2 = (LCD) tvp.getPrototipo("LCD");
		
		System.out.println(tvGenerica);
		
		System.out.println(tvGenerica2);
		
		//comparo que la clonacion me crea dos objetos diferentes
		System.out.println(tvGenerica==tvGenerica2);
		
		System.out.println(tvGenerica.getMarca());
	}

}
