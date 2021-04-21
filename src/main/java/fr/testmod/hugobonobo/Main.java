package fr.testmod.hugobonobo;

import fr.testmod.hugobonobo.ct.BonoboTab;
import fr.testmod.hugobonobo.events.RegisteringEvent;
import fr.testmod.hugobonobo.proxy.CommonProxy;
import fr.testmod.hugobonobo.utils.References;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)
public class Main {

    @Mod.Instance(References.MODID)
    public static Main instance ;

    @SidedProxy(clientSide = References.CP, serverSide = References.SP)
    public static CommonProxy proxy;

    public static final CreativeTabs modtab = new  BonoboTab("bonobotab");

    public Main()
    {
        MinecraftForge.EVENT_BUS.register(new RegisteringEvent());

    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        proxy.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e)
    {
        proxy.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
        proxy.postInit();
    }
}
