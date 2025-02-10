package net.legacy.end_reborn;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.core.component.DataComponents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.equipment.ArmorMaterials;

public class ERDefaultItemComponents {
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

    }
    public static ItemAttributeModifiers createNetheriteHelmetAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_ID, 3, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_ID, ArmorMaterials.NETHERITE.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .add(Attributes.BURNING_TIME, new AttributeModifier(BURNING_TIME_ID, -0.2, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .build();
    }
    public static ItemAttributeModifiers createNetheriteChestplateAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_ID, 8, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.BODY)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.BODY)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_ID, ArmorMaterials.NETHERITE.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.BODY)
                .add(Attributes.BURNING_TIME, new AttributeModifier(BURNING_TIME_ID, -0.2, AttributeModifier.Operation.ADD_MULTIPLIED_BASE), EquipmentSlotGroup.BODY)
                .build();
    }
    public static ItemAttributeModifiers createNetheriteLeggingsAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_ID, 6, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_ID, ArmorMaterials.NETHERITE.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .add(Attributes.BURNING_TIME, new AttributeModifier(BURNING_TIME_ID, -0.2, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .build();
    }
    public static ItemAttributeModifiers createNetheriteBootsAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_ID, 3, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_ID, ArmorMaterials.NETHERITE.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
                .add(Attributes.BURNING_TIME, new AttributeModifier(BURNING_TIME_ID, -0.2, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
                .build();
    }

    public static final ResourceLocation ARMOR_ID = ResourceLocation.withDefaultNamespace("armor");
    public static final ResourceLocation ARMOR_TOUGHNESS_ID = ResourceLocation.withDefaultNamespace("armor_toughness");
    public static final ResourceLocation KNOCKBACK_RESISTANCE_ID = ResourceLocation.withDefaultNamespace("knockback_resistance");
    public static final ResourceLocation BURNING_TIME_ID = ResourceLocation.withDefaultNamespace("burning_time");

}