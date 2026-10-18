package com.enderdevelopment.plugin.creatures;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Ghostface {
    private final Location location;

    public Ghostface(Location location) {
        this.location = location;
    }

    public void spawn() {
        Zombie ghostface = (Zombie) location.getWorld().spawnEntity(location, EntityType.ZOMBIE);
        ghostface.setCustomName("Ghostface");
        ghostface.setCustomNameVisible(true);
        ghostface.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
        ghostface.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, Integer.MAX_VALUE, 2));
        ghostface.setBaby(false);
    }
}