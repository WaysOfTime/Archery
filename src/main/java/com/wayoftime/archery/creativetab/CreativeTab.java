package com.wayoftime.archery.creativetab;

import com.wayoftime.archery.init.ModItems;
import com.wayoftime.archery.Reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab
{
    public static final CreativeTabs ARCHERY_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.ebony_ingot;
        }

        @Override
    public String getTranslatedTabLabel()
        {
            return "Archery Mod";
        }
    };
}