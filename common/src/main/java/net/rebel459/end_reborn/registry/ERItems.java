package net.rebel459.end_reborn.registry;

import net.rebel459.end_reborn.EndReborn;
import net.minecraft.ChatFormatting;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.util.Util;
import net.minecraft.world.item.*;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.component.DamageResistant;
import net.minecraft.world.item.equipment.ArmorType;
import net.rebel459.unified.platform.UnifiedRegistries;
import net.rebel459.unified.util.SuppliedItem;
import org.spongepowered.asm.mixin.Unique;

public final class ERItems {
    
    public static UnifiedRegistries.Items ITEMS = UnifiedRegistries.Items.create(EndReborn.MOD_ID);

    // Items
    public static final SuppliedItem REMNANT_INGOT = ITEMS.register("remnant_ingot",
            Item::new,
            () -> new Properties()
                    .stacksTo(64)
                    .trimMaterial(ERTrimMaterials.REMNANT)
                    .delayedComponent(DataComponents.DAMAGE_RESISTANT, provider -> new DamageResistant(provider.getOrThrow(DamageTypeTags.IS_EXPLOSION)))
    );
    public static final SuppliedItem REMNANT_SCRAP = ITEMS.register("remnant_scrap",
            Item::new,
            () -> new Properties()
                    .stacksTo(64)
                    .delayedComponent(DataComponents.DAMAGE_RESISTANT, provider -> new DamageResistant(provider.getOrThrow(DamageTypeTags.IS_EXPLOSION)))
    );
    public static final SuppliedItem REMNANT_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("remnant_upgrade_smithing_template",
            ERItems::createRemnantUpgradeTemplate,
            () -> new Properties()
                    .stacksTo(64)
                    .rarity(Rarity.UNCOMMON)
    );
    public static final SuppliedItem FEATHERZEAL_INGOT = ITEMS.register("featherzeal_ingot",
            Item::new,
            () -> new Properties()
                    .stacksTo(64)
                    .trimMaterial(ERTrimMaterials.FEATHERZEAL)
    );
    public static final SuppliedItem FEATHERZEAL_SCRAP = ITEMS.register("featherzeal_scrap",
            Item::new,
            () -> new Properties()
                    .stacksTo(64)
    );
    public static final SuppliedItem FEATHERZEAL_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("featherzeal_upgrade_smithing_template",
            ERItems::createFeatherzealUpgradeTemplate,
            () -> new Properties()
                    .stacksTo(64)
                    .rarity(Rarity.UNCOMMON)
    );
    public static final SuppliedItem CHORUS_SPINE = ITEMS.register("chorus_spine",
            Item::new,
            () -> new Properties()
                    .stacksTo(64)
    );
    public static final SuppliedItem CRYSTALLINE_SHARD = ITEMS.register("crystalline_shard",
            Item::new,
            () -> new Properties()
                    .stacksTo(64)
    );

    // Entity Items
    public static final SuppliedItem CHORUS_RAFT = ITEMS.register("chorus_raft",
            properties -> new BoatItem(EREntityTypes.CHORUS_RAFT.get(), properties),
            () -> new Properties()
    );
    public static final SuppliedItem CHORUS_CHEST_RAFT = ITEMS.register("chorus_chest_raft",
            properties -> new BoatItem(EREntityTypes.CHORUS_CHEST_RAFT.get(), properties),
            () -> new Properties()
    );

    // Block Items
    public static final SuppliedItem CHORUS_SIGN = ITEMS.registerBlockItem(
            "chorus_sign",
            ERBlocks.CHORUS_SIGN,
            () -> new Properties()
                    .stacksTo(16)
    );
    public static final SuppliedItem CHORUS_HANGING_SIGN = ITEMS.registerBlockItem(
            "chorus_hanging_sign",
            ERBlocks.CHORUS_HANGING_SIGN,
            () -> new Properties()
                    .stacksTo(16)
    );

