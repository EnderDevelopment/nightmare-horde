package com.enderdevelopment.plugin.creatures;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Sonic {
    private final Location location;

    public Sonic(Location location) {
        this.location = location;
    }

    public void spawn() {
        Zombie sonic = (Zombie) location.getWorld().spawnEntity(location, EntityType.ZOMBIE);
        sonic.setCustomName("Sonic");
        sonic.setCustomNameVisible(true);
        sonic.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
        sonic.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, Integer.MAX_VALUE, 2));
        sonic.setBaby(false);
    }
}