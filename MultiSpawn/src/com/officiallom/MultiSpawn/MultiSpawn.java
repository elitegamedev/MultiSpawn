package com.officiallom.MultiSpawn;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class MultiSpawn extends JavaPlugin {
	
	@Override
	public void onEnable() {
		saveDefaultConfig();
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
		
		if (label.equalsIgnoreCase("setspawn")) {
			if (args.length == 1) {
				getConfig().set("MultiSpawn.spawns." + args[0], player.getLocation());
				player.sendMessage(ChatColor.DARK_PURPLE + "The warp '" + args[0] + "' has been created.");
			} else {
				player.sendMessage(ChatColor.RED + "--Usage: /setspawn <name>--");
			}
		}
		
		return true;
	}
	
}
