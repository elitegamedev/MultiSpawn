package com.officiallom.MultiSpawn;
/*
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
*/

import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class MultiSpawn extends JavaPlugin {
	/*
	public final Location[] spawnLocations = new Location[100];
	public final Integer[] spawnIDs = new Integer[100];
	public int spawnCounter = 0;
	public int id = 0;
	
	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String commandLabel, String[] args) {
		Player player = (Player) sender;
		if (commandLabel.equalsIgnoreCase("setspawn")) {
			if (sender instanceof Player) {
				Location location = player.getLocation();
				if (!(spawnCounter > 100)) {
					spawnLocations[spawnCounter] = location;
					spawnIDs[spawnCounter] = id;
					++id;
					spawnCounter++;
					player.sendMessage(ChatColor.GREEN + "A spawn with the ID of " + id + "has been created.");
				} else {
					player.sendMessage(ChatColor.RED + "The warp limit of 100 has been exceeded.");
				}
			}
		} else if (commandLabel.equalsIgnoreCase("spawn")) {
			
			for (int i = 0; i < spawnIDs.length;) {
				Integer spawnID = spawnIDs[i];
				// http://www.youtube.com/watch?v=S_5ESSoEsEI
			}
			
		}
		return false;
	}
	*/
	


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
		String id = "1";
		Integer newId = Integer.parseInt(id);
		if (label.equalsIgnoreCase("setspawn")) {
			if (sender instanceof Player) {
				if (args.length == 1) {
					if (args[0] == id) {
						List<String> spawn1 = getConfig().getStringList("spawn1");
						player.sendMessage("Spawn " + args[0] + " Created");
						w
						++newId;
					} /* else if (args[0] == "second") {
						List<String> spawn2 = getConfig().getStringList("spawn2");
						player.sendMessage("Spawn " + args[0] + " Created");
					} else if (args[0] == "third") {
						List<String> spawn3 = getConfig().getStringList("spawn3");
						player.sendMessage("Spawn " + args[0] + " Created");
					} else if (args[0] == "fourth") {
						List<String> spawn4 = getConfig().getStringList("spawn4");
						player.sendMessage("Spawn " + args[0] + " Created");
					} else {
						player.sendMessage(ChatColor.RED + "Usage: /setspawn <1-4>");
					} */
				} else {
					player.sendMessage(ChatColor.RED + "Usage: /setspawn <1-4>");
				} 
			} 
		}
		return false;
	}
	
	
	
	/*
	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		Player player = (Player) sender;
		if (label.equalsIgnoreCase("setspawn")) {
			if (sender instanceof Player) {
						List<String> spawn1 = getConfig().getStringList("spawns." + id);
						spawn1.add("x:" + player.getLocation().getBlockX());
						spawn1.add("y:" + player.getLocation().getBlockY());
						spawn1.add("z:" + player.getLocation().getBlockZ());
						getConfig().set("spawns", spawn1);
						player.sendMessage(ChatColor.DARK_PURPLE + "The spawn number '" + id + "' has been created.");
						getConfig().set("currentID", id);
						++id;
						getConfig().set("nextID", id);
						saveConfig();
			} else {
				sender.sendMessage("You must be a player to use this command!");
			}
			
		} else if (label.equalsIgnoreCase("spn")) {
		}
		
		return true;
		*/
	
}
