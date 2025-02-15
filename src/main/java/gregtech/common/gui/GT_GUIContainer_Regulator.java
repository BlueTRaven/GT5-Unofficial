package gregtech.common.gui;

import gregtech.api.gui.GT_GUIContainerMetaTile_Machine;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import net.minecraft.entity.player.InventoryPlayer;

public class GT_GUIContainer_Regulator extends GT_GUIContainerMetaTile_Machine {

    private final int textColor = this.getTextColorOrDefault("text", 0xFAFAFF);

    public GT_GUIContainer_Regulator(InventoryPlayer aInventoryPlayer, IGregTechTileEntity aTileEntity) {
        super(new GT_Container_Regulator(aInventoryPlayer, aTileEntity), "gregtech:textures/gui/Regulator.png");
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        this.fontRendererObj.drawString(String.valueOf(((GT_Container_Regulator) this.mContainer).mTargetSlots[0]), 120, 9, textColor);
        this.fontRendererObj.drawString(String.valueOf(((GT_Container_Regulator) this.mContainer).mTargetSlots[1]), 137, 9, textColor);
        this.fontRendererObj.drawString(String.valueOf(((GT_Container_Regulator) this.mContainer).mTargetSlots[2]), 155, 9, textColor);
        this.fontRendererObj.drawString(String.valueOf(((GT_Container_Regulator) this.mContainer).mTargetSlots[3]), 120, 26, textColor);
        this.fontRendererObj.drawString(String.valueOf(((GT_Container_Regulator) this.mContainer).mTargetSlots[4]), 137, 26, textColor);
        this.fontRendererObj.drawString(String.valueOf(((GT_Container_Regulator) this.mContainer).mTargetSlots[5]), 155, 26, textColor);
        this.fontRendererObj.drawString(String.valueOf(((GT_Container_Regulator) this.mContainer).mTargetSlots[6]), 120, 43, textColor);
        this.fontRendererObj.drawString(String.valueOf(((GT_Container_Regulator) this.mContainer).mTargetSlots[7]), 137, 43, textColor);
        this.fontRendererObj.drawString(String.valueOf(((GT_Container_Regulator) this.mContainer).mTargetSlots[8]), 155, 43, textColor);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float parTicks, int mouseX, int mouseY) {
        super.drawGuiContainerBackgroundLayer(parTicks, mouseX, mouseY);
        int x = (this.width - this.xSize) / 2;
        int y = (this.height - this.ySize) / 2;
        drawTexturedModalRect(x, y, 0, 0, this.xSize, this.ySize);
    }
}
