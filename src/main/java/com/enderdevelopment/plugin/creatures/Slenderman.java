package com.enderdevelopment.plugin.creatures;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Slenderman {
    private final Location location;

    public Slenderman(Location location) {
        this.location = location;
    }

    public void spawn() {
        Zombie slenderman = (Zombie) location.getWorld().spawnEntity(location, EntityType.ZOMBIE);
        slenderman.setCustomName("Slenderman");
        slenderman.setCustomNameVisible(true);
        slenderman.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
        slenderman.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, Integer.MAX_VALUE, 2));
        slenderman.setBaby(false);
    }
}