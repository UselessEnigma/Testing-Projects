package au.com.openicdevelopment.testproject.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import au.com.openicdevelopment.api.chat.InteractionHelper;
import au.com.openicdevelopment.testproject.gui.TestGUI;

public class OpenGUICommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String value, String[] args) {
			if(sender instanceof Player) {
				InteractionHelper.SendMessage(sender,"&3Opening GUI...");
				Player pl = (Player) sender;
				pl.openInventory(TestGUI.ReturnInventory(pl));
			} else {
				InteractionHelper.SendMessage(sender,"&4You have to be a player to do this");
			}
		return true;
	}

}
