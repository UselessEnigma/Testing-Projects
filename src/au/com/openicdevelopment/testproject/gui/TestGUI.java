package au.com.openicdevelopment.testproject.gui;

import org.bukkit.Bukkit;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import au.com.openicdevelopment.api.chat.InteractionHelper;


public class TestGUI implements Listener{
	public static Inventory ReturnInventory(Player pl) {
		Inventory toReturn = Bukkit.getServer().createInventory(pl, 9*6,(String)InteractionHelper.GetObjectFromMsg("&3Calculator"));
		ItemStack egg1 = new ItemStack(Material.STONE,1);
		ItemStack egg2 = new ItemStack(Material.STONE,2);
		ItemStack egg3 = new ItemStack(Material.STONE,3);
		ItemStack egg4 = new ItemStack(Material.STONE,4);
		ItemStack egg5 = new ItemStack(Material.STONE,5);
		ItemStack egg6 = new ItemStack(Material.STONE,6);
		ItemStack egg7 = new ItemStack(Material.STONE,7);
		ItemStack egg8 = new ItemStack(Material.STONE,8);
		ItemStack egg9 = new ItemStack(Material.STONE,9);
		ItemStack egg0 = new ItemStack(Material.STONE,0);
		ItemStack eggResult = new ItemStack(Material.OBSIDIAN,1);
		ItemStack eggResult2 = new ItemStack(Material.OBSIDIAN,1);
		ItemStack eggClear = new ItemStack(Material.BARRIER,1);
		ItemStack eggSymbol = new ItemStack(Material.GLASS,1);
		ItemStack eggAdd = new ItemStack(Material.WOOD,1);
		ItemStack eggTake = new ItemStack(Material.WOOD,1);
		ItemStack eggMultiply = new ItemStack(Material.WOOD,1);
		ItemStack eggDivide = new ItemStack(Material.WOOD,1);
		ItemStack eggCalculate = new ItemStack(Material.WOOL,1,DyeColor.GREEN.getData());
		ItemStack eggFinal = new ItemStack(Material.COAL_BLOCK,1);
		ItemMeta finalMeta = eggFinal.getItemMeta();
		finalMeta.setDisplayName("Result Of Calculation");
		eggFinal.setItemMeta(finalMeta);
		ItemMeta resultMeta = eggResult.getItemMeta();
		resultMeta.setDisplayName("0");
		eggResult.setItemMeta(resultMeta);
		ItemMeta resultMeta2 = eggResult2.getItemMeta();
		resultMeta2.setDisplayName("0");
		eggResult2.setItemMeta(resultMeta2);
		ItemMeta clearMeta = eggClear.getItemMeta();
		clearMeta.setDisplayName("Clear Value");
		eggClear.setItemMeta(clearMeta);
		ItemMeta addMeta = eggAdd.getItemMeta();
		addMeta.setDisplayName("+");
		eggAdd.setItemMeta(addMeta);
		ItemMeta takeMeta = eggTake.getItemMeta();
		takeMeta.setDisplayName("-");
		eggTake.setItemMeta(takeMeta);
		ItemMeta multiplyMeta = eggMultiply.getItemMeta();
		multiplyMeta.setDisplayName("x");
		eggMultiply.setItemMeta(multiplyMeta);
		ItemMeta divideMeta = eggDivide.getItemMeta();
		divideMeta.setDisplayName("/");
		eggDivide.setItemMeta(divideMeta);
		ItemMeta calcMeta = eggCalculate.getItemMeta();
		calcMeta.setDisplayName("Calculate");
		eggCalculate.setItemMeta(calcMeta);
		ItemMeta symbolMeta = eggSymbol.getItemMeta();
		symbolMeta.setDisplayName("");
		eggSymbol.setItemMeta(symbolMeta);
		toReturn.setItem(0, egg1);
		toReturn.setItem(1, egg2);
		toReturn.setItem(2, egg3);
		toReturn.setItem(9, egg4);
		toReturn.setItem(10, egg5);
		toReturn.setItem(11, egg6);
		toReturn.setItem(18, egg7);
		toReturn.setItem(19, egg8);
		toReturn.setItem(20, egg9);
		toReturn.setItem(28, egg0);
		toReturn.setItem(14, eggResult);
		toReturn.setItem(16, eggResult2);
		toReturn.setItem(33, eggClear);
		toReturn.setItem(39, eggAdd);
		toReturn.setItem(40, eggTake);
		toReturn.setItem(48, eggMultiply);
		toReturn.setItem(49, eggDivide);
		toReturn.setItem(15, eggSymbol);
		toReturn.setItem(42, eggCalculate);
		return toReturn;
	}
int result = 0;
int value1 = 0;
int value2 = 0;
String operation = "";
	@EventHandler
	public void OnPlayerClick(InventoryClickEvent event) {
		int calc = 0;
		int value = value1;
		int valuest = value2;
		int slot = event.getSlot();
		if (slot == 0) {
			if (result != 0) {
				result = ((result*10)+1);
			}
			else {
				result = (result+1);
			}
			
		}
		if (slot == 1) {
			if (result != 0) {
				result = ((result*10)+2);
			}
			else {
				result = (result+2);
			}
		}
		if (slot == 2) {
			if (result != 0) {
				result = ((result*10)+3);
			}
			else {
				result = (result+3);
			}
		}
		if (slot == 9) {
			if (result != 0) {
				result = ((result*10)+4);
			}
			else {
				result = (result+4);
			}
		}
		if (slot == 10) {
			if (result != 0) {
				result = ((result*10)+5);
			}
			else {
				result = (result+5);
			}
		}
		if (slot ==11) {
			if (result != 0) {
				result = ((result*10)+6);
			}
			else {
				result = (result+6);
			}
		}
		if (slot == 18) {
			if (result != 0) {
				result = ((result*10)+7);
			}
			else {
				result = (result+7);
			}
		}
		if (slot == 19) {
			if (result != 0) {
				result = ((result*10)+8);
			}
			else {
				result = (result+8);
			}
		}
		if (slot == 20) {
			if (result != 0) {
				result = ((result*10)+9);
			}
			else {
				result = (result+9);
			}
		}
		if (slot == 28) {
			result = (result*10);
		}
		if (slot == 33) {
			InteractionHelper.SendMessage(event.getWhoClicked(), "&3Reset The Calculation");
			result = 0;
			operation = "";
			ItemStack eggCalc = new ItemStack(Material.WOOL,1,DyeColor.GREEN.getData());
			ItemMeta calcMeta = eggCalc.getItemMeta();
			calcMeta.setDisplayName("Calculate");
			eggCalc.setItemMeta(calcMeta);
			event.getInventory().setItem(42, eggCalc);
		}
		if (slot == 39) {
			operation = "+";
			ItemStack eggAdd = new ItemStack(Material.GLASS,1);
			ItemMeta addMeta = eggAdd.getItemMeta();
			addMeta.setDisplayName(operation);
			eggAdd.setItemMeta(addMeta);
			event.getInventory().setItem(15, eggAdd);
			result = 0;
		}
		if (slot == 40) {
			operation = "-";
			ItemStack eggTake = new ItemStack(Material.GLASS,1);
			ItemMeta takeMeta = eggTake.getItemMeta();
			takeMeta.setDisplayName(operation);
			eggTake.setItemMeta(takeMeta);
			event.getInventory().setItem(15, eggTake);
			result = 0;
		}
		if (slot == 48) {
			operation = "x";
			ItemStack eggMultiply = new ItemStack(Material.GLASS,1);
			ItemMeta multiplyMeta = eggMultiply.getItemMeta();
			multiplyMeta.setDisplayName(operation);
			eggMultiply.setItemMeta(multiplyMeta);
			event.getInventory().setItem(15, eggMultiply);
			result = 0;
		}
		if (slot == 49) {
			operation = "/";
			ItemStack eggDivide = new ItemStack(Material.GLASS,1);
			ItemMeta divideMeta = eggDivide.getItemMeta();
			divideMeta.setDisplayName(operation);
			eggDivide.setItemMeta(divideMeta);
			event.getInventory().setItem(15, eggDivide);
			result = 0;
		}
		event.setCancelled(true);
		if (operation == "") {
			value1 = result;
			String amount = (String.valueOf(value1));
			ItemStack eggResult = new ItemStack(Material.OBSIDIAN,1);
			ItemMeta resultMeta = eggResult.getItemMeta();
			resultMeta.setDisplayName(amount);
			eggResult.setItemMeta(resultMeta);
			event.getInventory().setItem(14, eggResult);
		} 
		if (operation != "") {
			value2 = result;
			String amount2 = (String.valueOf(value2));
			ItemStack eggResult2 = new ItemStack(Material.OBSIDIAN,1);
			ItemMeta resultMeta2 = eggResult2.getItemMeta();
			resultMeta2.setDisplayName(amount2);
			eggResult2.setItemMeta(resultMeta2);
			event.getInventory().setItem(16, eggResult2);
		}
		if (slot == 42 && operation != "") {
			if (operation == "+") {
				calc = (value + valuest);	
			}
			if (operation == "-") {
				calc = (value - valuest);
			}
			if (operation == "x") {
				calc = (value * valuest);
			}
			if (operation == "/") {
				calc = (value / valuest);
			}
			String ans = (String.valueOf(calc));
			ItemStack eggCalc = new ItemStack(Material.WOOL,1,DyeColor.GREEN.getData());
			ItemMeta calcMeta = eggCalc.getItemMeta();
			calcMeta.setDisplayName(ans);
			eggCalc.setItemMeta(calcMeta);
			event.getInventory().setItem(42, eggCalc);
		}
	}
}

