package me.srgantmoomoo.lasventuras.client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.Display;

import me.srgantmoomoo.lasventuras.api.config.SaveLoad;
import me.srgantmoomoo.lasventuras.client.module.ModuleManager;
import me.srgantmoomoo.lasventuras.client.setting.SettingManager;
import me.srgantmoomoo.lasventuras.client.ui.UIRenderer;
import me.srgantmoomoo.lasventuras.client.ui.name.NameManager;

public class LasVenturas {
		public static String NAME = "LasVenturas", VERSION = "1";
		public static UIRenderer uiRenderer;
		public static ModuleManager moduleManager;
		public static SettingManager settingManager;
		public static NameManager nameManager;
		public static SaveLoad saveLoad;
		
		public static final Logger log = LogManager.getLogger("LasVenturas");
		
		public static void init() {
			uiRenderer = new UIRenderer();
			nameManager = new NameManager();
			Display.setTitle(NAME + " " + VERSION);
			log.info("UI initialized!");
			
			moduleManager = new ModuleManager();
			log.info("Module system initialized!");
			
			settingManager = new SettingManager();
			log.info("Setting system initialized!");
			
			saveLoad = new SaveLoad();
			log.info("Configs initialized!");
			
			log.info("LasVenturas is has initialized!");

	}

}
