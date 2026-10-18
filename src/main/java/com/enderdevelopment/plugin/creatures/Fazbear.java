package com.enderdevelopment.plugin.creatures;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Fazbear {
    private final Location location;

    public Fazbear(Location location) {
        this.location = location;
    }

    public void spawn() {
        Zombie fazbear = (Zombie) location.getWorld().spawnEntity(location, EntityType.ZOMBIE);
        fazbear.setCustomName("Fazbear");
        fazbear.setCustomNameVisible(true);
        fazbear.setBaby(false);
        fazbear.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
        fazbear.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2));
        fazbear.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 2));
    }
}