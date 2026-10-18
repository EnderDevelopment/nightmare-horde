package com.enderdevelopment.plugin.creatures;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Freedy {
    private final Location location;

    public Freedy(Location location) {
        this.location = location;
    }

    public void spawn() {
        Zombie freedy = (Zombie) location.getWorld().spawnEntity(location, EntityType.ZOMBIE);
        freedy.setCustomName("Freedy");
        freedy.setCustomNameVisible(true);
        freedy.setBaby(false);
        freedy.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
        freedy.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2));
        freedy.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 2));
    }
}