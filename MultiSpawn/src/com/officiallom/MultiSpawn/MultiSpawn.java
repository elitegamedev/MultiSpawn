package com.officiallom.MultiSpawn;

import java.io.File;
import java.io.IOException;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class MultiSpawn extends JavaPlugin {
	
	@Override
	public void onEnable() {
		try {
			saveConfig();
			setupConfig(getConfig());
			saveConfig();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void setupConfig(FileConfiguration config) throws IOException {
		if (!new File(getDataFolder(), "RESET.FILE").exists()) {
			getLogger().info("Config doesn't exists. Creating one!");
			// config.set("Section.Section", "Data");
			config.set("MultiSpawn.spawns", "");
			
			new File(getDataFolder(), "RESET.FILE").createNewFile();
		} else {
			getLogger().info("Config file exists. Reading it.");
		}
	}

	@Override
	public void onDisable() {
		try {
			saveConfig();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		Player player = (Player) sender;
		
		if (label.equalsIgnoreCase("setwarp")) {
			if (args.length == 1) {
				
			} else {
				player.sendMessage(ChatColor.RED + "Usage: /setwarp <name>");
			}
		}
		
		return super.onCommand(sender, command, label, args);
	}
	
}
