package com.envyful.papi.forge;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(
        modid = "forgeplaceholderapi",
        name = "Forge PlaceholderAPI",
        version = "0.0.1",
        acceptableRemoteVersions = "*"
)
public class ForgePlaceholderAPI {

    @Mod.EventHandler
    public void onServerStarting(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void onServerStarting(FMLServerStartingEvent event) {

    }
}