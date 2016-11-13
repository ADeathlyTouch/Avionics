package com.collinriggs.avionics.test;

import com.collinriggs.avionics.blocks.ContainerNewWorkbench;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;

/**
 * Created by Jeremy on 11/12/2016.
 */
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class GuiTinyChest extends GuiContainer {
    private static final ResourceLocation TINYBENCH_GUI = new ResourceLocation("avionics:textures/gui/dirtcontainer.png");

    public GuiTinyChest(InventoryPlayer playerInv, World worldIn) {
        super(new TinyChestContainer(playerInv, worldIn));
        this.xSize = 176;
        this.ySize = 165;
    }

    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        this.fontRendererObj.drawString(I18n.format("container.avionics.tinychest", new Object[0]), 28, 6, 4210752);
        this.fontRendererObj.drawString(I18n.format("container.avionics.inventory", new Object[0]), 8, this.ySize - 96 + 2, 4210752);
    }

    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(TINYBENCH_GUI);
        int i = (this.width - this.xSize) / 2;
        int j = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(i, j, 0, 0, this.xSize, this.ySize);
    }
}

