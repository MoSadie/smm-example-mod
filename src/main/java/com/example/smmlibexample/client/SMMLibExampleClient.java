package com.example.smmlibexample.client;

import com.example.smmlibexample.client.theme.NormalTheme;
import com.mosadie.servermainmenu.client.ServerMainMenuLibClient;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class SMMLibExampleClient implements ClientModInitializer {

    public static final String MOD_ID = "smm-lib-example";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    private static NormalTheme normalTheme = new NormalTheme();

    @Override
    public void onInitializeClient() {
        LOGGER.info("Initializing SMM-Lib example mod...");

        LOGGER.info("Registering Theme...");

        Registry.register(ServerMainMenuLibClient.registry, new Identifier(SMMLibExampleClient.MOD_ID, "normal"), normalTheme);

        LOGGER.info("SMM-Lib example mod Initialized!");
    }
}
