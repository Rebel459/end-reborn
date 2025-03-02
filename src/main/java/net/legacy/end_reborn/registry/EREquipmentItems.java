package net.legacy.end_reborn.registry;

import net.frozenblock.lib.shadow.org.jetbrains.annotations.NotNull;
import net.legacy.end_reborn.ERConstants;
import net.minecraft.core.component.DataComponents;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.DamageResistant;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item.Properties;

import java.util.function.Function;

public final class EREquipmentItems {

    // Tools
    public static final SwordItem REMNANT_SWORD = register("remnant_sword", settings -> new SwordItem(ERToolMaterial.REMNANT, 3f, -2.4f, settings
            .stacksTo(1)
            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    ));
    public static final PickaxeItem REMNANT_PICKAXE = register("remnant_pickaxe", settings -> new PickaxeItem(ERToolMaterial.REMNANT, 1f, -2.8f, settings
            .stacksTo(1)
            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    ));
    public static final AxeItem REMNANT_AXE = register("remnant_axe", settings -> new AxeItem(ERToolMaterial.REMNANT, 5f, -3.0f, settings
            .stacksTo(1)
            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    ));
    public static final ShovelItem REMNANT_SHOVEL = register("remnant_shovel", settings -> new ShovelItem(ERToolMaterial.REMNANT, 1.5f, -3f, settings
            .stacksTo(1)
            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    ));
    public static final HoeItem REMNANT_HOE = register("remnant_hoe", settings -> new HoeItem(ERToolMaterial.REMNANT, -2f, -1f, settings
            .stacksTo(1)
            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    ));

    public static final SwordItem FEATHERZEAL_SWORD = register("featherzeal_sword", settings -> new SwordItem(ERToolMaterial.FEATHERZEAL, 3f, -2.4f, settings
            .stacksTo(1)
    ));
    public static final PickaxeItem FEATHERZEAL_PICKAXE = register("featherzeal_pickaxe", settings -> new PickaxeItem(ERToolMaterial.FEATHERZEAL, 1f, -2.8f, settings
            .stacksTo(1)
    ));
    public static final AxeItem FEATHERZEAL_AXE = register("featherzeal_axe", settings -> new AxeItem(ERToolMaterial.FEATHERZEAL, 5f, -3.0f, settings
            .stacksTo(1)
    ));
    public static final ShovelItem FEATHERZEAL_SHOVEL = register("featherzeal_shovel", settings -> new ShovelItem(ERToolMaterial.FEATHERZEAL, 1.5f, -3f, settings
            .stacksTo(1)
    ));
    public static final HoeItem FEATHERZEAL_HOE = register("featherzeal_hoe", settings -> new HoeItem(ERToolMaterial.FEATHERZEAL, -2f, -1f, settings
            .stacksTo(1)
    ));

    // Armor
    public static final ArmorItem REMNANT_HELMET = register("remnant_helmet", settings -> new ArmorItem(ERArmorMaterials.REMNANT, ArmorType.HELMET, settings
            .stacksTo(1)
            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    ));
    public static final ArmorItem REMNANT_CHESTPLATE = register("remnant_chestplate", settings -> new ArmorItem(ERArmorMaterials.REMNANT, ArmorType.CHESTPLATE, settings
            .stacksTo(1)
            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    ));
    public static final ArmorItem REMNANT_LEGGINGS = register("remnant_leggings", settings -> new ArmorItem(ERArmorMaterials.REMNANT, ArmorType.LEGGINGS, settings
            .stacksTo(1)
            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    ));
    public static final ArmorItem REMNANT_BOOTS = register("remnant_boots", settings -> new ArmorItem(ERArmorMaterials.REMNANT, ArmorType.BOOTS, settings
            .stacksTo(1)
            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    ));

    public static final ArmorItem FEATHERZEAL_HELMET = register("featherzeal_helmet", settings -> new ArmorItem(ERArmorMaterials.FEATHERZEAL, ArmorType.HELMET, settings
            .stacksTo(1)
    ));
    public static final ArmorItem FEATHERZEAL_CHESTPLATE = register("featherzeal_chestplate", settings -> new ArmorItem(ERArmorMaterials.FEATHERZEAL, ArmorType.CHESTPLATE, settings
            .stacksTo(1)
    ));
    public static final ArmorItem FEATHERZEAL_LEGGINGS = register("featherzeal_leggings", settings -> new ArmorItem(ERArmorMaterials.FEATHERZEAL, ArmorType.LEGGINGS, settings
            .stacksTo(1)
    ));
    public static final ArmorItem FEATHERZEAL_BOOTS = register("featherzeal_boots", settings -> new ArmorItem(ERArmorMaterials.FEATHERZEAL, ArmorType.BOOTS, settings
            .stacksTo(1)
    ));

    public static final AnimalArmorItem REMNANT_HORSE_ARMOR = register("remnant_horse_armor", settings -> new AnimalArmorItem(ERArmorMaterials.REMNANT, AnimalArmorItem.BodyType.EQUESTRIAN, SoundEvents.HORSE_ARMOR, false, settings
            .stacksTo(1)
            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    ));

    public static final AnimalArmorItem FEATHERZEAL_HORSE_ARMOR = register("featherzeal_horse_armor", settings -> new AnimalArmorItem(ERArmorMaterials.FEATHERZEAL, AnimalArmorItem.BodyType.EQUESTRIAN, SoundEvents.HORSE_ARMOR, false, settings
            .stacksTo(1)
    ));

    public static void init() {
    }

    private static @NotNull <T extends Item> T register(String name, @NotNull Function<Properties, Item> function) {
        return (T) Items.registerItem(ResourceKey.create(Registries.ITEM, ERConstants.id(name)), function);
    }
    private static Item register (String name) {
        return register(name, Item::new);
    }

    public static Function<Properties, Item> createBlockItemWithCustomItemName(Block block) {
        return properties -> new BlockItem(block, properties.useItemDescriptionPrefix());
    }

    public static ItemAttributeModifiers createRemnantHelmetAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.SAFE_FALL_DISTANCE, new AttributeModifier(SAFE_FALL_DISTANCE_ID, 8.0, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .build();
    }

    public static final ResourceLocation SAFE_FALL_DISTANCE_ID = ResourceLocation.withDefaultNamespace("safe_fall_distance");

}
