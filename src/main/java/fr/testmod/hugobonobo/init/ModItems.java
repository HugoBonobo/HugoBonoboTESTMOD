package fr.testmod.hugobonobo.init;

import com.google.common.collect.Lists;
import fr.testmod.hugobonobo.items.BonoboItem;
import fr.testmod.hugobonobo.items.ItemEmeraldApple;
import fr.testmod.hugobonobo.utils.References;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.List;


public class ModItems
{

    public static final ModItems INSTANCE = new ModItems();

    public static Item green_apple;
    public static ItemFood emerald_apple;

    private List<Item> items;


    public  void init()
    {
        items = Lists.newArrayList();

        green_apple = new BonoboItem("green_apple_item");
        emerald_apple = new ItemEmeraldApple("emerald_apple", 20,25f, false);


    }

    @SubscribeEvent
    public void registerModels(ModelRegistryEvent e)
    {
        for(Item item : items)
        {
            registerModel(item);

        }

    }

    private void registerModel(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(References.MODID, item.getUnlocalizedName().substring(5)), "inventory"));

    }

    public List<Item> getItems() {
        return items;
    }
}