    public static final SuppliedItem REMNANT_BLOCK = ITEMS.registerBlockItem(
            "remnant_block",
            ERBlocks.REMNANT_BLOCK,
            () -> new Properties()
                    .delayedComponent(DataComponents.DAMAGE_RESISTANT, provider -> new DamageResistant(provider.getOrThrow(DamageTypeTags.IS_EXPLOSION)))
    );
    public static final SuppliedItem FORGOTTEN_REMAINS = ITEMS.registerBlockItem(
            "forgotten_remains",
            ERBlocks.FORGOTTEN_REMAINS,
            () -> new Properties()
                    .delayedComponent(DataComponents.DAMAGE_RESISTANT, provider -> new DamageResistant(provider.getOrThrow(DamageTypeTags.IS_EXPLOSION)))
    );

    // Tools
    public static final SuppliedItem REMNANT_SWORD = ITEMS.register("remnant_sword",
            Item::new,
            () -> new Properties()
                    .sword(ERToolMaterials.REMNANT, 3f, -2.4f)
                    .delayedComponent(DataComponents.DAMAGE_RESISTANT, provider -> new DamageResistant(provider.getOrThrow(DamageTypeTags.IS_EXPLOSION)))
    );
    public static final SuppliedItem REMNANT_PICKAXE = ITEMS.register("remnant_pickaxe",
            Item::new,
            () -> new Properties()
                    .pickaxe(ERToolMaterials.REMNANT, 1f, -2.8f)
                    .delayedComponent(DataComponents.DAMAGE_RESISTANT, provider -> new DamageResistant(provider.getOrThrow(DamageTypeTags.IS_EXPLOSION)))
    );
    public static final SuppliedItem REMNANT_AXE = ITEMS.register("remnant_axe",
            (properties) -> new AxeItem(ERToolMaterials.REMNANT, 5f, -3.0f, properties), (
                    () -> new Properties()
                            .delayedComponent(DataComponents.DAMAGE_RESISTANT, provider -> new DamageResistant(provider.getOrThrow(DamageTypeTags.IS_EXPLOSION)))
            )
    );
    public static final SuppliedItem REMNANT_SHOVEL = ITEMS.register("remnant_shovel",
            (properties) -> new ShovelItem(ERToolMaterials.REMNANT, 1.5f, -3f, properties), (
                    () -> new Properties()
                            .delayedComponent(DataComponents.DAMAGE_RESISTANT, provider -> new DamageResistant(provider.getOrThrow(DamageTypeTags.IS_EXPLOSION)))
            )
    );
    public static final SuppliedItem REMNANT_HOE = ITEMS.register("remnant_hoe",
            (properties) -> new HoeItem(ERToolMaterials.REMNANT, -4f, 0f, properties), (
                    () -> new Properties()
                            .delayedComponent(DataComponents.DAMAGE_RESISTANT, provider -> new DamageResistant(provider.getOrThrow(DamageTypeTags.IS_EXPLOSION)))
            )
    );
    public static final SuppliedItem REMNANT_SPEAR = ITEMS.register("remnant_spear",
            Item::new,
            () -> new Properties()
                    .spear(ERToolMaterials.REMNANT, 1.15F, 1.2F, 0.4F, 2.5F, 7.0F, 5.5F, 5.1F, 8.75F, 4.6F)
                    .delayedComponent(DataComponents.DAMAGE_RESISTANT, provider -> new DamageResistant(provider.getOrThrow(DamageTypeTags.IS_EXPLOSION)))
    );

    public static final SuppliedItem FEATHERZEAL_SWORD = ITEMS.register("featherzeal_sword",
            Item::new,
            () -> new Properties()
                    .sword(ERToolMaterials.FEATHERZEAL, 3f, -2.4f)
    );
    public static final SuppliedItem FEATHERZEAL_PICKAXE = ITEMS.register("featherzeal_pickaxe",
            Item::new,
            () -> new Properties()
                    .pickaxe(ERToolMaterials.FEATHERZEAL, 1f, -2.8f)
    );
    public static final SuppliedItem FEATHERZEAL_AXE = ITEMS.register("featherzeal_axe",
            (properties) -> new AxeItem(ERToolMaterials.FEATHERZEAL, 5f, -3.0f, properties), (
                    Properties::new
            )
    );
    public static final SuppliedItem FEATHERZEAL_SHOVEL = ITEMS.register("featherzeal_shovel",
            (properties) -> new ShovelItem(ERToolMaterials.FEATHERZEAL, 1.5f, -3f, properties), (
                    Properties::new
            )
    );
    public static final SuppliedItem FEATHERZEAL_HOE = ITEMS.register("featherzeal_hoe",
            (properties) -> new HoeItem(ERToolMaterials.FEATHERZEAL, -3f, 0f, properties), (
                    Properties::new
            )
    );
    public static final SuppliedItem FEATHERZEAL_SPEAR = ITEMS.register("featherzeal_spear",
            Item::new,
            () -> new Properties()
                    .spear(ERToolMaterials.FEATHERZEAL, 1.15F, 1.2F, 0.4F, 2.5F, 7.0F, 5.5F, 5.1F, 8.75F, 4.6F)
    );

