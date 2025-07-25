package net.legacy.end_reborn.registry;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.legacy.end_reborn.ERConstants;
import net.legacy.end_reborn.food.ERConsumables;
import net.legacy.end_reborn.food.ERFoods;
import net.minecraft.core.component.DataComponents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.equipment.ArmorMaterials;

public class ERItemComponents {
    public static void init(){

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.NETHERITE_HELMET, builder -> {
                builder.set(DataComponents.ATTRIBUTE_MODIFIERS, createNetheriteHelmetAttributes());
            });
        });
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.NETHERITE_CHESTPLATE, builder -> {
                builder.set(DataComponents.ATTRIBUTE_MODIFIERS, createNetheriteChestplateAttributes());
            });
        });
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.NETHERITE_LEGGINGS, builder -> {
                builder.set(DataComponents.ATTRIBUTE_MODIFIERS, createNetheriteLeggingsAttributes());
            });
        });
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.NETHERITE_BOOTS, builder -> {
                builder.set(DataComponents.ATTRIBUTE_MODIFIERS, createNetheriteBootsAttributes());
            });
        });
        // Netherite Horse Armor handled in Progression Reborn

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.POPPED_CHORUS_FRUIT, builder -> {
                builder.set(DataComponents.CONSUMABLE, ERConsumables.POPPED_CHORUS_FRUIT);
                builder.set(DataComponents.FOOD, ERFoods.POPPED_CHORUS_FRUIT);
            });
        });

    }

    public static ItemAttributeModifiers createNetheriteHelmetAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ERArmorMaterials.ARMOR_HELMET_ID, 3, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ERArmorMaterials.ARMOR_TOUGHNESS_HELMET_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(ERArmorMaterials.KNOCKBACK_RESISTANCE_HELMET_ID, ArmorMaterials.NETHERITE.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .add(Attributes.BURNING_TIME, new AttributeModifier(ERArmorMaterials.BURNING_TIME_HELMET_ID, -0.25, AttributeModifier.Operation.ADD_MULTIPLIED_BASE), EquipmentSlotGroup.HEAD)
                .build();
    }
    public static ItemAttributeModifiers createNetheriteChestplateAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ERArmorMaterials.ARMOR_CHESTPLATE_ID, 8, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ERArmorMaterials.ARMOR_TOUGHNESS_CHESTPLATE_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(ERArmorMaterials.KNOCKBACK_RESISTANCE_CHESTPLATE_ID, ArmorMaterials.NETHERITE.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST)
                .add(Attributes.BURNING_TIME, new AttributeModifier(ERArmorMaterials.BURNING_TIME_CHESTPLATE_ID, -0.25, AttributeModifier.Operation.ADD_MULTIPLIED_BASE), EquipmentSlotGroup.CHEST)
                .build();
    }
    public static ItemAttributeModifiers createNetheriteLeggingsAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ERArmorMaterials.ARMOR_LEGGINGS_ID, 6, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ERArmorMaterials.ARMOR_TOUGHNESS_LEGGINGS_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(ERArmorMaterials.KNOCKBACK_RESISTANCE_LEGGINGS_ID, ArmorMaterials.NETHERITE.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .add(Attributes.BURNING_TIME, new AttributeModifier(ERArmorMaterials.BURNING_TIME_LEGGINGS_ID, -0.25, AttributeModifier.Operation.ADD_MULTIPLIED_BASE), EquipmentSlotGroup.LEGS)
                .build();
    }
    public static ItemAttributeModifiers createNetheriteBootsAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ERArmorMaterials.ARMOR_BOOTS_ID, 3, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ERArmorMaterials.ARMOR_TOUGHNESS_BOOTS_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(ERArmorMaterials.KNOCKBACK_RESISTANCE_BOOTS_ID, ArmorMaterials.NETHERITE.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
                .add(Attributes.BURNING_TIME, new AttributeModifier(ERArmorMaterials.BURNING_TIME_BOOTS_ID, -0.25, AttributeModifier.Operation.ADD_MULTIPLIED_BASE), EquipmentSlotGroup.FEET)
                .build();
    }

}