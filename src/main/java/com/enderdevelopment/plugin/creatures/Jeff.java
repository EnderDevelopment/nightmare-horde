package com.enderdevelopment.plugin.creatures;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Jeff {
    private final Location location;

    public Jeff(Location location) {
        this.location = location;
    }

    public void spawn() {
        Zombie jeff = (Zombie) location.getWorld().spawnEntity(location, EntityType.ZOMBIE);
        jeff.setCustomName("Jeff");
        jeff.setCustomNameVisible(true);
        jeff.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
        jeff.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, Integer.MAX_VALUE, 2));
        jeff.setBaby(false);
    }
}