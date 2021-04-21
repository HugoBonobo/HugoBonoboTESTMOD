package fr.testmod.hugobonobo.ct;

import fr.testmod.hugobonobo.init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BonoboTab extends CreativeTabs {


    public BonoboTab(String label) {
        super(label);


        setBackgroundImageName("bonobotab.png");//256*256 pixels fond creativetab


    }

    @Override
    public boolean hasSearchBar() {

        return true;
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModBlocks.grassy_block);
    }

}
