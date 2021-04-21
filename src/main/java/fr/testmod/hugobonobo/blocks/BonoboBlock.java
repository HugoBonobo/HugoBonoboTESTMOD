package fr.testmod.hugobonobo.blocks;

import fr.testmod.hugobonobo.Main;
import fr.testmod.hugobonobo.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import scala.tools.nsc.typechecker.Macros;

public class  BonoboBlock extends Block
{
    public BonoboBlock(String name, Material materialIn) {
        super(materialIn);
        setRegistryName(name).setUnlocalizedName(name);

        ModBlocks.INSTANCE.getBlocks().add(this);
    }

    public BonoboBlock(String name, Material materialIn, float hardness, float resistance) {
        this(name, materialIn);

        setHardness(hardness);
        setResistance(resistance);
        setCreativeTab(Main.modtab);

        //ModBlocks.INSTANCE.getBlocks().add(this);
    }

    public BonoboBlock(String name, Material material, float hardness, float resistance, int harvestLevel, String harvestType){
        this(name, material, hardness, resistance);

        setHarvestLevel(harvestType, harvestLevel);
        // 0 -> Pioche en Bois 1 -> Pioche en Pierre 2 -> Pioche en Fer 3 -> Pioche en Diamant

        //ModBlocks.INSTANCE.getBlocks().add(this);
    }
}
