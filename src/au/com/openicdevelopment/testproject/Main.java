package au.com.openicdevelopment.testproject;

import org.bukkit.plugin.java.JavaPlugin;

import au.com.openicdevelopment.testproject.command.OpenGUICommand;
import au.com.openicdevelopment.testproject.gui.TestGUI;

public class Main extends JavaPlugin {
	public TestGUI gui = new TestGUI();
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(gui, this);
        this.getCommand("calc").setExecutor(new OpenGUICommand());
	}
	
	@Override
	public void onDisable() {
		
	}
	
}
