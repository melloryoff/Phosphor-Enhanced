package net.caffeinemc.phosphor.mixin.block;

import net.caffeinemc.phosphor.common.block.BlockStateLightInfo;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(BlockBehaviour.BlockStateBase.Cache.class)
public class MixinShapeCache implements BlockStateLightInfo {
    @Shadow
    @Final
    int lightBlock;

    @Override
    public int getLightSubtracted() {
        return this.lightBlock;
    }
}
