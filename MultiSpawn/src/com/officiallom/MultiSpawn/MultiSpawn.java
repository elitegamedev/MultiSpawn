package com.officiallom.MultiSpawn;

import org.bukkit.plugin.java.JavaPlugin;

public class MultiSpawn extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getLogger().info("Loading MultiSpawn...");
		getLogger().info("Plugin from the developers of the League of Minecraft Plugin");
	}
	
	public void onDisable() {
		//TODO Add some sort of save for the config
	}
	
}
