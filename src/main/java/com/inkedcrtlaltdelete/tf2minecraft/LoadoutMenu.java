package com.inkedcrtlaltdelete.tf2minecraft;

import net.fabricmc.api.ModInitializer;

public class TF2MinecraftMod implements ModInitializer {
    public static final String MOD_ID = "tf2minecraft";

    @Override
    public void onInitialize() {
        System.out.println("TF2 Minecraft Mashup initializing");
        System.out.println("Playable mercs: " + String.join(", ", MercRegistry.getIds()));
    }
}
