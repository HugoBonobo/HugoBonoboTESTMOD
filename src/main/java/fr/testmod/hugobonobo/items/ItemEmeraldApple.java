package fr.testmod.hugobonobo.items;

import fr.testmod.hugobonobo.Main;
import fr.testmod.hugobonobo.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemEmeraldApple extends ItemFood {

    public ItemEmeraldApple(String name, int amount, float saturation, boolean isWolfFood) {


        super(amount, saturation, isWolfFood);
        setRegistryName(name).setUnlocalizedName(name).setCreativeTab(Main.modtab);

        ModItems.INSTANCE.getItems().add(this);

    }

    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        player.addPotionEffect(new PotionEffect(Potion.getPotionById(1), 20*60*2, 5));

    }

    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 20*5;
    }

}

