package io.github.conditioner.lithium.gui;

public enum EnumWidgetAnchor {
    TOP_LEFT(0.0D, 0.0D),
    LEFT_CENTER(0.0D, 0.5D),
    BOTTOM_LEFT(0.0D, 1.0D),
    TOP_CENTER(0.5D, 0.0D),
    CENTER(0.5D, 0.5D),
    BOTTOM_CENTER(0.5D, 1.0D),
    TOP_RIGHT(1.0D, 0.0D),
    RIGHT_CENTER(1.0D, 0.5D),
    BOTTOM_RIGHT(1.0D, 1.0D);

    public final double offX, offY;

    EnumWidgetAnchor(double offX, double offY) {
        this.offX = offX;
        this.offY = offY;
    }

    public static EnumWidgetAnchor getAnchor(double offX, double offY) {
        for (EnumWidgetAnchor anchor : values()) {
            if (anchor.offX == offX && anchor.offY == offY) {
                return anchor;
            }
        }
        return null;
    }
}
