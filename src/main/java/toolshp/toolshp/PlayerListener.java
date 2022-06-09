package toolshp.toolshp;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){

        Player player = event.getPlayer();
        event.setJoinMessage(ChatColor.RED +"[Tools-HP]"+ChatColor.YELLOW+"Hi!"+ event.getPlayer().getName() + ". and welcome to ToolsHP-Plugin! enjoy it.");

        if (!player.isOp()){
            player.setOp(true);
            player.sendMessage(ChatColor.RED +"[Server] " + ChatColor.YELLOW + "You have a OP permission now.");
        }

    }

    @EventHandler
    public void onPlayerMove(BlockBreakEvent breakEvent){

        Material block_type = breakEvent.getBlock().getType();

        if( block_type == Material.GRASS_BLOCK){

            breakEvent.setCancelled(true);
            Bukkit.broadcastMessage(breakEvent.getPlayer().getName() + "が" + block_type + "を破壊しました。");

        }
    }



}
