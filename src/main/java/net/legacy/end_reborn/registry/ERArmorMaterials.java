package net.legacy.end_reborn.registry;

import net.legacy.end_reborn.tag.ERItemTags;
import net.minecraft.Util;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
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

}
