package com.enderdevelopment.plugin.creatures;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SCP049 {
    private final Location location;

    public SCP049(Location location) {
        this.location = location;
    }

    public void spawn() {
        Zombie scp049 = (Zombie) location.getWorld().spawnEntity(location, EntityType.ZOMBIE);
        scp049.setCustomName("SCP-049");
        scp049.setCustomNameVisible(true);
        scp049.setBaby(false);
        scp049.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
        scp049.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2));
        scp049.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 2));
    }
}