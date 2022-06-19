package io.github.conditioner.lithium.gui;

import io.github.conditioner.lithium.node.WidgetNode;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.Window;

public class WidgetPosition {

    private double x, y;

    private EnumWidgetAnchor anchor;

    private final MinecraftClient mc = MinecraftClient.getInstance();

    public WidgetPosition(double x, double y, EnumWidgetAnchor anchor) {
        this.x = x;
        this.y = y;
        this.anchor = anchor;
    }

    public WidgetPosition adjust(double x, double y) {
        Window window = new Window(mc);

        this.x += x / window.getScaledWidth();
        this.y += y / window.getScaledHeight();
        return this;
    }

    public WidgetPosition updateAnchor(EnumWidgetAnchor anchor, WidgetNode node) {
        Window window = new Window(mc);
        double scale = node.getSetting().getDouble("scale");

        this.x += (anchor.offX - this.anchor.offX) * node.getAbsoluteWidth() * scale / window.getScaledWidth();
        this.y += (anchor.offY - this.anchor.offY) * node.getAbsoluteHeight() * scale / window.getScaledHeight();
        this.anchor = anchor;
        return this;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public EnumWidgetAnchor getAnchor() {
        return anchor;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
