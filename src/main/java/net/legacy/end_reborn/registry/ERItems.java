package net.legacy.end_reborn.registry;

import net.legacy.end_reborn.ERConstants;
import net.legacy.end_reborn.tag.ERItemTags;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.component.DamageResistant;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.Equippable;
import org.jetbrains.annotations.NotNull;

import java.util.function.Function;

import static net.minecraft.world.item.Items.CHAINMAIL_HELMET;
import static net.minecraft.world.item.Items.registerBlock;

public final class ERItems {

    // Items
    public static final Item REMNANT_INGOT = register("remnant_ingot",
            Item::new,
            new Properties()
                    .stacksTo(64)
                    .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );
    public static final Item REMNANT_SCRAP = register("remnant_scrap",
            Item::new,
            new Properties()
                    .stacksTo(64)
                    .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );
    public static final SmithingTemplateItem REMNANT_UPGRADE_SMITHING_TEMPLATE = register("remnant_upgrade_smithing_template",
            ERItems::createRemnantUpgradeTemplate,
            new Properties()
                    .stacksTo(64)
                    .rarity(Rarity.UNCOMMON)
    );
    public static final Item FEATHERZEAL_INGOT = register("featherzeal_ingot",
            Item::new,
            new Properties()
                    .stacksTo(64)
    );
    public static final Item FEATHERZEAL_SCRAP = register("featherzeal_scrap",
            Item::new,
            new Properties()
                    .stacksTo(64)
    );
    public static final SmithingTemplateItem FEATHERZEAL_UPGRADE_SMITHING_TEMPLATE = register("featherzeal_upgrade_smithing_template",
            ERItems::createFeatherzealUpgradeTemplate,
            new Properties()
                    .stacksTo(64)
                    .rarity(Rarity.UNCOMMON)
    );
    public static final Item CHORUS_SPINE = register("chorus_spine",
            Item::new,
            new Properties()
                    .stacksTo(64)
    );
    public static final Item CRYSTALLINE_SHARD = register("crystalline_shard",
            Item::new,
            new Properties()
                    .stacksTo(64)
    );

    // Boats
    public static final BoatItem CHORUS_RAFT = register("chorus_raft",
            properties -> new BoatItem(EREntityTypes.CHORUS_RAFT, properties),
            new Item.Properties()
                    .stacksTo(1)
    );
    public static final BoatItem CHORUS_CHEST_RAFT = register("chorus_chest_raft",
            properties -> new BoatItem(EREntityTypes.CHORUS_CHEST_RAFT, properties),
            new Item.Properties()
                    .stacksTo(1)
    );

    // Signs
    public static final Item CHORUS_SIGN = registerBlock(ERBlocks.CHORUS_SIGN,
            (block, properties) -> new SignItem(block, ERBlocks.CHORUS_WALL_SIGN, properties),
            new Item.Properties()
                    .stacksTo(16)
    );
    public static final Item CHORUS_HANGING_SIGN = registerBlock(ERBlocks.CHORUS_HANGING_SIGN,
            (block, properties) -> new HangingSignItem(block, ERBlocks.CHORUS_WALL_HANGING_SIGN, properties),
            new Item.Properties()
                    .stacksTo(16)
    );

    // Block Items
    public static final Item REMNANT_BLOCK = registerBlock(ERBlocks.REMNANT_BLOCK,
            (block, properties) -> new BlockItem(ERBlocks.REMNANT_BLOCK, properties),
            new Item.Properties()
                    .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );
    public static final Item FORGOTTEN_REMAINS = registerBlock(ERBlocks.FORGOTTEN_REMAINS,
            (block, properties) -> new BlockItem(ERBlocks.FORGOTTEN_REMAINS, properties),
            new Item.Properties()
                    .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );

