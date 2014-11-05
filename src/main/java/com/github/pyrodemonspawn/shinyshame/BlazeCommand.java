package com.github.pyrodemonspawn.shinyshame;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Created by mscs on 11/4/14.
 */
public class BlazeCommand implements CommandExecutor {
    private final ShinyShamePlugin plugin;

    public BlazeCommand(ShinyShamePlugin shinyShamePlugin) {
        this.plugin = shinyShamePlugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        return false;
    }
}
