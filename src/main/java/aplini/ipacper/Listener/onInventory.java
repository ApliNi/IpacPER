package aplini.ipacper.Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;

public class onInventory implements Listener {

    // 库存交互事件
    @EventHandler(priority = EventPriority.LOW)
    private void onInventoryClick(InventoryClickEvent event) {
        func(event);
    }

    // 库存拖动事件
    @EventHandler(priority = EventPriority.LOW)
    private void onInventoryDrag(InventoryDragEvent event) {
        func(event);
    }

    // 处理程序
    private void func(InventoryInteractEvent event){
        // 如果这是一个虚拟库存 && 玩家有 IpacPER.DEV.onPlayerVirtualInventoryEventPreventCancelled 权限
        if(event.getInventory().getLocation() == null && event.getWhoClicked().hasPermission("IpacPER.DEV.onPlayerVirtualInventoryEventPreventCancelled")){
            // 取消取消
            event.setCancelled(false);
        }
    }

}
