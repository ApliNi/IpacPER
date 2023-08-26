package aplini.ipacper.Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerKickEvent;

//import static org.bukkit.Bukkit.getLogger;

public class onPlayerKick implements Listener {

    final String kickJson = "TranslatableComponentImpl{key=\"disconnect.spam\", args=[], fallback=null, style=StyleImpl{obfuscated=not_set, bold=not_set, strikethrough=not_set, underlined=not_set, italic=not_set, color=null, clickEvent=null, hoverEvent=null, insertion=null, font=null}, children=[]}";

    @EventHandler
    public void onKick(PlayerKickEvent event) {
//        getLogger().info(event.reason().toString());
        if(event.reason().toString().equals(kickJson) && event.getPlayer().hasPermission("IpacPER.onPlayerKickForSpamming")){
            event.setCancelled(true);
        }
    }
}
