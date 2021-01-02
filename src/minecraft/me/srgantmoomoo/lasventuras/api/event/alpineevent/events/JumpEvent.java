package me.srgantmoomoo.lasventuras.api.event.alpineevent.events;

import me.srgantmoomoo.lasventuras.api.event.alpineevent.Event;
import me.srgantmoomoo.lasventuras.api.util.world.Location;

public class JumpEvent extends Event {

	private Location location;

	public JumpEvent(Location location) {
		this.location = location;
	}

	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
}