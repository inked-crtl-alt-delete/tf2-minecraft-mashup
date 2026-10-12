package com.inkedcrtlaltdelete.tf2minecraft;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class TF2MinecraftMod implements ModInitializer {
    public static final String MOD_ID = "tf2minecraft";

    @Override
    public void onInitialize() {
        System.out.println("TF2 Minecraft Mashup initializing");
    }
}
