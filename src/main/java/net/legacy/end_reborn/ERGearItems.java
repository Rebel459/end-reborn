package net.legacy.end_reborn;

import net.frozenblock.lib.shadow.org.jetbrains.annotations.NotNull;
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

public final class ERGearItems {

    // Tools
    public static final SwordItem REMNIUM_SWORD = register("remnium_sword", settings -> new SwordItem(ERToolMaterial.REMNIUM, 3f, -2.4f, settings
            .stacksTo(1)
            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    ));
    public static final PickaxeItem REMNIUM_PICKAXE = register("remnium_pickaxe", settings -> new PickaxeItem(ERToolMaterial.REMNIUM, 1f, -2.8f, settings
            .stacksTo(1)
            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    ));
    public static final AxeItem REMNIUM_AXE = register("remnium_axe", settings -> new AxeItem(ERToolMaterial.REMNIUM, 6f, -3.1f, settings
            .stacksTo(1)
            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    ));
    public static final ShovelItem REMNIUM_SHOVEL = register("remnium_shovel", settings -> new ShovelItem(ERToolMaterial.REMNIUM, 1.5f, -3f, settings
            .stacksTo(1)
            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    ));
    public static final HoeItem REMNIUM_HOE = register("remnium_hoe", settings -> new HoeItem(ERToolMaterial.REMNIUM, -2f, -1f, settings
            .stacksTo(1)
            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    ));

    // Armor
    public static final ArmorItem REMNIUM_HELMET = register("remnium_helmet", settings -> new ArmorItem(ERArmorMaterials.REMNIUM, ArmorType.HELMET, settings
            .stacksTo(1)
            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    ));
    public static final ArmorItem REMNIUM_CHESTPLATE = register("remnium_chestplate", settings -> new ArmorItem(ERArmorMaterials.REMNIUM, ArmorType.CHESTPLATE, settings
            .stacksTo(1)
            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    ));
    public static final ArmorItem REMNIUM_LEGGINGS = register("remnium_leggings", settings -> new ArmorItem(ERArmorMaterials.REMNIUM, ArmorType.LEGGINGS, settings
            .stacksTo(1)
            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    ));
    public static final ArmorItem REMNIUM_BOOTS = register("remnium_boots", settings -> new ArmorItem(ERArmorMaterials.REMNIUM, ArmorType.BOOTS, settings
            .stacksTo(1)
            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    ));

    public static final AnimalArmorItem REMNIUM_HORSE_ARMOR = register("remnium_horse_armor", settings -> new AnimalArmorItem(ERArmorMaterials.REMNIUM, AnimalArmorItem.BodyType.EQUESTRIAN, SoundEvents.HORSE_ARMOR, false, settings
            .stacksTo(1)
            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
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
