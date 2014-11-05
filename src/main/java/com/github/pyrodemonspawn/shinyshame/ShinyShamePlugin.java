package com.github.pyrodemonspawn.shinyshame;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class ShinyShamePlugin extends JavaPlugin {
    @Override
    public void onEnable(){
        Logger logger = getServer().getLogger();
        logger.info("Starting ShinyShame Plugin.");
    }
    @Override
    public void onDisable(){
        Logger logger = getServer().getLogger();
        logger.info("Disabling ShinyShame Plugin.");
    }
}
