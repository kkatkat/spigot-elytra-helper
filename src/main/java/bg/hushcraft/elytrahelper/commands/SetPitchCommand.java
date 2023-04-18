package bg.hushcraft.elytrahelper.commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class SetPitchCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            return true;
        }

        Player player = (Player) sender;

        Location loc = player.getLocation();
        Vector velocity =  player.getVelocity();

        loc.setPitch(-4.5f);
        player.teleport(loc);
        player.setVelocity(velocity);

        Vector v = new Vector();

        return true;
    }
}
