package net.rebel459.end_reborn.mixin.item;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.ToolMaterial;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value = ToolMaterial.class)
public class ToolMaterialMixin {

    @WrapOperation
            (
            method = "<clinit>",
            at = @At
                    (
                            value = "NEW",
                            target = "(Lnet/minecraft/tags/TagKey;IFFILnet/minecraft/tags/TagKey;)Lnet/minecraft/world/item/ToolMaterial;",
                            ordinal = 6
                    )
            )
    private static ToolMaterial modifyToolMaterial(TagKey incorrectBlocksForDrops, int durability, float speed, float attackDamageBonus, int enchantmentValue, TagKey repairItems, Operation<ToolMaterial> original){
        return original.call(incorrectBlocksForDrops, durability, speed, 4.5F, 18, repairItems);
    }
}