    // Armor
    public static final SuppliedItem REMNANT_HELMET = ITEMS.register("remnant_helmet",
            Item::new,
            () -> new Properties()
                    .humanoidArmor(ERArmorMaterials.REMNANT, ArmorType.HELMET)
                    .attributes(ERArmorMaterials.createHelmetAttributes(ERAttributes.Type.MAGIC_RESISTANCE))
                    .delayedComponent(DataComponents.DAMAGE_RESISTANT, provider -> new DamageResistant(provider.getOrThrow(DamageTypeTags.IS_EXPLOSION)))
    );
    public static final SuppliedItem REMNANT_CHESTPLATE = ITEMS.register("remnant_chestplate",
            Item::new,
            () -> new Properties()
                    .humanoidArmor(ERArmorMaterials.REMNANT, ArmorType.CHESTPLATE)
                    .attributes(ERArmorMaterials.createChestplateAttributes(ERAttributes.Type.MAGIC_RESISTANCE))
                    .delayedComponent(DataComponents.DAMAGE_RESISTANT, provider -> new DamageResistant(provider.getOrThrow(DamageTypeTags.IS_EXPLOSION)))
    );
    public static final SuppliedItem REMNANT_LEGGINGS = ITEMS.register("remnant_leggings",
            Item::new,
            () -> new Properties()
                    .humanoidArmor(ERArmorMaterials.REMNANT, ArmorType.LEGGINGS)
                    .attributes(ERArmorMaterials.createLeggingsAttributes(ERAttributes.Type.MAGIC_RESISTANCE))
                    .delayedComponent(DataComponents.DAMAGE_RESISTANT, provider -> new DamageResistant(provider.getOrThrow(DamageTypeTags.IS_EXPLOSION)))
    );
    public static final SuppliedItem REMNANT_BOOTS = ITEMS.register("remnant_boots",
            Item::new,
            () -> new Properties()
                    .humanoidArmor(ERArmorMaterials.REMNANT, ArmorType.BOOTS)
                    .attributes(ERArmorMaterials.createBootsAttributes(ERAttributes.Type.MAGIC_RESISTANCE))
                    .delayedComponent(DataComponents.DAMAGE_RESISTANT, provider -> new DamageResistant(provider.getOrThrow(DamageTypeTags.IS_EXPLOSION)))
    );
    public static final SuppliedItem REMNANT_HORSE_ARMOR = ITEMS.register("remnant_horse_armor",
            Item::new,
            () -> new Properties()
                    .horseArmor(ERArmorMaterials.REMNANT)
                    .attributes(ERArmorMaterials.createAnimalArmorAttributes(ERAttributes.Type.MAGIC_RESISTANCE))
                    .delayedComponent(DataComponents.DAMAGE_RESISTANT, provider -> new DamageResistant(provider.getOrThrow(DamageTypeTags.IS_EXPLOSION)))
    );
    public static final SuppliedItem REMNANT_NAUTILUS_ARMOR = ITEMS.register("remnant_nautilus_armor",
            Item::new,
            () -> new Properties()
                    .nautilusArmor(ERArmorMaterials.REMNANT)
                    .attributes(ERArmorMaterials.createAnimalArmorAttributes(ERAttributes.Type.MAGIC_RESISTANCE))
                    .delayedComponent(DataComponents.DAMAGE_RESISTANT, provider -> new DamageResistant(provider.getOrThrow(DamageTypeTags.IS_EXPLOSION)))
    );

