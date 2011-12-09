package me.hammale.tree;


import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;

public class treeGenerator {
    
	private final treeMaker tree = new treeMaker();
	
	public void com1(Block set, BlockFace bf){

		BlockFace bf1 = BlockFace.NORTH;
		BlockFace bf2 = BlockFace.SOUTH;
		BlockFace bf3 = BlockFace.EAST;
		BlockFace bf4 = BlockFace.WEST;
		
		int tree1 = tree.tree(set, bf2);
		
	}
}	