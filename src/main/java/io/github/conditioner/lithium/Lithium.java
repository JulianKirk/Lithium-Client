package io.github.conditioner.lithium;

import net.fabricmc.api.ModInitializer;

public class Lithium implements ModInitializer {

    private static final Lithium INSTANCE = new Lithium();

    @Override
    public void onInitialize() {

    }

    public void onShutdown() {

    }

    public static Lithium getLithium() {
        return INSTANCE;
    }
}
