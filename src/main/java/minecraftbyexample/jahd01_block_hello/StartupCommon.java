package minecraftbyexample.jahd01_block_hello;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * User: The Grey Ghost Date: 24/12/2014 The Startup classes for this example are called during startup, in the
 * following order: preInitCommon preInitClientOnly initCommon initClientOnly postInitCommon postInitClientOnly See
 * MinecraftByExample class for more information
 */
public class StartupCommon {
    public static BlockHello blockHello; // this holds the unique instance of your block

    public static void preInitCommon() {

        // each instance of your block should have a name that is unique within your mod.  use lower case.
        blockHello = (BlockHello) (new BlockHello().setUnlocalizedName("jahd01_block_hello"));
        GameRegistry.registerBlock(blockHello, "jahd01_block_hello");
        // you don't need to register an item corresponding to the block, GameRegistry.registerBlock does this
        // automatically.
    }

    public static void initCommon() { }

    public static void postInitCommon() { }

}
