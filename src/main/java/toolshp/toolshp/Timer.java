package toolshp.toolshp;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

public class Timer {

    public static int count = 20;

    public static void countdown(){
        BukkitRunnable task = new BukkitRunnable() {
            public void run() {

                if(count == 0){
                    Bukkit.broadcastMessage("試合開始です");
                    this.cancel();
                }
                else {
                    Bukkit.broadcastMessage("残り: "+ count + "秒");
                }

                count--;
            }
        };

        task.runTaskTimer(ToolsHP.getPlugin(),0L,20L);

    }

}
