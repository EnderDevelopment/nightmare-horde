package com.enderdevelopment.plugin.creatures;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Predator {
    private final Location location;

    public Predator(Location location) {
        this.location = location;
    }

    public void spawn() {
        Zombie predator = (Zombie) location.getWorld().spawnEntity(location, EntityType.ZOMBIE);
        predator.setCustomName("Predator");
        predator.setCustomNameVisible(true);
        predator.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
        predator.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, Integer.MAX_VALUE, 2));
        predator.setBaby(false);
    }
}