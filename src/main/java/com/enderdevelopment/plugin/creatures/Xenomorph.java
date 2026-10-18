package com.enderdevelopment.plugin.creatures;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Xenomorph {
    private final Location location;

    public Xenomorph(Location location) {
        this.location = location;
    }

    public void spawn() {
        Zombie xenomorph = (Zombie) location.getWorld().spawnEntity(location, EntityType.ZOMBIE);
        xenomorph.setCustomName("Xenomorph");
        xenomorph.setCustomNameVisible(true);
        xenomorph.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
        xenomorph.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, Integer.MAX_VALUE, 2));
        xenomorph.setBaby(false);
    }
}