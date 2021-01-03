package me.srgantmoomoo.lasventuras.client.ui.name;

import java.util.ArrayList;

import me.srgantmoomoo.lasventuras.client.module.Module;
import me.srgantmoomoo.lasventuras.client.ui.name.names.*;

public class NameManager {
	public static ArrayList<Name> names;
	
	public NameManager() {
		names = new ArrayList<>();
		
		NameManager.names.add(new L());
		NameManager.names.add(new A());
		NameManager.names.add(new S());
		NameManager.names.add(new V());
		NameManager.names.add(new E());
		NameManager.names.add(new N());
		NameManager.names.add(new T());
		NameManager.names.add(new U());
		NameManager.names.add(new R());
		NameManager.names.add(new A());
		NameManager.names.add(new S());
		NameManager.names.add(new Version());
		
	}
	public ArrayList<Name> getNameList() {
		return NameManager.names;
	}

}