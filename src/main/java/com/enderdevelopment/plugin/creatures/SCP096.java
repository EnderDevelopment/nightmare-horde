package com.enderdevelopment.plugin.creatures;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SCP096 {
    private final Location location;

    public SCP096(Location location) {
        this.location = location;
    }

    public void spawn() {
        Zombie scp096 = (Zombie) location.getWorld().spawnEntity(location, EntityType.ZOMBIE);
        scp096.setCustomName("SCP-096");
        scp096.setCustomNameVisible(true);
        scp096.setBaby(false);
        scp096.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
        scp096.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2));
        scp096.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 2));
    }
}