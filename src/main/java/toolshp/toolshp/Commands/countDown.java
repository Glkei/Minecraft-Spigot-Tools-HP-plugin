package toolshp.toolshp.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import toolshp.toolshp.Timer;
import toolshp.toolshp.ToolsHP;

public class countDown implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender.isOp()){
            Timer.countdown();
        }else{
            sender.sendMessage(ToolsHP.noPermission);
        }

        return true;
    }
}
