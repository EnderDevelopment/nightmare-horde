package com.enderdevelopment.plugin.creatures;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Michael {
    private final Location location;

    public Michael(Location location) {
        this.location = location;
    }

    public void spawn() {
        Zombie michael = (Zombie) location.getWorld().spawnEntity(location, EntityType.ZOMBIE);
        michael.setCustomName("Michael Myers");
        michael.setCustomNameVisible(true);
        michael.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
        michael.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, Integer.MAX_VALUE, 2));
        michael.setBaby(false);
    }
}