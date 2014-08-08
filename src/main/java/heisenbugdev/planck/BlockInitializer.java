package heisenbugdev.planck;

import org.apache.commons.lang3.StringUtils;

/**
 * This class initializes all sorts of things. It handles registering blocks, recipes, TEs, etc.
 * It will also keep track of all these things so that they can be accessed by other mods.
 */
public class BlockInitializer {
    /**
     * Extracts the block name from the class
     * @param block PBlock to extract name from
     * @return Block name
     */
    public static String getBlockNameFromClass(PBlock block) {
        String className = block.getClass().getSimpleName();
        return StringUtils.replaceOnce(className, "Block", "");
    }

    /**
     * Scans block package and looks for a mod's name. Mod names are taken from Planck's internal mod registry.
     * @param block PBlock to scan
     * @return Mod name
     */
    public static String getModNameFromClass(PBlock block) {
        String packageName = block.getClass().getPackage().toString();

        // Here's where we can look for the Mod name in the package name and the use that.

        return "";
    }

    /**
     * This will register the block, setting its name, and some other stuff.
     * @param block The PBlock to be registered
     * @return Did we successfully register the block?
     */
    public static boolean registerBlock(PBlock block) {
        ConventionValidator.validateBlock(block);
        block.setBlockName(getModNameFromClass(block) + "-" + getBlockNameFromClass(block));
        return true;
    }
}
