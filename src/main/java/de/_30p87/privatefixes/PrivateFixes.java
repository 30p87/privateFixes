package de._30p87.privatefixes;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = PrivateFixes.MOD_ID,
        name = PrivateFixes.MOD_NAME,
        version = PrivateFixes.VERSION
)
public class PrivateFixes {
    public static final String MOD_ID = "privatefixes";
    public static final String MOD_NAME = "Private Fixes";
    public static final String VERSION = "1.0-SNAPSHOT";

    public static final Logger LOGGER = LogManager.getLogger(PrivateFixes.MOD_ID);
}
