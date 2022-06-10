package toolshp.toolshp;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import toolshp.toolshp.Commands.AllowFly;
import toolshp.toolshp.Commands.countDown;
import toolshp.toolshp.Commands.msg;

public final class ToolsHP extends JavaPlugin {

    private static JavaPlugin plugin;

    public static String noPermission = ChatColor.RED + "you dont have a permission to run this.";

    @Override
    public void onEnable() {
        // Plugin startup logic

        plugin = this;

        getServer().getPluginManager().registerEvents(new PlayerListener(), this);

        getCommand("message").setExecutor(new msg());

        getCommand("Timer").setExecutor(new countDown());

        getCommand("AllowFly").setExecutor(new AllowFly());

        super.onEnable();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        super.onDisable();
    }

    public static JavaPlugin getPlugin(){ return plugin; }
}
