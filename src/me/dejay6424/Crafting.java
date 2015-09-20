package me.dejay6424;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Crafting extends JavaPlugin {
    
    public static Crafting plugin;

    @Override
    public void onEnable() {
        plugin.getLogger().info("If you are seeing this. The plugin works.");
        plugin.precipe();
    }

    @Override
    public void onDisable() {
        plugin.getLogger().info("Crafting plugin disabled.");
    }

    public void precipe() {
        ItemStack creeperEgg = new ItemStack(Material.MONSTER_EGG, 1);
        creeperEgg.setDurability((short) 50);
        ItemMeta meta = creeperEgg.getItemMeta();
        meta.setDisplayName(ChatColor.GREEN + "Spawn Creeper");
        creeperEgg.setItemMeta(meta);

        ShapelessRecipe precipe = new ShapelessRecipe(creeperEgg);
        precipe.addIngredient(3, Material.TNT);
        Bukkit.getServer().addRecipe(precipe);
    }
}