    public static final SuppliedItem FEATHERZEAL_HELMET = ITEMS.register("featherzeal_helmet",
            Item::new,
            () -> new Properties()
                    .humanoidArmor(ERArmorMaterials.FEATHERZEAL, ArmorType.HELMET)
                    .attributes(ERArmorMaterials.createHelmetAttributes(ERAttributes.Type.FALL_RESISTANCE))
    );
    public static final SuppliedItem FEATHERZEAL_CHESTPLATE = ITEMS.register("featherzeal_chestplate",
            Item::new,
            () -> new Properties()
                    .humanoidArmor(ERArmorMaterials.FEATHERZEAL, ArmorType.CHESTPLATE)
                    .attributes(ERArmorMaterials.createChestplateAttributes(ERAttributes.Type.FALL_RESISTANCE))
    );
    public static final SuppliedItem FEATHERZEAL_LEGGINGS = ITEMS.register("featherzeal_leggings",
            Item::new,
            () -> new Properties()
                    .humanoidArmor(ERArmorMaterials.FEATHERZEAL, ArmorType.LEGGINGS)
                    .attributes(ERArmorMaterials.createLeggingsAttributes(ERAttributes.Type.FALL_RESISTANCE))
    );
    public static final SuppliedItem FEATHERZEAL_BOOTS = ITEMS.register("featherzeal_boots",
            Item::new,
            () -> new Properties()
                    .humanoidArmor(ERArmorMaterials.FEATHERZEAL, ArmorType.BOOTS)
                    .attributes(ERArmorMaterials.createBootsAttributes(ERAttributes.Type.FALL_RESISTANCE))
    );
    public static final SuppliedItem FEATHERZEAL_HORSE_ARMOR = ITEMS.register("featherzeal_horse_armor",
            Item::new,
            () -> new Properties()
                    .horseArmor(ERArmorMaterials.FEATHERZEAL)
                    .attributes(ERArmorMaterials.createAnimalArmorAttributes(ERAttributes.Type.FALL_RESISTANCE))
    );
    public static final SuppliedItem FEATHERZEAL_NAUTILUS_ARMOR = ITEMS.register("featherzeal_nautilus_armor",
            Item::new,
            () -> new Properties()
                    .nautilusArmor(ERArmorMaterials.FEATHERZEAL)
                    .attributes(ERArmorMaterials.createAnimalArmorAttributes(ERAttributes.Type.FALL_RESISTANCE))
    );

    public static SuppliedItem REMNANT_KNIFE;

    public static SuppliedItem FEATHERZEAL_KNIFE;

    public static void init() {}

    public static SmithingTemplateItem createRemnantUpgradeTemplate(Properties properties) {
        return new SmithingTemplateItem(
                Component.translatable(Util.makeDescriptionId("item", EndReborn.id("smithing_template.remnant_upgrade.applies_to"))).withStyle(ChatFormatting.BLUE),
                Component.translatable(Util.makeDescriptionId("item", EndReborn.id("smithing_template.remnant_upgrade.ingredients"))).withStyle(ChatFormatting.BLUE),
                Component.translatable(Util.makeDescriptionId("item", EndReborn.id("smithing_template.remnant_upgrade.base_slot_description"))),
                Component.translatable(Util.makeDescriptionId("item", EndReborn.id("smithing_template.remnant_upgrade.additions_slot_description"))),
                SmithingTemplateItem.createNetheriteUpgradeIconList(),
                SmithingTemplateItem.createNetheriteUpgradeMaterialList(),
                properties
        );
    }

    public static SmithingTemplateItem createFeatherzealUpgradeTemplate(Properties properties) {
        return new SmithingTemplateItem(
                Component.translatable(Util.makeDescriptionId("item", EndReborn.id("smithing_template.featherzeal_upgrade.applies_to"))).withStyle(ChatFormatting.BLUE),
                Component.translatable(Util.makeDescriptionId("item", EndReborn.id("smithing_template.featherzeal_upgrade.ingredients"))).withStyle(ChatFormatting.BLUE),
                Component.translatable(Util.makeDescriptionId("item", EndReborn.id("smithing_template.featherzeal_upgrade.base_slot_description"))),
                Component.translatable(Util.makeDescriptionId("item", EndReborn.id("smithing_template.featherzeal_upgrade.additions_slot_description"))),
                SmithingTemplateItem.createNetheriteUpgradeIconList(),
                SmithingTemplateItem.createNetheriteUpgradeMaterialList(),
                properties
        );
    }
}
