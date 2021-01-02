package me.srgantmoomoo.lasventuras.api.event.alpineevent.events;

import me.srgantmoomoo.lasventuras.api.event.alpineevent.Event;
import net.minecraft.util.math.BlockPos;

public class DestroyBlockEvent extends Event {

	BlockPos blockPos;

	public DestroyBlockEvent(BlockPos blockPos) {
		super();
		this.blockPos = blockPos;
	}

	public BlockPos getBlockPos() {
		return this.blockPos;
	}

	public void setBlockPos(BlockPos blockPos) {
		this.blockPos = blockPos;
	}
}