package com.collinriggs.avionics.recipe;

/**
 * Created by Deathly on 11/20/2016 at 1:09 AM.
 */
import com.collinriggs.avionics.Items.ModItems;
import com.collinriggs.avionics.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import static net.minecraft.init.Items.*;
import static net.minecraft.item.Item.getByNameOrId;
import static net.minecraftforge.fml.common.registry.GameRegistry.addRecipe;
import static net.minecraftforge.fml.common.registry.GameRegistry.addShapelessRecipe;
public class ModRecipes {

    public static void init() {
        addShapedRecipes();
        addShapelessRecipes();
    }

    private static void addShapelessRecipes() {
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.purewhite),"a","x",'a',Items.WATER_BUCKET,'x',ModBlocks.pureblack);
    }

    private static void addShapedRecipes() {
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.purewhite),"aaa","aya","aaa",'a', ModItems.purifieddust,'y', Blocks.STONE);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.purifieddust),"xxx","xyx","xxx",'x', Blocks.STONE,'y', Items.GLOWSTONE_DUST);
    }
}