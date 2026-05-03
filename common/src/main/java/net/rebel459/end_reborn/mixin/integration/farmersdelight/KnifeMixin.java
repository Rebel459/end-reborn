package net.rebel459.end_reborn.mixin.integration.farmersdelight;

import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.item.component.DamageResistant;
import net.rebel459.end_reborn.EndReborn;
import net.rebel459.end_reborn.registry.ERItems;
import net.rebel459.end_reborn.registry.ERToolMaterials;
import net.rebel459.unified.platform.UnifiedHelpers;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import vectorwing.farmersdelight.common.item.KnifeItem;
import vectorwing.farmersdelight.common.registry.ModItems;

@Mixin(value = EndReborn.class)
public class KnifeMixin {

    @Inject(method = "initRegistries", at = @At(value = "HEAD"))
    private static void registerKnives(CallbackInfo ci) {
        ERItems.REMNANT_KNIFE = ERItems.ITEMS.register("remnant_knife",
                KnifeItem::new,
                () -> ModItems.knifeItem(ERToolMaterials.REMNANT)
                        .delayedComponent(DataComponents.DAMAGE_RESISTANT, provider -> new DamageResistant(provider.getOrThrow(DamageTypeTags.IS_EXPLOSION)))
        );
        ERItems.FEATHERZEAL_KNIFE = ERItems.ITEMS.register("featherzeal_knife",
                KnifeItem::new,
                () -> ModItems.knifeItem(ERToolMaterials.FEATHERZEAL)
        );
    }

    @Inject(method = "init", at = @At(value = "TAIL"))
    private static void knifeCreativeEntries(CallbackInfo ci) {
        UnifiedHelpers.CREATIVE_ENTRIES.insertAfter(ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath("farmersdelight", "farmersdelight")), ModItems.COPPER_KNIFE.get(), ERItems.REMNANT_KNIFE, ERItems.FEATHERZEAL_KNIFE);
    }
}