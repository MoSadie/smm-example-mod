package com.example.smmlibexample.client;

import com.example.smmlibexample.client.theme.ExampleTheme;
import com.mosadie.simplemainmenu.client.SimpleMainMenuLibClient;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class SMMLibExampleClient implements ClientModInitializer {

    public static final String MOD_ID = "smm-lib-example";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    private static ExampleTheme normalTheme = new ExampleTheme();

    @Override
    public void onInitializeClient() {
        LOGGER.info("Initializing SMM-Lib example mod...");

        LOGGER.info("Registering Theme...");

        Registry.register(SimpleMainMenuLibClient.registry, Identifier.fromNamespaceAndPath(SMMLibExampleClient.MOD_ID, "normal"), normalTheme);

        LOGGER.info("SMM-Lib example mod initialized!");
    }
}
