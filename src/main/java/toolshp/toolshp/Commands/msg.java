package toolshp.toolshp.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class msg implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        sender.sendMessage("["+ ChatColor.RED + "TOOLSHP"  + ChatColor.WHITE + "] " + sender.getName() +" さん、ToolsHPプラグインへようこそ");

        Bukkit.broadcastMessage("["+ ChatColor.RED + "TOOLSHP"  + ChatColor.WHITE + "] " +" ToolsHPプラグインが起動しています。");

        return true;
    }
}
