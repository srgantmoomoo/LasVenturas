package me.srgantmoomoo.lasventuras.client.module.modules.movement;

import org.lwjgl.input.Keyboard;

import me.srgantmoomoo.lasventuras.api.event.customevent.Event;
import me.srgantmoomoo.lasventuras.api.event.customevent.listeners.EventUpdate;
import me.srgantmoomoo.lasventuras.client.module.Category;
import me.srgantmoomoo.lasventuras.client.module.Module;
import me.srgantmoomoo.lasventuras.client.setting.settings.ModeSetting;

public class Sprint extends Module {
	public ModeSetting mode = new ModeSetting("Mode", this, "Normal", "Normal", "Rage");
	
	public Sprint() {
		super ("Sprint", "now u cant walk, good going", Keyboard.KEY_I, Category.MOVEMENT);
		this.addSettings(mode);
		toggled = true;
	}
	
	public void onEnable() {

	}
	
	public void onDisable() {
		
		mc.player.setSprinting(false);
	}
	
	public void onEvent(Event e){
		if(e instanceof EventUpdate){
			if(e.isPre()) {
				if(mc.player.moveForward > 0 && !mc.player.isSneaking() && !mc.player.isCollidedHorizontally) {
					mc.player.setSprinting(true);
					
				}
			}
		}
	}

}