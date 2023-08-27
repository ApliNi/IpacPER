package aplini.ipacper;

import aplini.ipacper.Listener.onInventory;
import aplini.ipacper.Listener.onPlayerAdvancement;
import aplini.ipacper.Listener.onPlayerKick;
import aplini.ipacper.Listener.onPlayerTP;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public final class IpacPER extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // 注册监听器
        getServer().getPluginManager().registerEvents(new onPlayerTP(), this);
        getServer().getPluginManager().registerEvents(new onPlayerKick(), this);
        getServer().getPluginManager().registerEvents(new onPlayerAdvancement(), this);
        getServer().getPluginManager().registerEvents(new onInventory(), this);
    }

    @Override
    public void onDisable() {
    }

}
