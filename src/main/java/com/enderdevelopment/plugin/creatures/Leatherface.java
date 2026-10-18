package com.enderdevelopment.plugin.creatures;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Leatherface {
    private final Location location;

    public Leatherface(Location location) {
        this.location = location;
    }

    public void spawn() {
        Zombie leatherface = (Zombie) location.getWorld().spawnEntity(location, EntityType.ZOMBIE);
        leatherface.setCustomName("Leatherface");
        leatherface.setCustomNameVisible(true);
        leatherface.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
        leatherface.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, Integer.MAX_VALUE, 2));
        leatherface.setBaby(false);
    }
}