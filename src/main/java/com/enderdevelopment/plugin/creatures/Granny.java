package com.enderdevelopment.plugin.creatures;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Granny {
    private final Location location;

    public Granny(Location location) {
        this.location = location;
    }

    public void spawn() {
        Zombie granny = (Zombie) location.getWorld().spawnEntity(location, EntityType.ZOMBIE);
        granny.setCustomName("Granny");
        granny.setCustomNameVisible(true);
        granny.setBaby(false);
        granny.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
        granny.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2));
        granny.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 2));
    }
}