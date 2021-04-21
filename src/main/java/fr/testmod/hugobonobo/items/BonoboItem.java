package fr.testmod.hugobonobo.items;

import fr.testmod.hugobonobo.Main;
import fr.testmod.hugobonobo.init.ModItems;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class BonoboItem extends Item
{

    public BonoboItem(String name)
    {
        setRegistryName(name).setUnlocalizedName(name);
        setCreativeTab(Main.modtab);

        ModItems.INSTANCE.getItems().add(this);
    }


}
