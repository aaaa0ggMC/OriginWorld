package aaaa0ggmc.theoriginworld;

import aaaa0ggmc.theoriginworld.effects.Effects;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
    public static final String MODID = "theoriginworld";
    public static final String MOD_IDEN = "tow";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
    @Override
    public void onInitialize() {
        LOGGER.info("Loading Mod:aaaa0ggmc -- The Origin World...");
        Registry.register(Registry.ITEM,new Identifier(MOD_IDEN,"chicken_cxk"),ModItems.CHICKEN_CXK);
        Registry.register(Registry.STATUS_EFFECT,new Identifier(MOD_IDEN,"trainee"), Effects.TRAINEE);
    }
}
