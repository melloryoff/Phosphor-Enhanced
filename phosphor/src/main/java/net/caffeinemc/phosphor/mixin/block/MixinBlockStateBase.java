package net.caffeinemc.phosphor.mixin.block;

import net.caffeinemc.phosphor.common.block.BlockStateLightInfoAccess;
import net.caffeinemc.phosphor.common.block.BlockStateLightInfo;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(BlockBehaviour.BlockStateBase.class)
public abstract class MixinBlockStateBase implements BlockStateLightInfoAccess {
    @Shadow
    protected BlockBehaviour.BlockStateBase.Cache cache;

    @SuppressWarnings("ConstantConditions")
    @Override
    public BlockStateLightInfo getLightInfo() {
        return (BlockStateLightInfo) (Object) this.cache;
    }
}
