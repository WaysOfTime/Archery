package com.wayoftime.archery.init;

import com.wayoftime.archery.ItemsAndBlocks.Items.Bows.ItemEbonyBow;
import com.wayoftime.archery.ItemsAndBlocks.Items.Bows.ItemTestBow;
import com.wayoftime.archery.ItemsAndBlocks.Items.ItemArchery;
import com.wayoftime.archery.ItemsAndBlocks.Items.Minerals.ItemEbonyIngot;
import com.wayoftime.archery.ItemsAndBlocks.Items.Misc.ItemTest;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemArchery Test = new ItemTest();
    public static final ItemArchery ebony_ingot = new ItemEbonyIngot();
    public static final ItemArchery ebony_bow = new ItemEbonyBow();
    public static final ItemTestBow test_bow = new ItemTestBow();

    public  static void init()
    {
        GameRegistry.registerItem(Test,"Test");
        GameRegistry.registerItem(ebony_ingot, "ebony_ingot");
        GameRegistry.registerItem(ebony_bow, "ebony_bow");
        GameRegistry.registerItem(test_bow, "test_bow");
    }
}
