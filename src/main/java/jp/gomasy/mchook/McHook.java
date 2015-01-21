package jp.gomasy.mchook;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = McHook.MODID, version = McHook.VERSION)
public class McHook
{
    public static final String MODID = "jp.gomasy.mchook";
    public static final String VERSION = "1.01";

    @EventHandler
    public void init(FMLInitializationEvent event) {
        new MultiHookServer().start();
    }
}