package me.srgantmoomoo.lasventuras.client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import me.srgantmoomoo.lasventuras.api.config.SaveLoad;
import me.srgantmoomoo.lasventuras.client.module.ModuleManager;
import me.srgantmoomoo.lasventuras.client.setting.SettingManager;

public class LasVenturas {
		public static String NAME = "LasVenturas", VERSION = "1";
		
		public static ModuleManager moduleManager;
		public static SettingManager settingManager;
		public static SaveLoad saveLoad;
		
		public static final Logger log = LogManager.getLogger("LasVenturas");
		
		public static void init() {
			
			moduleManager = new ModuleManager();
			log.info("Module system initialized.");
			
			settingManager = new SettingManager();
			log.info("Setting system initialized.");
			
			saveLoad = new SaveLoad();
			log.info("Configs initialized");
			
			log.info("LasVenturas is ready.");

	}

}