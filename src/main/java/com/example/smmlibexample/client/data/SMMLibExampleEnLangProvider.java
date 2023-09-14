package com.example.smmlibexample.client.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class SMMLibExampleEnLangProvider extends FabricLanguageProvider {
    protected SMMLibExampleEnLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add("smm-lib-example.menu.join", "Join your server!");
    }
}
