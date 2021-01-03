package me.srgantmoomoo.lasventuras.client.ui;

import java.awt.Color;

import me.srgantmoomoo.lasventuras.client.LasVenturas;
import me.srgantmoomoo.lasventuras.client.ui.name.Name;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiLanguage;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiOptionButton;
import net.minecraft.client.gui.GuiOptions;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiWorldSelection;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

public class MainMenuScreen extends GuiScreen {
	
	public MainMenuScreen() {
	
	}
	
	public void initGui() {
		
	}
	
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		ScaledResolution sr = new ScaledResolution(mc);
		mc.getTextureManager().bindTexture(new ResourceLocation("LasVenturas/Background.jpg"));
		this.drawModalRectWithCustomSizedTexture(0, 0, 0, 0, this.width, this.height, this.width, this.height);
		
		String[] buttons = { "singleplayer", "multiplayer", "settings", "language settings", "leave game" };
		
		int count = 0;
		for(String name : buttons) {
			float x = (width/buttons.length) + (width/buttons.length) + (width/buttons.length)/2f - mc.fontRendererObj.getStringWidth(name)/2f;
			float y = (height/buttons.length) + (height/buttons.length) + 9 + count * 30;
			
			boolean hovered = mouseX >= x && mouseY >= y && mouseX < x + mc.fontRendererObj.getStringWidth(name) && mouseY < y + mc.fontRendererObj.FONT_HEIGHT; 
			
			final int[] counter = {1};
			this.drawCenteredString(mc.fontRendererObj, name, (width/buttons.length) + (width/buttons.length) + (width/buttons.length)/2f, (height/buttons.length) + (height/buttons.length) + 9 + count * 30, hovered ?  rainbow(counter[0] * -300) : -1);
			count++;
			counter[0]++;
		}
		
		int xx = 1;
		final int[] counter = {1};
		for (Name nam : LasVenturas.nameManager.getNameList()) {
			
			if(!nam.getName().equals(" " + LasVenturas.VERSION)) {
			GlStateManager.pushMatrix();
			GlStateManager.translate(width/2f, height/2f - 60, 0);
			GlStateManager.scale(3, 3, 1);
			GlStateManager.translate(-(width/2f), -(height/2f), 0);
			this.drawCenteredString(mc.fontRendererObj, nam.getName(), xx + width/2f - 28, height/2f - mc.fontRendererObj.FONT_HEIGHT/2f, rainbow(counter[0] * -300));
			GlStateManager.popMatrix();
			
		xx += mc.fontRendererObj.getStringWidth(nam.getName());
		counter[0]++;
			}
		}
	}
	
	public void mouseClicked(int mouseX, int mouseY, int button) {
		String[] buttons = { "singleplayer", "multiplayer", "settings", "language settings", "leave game" };
		
		int count = 0;
		for(String name : buttons) {
			float x = (width/buttons.length) + (width/buttons.length) + (width/buttons.length)/2f - mc.fontRendererObj.getStringWidth(name)/2f;
			float y = (height/buttons.length) + (height/buttons.length) + 9 + count * 30;
			
			if (mouseX >= x && mouseY >= y && mouseX < x + mc.fontRendererObj.getStringWidth(name) && mouseY < y + mc.fontRendererObj.FONT_HEIGHT) {
				switch(name) {
				case "singleplayer":
					mc.displayGuiScreen(new GuiWorldSelection(this));
					break;
				
				case "multiplayer":
					mc.displayGuiScreen(new GuiMultiplayer(this));
					break;
					
				case "settings":
					mc.displayGuiScreen(new GuiOptions(this, mc.gameSettings));
					break;
					
				case "language settings":
					mc.displayGuiScreen(new GuiLanguage(this, mc.gameSettings, mc.getLanguageManager()));
					break;
					
				case "leave game":
					mc.shutdown();
					break;
				}
			}
			count++;
		}
	}
	
	public static int rainbow(int delay) {
		double rainbowState = Math.ceil((System.currentTimeMillis() + delay) / 20.0);
		rainbowState %= 360;
		return Color.getHSBColor((float) (rainbowState / 360.0f), 0.5f, 1f).getRGB();
	}
	
	public void onGuiClosed() {
		
	}

}