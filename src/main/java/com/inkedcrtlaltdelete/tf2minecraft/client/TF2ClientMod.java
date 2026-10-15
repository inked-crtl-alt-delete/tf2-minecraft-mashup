package com.inkedcrtlaltdelete.tf2minecraft.client;

import com.inkedcrtlaltdelete.tf2minecraft.MercRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class TF2ClientMod implements ClientModInitializer {
    public static KeyBinding OPEN_LOADOUT;

    @Override
    public void onInitializeClient() {
        OPEN_LOADOUT = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.tf2minecraft.open_loadout",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_K,
                "category.tf2minecraft.keys"
        ));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (OPEN_LOADOUT.wasPressed()) {
                client.execute(() -> client.setScreen(new LoadoutScreen()));
            }
        });

        System.out.println("TF2 Minecraft Mashup client initialized. Mercs: " + String.join(", ", MercRegistry.getIds()));
    }
}
