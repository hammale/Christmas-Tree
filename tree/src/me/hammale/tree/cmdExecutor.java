package me.hammale.tree;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class cmdExecutor implements CommandExecutor {
    
	private final treeGenerator tree = new treeGenerator();
	
	@SuppressWarnings("unused")
	private tree plugin;
 
	public cmdExecutor(tree plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		Player p = null;
		if (sender instanceof Player) {
			p = (Player) sender;
		}
		
		if (command.getName().equalsIgnoreCase("ctree")) {
			
			if(args.length == 1){
			String arg = args[0];
			if(arg.equalsIgnoreCase("create")){
			
			if (p == null) {
				sender.sendMessage("[ChristmasTree] This command can only be run by a player!");
			} else if (p.isOp()) {
				p.sendMessage(ChatColor.GREEN + "Generating Tree...");
				Block b = p.getLocation().getBlock();
				b.setType(Material.AIR);
				Material m = (Material.SMOOTH_BRICK);
				BlockFace bf = BlockFace.NORTH;
				Block set2 = b;
				tree.com1(set2, bf);
				p.sendMessage(ChatColor.GREEN + "Tree Complete!");
										
			return true;
			}
			else {
				sender.sendMessage("This command can opnly be run by an OP!");
			}
		}
	}
}
		return false;
}		
	
}


