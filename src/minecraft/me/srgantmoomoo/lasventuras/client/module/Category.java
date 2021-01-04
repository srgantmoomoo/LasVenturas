package me.srgantmoomoo.lasventuras.client.module;

public enum Category {
	PLAYER("Player"), RENDER("Render"), COMBAT("Combat"), EXPLOITS("Exploits"), MOVEMENT("Movement"), LASVENTURAS("Las Venturas");
	
	public String name;
	public int moduleIndex;
	
	Category(String name) {
		this.name = name;
	}

}