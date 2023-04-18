package bg.hushcraft.elytrahelper;

import bg.hushcraft.elytrahelper.commands.SetPitchCommand;
import bg.hushcraft.elytrahelper.listeners.PlayerSwapItemsListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Elytrahelper extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new PlayerSwapItemsListener(), this);
        getCommand("setpitch").setExecutor(new SetPitchCommand());

    }
}
