package com.gmail.moonmasters200.RaffleTickets;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
	
	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if (cmd.getName().equalsIgnoreCase("raffles"))
		{
			sender.sendMessage(ChatColor.GOLD + "[Swag-Raffles] " + ChatColor.BLUE + "Raffles Plugin by " + ChatColor.RED + "millenium200 " +
			ChatColor.BLUE + "for Swag-Craft Factions Reborn!");
			sender.sendMessage(ChatColor.GOLD + "[Swag-Raffles] " + ChatColor.BLUE + "Buy a raffle ticket with " + ChatColor.GREEN +
			"/raffle buy " + ChatColor.BLUE + "to get a chance to " + "win lots of cool prizes!");
			sender.sendMessage(ChatColor.GOLD + "[Swag-Raffles] " + ChatColor.BLUE + "Tickets: $250, Prizes include swords, armor, and money!");
			return true;
		}
		
		if (cmd.getName().equalsIgnoreCase("raffle")) 
		{
			if (args.length != 1)
			{
				//When onCommand() returns false, the help message associated with the
				//command is displayed.
				return false;
			} else if (!(sender instanceof Player)) 
			{ //Make sure the sender is a player.
				sender.sendMessage("Only players can buy raffle tickets!");
				return true;
			}
			
			Player player = (Player) sender;
			
			int randomNumber;
			ItemStack itemstack;
			String prizeName = null;
			
			randomNumber = (int)(Math.random() * 1000);
			randomNumber = 6;
			switch(randomNumber) 
			{
			case 1:
			{
				itemstack = new ItemStack(Material.OBSIDIAN, 16);
				prizeName = "Obsidian";
				PlayerInventory inventory = player.getInventory();
				inventory.addItem(itemstack);
				break;
			}
			case 2:
			{
				itemstack = new ItemStack(Material.OBSIDIAN, 16);
				prizeName = "Obsidian";
				PlayerInventory inventory = player.getInventory();
				inventory.addItem(itemstack);
				break;
			}
			case 3:
			{
				itemstack = new ItemStack(Material.OBSIDIAN, 16);
				prizeName = "Obsidian";
				PlayerInventory inventory = player.getInventory();
				inventory.addItem(itemstack);
				break;
			}
			case 4:
			{
				itemstack = new ItemStack(Material.BEACON, 1);
				prizeName = "A Beacon!";
				PlayerInventory inventory = player.getInventory();
				inventory.addItem(itemstack);
				break;
			}
			case 5:
			{
				itemstack = new ItemStack(Material.ANVIL);
				prizeName = "Anvil";
				PlayerInventory inventory = player.getInventory();
				inventory.addItem(itemstack);
				break;
			}
			case 6:
			{
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "eco give " + 
				player.getName() + " 1000");
				prizeName = "$1000";
				break;
				// Add money
			}
			case 7:
			{
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "eco give " + 
				player.getName() + " 1000");
				prizeName = "$1000";
				break;
				// Add money
			}
	    case 8:
	    {
	      itemstack = new ItemStack(Material.IRON_SWORD, 1);
	      prizeName = "Iron Sword";
	      PlayerInventory inventory = player.getInventory();
	      inventory.addItem(itemstack);
	      break;
	    }
			case 9:
			{
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "eco give " + 
				player.getName() + " 1000");
				prizeName = "$1000";
				break;
				// Add money
			}
      case 10:
      {
        itemstack = new ItemStack(Material.DIAMOND_SWORD, 1);
        prizeName = "Diamond Sword";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
        break;
      }
			case 11:
			{
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "eco give " + 
				player.getName() + " 1000");
				prizeName = "$1000";
				break;
				// Add money
			}
			case 12:
			{
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "eco give " + 
				player.getName() + " 1000");
				prizeName = "$1000";
				break;
				// Add money
			}
			case 13:
			{
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "eco give " + 
				player.getName() + " 1000");
				prizeName = "$1000";
				break;
				// Add money
			}
			case 14:
			{
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "eco give " + 
				player.getName() + " 1000");
				prizeName = "$1000";
				break;
				// Add money
			}
			case 15:
			{
	      Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "tokens give " + 
	      player.getName() + " 100");
	      prizeName = "$100 Tokens!";
			  break;
				// Add tokens
			}
			case 16:
			{
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "tokens give " + 
        player.getName() + " 50");
        prizeName = "$50 Tokens!";
        break;
        // Add tokens
			}
			case 17:
			{
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "tokens give " + 
        player.getName() + " 25");
        prizeName = "$25 Tokens!";
        break;
        // Add tokens
			}
			case 18:
			{
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "tokens give " + 
        player.getName() + " 10");
        prizeName = "$100 Tokens!";
        break;
        // Add tokens
			}
			case 19:
			{
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "tokens give " + 
        player.getName() + " 10");
        prizeName = "$10 Tokens!";
        break;
        // Add tokens
			}
			case 20:
			{
				Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "eco give " + 
				player.getName() + " 1000");
				prizeName = "$1000";
				break;
				// Add McMMO credits
			}
			case 21:
			{
			  break;
				// Add McMMO credits
			}
			case 22:
			{
			  break;
				// Add McMMO credits
			}
			case 23:
			{
			  break;
				// Add McMMO credits
			}
			case 24:
			{
				itemstack = new ItemStack(Material.COAL_ORE, 16);
				prizeName = "Coal Ore";
				PlayerInventory inventory = player.getInventory();
				inventory.addItem(itemstack);
				break;
			}
			case 25:
			{
				itemstack = new ItemStack(Material.DIAMOND_ORE, 8);
				prizeName = "Diamond Ore";
				PlayerInventory inventory = player.getInventory();
				inventory.addItem(itemstack);
				break;
			}
			case 26:
			{
				itemstack = new ItemStack(Material.GLOWSTONE_DUST, 16);
				prizeName = "Glowstone!";
				PlayerInventory inventory = player.getInventory();
				inventory.addItem(itemstack);
				break;
			}
			case 27:
			{
			  itemstack = new ItemStack(Material.BLAZE_ROD, 5);
			  prizeName = "Blazkerods!";
			  PlayerInventory inventory = player.getInventory();
			  inventory.addItem(itemstack);
			  break;
			}
			case 28:
			{
        itemstack = new ItemStack(Material.BLAZE_ROD, 5);
        prizeName = "Blazkerods!";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
        break;
			}
			case 29:
			{
        itemstack = new ItemStack(Material.BLAZE_ROD, 5);
        prizeName = "Blazkerods!";
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(itemstack);
        break;
			}
			case 30:
			{
			  itemstack = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
			  prizeName = "Chainmail Boots!";
			  PlayerInventory inventory = player.getInventory();
			  inventory.addItem(itemstack);
			  break;
			}
			case 31:
			{
			  itemstack = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
			  prizeName = "Chainmail Chestplate!";
			  PlayerInventory inventory = player.getInventory();
			  inventory.addItem(itemstack);
			  break;
			}
			case 32:
			{
			  itemstack = new ItemStack(Material.CHAINMAIL_HELMET, 1);
			  prizeName = "Chainmail Helmet!";
			  PlayerInventory inventory = player.getInventory();
			  inventory.addItem(itemstack);
			  break;
			}
			case 33:
			{
			  itemstack = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
			  prizeName = "Chainmail Leggings!";
			  PlayerInventory inventory = player.getInventory();
			  inventory.addItem(itemstack);
			  break;
			}
			case 34:
			{
			  itemstack = new ItemStack(Material.CAKE, 1);
			  prizeName = "Cake";
			  PlayerInventory inventory = player.getInventory();
			  inventory.addItem(itemstack);
			  break;
			}
			case 35:
			{
			  itemstack = new ItemStack(Material.DIAMOND_SWORD, 1);
			  itemstack.addEnchantment(SHARPNESS, 3);
			  prizeName = "Sharp Diamond Sword!";
			  PlayerInventory inventory = player.getInventory();
			  inventory.addItem(itemstack);
			  break;
			}
			case 36:
			{
			  
			  break;
			}
			case 37:
			{
			  
			  break;
			}
			case 38:
			{
			  
			  break;
			}
			case 39:
			{
			  
			  break;
			}
			case 40:
			{
			  
			  break;
			}
			case 41:
			{
			  
			  break;
			}
			case 42:
			{
			  
			  break;
			}
			case 43:
			{
			  
			  break;
			}
			case 44:
			{
			  
			  break;
			}
			case 45:
			{
			  
			  break;
			}
			case 46:
			{
			  
			  break;
			}
			case 47:
			{
			  
			  break;
			}
			case 48:
			{
			  
			  break;
			}
			case 49:
			{
			  
			  break;
			}
			case 50:
			{
			  
			  break;
			}
			default:
			{
				itemstack = new ItemStack(Material.EXP_BOTTLE, 32);
				prizeName = "Bottles of Enchanting";
				PlayerInventory inventory = player.getInventory();
				inventory.addItem(itemstack);
				break;
			}
			}
		 
			for (Player p : Bukkit.getOnlinePlayers())
			{
				p.sendMessage(ChatColor.GOLD + "[Swag-Raffles]" + ChatColor.AQUA + " "
				    + "" + player.getName() + " has won " + ChatColor.BOLD + 
				    prizeName + ChatColor.AQUA + " from /raffles!");
			}			
			return true;
		}
		return false;
		
	}

}
