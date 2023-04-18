package bg.hushcraft.elytrahelper.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;

public class PlayerSwapItemsListener implements Listener {

    @EventHandler
    public void onPlayerSwapItems(PlayerSwapHandItemsEvent event) {
        Player player = event.getPlayer();

        if (player.isGliding()) {
            player.performCommand("setpitch");

            event.setCancelled(true);
        }
    }
}
