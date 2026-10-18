package com.enderdevelopment.plugin.creatures;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Springtrap {
    private final Location location;

    public Springtrap(Location location) {
        this.location = location;
    }

    public void spawn() {
        Zombie springtrap = (Zombie) location.getWorld().spawnEntity(location, EntityType.ZOMBIE);
        springtrap.setCustomName("Springtrap");
        springtrap.setCustomNameVisible(true);
        springtrap.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
        springtrap.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, Integer.MAX_VALUE, 2));
        springtrap.setBaby(false);
    }
}