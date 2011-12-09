package me.hammale.tree;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;

public class treeMaker {

	Random gen = new Random();
	public int tree(Block set,  BlockFace bf){
		int x = 1;
		int a = 15;
		while (x < a) {
			int u = 1;
			while(u != a){
				int newx = x-1;
				//START//
				Block otherset = set.getRelative(bf, newx);
				otherset = otherset.getRelative(BlockFace.UP, u);
				Block set1 = null;
				int setter = 1;
				while(setter <= a){
					set1 = otherset.getRelative(BlockFace.EAST, setter);
					set1.setTypeId(18);
					setter++;
				}
				setter = 1;
				set1 = set1.getRelative(BlockFace.WEST, 1);
				while(setter <= a){
					set1 = otherset.getRelative(BlockFace.WEST, setter);
					set1.setTypeId(18);
					setter++;
				}
				Block setter2 = otherset.getRelative(BlockFace.NORTH, a);
				setter = 1;
				while(setter <= a){
					set1 = setter2.getRelative(BlockFace.EAST, setter);
					set1.setTypeId(18);
					setter++;
				}
				setter = 1;
				set1 = set1.getRelative(BlockFace.WEST, 1);
				while(setter <= a){
					set1 = setter2.getRelative(BlockFace.WEST, setter);
					set1.setTypeId(18);
					setter++;
				}
				u++;
				newx++;
				x++;
				}
			}
		return a;
	  }

}