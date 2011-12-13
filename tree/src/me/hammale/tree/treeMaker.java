package me.hammale.tree;

import java.util.Random;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;

public class treeMaker {

	Random gen = new Random();
	public int tree(Block set,  BlockFace bf){
		int x = 1;
		int a = 20;
		int i = 1;
		int s = 1;
		while (x < a) {			
			Block up = set.getRelative(BlockFace.UP, x);
			while(i < a){
				int i1 = 1;
				Block set1 = up.getRelative(BlockFace.EAST, i);
				Block set01 = up.getRelative(BlockFace.WEST, i);
				while(i1 < a){
					Block set2 = set1.getRelative(BlockFace.NORTH, i1);
					Block set3 = set01.getRelative(BlockFace.NORTH, i1);
					//set2.setTypeId(18);
					if(i1 == 7  && i == 1){

						while(s < 7){
							Block clr = set2.getRelative(BlockFace.NORTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 6  && i == 2){

						while(s < 8){
							Block clr = set2.getRelative(BlockFace.NORTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 5  && i == 3){

						while(s < 9){
							Block clr = set2.getRelative(BlockFace.NORTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 4  && i == 4){

						while(s < 9){
							Block clr = set2.getRelative(BlockFace.NORTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 3  && i == 5){

						while(s < 9){
							Block clr = set2.getRelative(BlockFace.NORTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 2  && i == 6){

						while(s < 9){
							Block clr = set2.getRelative(BlockFace.NORTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 1  && i == 7){

						while(s < 9){
							Block clr = set2.getRelative(BlockFace.NORTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}
					
					//start corner 2//
					if(i1 == 20  && i == 7){

						while(s < 9){
							Block clr = set2.getRelative(BlockFace.SOUTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 19  && i == 6){

						while(s < 9){
							Block clr = set2.getRelative(BlockFace.SOUTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 18  && i == 5){

						while(s < 9){
							Block clr = set2.getRelative(BlockFace.SOUTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 17  && i == 4){

						while(s < 9){
							Block clr = set2.getRelative(BlockFace.SOUTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 16  && i == 3){

						while(s < 9){
							Block clr = set2.getRelative(BlockFace.SOUTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 15  && i == 2){

						while(s < 9){
							Block clr = set2.getRelative(BlockFace.SOUTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 14  && i == 1){

						while(s < 7){
							Block clr = set2.getRelative(BlockFace.SOUTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}
								
					//end corner 2//
					
					//START OTHER SIDE
					
					set3 = set3.getRelative(BlockFace.EAST, 19);
									
					if(i1 == 7  && i == 1){

						while(s < 7){
							Block clr = set3.getRelative(BlockFace.NORTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 6  && i == 2){

						while(s < 8){
							Block clr = set3.getRelative(BlockFace.NORTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 5  && i == 3){

						while(s < 9){
							Block clr = set3.getRelative(BlockFace.NORTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 4  && i == 4){

						while(s < 9){
							Block clr = set3.getRelative(BlockFace.NORTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 3  && i == 5){

						while(s < 9){
							Block clr = set3.getRelative(BlockFace.NORTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 2  && i == 6){

						while(s < 9){
							Block clr = set3.getRelative(BlockFace.NORTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 1  && i == 7){

						while(s < 9){
							Block clr = set3.getRelative(BlockFace.NORTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}
					
					//start corner 2//
					if(i1 == 20  && i == 7){

						while(s < 9){
							Block clr = set3.getRelative(BlockFace.SOUTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 19  && i == 6){

						while(s < 9){
							Block clr = set3.getRelative(BlockFace.SOUTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 18  && i == 5){

						while(s < 9){
							Block clr = set3.getRelative(BlockFace.SOUTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 17  && i == 4){

						while(s < 9){
							Block clr = set3.getRelative(BlockFace.SOUTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 16  && i == 3){

						while(s < 9){
							Block clr = set3.getRelative(BlockFace.SOUTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 15  && i == 2){

						while(s < 9){
							Block clr = set3.getRelative(BlockFace.SOUTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 14  && i == 1){

						while(s < 7){
							Block clr = set3.getRelative(BlockFace.SOUTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}
								
					//end corner 2//
					
					
					
					
					
					set3 = set3.getRelative(BlockFace.WEST, 5);
					
					if(i1 == 7  && i == 1){

						while(s < 7){
							Block clr = set3.getRelative(BlockFace.NORTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 6  && i == 2){

						while(s < 8){
							Block clr = set3.getRelative(BlockFace.NORTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 5  && i == 3){

						while(s < 9){
							Block clr = set3.getRelative(BlockFace.NORTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 4  && i == 4){

						while(s < 9){
							Block clr = set3.getRelative(BlockFace.NORTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 3  && i == 5){

						while(s < 9){
							Block clr = set3.getRelative(BlockFace.NORTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 2  && i == 6){

						while(s < 9){
							Block clr = set3.getRelative(BlockFace.NORTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 1  && i == 7){

						while(s < 9){
							Block clr = set3.getRelative(BlockFace.NORTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}
					
					//start corner 2//
					if(i1 == 20  && i == 7){

						while(s < 9){
							Block clr = set3.getRelative(BlockFace.SOUTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 19  && i == 6){

						while(s < 9){
							Block clr = set3.getRelative(BlockFace.SOUTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 18  && i == 5){

						while(s < 9){
							Block clr = set3.getRelative(BlockFace.SOUTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 17  && i == 4){

						while(s < 9){
							Block clr = set3.getRelative(BlockFace.SOUTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 16  && i == 3){

						while(s < 9){
							Block clr = set3.getRelative(BlockFace.SOUTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 15  && i == 2){

						while(s < 9){
							Block clr = set3.getRelative(BlockFace.SOUTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}else if(i1 == 14  && i == 1){

						while(s < 7){
							Block clr = set3.getRelative(BlockFace.SOUTH, s);
							clr.setTypeId(18);
							s++;
						}
						s = 1;
					}
								
					//end corner 2//
					
					
					
					
					
					//END OTHER SIDE
					
					
					i1++;
				}
				//set1.setTypeId(18);
				i++;
			}
			
				x++;				
			}
		return a;
	  }

}