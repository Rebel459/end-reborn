package net.rebel459.end_reborn.mixin.integration.farmersdelight;

import net.minecraft.world.item.Item;
import net.rebel459.end_reborn.registry.ERItems;
import net.rebel459.end_reborn.registry.ERToolMaterials;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.ArrayList;
import java.util.List;

@Mixin(value = ERToolMaterials.class)
public class FeatherzealKnifeMixin {

    @Inject(method = "getFeatherzealTools", at = @At(value = "TAIL"), cancellable = true)
    private static void getFeatherzealKnife(CallbackInfoReturnable<List<Item>> cir) {
        if (ERItems.FEATHERZEAL_KNIFE != null) {
            List<Item> list = new ArrayList<>(cir.getReturnValue());
            list.add(ERItems.FEATHERZEAL_KNIFE.get());
            cir.setReturnValue(list);
        }
    }

    @Inject(method = "getFeatherzealAttackSpeedBonus", at = @At(value = "HEAD"), cancellable = true)
    private static void getFeatherzealKnifeAttackSpeedBonus(Item item, CallbackInfoReturnable<Double> cir) {
        if (ERItems.FEATHERZEAL_KNIFE != null && item == ERItems.FEATHERZEAL_KNIFE.get()) {
            cir.setReturnValue(0.4D);
        }
    }
}