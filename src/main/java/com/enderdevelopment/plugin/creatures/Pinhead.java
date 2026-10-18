package com.enderdevelopment.plugin.creatures;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Pinhead {
    private final Location location;

    public Pinhead(Location location) {
        this.location = location;
    }

    public void spawn() {
        Zombie pinhead = (Zombie) location.getWorld().spawnEntity(location, EntityType.ZOMBIE);
        pinhead.setCustomName("Pinhead");
        pinhead.setCustomNameVisible(true);
        pinhead.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
        pinhead.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, Integer.MAX_VALUE, 2));
        pinhead.setBaby(false);
    }
}