package me.srgantmoomoo.lasventuras.client.ui;

import java.awt.Color;

import me.srgantmoomoo.lasventuras.api.event.customevent.listeners.EventRenderGUI;
import me.srgantmoomoo.lasventuras.client.LasVenturas;
import me.srgantmoomoo.lasventuras.client.module.Module;
import me.srgantmoomoo.lasventuras.client.module.ModuleManager;
import me.srgantmoomoo.lasventuras.client.ui.name.Name;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;

public class UIRenderer extends GuiScreen {
	private Minecraft mc = Minecraft.getMinecraft();

	public void draw() {
		ScaledResolution sr = new ScaledResolution(mc);
		FontRenderer fr = mc.fontRendererObj;
		
		int x = 1;
		final int[] counter = {1};
		for (Name nam : LasVenturas.nameManager.getNameList()) {
		fr.drawStringWithShadow(nam.getName(), x-1, 0, rainbow(counter[0] * -300));
		x += fr.getStringWidth(nam.getName());
		counter[0]++;
		}
	}
	public static int rainbow(int delay) {
		double rainbowState = Math.ceil((System.currentTimeMillis() + delay) / 20.0);
		rainbowState %= 360;
		return Color.getHSBColor((float) (rainbowState / 360.0f), 0.5f, 1f).getRGB();
	}
}