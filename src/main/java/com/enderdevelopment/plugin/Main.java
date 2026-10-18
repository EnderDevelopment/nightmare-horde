package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("HorrorCreatures plugin enabled!");
        this.getCommand("spawncreature").setExecutor(new SpawnCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("HorrorCreatures plugin disabled!");
    }
}