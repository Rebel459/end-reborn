package net.legacy.end_reborn.registry;

import java.util.function.Function;
import net.legacy.end_reborn.ERConstants;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import org.jetbrains.annotations.NotNull;

public final class EREquipmentItems {

    // Tools
    public static final SwordItem REMNANT_SWORD = register("remnant_sword", settings -> new SwordItem(ERToolMaterial.REMNANT, settings
            .stacksTo(1)
            .fireResistant()
            .attributes(SwordItem.createAttributes(ERToolMaterial.REMNANT, 3, -2.4F))
    ));
    public static final PickaxeItem REMNANT_PICKAXE = register("remnant_pickaxe", settings -> new PickaxeItem(ERToolMaterial.REMNANT, settings
            .stacksTo(1)
            .fireResistant()
            .attributes(DiggerItem.createAttributes(ERToolMaterial.REMNANT, 1, -2.8F))
    ));
    public static final AxeItem REMNANT_AXE = register("remnant_axe", settings -> new AxeItem(ERToolMaterial.REMNANT, settings
            .stacksTo(1)
            .fireResistant()
            .attributes(DiggerItem.createAttributes(ERToolMaterial.REMNANT, 5, -3.0F))
    ));
    public static final ShovelItem REMNANT_SHOVEL = register("remnant_shovel", settings -> new ShovelItem(ERToolMaterial.REMNANT, settings
            .stacksTo(1)
            .fireResistant()
            .attributes(DiggerItem.createAttributes(ERToolMaterial.REMNANT, 1.5F, -3.0F))
    ));
    public static final HoeItem REMNANT_HOE = register("remnant_hoe", settings -> new HoeItem(ERToolMaterial.REMNANT, settings
            .stacksTo(1)
            .fireResistant()
            .attributes(DiggerItem.createAttributes(ERToolMaterial.REMNANT, -2, -1.0F))
    ));

    public static final SwordItem FEATHERZEAL_SWORD = register("featherzeal_sword", settings -> new SwordItem(ERToolMaterial.FEATHERZEAL, settings
            .stacksTo(1)
            .attributes(SwordItem.createAttributes(ERToolMaterial.FEATHERZEAL, 3, -2.4F))
    ));
    public static final PickaxeItem FEATHERZEAL_PICKAXE = register("featherzeal_pickaxe", settings -> new PickaxeItem(ERToolMaterial.FEATHERZEAL, settings
            .stacksTo(1)
            .attributes(DiggerItem.createAttributes(ERToolMaterial.FEATHERZEAL, 1, -2.8F))
    ));
    public static final AxeItem FEATHERZEAL_AXE = register("featherzeal_axe", settings -> new AxeItem(ERToolMaterial.FEATHERZEAL, settings
            .stacksTo(1)
            .attributes(DiggerItem.createAttributes(ERToolMaterial.FEATHERZEAL, 5, -3.0F))
    ));
    public static final ShovelItem FEATHERZEAL_SHOVEL = register("featherzeal_shovel", settings -> new ShovelItem(ERToolMaterial.FEATHERZEAL, settings
            .stacksTo(1)
            .attributes(DiggerItem.createAttributes(ERToolMaterial.FEATHERZEAL, 1.5F, -3.0F))
    ));
    public static final HoeItem FEATHERZEAL_HOE = register("featherzeal_hoe", settings -> new HoeItem(ERToolMaterial.FEATHERZEAL, settings
            .stacksTo(1)
            .attributes(DiggerItem.createAttributes(ERToolMaterial.FEATHERZEAL, -2, -1.0F))
    ));

    public static void init() {
    }

    private static @NotNull <T extends Item> T register(String name, @NotNull Function<Item.Properties, Item> function) {
        return (T) Items.registerItem(ResourceKey.create(Registries.ITEM, ERConstants.id(name)), function.apply(new Item.Properties()));
    }

    public static ItemAttributeModifiers createRemnantHelmetAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.SAFE_FALL_DISTANCE, new AttributeModifier(SAFE_FALL_DISTANCE_ID, 8.0, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .build();
    }

    public static final ResourceLocation SAFE_FALL_DISTANCE_ID = ResourceLocation.withDefaultNamespace("safe_fall_distance");

}
