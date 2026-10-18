package com.enderdevelopment.plugin.creatures;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Freddy {
    private final Location location;

    public Freddy(Location location) {
        this.location = location;
    }

    public void spawn() {
        Zombie freddy = (Zombie) location.getWorld().spawnEntity(location, EntityType.ZOMBIE);
        freddy.setCustomName("Freddy Krueger");
        freddy.setCustomNameVisible(true);
        freddy.setBaby(false);
        freddy.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
        freddy.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2));
        freddy.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 2));
    }
}