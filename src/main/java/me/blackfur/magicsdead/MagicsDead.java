package me.blackfur.magicsdead;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MagicsDead.MODID)
public class MagicsDead {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "magicsdead";

    public MagicsDead() {
        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }
}
