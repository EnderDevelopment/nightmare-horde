package com.enderdevelopment.plugin.creatures;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Jason {
    private final Location location;

    public Jason(Location location) {
        this.location = location;
    }

    public void spawn() {
        Zombie jason = (Zombie) location.getWorld().spawnEntity(location, EntityType.ZOMBIE);
        jason.setCustomName("Jason");
        jason.setCustomNameVisible(true);
        jason.setBaby(false);
        jason.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
        jason.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2));
        jason.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 2));
    }
}