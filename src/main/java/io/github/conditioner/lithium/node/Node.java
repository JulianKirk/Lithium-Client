package io.github.conditioner.lithium.node;

import io.github.conditioner.lithium.settings.Setting;
import io.github.conditioner.lithium.util.HashMapUtil;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;

import java.util.HashMap;

public class Node {

    private Setting setting;

    private static final HashMap<String, Object> SETTINGS_DATA = new HashMap<String, Object>() {
        {
            put("enabled", true);
        }
    };

    protected final MinecraftClient mc = MinecraftClient.getInstance();

    protected final TextRenderer text = mc.textRenderer;

    public Node(HashMap<String, Object> settingsData) {
        setting = new Setting(HashMapUtil.combine(SETTINGS_DATA, settingsData));
    }

    public Setting getSetting() {
        return setting;
    }

    public void setSetting(Setting setting) {
        this.setting = setting;
    }
}
