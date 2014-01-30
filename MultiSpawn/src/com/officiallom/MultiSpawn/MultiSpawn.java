package com.officiallom.MultiSpawn;

import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class MultiSpawn extends JavaPlugin {
	
	int id = 0;
	
	@Override
	public void onEnable() {
		saveDefaultConfig();
	}
	
	

	@Override
	public void onDisable() {
		saveDefaultConfig();
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		Player player = (Player) sender;

		if (label.equalsIgnoreCase("setspawn")) {
			if (sender instanceof Player) {
						List<String> spawns = getConfig().getStringList("spawns");
						spawns.add(id + ":" + player.getLocation().getBlock().getLocation());
						getConfig().set("spawns", spawns);
						player.sendMessage(ChatColor.DARK_PURPLE + "The spawn number '" + id + "' has been created.");
						getConfig().set("currentID", id);
						++id;
						getConfig().set("nextID", id);
						saveConfig();
			} else {
				sender.sendMessage("You must be a player to use this command!");
			}
			
		} else if (label.equalsIgnoreCase("spn")) {
			player.teleport((Location) getConfig().getConfigurationSection("spawns.1"));
		}
		
		return true;
	}
	
}
