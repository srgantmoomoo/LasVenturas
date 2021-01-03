package me.srgantmoomoo.lasventuras.client.ui.name;

import java.util.ArrayList;

import me.srgantmoomoo.lasventuras.client.module.Category;
import me.srgantmoomoo.lasventuras.client.module.Module;

public abstract class Name {
	public static ArrayList<Name> names;
	
	public String name;
	public Name(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