    // Armor
    public static final Item REMNANT_HELMET = register("remnant_helmet",
            Item::new,
            new Properties()
                    .stacksTo(1)
                    .durability(ArmorType.HELMET.getDurability(ERArmorMaterials.REMNANT.durability()))
                    .component(DataComponents.EQUIPPABLE, Equippable.builder(ArmorType.HELMET.getSlot()).setEquipSound(SoundEvents.ARMOR_EQUIP_NETHERITE).setAsset(EREquipmentAssets.REMNANT).build())
                    .repairable(ERArmorMaterials.REMNANT.repairIngredient())
                    .enchantable(ERArmorMaterials.REMNANT.enchantmentValue())
                    .attributes(ERArmorMaterials.createRemnantHelmetAttributes())
                    .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );
    public static final Item REMNANT_CHESTPLATE = register("remnant_chestplate",
            Item::new,
            new Properties()
                    .stacksTo(1)
                    .durability(ArmorType.CHESTPLATE.getDurability(ERArmorMaterials.REMNANT.durability()))
                    .component(DataComponents.EQUIPPABLE, Equippable.builder(ArmorType.CHESTPLATE.getSlot()).setEquipSound(SoundEvents.ARMOR_EQUIP_NETHERITE).setAsset(EREquipmentAssets.REMNANT).build())
                    .repairable(ERArmorMaterials.REMNANT.repairIngredient())
                    .enchantable(ERArmorMaterials.REMNANT.enchantmentValue())
                    .attributes(ERArmorMaterials.createRemnantChestplateAttributes())
                    .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );
    public static final Item REMNANT_LEGGINGS = register("remnant_leggings",
            Item::new,
            new Properties()
                    .stacksTo(1)
                    .durability(ArmorType.LEGGINGS.getDurability(ERArmorMaterials.REMNANT.durability()))
                    .component(DataComponents.EQUIPPABLE, Equippable.builder(ArmorType.LEGGINGS.getSlot()).setEquipSound(SoundEvents.ARMOR_EQUIP_NETHERITE).setAsset(EREquipmentAssets.REMNANT).build())
                    .repairable(ERArmorMaterials.REMNANT.repairIngredient())
                    .enchantable(ERArmorMaterials.REMNANT.enchantmentValue())
                    .attributes(ERArmorMaterials.createRemnantLeggingsAttributes())
                    .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );
    public static final Item REMNANT_BOOTS = register("remnant_boots",
            Item::new,
            new Properties()
                    .stacksTo(1)
                    .durability(ArmorType.BOOTS.getDurability(ERArmorMaterials.REMNANT.durability()))
                    .component(DataComponents.EQUIPPABLE, Equippable.builder(ArmorType.BOOTS.getSlot()).setEquipSound(SoundEvents.ARMOR_EQUIP_NETHERITE).setAsset(EREquipmentAssets.REMNANT).build())
                    .repairable(ERArmorMaterials.REMNANT.repairIngredient())
                    .enchantable(ERArmorMaterials.REMNANT.enchantmentValue())
                    .attributes(ERArmorMaterials.createRemnantBootsAttributes())
                    .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );
    public static final Item REMNANT_HORSE_ARMOR = register("remnant_horse_armor",
            Item::new,
            new Properties()
                    .stacksTo(1)
                    .component(DataComponents.EQUIPPABLE, Equippable.builder(ArmorType.BODY.getSlot()).setEquipSound(SoundEvents.ARMOR_EQUIP_NETHERITE).setAsset(EREquipmentAssets.REMNANT).build())
                    .repairable(ERArmorMaterials.REMNANT.repairIngredient())
                    .enchantable(ERArmorMaterials.REMNANT.enchantmentValue())
                    .attributes(ERArmorMaterials.createRemnantHorseArmorAttributes())
                    .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );

    public static final Item FEATHERZEAL_HELMET = register("featherzeal_helmet",
            Item::new,
            new Properties()
                    .stacksTo(1)
                    .durability(ArmorType.HELMET.getDurability(ERArmorMaterials.FEATHERZEAL.durability()))
                    .component(DataComponents.EQUIPPABLE, Equippable.builder(ArmorType.HELMET.getSlot()).setEquipSound(SoundEvents.ARMOR_EQUIP_NETHERITE).setAsset(EREquipmentAssets.FEATHERZEAL).build())
                    .repairable(ERArmorMaterials.FEATHERZEAL.repairIngredient())
                    .enchantable(ERArmorMaterials.FEATHERZEAL.enchantmentValue())
                    .attributes(ERArmorMaterials.createFeatherzealHelmetAttributes())
                    .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );
    public static final Item FEATHERZEAL_CHESTPLATE = register("featherzeal_chestplate",
            Item::new,
            new Properties()
                    .stacksTo(1)
                    .durability(ArmorType.CHESTPLATE.getDurability(ERArmorMaterials.FEATHERZEAL.durability()))
                    .component(DataComponents.EQUIPPABLE, Equippable.builder(ArmorType.CHESTPLATE.getSlot()).setEquipSound(SoundEvents.ARMOR_EQUIP_NETHERITE).setAsset(EREquipmentAssets.FEATHERZEAL).build())
                    .repairable(ERArmorMaterials.FEATHERZEAL.repairIngredient())
                    .enchantable(ERArmorMaterials.FEATHERZEAL.enchantmentValue())
                    .attributes(ERArmorMaterials.createFeatherzealChestplateAttributes())
                    .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );
    public static final Item FEATHERZEAL_LEGGINGS = register("featherzeal_leggings",
            Item::new,
            new Properties()
                    .stacksTo(1)
                    .durability(ArmorType.LEGGINGS.getDurability(ERArmorMaterials.FEATHERZEAL.durability()))
                    .component(DataComponents.EQUIPPABLE, Equippable.builder(ArmorType.LEGGINGS.getSlot()).setEquipSound(SoundEvents.ARMOR_EQUIP_NETHERITE).setAsset(EREquipmentAssets.FEATHERZEAL).build())
                    .repairable(ERArmorMaterials.FEATHERZEAL.repairIngredient())
                    .enchantable(ERArmorMaterials.FEATHERZEAL.enchantmentValue())
                    .attributes(ERArmorMaterials.createFeatherzealLeggingsAttributes())
                    .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );
    public static final Item FEATHERZEAL_BOOTS = register("featherzeal_boots",
            Item::new,
            new Properties()
                    .stacksTo(1)
                    .durability(ArmorType.BOOTS.getDurability(ERArmorMaterials.FEATHERZEAL.durability()))
                    .component(DataComponents.EQUIPPABLE, Equippable.builder(ArmorType.BOOTS.getSlot()).setEquipSound(SoundEvents.ARMOR_EQUIP_NETHERITE).setAsset(EREquipmentAssets.FEATHERZEAL).build())
                    .repairable(ERArmorMaterials.FEATHERZEAL.repairIngredient())
                    .enchantable(ERArmorMaterials.FEATHERZEAL.enchantmentValue())
                    .attributes(ERArmorMaterials.createFeatherzealBootsAttributes())
                    .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );
    public static final Item FEATHERZEAL_HORSE_ARMOR = register("featherzeal_horse_armor",
            Item::new,
            new Properties()
                    .stacksTo(1)
                    .component(DataComponents.EQUIPPABLE, Equippable.builder(ArmorType.BODY.getSlot()).setEquipSound(SoundEvents.ARMOR_EQUIP_NETHERITE).setAsset(EREquipmentAssets.FEATHERZEAL).build())
                    .repairable(ERArmorMaterials.FEATHERZEAL.repairIngredient())
                    .enchantable(ERArmorMaterials.FEATHERZEAL.enchantmentValue())
                    .attributes(ERArmorMaterials.createFeatherzealHorseArmorAttributes())
                    .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );

    public static void init() {
    }

    private static @NotNull <T extends Item> T register(String name, @NotNull Function<Properties, Item> function, Item.@NotNull Properties properties) {
        return (T) Items.registerItem(ResourceKey.create(Registries.ITEM, ERConstants.id(name)), function, properties);
    }

    public static SmithingTemplateItem createRemnantUpgradeTemplate(Item.Properties properties) {
        return new SmithingTemplateItem(
                Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, "smithing_template.remnant_upgrade.applies_to"))).withStyle(ChatFormatting.BLUE),
                Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, "smithing_template.remnant_upgrade.ingredients"))).withStyle(ChatFormatting.BLUE),
                Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, "smithing_template.remnant_upgrade.base_slot_description"))),
                Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, "smithing_template.remnant_upgrade.additions_slot_description"))),
                SmithingTemplateItem.createNetheriteUpgradeIconList(),
                SmithingTemplateItem.createNetheriteUpgradeMaterialList(),
                properties
        );
    }

    public static SmithingTemplateItem createFeatherzealUpgradeTemplate(Item.Properties properties) {
        return new SmithingTemplateItem(
                Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, "smithing_template.featherzeal_upgrade.applies_to"))).withStyle(ChatFormatting.BLUE),
                Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, "smithing_template.featherzeal_upgrade.ingredients"))).withStyle(ChatFormatting.BLUE),
                Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, "smithing_template.featherzeal_upgrade.base_slot_description"))),
                Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, "smithing_template.featherzeal_upgrade.additions_slot_description"))),
                SmithingTemplateItem.createNetheriteUpgradeIconList(),
                SmithingTemplateItem.createNetheriteUpgradeMaterialList(),
                properties
        );
    }
}
