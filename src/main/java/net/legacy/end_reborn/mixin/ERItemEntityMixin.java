package net.legacy.end_reborn.mixin;

import net.legacy.end_reborn.ERItemTags;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemEntity.class)
public abstract class ERItemEntityMixin extends Entity {

    @Shadow
    public abstract ItemStack getItem();

    protected ERItemEntityMixin(EntityType<?> type, Level level) {
        super(type, level);
    }

    @Inject(at = @At("TAIL"), method = "tick()V")
    private void dropItem(CallbackInfo info) {
        if ((getItem().is(ERItemTags.VOID_IMMUNE))) {
            if (!isNoGravity() && !level().isClientSide() && !getItem().isEmpty()) {
            setNoGravity(true);
        }
            this.setDeltaMovement(this.getDeltaMovement().multiply(0.9D, 0.9D, 0.9D));
        }
    }

    @Inject(at = @At("HEAD"), method = "tick")
    private void damageItem(CallbackInfo info) {
        if (this.getY() < this.level().getMinY() && getItem().is(ERItemTags.VOID_IMMUNE)) {
                this.unsetRemoved();
                this.teleportTo(this.getX(), this.level().getMinY(), this.getZ());
                this.setDeltaMovement(0, 0, 0);
                this.setNoGravity(true);
        }
    }
}