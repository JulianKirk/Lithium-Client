package io.github.conditioner.lithium;

import net.fabricmc.api.ModInitializer;
import io.github.conditioner.lithium.node.NodeFactory;

public class Lithium implements ModInitializer {

    private static final Lithium INSTANCE = new Lithium();

    @Override
    public void onInitialize() {
        NodeFactory.getInstance().loadInternalNodes();
    }

    public void onShutdown() {

    }

    public static Lithium getLithium() {
        return INSTANCE;
    }
}
