package net.rebel459.end_reborn.registry;

import com.mojang.logging.LogUtils;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.item.equipment.ArmorType;
import net.rebel459.end_reborn.EndReborn;
import net.rebel459.end_reborn.tag.ERItemTags;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;

import java.util.Objects;

public interface ERArmorMaterials {

    ArmorMaterial REMNANT = new ArmorMaterial(37, ArmorMaterials.makeDefense(3, 6, 8, 3, 19), 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, ERItemTags.REPAIRS_REMNANT_ARMOR, EREquipmentAssets.REMNANT);

    ArmorMaterial FEATHERZEAL = new ArmorMaterial(37, ArmorMaterials.makeDefense(3, 6, 8, 3, 19), 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, ERItemTags.REPAIRS_FEATHERZEAL_ARMOR, EREquipmentAssets.FEATHERZEAL);

    // Armor Attributes

    static ItemAttributeModifiers createHelmetAttributes(ERAttributes.Type attribute) {
        return createAttributes(getAttribute(attribute), getId(attribute), "_helmet", ArmorType.HELMET, EquipmentSlotGroup.HEAD);
    }

    static ItemAttributeModifiers createChestplateAttributes(ERAttributes.Type attribute) {
        return createAttributes(getAttribute(attribute), getId(attribute), "_chestplate", ArmorType.CHESTPLATE, EquipmentSlotGroup.CHEST);
    }

    static ItemAttributeModifiers createLeggingsAttributes(ERAttributes.Type attribute) {
        return createAttributes(getAttribute(attribute), getId(attribute), "_leggings", ArmorType.LEGGINGS, EquipmentSlotGroup.LEGS);
    }

    static ItemAttributeModifiers createBootsAttributes(ERAttributes.Type attribute) {
        return createAttributes(getAttribute(attribute), getId(attribute), "_boots", ArmorType.BOOTS, EquipmentSlotGroup.FEET);
    }

    static ItemAttributeModifiers createAnimalArmorAttributes(ERAttributes.Type attribute) {
        return createAttributes(getAttribute(attribute), getId(attribute), "", ArmorType.BODY, EquipmentSlotGroup.BODY);
    }

    private static Holder<Attribute> getAttribute(ERAttributes.Type specialAttribute) {
        return switch(specialAttribute) {
            case MAGIC_RESISTANCE -> ERAttributes.MAGIC_RESISTANCE;
            case BURNING_RESISTANCE -> ERAttributes.BURNING_RESISTANCE;
            case FALL_RESISTANCE -> ERAttributes.FALL_RESISTANCE;
        };
    }

    private static Identifier getId(ERAttributes.Type specialAttribute) {
        return switch(specialAttribute) {
            case MAGIC_RESISTANCE -> EndReborn.id("magic_resistance");
            case BURNING_RESISTANCE -> EndReborn.id("burning_resistance");
            case FALL_RESISTANCE -> EndReborn.id("fall_resistance");
        };
    }

    private static ItemAttributeModifiers createAttributes(Holder<Attribute> specialAttribute, Identifier specialId, String idModifier, ArmorType type, EquipmentSlotGroup slot) {
        int multiplier = 1;
        if (type == ArmorType.BODY && Objects.equals(idModifier, "")) multiplier = 4;
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(EndReborn.id("armor" + idModifier), ArmorMaterials.NETHERITE.defense().get(type), AttributeModifier.Operation.ADD_VALUE), slot)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(EndReborn.id("armor_toughness" + idModifier), ArmorMaterials.NETHERITE.toughness() * multiplier, AttributeModifier.Operation.ADD_VALUE), slot)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(EndReborn.id("knockback_resistance" + idModifier), ArmorMaterials.NETHERITE.knockbackResistance() * multiplier, AttributeModifier.Operation.ADD_VALUE), slot)
                .add(specialAttribute, new AttributeModifier(specialId.withPath(specialId.getPath() + idModifier), multiplier, AttributeModifier.Operation.ADD_VALUE), slot)
                .build();
    }
}
