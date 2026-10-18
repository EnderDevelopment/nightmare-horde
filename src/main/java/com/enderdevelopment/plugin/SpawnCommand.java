package com.enderdevelopment.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this command.");
            return true;
        }

        Player player = (Player) sender;
        if (args.length == 0) {
            player.sendMessage("Usage: /spawncreature <creature>");
            return true;
        }

        String creature = args[0].toLowerCase();
        switch (creature) {
            case "jason":
                new Jason(player.getLocation()).spawn();
                break;
            case "freddy":
                new Freddy(player.getLocation()).spawn();
                break;
            case "scp173":
                new SCP173(player.getLocation()).spawn();
                break;
            case "scp096":
                new SCP096(player.getLocation()).spawn();
                break;
            case "scp049":
                new SCP049(player.getLocation()).spawn();
                break;
            case "freedy":
                new Freedy(player.getLocation()).spawn();
                break;
            case "fazbear":
                new Fazbear(player.getLocation()).spawn();
                break;
            case "baldi":
                new Baldi(player.getLocation()).spawn();
                break;
            case "granny":
                new Granny(player.getLocation()).spawn();
                break;
            case "siren":
                new Siren(player.getLocation()).spawn();
                break;
            case "predator":
                new Predator(player.getLocation()).spawn();
                break;
            case "xenomorph":
                new Xenomorph(player.getLocation()).spawn();
                break;
            case "pyramidhead":
                new PyramidHead(player.getLocation()).spawn();
                break;
            case "springtrap":
                new Springtrap(player.getLocation()).spawn();
                break;
            case "jeff":
                new Jeff(player.getLocation()).spawn();
                break;
            case "slenderman":
                new Slenderman(player.getLocation()).spawn();
                break;
            case "bendy":
                new Bendy(player.getLocation()).spawn();
                break;
            case "chucky":
                new Chucky(player.getLocation()).spawn();
                break;
            case "leatherface":
                new Leatherface(player.getLocation()).spawn();
                break;
            case "michael":
                new Michael(player.getLocation()).spawn();
                break;
            case "pinhead":
                new Pinhead(player.getLocation()).spawn();
                break;
            case "ghostface":
                new Ghostface(player.getLocation()).spawn();
                break;
            case "sonic":
                new Sonic(player.getLocation()).spawn();
                break;
            default:
                player.sendMessage("Unknown creature: " + creature);
                return true;
        }
        player.sendMessage("Spawned " + creature + "!");
        return true;
    }
}