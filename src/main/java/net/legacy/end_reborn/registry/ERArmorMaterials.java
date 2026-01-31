package net.legacy.end_reborn.registry;

import net.legacy.end_reborn.EndReborn;
import net.legacy.end_reborn.tag.ERItemTags;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;

public interface ERArmorMaterials {

    ArmorMaterial REMNANT = new ArmorMaterial(37, ArmorMaterials.makeDefense(3, 6, 8, 3, 19), 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, ERItemTags.REPAIRS_REMNANT_ARMOR, EREquipmentAssets.REMNANT);

    ArmorMaterial FEATHERZEAL = new ArmorMaterial(37, ArmorMaterials.makeDefense(3, 6, 8, 3, 19), 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, ERItemTags.REPAIRS_FEATHERZEAL_ARMOR, EREquipmentAssets.FEATHERZEAL);

    // Armor Attributes

    static ItemAttributeModifiers createRemnantHelmetAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_HELMET_ID, 3, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_HELMET_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_HELMET_ID, ERArmorMaterials.REMNANT.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .add(Attributes.EXPLOSION_KNOCKBACK_RESISTANCE, new AttributeModifier(EXPLOSION_KNOCKBACK_RESISTANCE_HELMET_ID, 0.25, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .build();
    }
    static ItemAttributeModifiers createRemnantChestplateAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_CHESTPLATE_ID, 8, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_CHESTPLATE_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_CHESTPLATE_ID, ERArmorMaterials.REMNANT.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST)
                .add(Attributes.EXPLOSION_KNOCKBACK_RESISTANCE, new AttributeModifier(EXPLOSION_KNOCKBACK_RESISTANCE_CHESTPLATE_ID, 0.25, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST)
                .build();
    }
    static ItemAttributeModifiers createRemnantLeggingsAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_LEGGINGS_ID, 6, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_LEGGINGS_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_LEGGINGS_ID, ERArmorMaterials.REMNANT.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .add(Attributes.EXPLOSION_KNOCKBACK_RESISTANCE, new AttributeModifier(EXPLOSION_KNOCKBACK_RESISTANCE_LEGGINGS_ID, 0.25, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .build();
    }
    static ItemAttributeModifiers createRemnantBootsAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_BOOTS_ID, 3, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_BOOTS_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_BOOTS_ID, ERArmorMaterials.REMNANT.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
                .add(Attributes.EXPLOSION_KNOCKBACK_RESISTANCE, new AttributeModifier(EXPLOSION_KNOCKBACK_RESISTANCE_BOOTS_ID, 0.25, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
                .build();
    }
    static ItemAttributeModifiers createRemnantAnimalArmorAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_ID, 19, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.BODY)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.BODY)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_ID, ERArmorMaterials.REMNANT.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.BODY)
                .add(Attributes.EXPLOSION_KNOCKBACK_RESISTANCE, new AttributeModifier(EXPLOSION_KNOCKBACK_RESISTANCE_ID, 1.00, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.BODY)
                .build();
    }

    static ItemAttributeModifiers createFeatherzealHelmetAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_HELMET_ID, 3, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_HELMET_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_HELMET_ID, ERArmorMaterials.FEATHERZEAL.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .add(Attributes.SAFE_FALL_DISTANCE, new AttributeModifier(SAFE_FALL_DISTANCE_HELMET_ID, 0.30, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL), EquipmentSlotGroup.HEAD)
                .build();
    }
    static ItemAttributeModifiers createFeatherzealChestplateAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_CHESTPLATE_ID, 8, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_CHESTPLATE_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_CHESTPLATE_ID, ERArmorMaterials.FEATHERZEAL.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST)
                .add(Attributes.SAFE_FALL_DISTANCE, new AttributeModifier(SAFE_FALL_DISTANCE_CHESTPLATE_ID, 0.30, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL), EquipmentSlotGroup.CHEST)
                .build();
    }
    static ItemAttributeModifiers createFeatherzealLeggingsAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_LEGGINGS_ID, 6, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_LEGGINGS_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_LEGGINGS_ID, ERArmorMaterials.FEATHERZEAL.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .add(Attributes.SAFE_FALL_DISTANCE, new AttributeModifier(SAFE_FALL_DISTANCE_LEGGINGS_ID, 0.30, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL), EquipmentSlotGroup.LEGS)
                .build();
    }
    static ItemAttributeModifiers createFeatherzealBootsAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_BOOTS_ID, 3, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_BOOTS_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_BOOTS_ID, ERArmorMaterials.FEATHERZEAL.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
                .add(Attributes.SAFE_FALL_DISTANCE, new AttributeModifier(SAFE_FALL_DISTANCE_BOOTS_ID, 0.30, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL), EquipmentSlotGroup.FEET)
                .build();
    }
    static ItemAttributeModifiers createFeatherzealAnimalArmorAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_ID, 19, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.BODY)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.BODY)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_ID, ERArmorMaterials.FEATHERZEAL.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.BODY)
                .add(Attributes.SAFE_FALL_DISTANCE, new AttributeModifier(SAFE_FALL_DISTANCE_ID, 0.30 * 0.30 * 0.30 * 0.30, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL), EquipmentSlotGroup.BODY)
                .build();
    }


    Identifier ARMOR_ID = EndReborn.id("armor");
    Identifier ARMOR_TOUGHNESS_ID = EndReborn.id("armor_toughness");
    Identifier KNOCKBACK_RESISTANCE_ID = EndReborn.id("knockback_resistance");

    Identifier ARMOR_HELMET_ID = EndReborn.id("armor_head");
    Identifier ARMOR_TOUGHNESS_HELMET_ID = EndReborn.id("armor_toughness_head");
    Identifier KNOCKBACK_RESISTANCE_HELMET_ID = EndReborn.id("knockback_resistance_head");

    Identifier ARMOR_CHESTPLATE_ID = EndReborn.id("armor_chestplate");
    Identifier ARMOR_TOUGHNESS_CHESTPLATE_ID = EndReborn.id("armor_toughness_chestplate");
    Identifier KNOCKBACK_RESISTANCE_CHESTPLATE_ID = EndReborn.id("knockback_resistance_chestplate");

    Identifier ARMOR_LEGGINGS_ID = EndReborn.id("armor_leggings");
    Identifier ARMOR_TOUGHNESS_LEGGINGS_ID = EndReborn.id("armor_toughness_leggings");
    Identifier KNOCKBACK_RESISTANCE_LEGGINGS_ID = EndReborn.id("knockback_resistance_leggings");

    Identifier ARMOR_BOOTS_ID = EndReborn.id("armor_boots");
    Identifier ARMOR_TOUGHNESS_BOOTS_ID = EndReborn.id("armor_toughness_boots");
    Identifier KNOCKBACK_RESISTANCE_BOOTS_ID = EndReborn.id("knockback_resistance_boots");

    Identifier BURNING_TIME_ID = EndReborn.id("burning_time");
    Identifier EXPLOSION_KNOCKBACK_RESISTANCE_ID = EndReborn.id("explosion_knockback_resistance");
    Identifier SAFE_FALL_DISTANCE_ID = EndReborn.id("safe_fall_distance");

    Identifier BURNING_TIME_HELMET_ID = EndReborn.id("burning_time_helmet");
    Identifier EXPLOSION_KNOCKBACK_RESISTANCE_HELMET_ID = EndReborn.id("explosion_knockback_resistance_helmet");
    Identifier SAFE_FALL_DISTANCE_HELMET_ID = EndReborn.id("safe_fall_distance_helmet");

    Identifier BURNING_TIME_CHESTPLATE_ID = EndReborn.id("burning_time_chestplate");
    Identifier EXPLOSION_KNOCKBACK_RESISTANCE_CHESTPLATE_ID = EndReborn.id("explosion_knockback_resistance_chestplate");
    Identifier SAFE_FALL_DISTANCE_CHESTPLATE_ID = EndReborn.id("safe_fall_distance_chestplate");

    Identifier BURNING_TIME_LEGGINGS_ID = EndReborn.id("burning_time_leggings");
    Identifier EXPLOSION_KNOCKBACK_RESISTANCE_LEGGINGS_ID = EndReborn.id("explosion_knockback_resistance_leggings");
    Identifier SAFE_FALL_DISTANCE_LEGGINGS_ID = EndReborn.id("safe_fall_distance_leggings");

    Identifier BURNING_TIME_BOOTS_ID = EndReborn.id("burning_time_boots");
    Identifier EXPLOSION_KNOCKBACK_RESISTANCE_BOOTS_ID = EndReborn.id("explosion_knockback_resistance_boots");
    Identifier SAFE_FALL_DISTANCE_BOOTS_ID = EndReborn.id("safe_fall_distance_boots");

}
