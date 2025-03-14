package net.legacy.end_reborn.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.ToolMaterial;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value = ToolMaterial.class, priority = 1001)
public class ToolMaterialMixin {

    @WrapOperation
            (
            method = "<clinit>",
            at = @At
                    (
                            value = "NEW",
                            target = "(Lnet/minecraft/tags/TagKey;IFFILnet/minecraft/tags/TagKey;)Lnet/minecraft/world/item/ToolMaterial;"
                    )
            )
    private static ToolMaterial modifyToolMaterial(TagKey tagKey, int i, float f, float g, int j, TagKey tagKey2, Operation<ToolMaterial> original){
        if (tagKey == BlockTags.INCORRECT_FOR_NETHERITE_TOOL && tagKey2 == ItemTags.NETHERITE_TOOL_MATERIALS) {
            return original.call(tagKey, i,f, 5.0F, j, tagKey2);
        }
        else {
            return original.call(tagKey, i, f, g, j, tagKey2);
        }
    }
}