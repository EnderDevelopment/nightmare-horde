package com.enderdevelopment.plugin.creatures;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Bendy {
    private final Location location;

    public Bendy(Location location) {
        this.location = location;
    }

    public void spawn() {
        Zombie bendy = (Zombie) location.getWorld().spawnEntity(location, EntityType.ZOMBIE);
        bendy.setCustomName("Bendy");
        bendy.setCustomNameVisible(true);
        bendy.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
        bendy.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, Integer.MAX_VALUE, 2));
        bendy.setBaby(false);
    }
}