package fr.testmod.hugobonobo.proxy;

import fr.testmod.hugobonobo.init.ModBlocks;
import fr.testmod.hugobonobo.init.ModItems;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy
{
    @Override
    public void preInit() {
        super.preInit();

        MinecraftForge.EVENT_BUS.register(ModItems.INSTANCE);
        MinecraftForge.EVENT_BUS.register(ModBlocks.INSTANCE);
    }

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void postInit() {
        super.postInit();
    }
}
