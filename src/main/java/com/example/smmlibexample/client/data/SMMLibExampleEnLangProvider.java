package com.example.smmlibexample.client.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class SMMLibExampleEnLangProvider extends FabricLanguageProvider {

    protected SMMLibExampleEnLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup lookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("smm-lib-example.menu.join", "Join your server!");
    }
}
