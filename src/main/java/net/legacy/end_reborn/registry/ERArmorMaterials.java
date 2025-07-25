package net.legacy.end_reborn.registry;

import net.legacy.end_reborn.ERConstants;
import net.legacy.end_reborn.tag.ERItemTags;
import net.minecraft.Util;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.EnumMap;

public interface ERArmorMaterials {
    ArmorMaterial REMNANT = new net.minecraft.world.item.equipment.ArmorMaterial(37, Util.make(new EnumMap(ArmorType.class), enumMap -> {
        enumMap.put(ArmorType.BOOTS, 3);
        enumMap.put(ArmorType.LEGGINGS, 6);
        enumMap.put(ArmorType.CHESTPLATE, 8);
        enumMap.put(ArmorType.HELMET, 3);
        enumMap.put(ArmorType.BODY, 12);
    }), 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, ERItemTags.REPAIRS_REMNANT_ARMOR, EREquipmentAssets.REMNANT);

    ArmorMaterial FEATHERZEAL = new net.minecraft.world.item.equipment.ArmorMaterial(37, Util.make(new EnumMap(ArmorType.class), enumMap -> {
        enumMap.put(ArmorType.BOOTS, 3);
        enumMap.put(ArmorType.LEGGINGS, 6);
        enumMap.put(ArmorType.CHESTPLATE, 8);
        enumMap.put(ArmorType.HELMET, 3);
        enumMap.put(ArmorType.BODY, 12);
    }), 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, ERItemTags.REPAIRS_FEATHERZEAL_ARMOR, EREquipmentAssets.FEATHERZEAL);

    // Armor Attributes

