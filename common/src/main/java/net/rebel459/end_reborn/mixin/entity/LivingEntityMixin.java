package net.rebel459.end_reborn.mixin.entity;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.rebel459.end_reborn.registry.ERAttributes;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {

    @Shadow
    public abstract double getAttributeValue(Holder<Attribute> attribute);

    @Shadow
    public abstract @Nullable AttributeInstance getAttribute(Holder<Attribute> attribute);

    @ModifyVariable(
            method = "addEffect(Lnet/minecraft/world/effect/MobEffectInstance;Lnet/minecraft/world/entity/Entity;)Z",
            at = @At(value = "HEAD"),
            index = 1,
            argsOnly = true
    )
    private MobEffectInstance magicResistance(MobEffectInstance instance) {
        if (instance.getEffect().value().getCategory() == MobEffectCategory.HARMFUL) {
            double magicResistance = 0;
            if (this.getAttribute(ERAttributes.MAGIC_RESISTANCE) != null) magicResistance = this.getAttributeValue(ERAttributes.MAGIC_RESISTANCE);
            int duration = (int) Math.round((instance.getDuration() * (1 - 0.125 * Math.min(magicResistance, 8))));
            return new MobEffectInstance(instance.getEffect(), duration, instance.getAmplifier(), instance.isAmbient(), instance.isVisible(), instance.showIcon());
        }
        else return instance;
    }

    @WrapOperation(method = "igniteForTicks", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/Mth;ceil(D)I"))
    private int burningResistance(double v, Operation<Integer> original) {
        double burningResistance = 0;
        if (this.getAttribute(ERAttributes.BURNING_RESISTANCE) != null) burningResistance = this.getAttributeValue(ERAttributes.BURNING_RESISTANCE);
        return original.call(v * (1 - 0.25 * Math.min(burningResistance, 4)));
    }

    @WrapOperation(method = "calculateFallPower", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/LivingEntity;getAttributeValue(Lnet/minecraft/core/Holder;)D"))
    private double fallResistance(LivingEntity entity, Holder<Attribute> attribute, Operation<Double> original) {
        double fallResistance = 0;
        if (this.getAttribute(ERAttributes.FALL_RESISTANCE) != null) fallResistance = this.getAttributeValue(ERAttributes.FALL_RESISTANCE);
        return original.call(entity, attribute) + fallResistance * 3D;
    }

    @Inject(method = "createLivingAttributes", at = @At(value = "TAIL"), cancellable = true)
    private static void addERAttributes(CallbackInfoReturnable<AttributeSupplier.Builder> cir) {
        cir.setReturnValue(cir.getReturnValue()
                .add(ERAttributes.MAGIC_RESISTANCE)
                .add(ERAttributes.BURNING_RESISTANCE)
                .add(ERAttributes.FALL_RESISTANCE)
        );
    }
}
