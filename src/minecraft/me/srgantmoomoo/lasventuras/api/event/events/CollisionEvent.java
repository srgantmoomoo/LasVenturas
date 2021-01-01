package me.srgantmoomoo.lasventuras.api.event.events;

import me.srgantmoomoo.lasventuras.api.event.Event;
import net.minecraft.entity.Entity;

public final class CollisionEvent extends Event {
    private final Entity entity;

    public CollisionEvent(Entity entity)
    {
        this.entity = entity;
    }

    public Entity getEntity()
    {
        return entity;
    }
}