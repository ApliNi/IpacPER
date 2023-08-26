package aplini.ipacper.Listener;

import org.bukkit.advancement.Advancement;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerAdvancementDoneEvent;

public class onPlayerAdvancement implements Listener {

    @EventHandler
    public void onPlayerAdvancementDoneEvent(PlayerAdvancementDoneEvent event) {
        Player player = event.getPlayer();
        if(!player.hasPermission("IpacPER.onPlayerAdvancementDoneEvent")){
            // paper: 设置广播消息为空
            event.message(null);
            // 撤销所有进度条件
            Advancement advancement = event.getAdvancement();
            for(String criteria: advancement.getCriteria()){
                player.getAdvancementProgress(advancement).revokeCriteria(criteria);
            }
        }
    }
}
