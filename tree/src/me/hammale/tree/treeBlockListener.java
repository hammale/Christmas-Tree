package me.hammale.tree;

import org.bukkit.event.block.BlockListener;
import org.bukkit.event.block.LeavesDecayEvent;

public class treeBlockListener extends BlockListener
{
  public static tree plugin;

  public treeBlockListener(tree instance)
  {
    plugin = instance;
  }

  public void onLeavesDecay(LeavesDecayEvent event) {
    event.setCancelled(true);
  }
}