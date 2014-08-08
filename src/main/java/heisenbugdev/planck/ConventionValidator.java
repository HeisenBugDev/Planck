package heisenbugdev.planck;

import heisenbugdev.planck.exceptions.BrokenConventionException;

import java.util.Arrays;

/**
 * The goal of this is to tell people when they are breaking convention and try to stop them.
 */
public class ConventionValidator {

    /**
     * This method will check to see if your block is in a <b>block</b> package.
     * This allows you to nest packages as long as your class is in the block tree.
     * @param block A PBlock instance to validate
     */
    public static void validateBlockPackage(PBlock block) {
        String packageName = block.getClass().getPackage().toString();
        if (!Arrays.asList(packageName.split(".")).contains("block")) {
            try {
                throw new BrokenConventionException("Your block class: " + block.getClass().getName() + " is not in a block package!");
            } catch (BrokenConventionException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * This will make sure the block name starts with Block
     * @param block PBlock to validate
     */
    public static void validateBlockName(PBlock block) {
        String name = block.getClass().getName();
        if (!name.startsWith("Block")) {
            try {
                throw new BrokenConventionException("Your block class: " + block.getClass().getName() + " does not start with 'Block'");
            } catch (BrokenConventionException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Validate all block conventions
     * @param block PBlock to validate
     */
    public static void validateBlock(PBlock block) {
        validateBlockPackage(block);
        validateBlockName(block);
    }
}
