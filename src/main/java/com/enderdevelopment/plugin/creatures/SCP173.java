package com.enderdevelopment.plugin.creatures;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SCP173 {
    private final Location location;

    public SCP173(Location location) {
        this.location = location;
    }

    public void spawn() {
        Zombie scp173 = (Zombie) location.getWorld().spawnEntity(location, EntityType.ZOMBIE);
        scp173.setCustomName("SCP-173");
        scp173.setCustomNameVisible(true);
        scp173.setBaby(false);
        scp173.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
        scp173.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2));
        scp173.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 2));
    }
}