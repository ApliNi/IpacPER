package aplini.ipacper.Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;

public class onPlayerTP implements Listener {


    @EventHandler
    public void playerCommandTeleportEvent(PlayerTeleportEvent event) {
        // 玩家处于观察模式
        if(event.getCause() == PlayerTeleportEvent.TeleportCause.SPECTATE){
            // 如果玩家没有权限则取消事件
            event.setCancelled(!event.getPlayer().hasPermission("IpacPER.onPlayerTP.spectatorTPGUI"));
        }
    }
}
