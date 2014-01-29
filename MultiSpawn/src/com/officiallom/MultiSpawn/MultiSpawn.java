package com.officiallom.MultiSpawn;

import java.util.List;
import java.util.Random;

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
		saveDefaultConfig();
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		Player player = (Player) sender;
		
		if (label.equalsIgnoreCase("setspawn")) {
			if (sender instanceof Player) {
				if (args.length == 1) {
					if (!args[0].equalsIgnoreCase("list")) {
						int id = 1;
						List<String> spawns = getConfig().getStringList("spawns");
						spawns.add(id + ":" + player.getLocation().getBlock().getLocation());
						getConfig().set("spawns", spawns);
						saveConfig();
						player.sendMessage(ChatColor.DARK_PURPLE + "The spawn number '" + id + "' has been created.");
						id++;
					} else {
						List<String> spawns = getConfig().getStringList("spawns");
						player.sendMessage("" + spawns);
					}
				} else {
					player.sendMessage(ChatColor.RED + "Usage: /setspawn <name>");
				}
			} else {
				sender.sendMessage("You must be a player to use this command!");
			}
			
		} else if (label.equalsIgnoreCase("spn")) {
			player.teleport() 
		}
		
		return true;
	}
	
}
