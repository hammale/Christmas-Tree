package me.hammale.tree;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.World.Environment;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Event;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class tree extends JavaPlugin {
	static Server server;
	static Plugin plugin;
	
	  private final treeBlockListener blockListener = new treeBlockListener(this);
	
	private cmdExecutor cmdExecutor;
	
	public FileConfiguration config;
	
	@Override
	public void onEnable()
    {	 
		//loadConfiguration(); TODO: Add config crap later :D
		PluginDescriptionFile pdfFile = this.getDescription();
		System.out.println("[ChristmassTree] Version " + pdfFile.getVersion() + " Enabled!");
	    cmdExecutor = new cmdExecutor(this);
		getCommand("ctree").setExecutor(cmdExecutor);
	    PluginManager pm = getServer().getPluginManager();
	    pm.registerEvent(Event.Type.LEAVES_DECAY, this.blockListener, Event.Priority.Normal, this);
		server = this.getServer();
		plugin = this;
    }
	public void onDisable()
    {
		PluginDescriptionFile pdfFile = this.getDescription();
		System.out.println("[ChristmassTree] Version " + pdfFile.getVersion() + " Disabled!");
    }
	
//	public void loadConfiguration(){
//		
//	    config = getConfig();
//	    config.options().copyDefaults(true); 
//	    
//	    for(World w : this.getServer().getWorlds()) {
//		    String wrld = w.getName();		        
//		    String path2 = "ChunkGeneration.World.AllowSewers." + wrld;		    
//		    config.addDefault(path2, 1);
//	    }
//	    
//		String path1 = "ChunkGeneration.Frequency";
//	    config.addDefault(path1, 100);
//	    
//	    config.options().copyDefaults(true);
//	    saveConfig();
//	}
	
//	public int isAllowedWorld(World w){
//	    config = getConfig();
//	    String wrld = w.getName();
//	    int amnt = config.getInt("ChunkGeneration.World.AllowSewers." + wrld); 
//	    return amnt;
//	}
//	
//	public int getFreq(){
//	    config = getConfig();
//	    int amnt = config.getInt("ChunkGeneration.Frequency"); 
//	    return amnt;
//	}
	
} 	