package net.rebel459.end_reborn.registry;

import net.minecraft.core.component.DataComponents;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.rebel459.end_reborn.EndReborn;
import net.rebel459.unified.platform.UnifiedEvents;

public class ERDataComponents {

    public static void init(){
        UnifiedEvents.DefaultDataComponents.modify((item, builder, provider) -> {
            if (!EndReborn.isCombatRebornloaded) {
                if (item == Items.NETHERITE_HELMET) {
                    builder.set(DataComponents.ATTRIBUTE_MODIFIERS, ERArmorMaterials.createHelmetAttributes(ERAttributes.Type.BURNING_RESISTANCE));
                }
                if (item == Items.NETHERITE_CHESTPLATE) {
                    builder.set(DataComponents.ATTRIBUTE_MODIFIERS, ERArmorMaterials.createChestplateAttributes(ERAttributes.Type.BURNING_RESISTANCE));
                }
                if (item == Items.NETHERITE_LEGGINGS) {
                    builder.set(DataComponents.ATTRIBUTE_MODIFIERS, ERArmorMaterials.createLeggingsAttributes(ERAttributes.Type.BURNING_RESISTANCE));
                }
                if (item == Items.NETHERITE_BOOTS) {
                    builder.set(DataComponents.ATTRIBUTE_MODIFIERS, ERArmorMaterials.createBootsAttributes(ERAttributes.Type.BURNING_RESISTANCE));
                }
                if (item == Items.NETHERITE_HORSE_ARMOR || item == Items.NETHERITE_NAUTILUS_ARMOR) {
                    builder.set(DataComponents.ATTRIBUTE_MODIFIERS, ERArmorMaterials.createAnimalArmorAttributes(ERAttributes.Type.BURNING_RESISTANCE));
                }
                if (ERToolMaterials.getFeatherzealTools().contains(item)) {
                    ItemStack stack = item.getDefaultInstance();
                    ItemAttributeModifiers oldAttributes = stack.getOrDefault(DataComponents.ATTRIBUTE_MODIFIERS, ItemAttributeModifiers.builder().build());
                    double attackSpeed = 0D;
                    for (ItemAttributeModifiers.Entry entry : oldAttributes.modifiers()) {
                        if (entry.modifier().id() == Item.BASE_ATTACK_SPEED_ID && entry.modifier().operation() == AttributeModifier.Operation.ADD_VALUE) {
                            attackSpeed = entry.modifier().amount();
                            break;
                        }
                    }
                    ItemAttributeModifiers newAttributes = oldAttributes.withModifierAdded(Attributes.ATTACK_SPEED, new AttributeModifier(Item.BASE_ATTACK_SPEED_ID, attackSpeed + ERToolMaterials.getFeatherzealAttackSpeedBonus(item), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND);
                    builder.set(DataComponents.ATTRIBUTE_MODIFIERS, newAttributes);
                }
            }
            if (item == Items.POPPED_CHORUS_FRUIT) {
                builder.set(DataComponents.CONSUMABLE, Consumable.builder().consumeSeconds(0.8F).animation(ItemUseAnimation.EAT).sound(SoundEvents.GENERIC_EAT).hasConsumeParticles(true).build());
                builder.set(DataComponents.FOOD, new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).alwaysEdible().build());
            }
        });
    }
}