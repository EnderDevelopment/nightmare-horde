package com.enderdevelopment.plugin.creatures;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Siren {
    private final Location location;

    public Siren(Location location) {
        this.location = location;
    }

    public void spawn() {
        Zombie siren = (Zombie) location.getWorld().spawnEntity(location, EntityType.ZOMBIE);
        siren.setCustomName("Siren");
        siren.setCustomNameVisible(true);
        siren.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
        siren.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, Integer.MAX_VALUE, 2));
        siren.setBaby(false);
    }
}