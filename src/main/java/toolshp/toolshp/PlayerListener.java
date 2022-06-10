package toolshp.toolshp;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){

        Player player = event.getPlayer();
        event.setJoinMessage(ChatColor.RED +"[Tools-HP]"+ChatColor.YELLOW+"Hi!"+ event.getPlayer().getName() + ". and welcome to ToolsHP-Plugin! enjoy it.");

//        if (!player.isOp()){
//            player.setOp(true);
//            player.sendMessage(ChatColor.RED +"[Server] " + ChatColor.YELLOW + "You have a OP permission now.");
//        }

    }

    @EventHandler
    public void onPlayerBreakBlocks(BlockBreakEvent breakEvent){

        Player player = breakEvent.getPlayer();

        if (!player.isOp()){
            breakEvent.setCancelled(true);
            player.sendMessage(ChatColor.RED + "[Server] あなたにはブロックなどの破壊等が許可されていません。");
        }
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e){

        Player entity = e.getEntity().getPlayer();

        int Loc_X = entity.getLocation().getBlockX();
        int Loc_Y = entity.getLocation().getBlockY();
        int Loc_Z = entity.getLocation().getBlockZ();

        entity.sendMessage(ChatColor.YELLOW + "Hey " + entity.getName() + ", You Died at " +"X："+Loc_X + " Y："+ Loc_Y + " Z："+ Loc_Z );

    }

}