    public static ItemAttributeModifiers createRemnantHelmetAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_HELMET_ID, 3, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_HELMET_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_HELMET_ID, ERArmorMaterials.REMNANT.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .add(Attributes.EXPLOSION_KNOCKBACK_RESISTANCE, new AttributeModifier(EXPLOSION_KNOCKBACK_RESISTANCE_HELMET_ID, 0.25, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .build();
    }
    public static ItemAttributeModifiers createRemnantChestplateAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_CHESTPLATE_ID, 8, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_CHESTPLATE_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_CHESTPLATE_ID, ERArmorMaterials.REMNANT.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST)
                .add(Attributes.EXPLOSION_KNOCKBACK_RESISTANCE, new AttributeModifier(EXPLOSION_KNOCKBACK_RESISTANCE_CHESTPLATE_ID, 0.25, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST)
                .build();
    }
    public static ItemAttributeModifiers createRemnantLeggingsAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_LEGGINGS_ID, 6, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_LEGGINGS_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_LEGGINGS_ID, ERArmorMaterials.REMNANT.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .add(Attributes.EXPLOSION_KNOCKBACK_RESISTANCE, new AttributeModifier(EXPLOSION_KNOCKBACK_RESISTANCE_LEGGINGS_ID, 0.25, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .build();
    }
    public static ItemAttributeModifiers createRemnantBootsAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_BOOTS_ID, 3, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_BOOTS_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_BOOTS_ID, ERArmorMaterials.REMNANT.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
                .add(Attributes.EXPLOSION_KNOCKBACK_RESISTANCE, new AttributeModifier(EXPLOSION_KNOCKBACK_RESISTANCE_BOOTS_ID, 0.25, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
                .build();
    }
    public static ItemAttributeModifiers createRemnantHorseArmorAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_ID, 12, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.BODY)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.BODY)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_ID, ERArmorMaterials.REMNANT.knockbackResistance() * 2F, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.BODY)
                .add(Attributes.EXPLOSION_KNOCKBACK_RESISTANCE, new AttributeModifier(EXPLOSION_KNOCKBACK_RESISTANCE_ID, 0.50, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.BODY)
                .build();
    }

    public static ItemAttributeModifiers createFeatherzealHelmetAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_HELMET_ID, 3, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_HELMET_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_HELMET_ID, ERArmorMaterials.FEATHERZEAL.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .add(Attributes.SAFE_FALL_DISTANCE, new AttributeModifier(SAFE_FALL_DISTANCE_HELMET_ID, 0.25, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL), EquipmentSlotGroup.HEAD)
                .build();
    }
    public static ItemAttributeModifiers createFeatherzealChestplateAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_CHESTPLATE_ID, 8, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_CHESTPLATE_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_CHESTPLATE_ID, ERArmorMaterials.FEATHERZEAL.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST)
                .add(Attributes.SAFE_FALL_DISTANCE, new AttributeModifier(SAFE_FALL_DISTANCE_CHESTPLATE_ID, 0.25, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL), EquipmentSlotGroup.CHEST)
                .build();
    }
    public static ItemAttributeModifiers createFeatherzealLeggingsAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_LEGGINGS_ID, 6, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_LEGGINGS_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_LEGGINGS_ID, ERArmorMaterials.FEATHERZEAL.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .add(Attributes.SAFE_FALL_DISTANCE, new AttributeModifier(SAFE_FALL_DISTANCE_LEGGINGS_ID, 0.25, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL), EquipmentSlotGroup.LEGS)
                .build();
    }
    public static ItemAttributeModifiers createFeatherzealBootsAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_BOOTS_ID, 3, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_BOOTS_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_BOOTS_ID, ERArmorMaterials.FEATHERZEAL.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
                .add(Attributes.SAFE_FALL_DISTANCE, new AttributeModifier(SAFE_FALL_DISTANCE_BOOTS_ID, 0.25, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL), EquipmentSlotGroup.FEET)
                .build();
    }
    public static ItemAttributeModifiers createFeatherzealHorseArmorAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_ID, 12, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.BODY)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.BODY)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_ID, ERArmorMaterials.FEATHERZEAL.knockbackResistance() * 2F, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.BODY)
                .add(Attributes.SAFE_FALL_DISTANCE, new AttributeModifier(SAFE_FALL_DISTANCE_ID, 0.50, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL), EquipmentSlotGroup.BODY)
                .build();
    }


    public static final ResourceLocation ARMOR_ID = ERConstants.id("armor");
    public static final ResourceLocation ARMOR_TOUGHNESS_ID = ERConstants.id("armor_toughness");
    public static final ResourceLocation KNOCKBACK_RESISTANCE_ID = ERConstants.id("knockback_resistance");

    public static final ResourceLocation ARMOR_HELMET_ID = ERConstants.id("armor_head");
    public static final ResourceLocation ARMOR_TOUGHNESS_HELMET_ID = ERConstants.id("armor_toughness_head");
    public static final ResourceLocation KNOCKBACK_RESISTANCE_HELMET_ID = ERConstants.id("knockback_resistance_head");

    public static final ResourceLocation ARMOR_CHESTPLATE_ID = ERConstants.id("armor_chestplate");
    public static final ResourceLocation ARMOR_TOUGHNESS_CHESTPLATE_ID = ERConstants.id("armor_toughness_chestplate");
    public static final ResourceLocation KNOCKBACK_RESISTANCE_CHESTPLATE_ID = ERConstants.id("knockback_resistance_chestplate");

    public static final ResourceLocation ARMOR_LEGGINGS_ID = ERConstants.id("armor_leggings");
    public static final ResourceLocation ARMOR_TOUGHNESS_LEGGINGS_ID = ERConstants.id("armor_toughness_leggings");
    public static final ResourceLocation KNOCKBACK_RESISTANCE_LEGGINGS_ID = ERConstants.id("knockback_resistance_leggings");

    public static final ResourceLocation ARMOR_BOOTS_ID = ERConstants.id("armor_boots");
    public static final ResourceLocation ARMOR_TOUGHNESS_BOOTS_ID = ERConstants.id("armor_toughness_boots");
    public static final ResourceLocation KNOCKBACK_RESISTANCE_BOOTS_ID = ERConstants.id("knockback_resistance_boots");

    public static final ResourceLocation BURNING_TIME_ID = ERConstants.id("burning_time");
    public static final ResourceLocation EXPLOSION_KNOCKBACK_RESISTANCE_ID = ERConstants.id("explosion_knockback_resistance");
    public static final ResourceLocation SAFE_FALL_DISTANCE_ID = ERConstants.id("safe_fall_distance");

    public static final ResourceLocation BURNING_TIME_HELMET_ID = ERConstants.id("burning_time_helmet");
    public static final ResourceLocation EXPLOSION_KNOCKBACK_RESISTANCE_HELMET_ID = ERConstants.id("explosion_knockback_resistance_helmet");
    public static final ResourceLocation SAFE_FALL_DISTANCE_HELMET_ID = ERConstants.id("safe_fall_distance_helmet");

    public static final ResourceLocation BURNING_TIME_CHESTPLATE_ID = ERConstants.id("burning_time_chestplate");
    public static final ResourceLocation EXPLOSION_KNOCKBACK_RESISTANCE_CHESTPLATE_ID = ERConstants.id("explosion_knockback_resistance_chestplate");
    public static final ResourceLocation SAFE_FALL_DISTANCE_CHESTPLATE_ID = ERConstants.id("safe_fall_distance_chestplate");

    public static final ResourceLocation BURNING_TIME_LEGGINGS_ID = ERConstants.id("burning_time_leggings");
    public static final ResourceLocation EXPLOSION_KNOCKBACK_RESISTANCE_LEGGINGS_ID = ERConstants.id("explosion_knockback_resistance_leggings");
    public static final ResourceLocation SAFE_FALL_DISTANCE_LEGGINGS_ID = ERConstants.id("safe_fall_distance_leggings");

    public static final ResourceLocation BURNING_TIME_BOOTS_ID = ERConstants.id("burning_time_boots");
    public static final ResourceLocation EXPLOSION_KNOCKBACK_RESISTANCE_BOOTS_ID = ERConstants.id("explosion_knockback_resistance_boots");
    public static final ResourceLocation SAFE_FALL_DISTANCE_BOOTS_ID = ERConstants.id("safe_fall_distance_boots");

}
