package io.github.conditioner.lithium.mixin;

import io.github.conditioner.lithium.Lithium;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public class MixinMinecraftClient {

    @Inject(method = "stop", at = @At("HEAD"))
    private void stop(CallbackInfo ci) {
        Lithium.getLithium().onShutdown();
    }
}
