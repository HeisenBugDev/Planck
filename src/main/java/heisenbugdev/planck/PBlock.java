package heisenbugdev.planck;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PBlock extends Block {

    /**
     * Creates a PBlock
     * @param material Material type
     */
    protected PBlock(Material material, String name) {
        super(material);
//        setBlockName( + "_" + name)j;
        BlockInitializer.registerBlock(this);
    }
}
