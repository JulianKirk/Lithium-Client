package io.github.conditioner.lithium.node;

import io.github.conditioner.lithium.gui.EnumWidgetAnchor;
import io.github.conditioner.lithium.gui.WidgetPosition;
import io.github.conditioner.lithium.util.HashMapUtil;
import net.minecraft.client.util.Window;

import java.util.HashMap;

public abstract class WidgetNode extends Node {

    private static final HashMap<String, Object> SETTINGS_DATA = new HashMap<String, Object>() {
        {
            put("position", new WidgetPosition(0.0D, 0.0D, EnumWidgetAnchor.TOP_LEFT));
            put("scale", 1.0D);
        }
    };

    public WidgetNode(HashMap<String, Object> settingsData) {
        super(HashMapUtil.combine(SETTINGS_DATA, settingsData));
    }

    public abstract double getWidth();

    public abstract double getHeight();

    public double getAbsoluteWidth() {
        return getWidth() * new Window(mc).getScaledWidth() / 450.0D;
    }

    public double getAbsoluteHeight() {
        return getHeight() * new Window(mc).getScaledHeight() / 253.125D;
    }
}
