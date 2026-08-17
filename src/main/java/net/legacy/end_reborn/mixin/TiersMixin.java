package net.legacy.end_reborn.mixin;

import net.minecraft.world.item.Tiers;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Tiers.class)
public class TiersMixin {
    @Inject(method = "getAttackDamageBonus", at = @At("RETURN"), cancellable = true)
    private void endReborn$buffNetherite(CallbackInfoReturnable<Float> callback) {
        if ((Object) this == Tiers.NETHERITE) {
            callback.setReturnValue(5.0F);
        }
    }
}
