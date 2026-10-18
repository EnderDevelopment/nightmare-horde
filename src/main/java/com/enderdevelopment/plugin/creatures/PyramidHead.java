package com.enderdevelopment.plugin.creatures;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PyramidHead {
    private final Location location;

    public PyramidHead(Location location) {
        this.location = location;
    }

    public void spawn() {
        Zombie pyramidHead = (Zombie) location.getWorld().spawnEntity(location, EntityType.ZOMBIE);
        pyramidHead.setCustomName("Pyramid Head");
        pyramidHead.setCustomNameVisible(true);
        pyramidHead.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
        pyramidHead.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, Integer.MAX_VALUE, 2));
        pyramidHead.setBaby(false);
    }
}