package net.legacy.end_reborn.registry;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
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
            context.modify(EREquipmentItems.REMNIUM_HELMET, builder -> {
                builder.set(DataComponents.ATTRIBUTE_MODIFIERS, createRemniumHelmetAttributes());
            });
        });
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(EREquipmentItems.REMNIUM_CHESTPLATE, builder -> {
                builder.set(DataComponents.ATTRIBUTE_MODIFIERS, createRemniumChestplateAttributes());
            });
        });
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(EREquipmentItems.REMNIUM_LEGGINGS, builder -> {
                builder.set(DataComponents.ATTRIBUTE_MODIFIERS, createRemniumLeggingsAttributes());
            });
        });
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(EREquipmentItems.REMNIUM_BOOTS, builder -> {
                builder.set(DataComponents.ATTRIBUTE_MODIFIERS, createRemniumBootsAttributes());
            });
        });
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(EREquipmentItems.REMNIUM_HORSE_ARMOR, builder -> {
                builder.set(DataComponents.ATTRIBUTE_MODIFIERS, createRemniumHorseArmorAttributes());
            });
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(EREquipmentItems.FEATHERZEAL_HELMET, builder -> {
                builder.set(DataComponents.ATTRIBUTE_MODIFIERS, createFeatherzealHelmetAttributes());
            });
        });
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(EREquipmentItems.FEATHERZEAL_CHESTPLATE, builder -> {
                builder.set(DataComponents.ATTRIBUTE_MODIFIERS, createFeatherzealChestplateAttributes());
            });
        });
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(EREquipmentItems.FEATHERZEAL_LEGGINGS, builder -> {
                builder.set(DataComponents.ATTRIBUTE_MODIFIERS, createFeatherzealLeggingsAttributes());
            });
        });
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(EREquipmentItems.FEATHERZEAL_BOOTS, builder -> {
                builder.set(DataComponents.ATTRIBUTE_MODIFIERS, createFeatherzealBootsAttributes());
            });
        });
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(EREquipmentItems.FEATHERZEAL_HORSE_ARMOR, builder -> {
                builder.set(DataComponents.ATTRIBUTE_MODIFIERS, createFeatherzealHorseArmorAttributes());
            });
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.POPPED_CHORUS_FRUIT, builder -> {
                builder.set(DataComponents.CONSUMABLE, ERConsumables.POPPED_CHORUS_FRUIT);
                builder.set(DataComponents.FOOD, ERFoods.POPPED_CHORUS_FRUIT);
            });
        });

    }

    public static ItemAttributeModifiers createNetheriteHelmetAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_ID, 3, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_ID, ArmorMaterials.NETHERITE.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .add(Attributes.BURNING_TIME, new AttributeModifier(BURNING_TIME_ID, -0.25, AttributeModifier.Operation.ADD_MULTIPLIED_BASE), EquipmentSlotGroup.HEAD)
                .build();
    }
    public static ItemAttributeModifiers createNetheriteChestplateAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_ID, 8, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_ID, ArmorMaterials.NETHERITE.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST)
                .add(Attributes.BURNING_TIME, new AttributeModifier(BURNING_TIME_ID, -0.25, AttributeModifier.Operation.ADD_MULTIPLIED_BASE), EquipmentSlotGroup.CHEST)
                .build();
    }
    public static ItemAttributeModifiers createNetheriteLeggingsAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_ID, 6, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_ID, ArmorMaterials.NETHERITE.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .add(Attributes.BURNING_TIME, new AttributeModifier(BURNING_TIME_ID, -0.25, AttributeModifier.Operation.ADD_MULTIPLIED_BASE), EquipmentSlotGroup.LEGS)
                .build();
    }
    public static ItemAttributeModifiers createNetheriteBootsAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_ID, 3, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_ID, ArmorMaterials.NETHERITE.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
                .add(Attributes.BURNING_TIME, new AttributeModifier(BURNING_TIME_ID, -0.25, AttributeModifier.Operation.ADD_MULTIPLIED_BASE), EquipmentSlotGroup.FEET)
                .build();
    }

    public static ItemAttributeModifiers createRemniumHelmetAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_ID, 3, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_ID, ArmorMaterials.NETHERITE.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .add(Attributes.EXPLOSION_KNOCKBACK_RESISTANCE, new AttributeModifier(EXPLOSION_KNOCKBACK_RESISTANCE_ID, 0.25, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .build();
    }
    public static ItemAttributeModifiers createRemniumChestplateAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_ID, 8, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_ID, ArmorMaterials.NETHERITE.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST)
                .add(Attributes.EXPLOSION_KNOCKBACK_RESISTANCE, new AttributeModifier(EXPLOSION_KNOCKBACK_RESISTANCE_ID, 0.25, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST)
                .build();
    }
    public static ItemAttributeModifiers createRemniumLeggingsAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_ID, 6, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_ID, ArmorMaterials.NETHERITE.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .add(Attributes.EXPLOSION_KNOCKBACK_RESISTANCE, new AttributeModifier(EXPLOSION_KNOCKBACK_RESISTANCE_ID, 0.25, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .build();
    }
    public static ItemAttributeModifiers createRemniumBootsAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_ID, 3, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_ID, ArmorMaterials.NETHERITE.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
                .add(Attributes.EXPLOSION_KNOCKBACK_RESISTANCE, new AttributeModifier(EXPLOSION_KNOCKBACK_RESISTANCE_ID, 0.25, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
                .build();
    }
    public static ItemAttributeModifiers createRemniumHorseArmorAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_ID, 3, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.BODY)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.BODY)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_ID, ArmorMaterials.NETHERITE.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.BODY)
                .add(Attributes.EXPLOSION_KNOCKBACK_RESISTANCE, new AttributeModifier(EXPLOSION_KNOCKBACK_RESISTANCE_ID, 0.25, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.BODY)
                .build();
    }

    public static ItemAttributeModifiers createFeatherzealHelmetAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_ID, 3, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_ID, ArmorMaterials.NETHERITE.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
                .add(Attributes.SAFE_FALL_DISTANCE, new AttributeModifier(SAFE_FALL_DISTANCE_ID, 0.25, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL), EquipmentSlotGroup.HEAD)
                .build();
    }
    public static ItemAttributeModifiers createFeatherzealChestplateAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_ID, 8, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.BODY)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.BODY)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_ID, ArmorMaterials.NETHERITE.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.BODY)
                .add(Attributes.SAFE_FALL_DISTANCE, new AttributeModifier(SAFE_FALL_DISTANCE_ID, 0.25, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL), EquipmentSlotGroup.BODY)
                .build();
    }
    public static ItemAttributeModifiers createFeatherzealLeggingsAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_ID, 6, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_ID, ArmorMaterials.NETHERITE.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
                .add(Attributes.SAFE_FALL_DISTANCE, new AttributeModifier(SAFE_FALL_DISTANCE_ID, 0.25, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL), EquipmentSlotGroup.LEGS)
                .build();
    }
    public static ItemAttributeModifiers createFeatherzealBootsAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_ID, 3, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_ID, ArmorMaterials.NETHERITE.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
                .add(Attributes.SAFE_FALL_DISTANCE, new AttributeModifier(SAFE_FALL_DISTANCE_ID, 0.25, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL), EquipmentSlotGroup.FEET)
                .build();
    }
    public static ItemAttributeModifiers createFeatherzealHorseArmorAttributes() {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(ARMOR_ID, 3, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.BODY)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ARMOR_TOUGHNESS_ID, ArmorMaterials.NETHERITE.toughness(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.BODY)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(KNOCKBACK_RESISTANCE_ID, ArmorMaterials.NETHERITE.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.BODY)
                .add(Attributes.SAFE_FALL_DISTANCE, new AttributeModifier(SAFE_FALL_DISTANCE_ID, 0.25, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL), EquipmentSlotGroup.BODY)
                .build();
    }

    public static final ResourceLocation ATTACK_DAMAGE_ID = ResourceLocation.withDefaultNamespace("attack_damage");

    public static final ResourceLocation ARMOR_ID = ResourceLocation.withDefaultNamespace("armor");
    public static final ResourceLocation ARMOR_TOUGHNESS_ID = ResourceLocation.withDefaultNamespace("armor_toughness");
    public static final ResourceLocation KNOCKBACK_RESISTANCE_ID = ResourceLocation.withDefaultNamespace("knockback_resistance");

    public static final ResourceLocation BURNING_TIME_ID = ResourceLocation.withDefaultNamespace("burning_time");
    public static final ResourceLocation EXPLOSION_KNOCKBACK_RESISTANCE_ID = ResourceLocation.withDefaultNamespace("explosion_knockback_resistance");
    public static final ResourceLocation SAFE_FALL_DISTANCE_ID = ResourceLocation.withDefaultNamespace("safe_fall_distance");

}