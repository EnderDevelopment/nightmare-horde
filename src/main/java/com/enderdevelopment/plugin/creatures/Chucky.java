package com.enderdevelopment.plugin.creatures;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Chucky {
    private final Location location;

    public Chucky(Location location) {
        this.location = location;
    }

    public void spawn() {
        Zombie chucky = (Zombie) location.getWorld().spawnEntity(location, EntityType.ZOMBIE);
        chucky.setCustomName("Chucky");
        chucky.setCustomNameVisible(true);
        chucky.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
        chucky.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, Integer.MAX_VALUE, 2));
        chucky.setBaby(false);
    }
}