package com.inkedcrtlaltdelete.tf2minecraft.client;

import com.inkedcrtlaltdelete.tf2minecraft.MercRegistry;
import com.inkedcrtlaltdelete.tf2minecraft.PlayerMercManager;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

import java.util.List;

public class LoadoutScreen extends Screen {
    protected LoadoutScreen() {
        super(Text.literal("TF2 Loadout"));
    }

    @Override
    protected void init() {
        super.init();
        List<String> ids = MercRegistry.getIds();
        int startY = this.height / 4;
        int btnW = 200;
        int x = (this.width - btnW) / 2;
        for (int i = 0; i < ids.size(); i++) {
            final String id = ids.get(i);
            this.addDrawableChild(new ButtonWidget(x, startY + i * 24, btnW, 20, Text.literal(MercRegistry.get(id).getName()), button -> {
                if (this.client != null && this.client.player != null) {
                    PlayerMercManager.setMerc(this.client.player.getUuid(), id);
                    this.client.player.sendMessage(Text.literal("Selected merc: " + MercRegistry.get(id).getName()), false);
                }
                this.client.setScreen(null);
            }));
        }

        this.addDrawableChild(new ButtonWidget(x, startY + ids.size() * 24 + 8, btnW, 20, Text.literal("Cancel"), b -> this.client.setScreen(null)));
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        this.renderBackground(matrices);
        super.render(matrices, mouseX, mouseY, delta);
    }
}
