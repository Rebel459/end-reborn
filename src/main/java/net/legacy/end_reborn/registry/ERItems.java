package net.legacy.end_reborn.registry;

import net.legacy.end_reborn.EndReborn;
import net.minecraft.ChatFormatting;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.util.Util;
import net.minecraft.world.item.*;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.component.DamageResistant;
import net.minecraft.world.item.equipment.ArmorType;
import org.jetbrains.annotations.NotNull;

import java.util.function.Function;

import static net.minecraft.world.item.Items.registerBlock;

public final class ERItems {

    // Items
    public static final Item REMNANT_INGOT = register("remnant_ingot",
            Item::new,
            new Properties()
                    .stacksTo(64)
                    .trimMaterial(ERTrimMaterials.REMNANT)
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
                    .trimMaterial(ERTrimMaterials.FEATHERZEAL)
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

    // Entity Items
    public static final BoatItem CHORUS_RAFT = register("chorus_raft",
            properties -> new BoatItem(EREntityTypes.CHORUS_RAFT, properties),
            new Item.Properties()
    );
    public static final BoatItem CHORUS_CHEST_RAFT = register("chorus_chest_raft",
            properties -> new BoatItem(EREntityTypes.CHORUS_CHEST_RAFT, properties),
            new Item.Properties()
    );

    // Block Items
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

    // Tools
    public static final Item REMNANT_SWORD = register("remnant_sword",
            Item::new,
            new Properties()
                    .sword(ERToolMaterial.REMNANT, 3f, -2.4f)
                    .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );
    public static final Item REMNANT_PICKAXE = register("remnant_pickaxe",
            Item::new,
            new Properties()
                    .pickaxe(ERToolMaterial.REMNANT, 1f, -2.8f)
                    .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );
    public static final AxeItem REMNANT_AXE = register("remnant_axe",
            (properties) -> new AxeItem(ERToolMaterial.REMNANT, 5f, -3.0f, properties), (
                    new Properties()
                            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
            )
    );
    public static final ShovelItem REMNANT_SHOVEL = register("remnant_shovel",
            (properties) -> new ShovelItem(ERToolMaterial.REMNANT, 1.5f, -3f, properties), (
                    new Properties()
                            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
            )
    );
    public static final HoeItem REMNANT_HOE = register("remnant_hoe",
            (properties) -> new HoeItem(ERToolMaterial.REMNANT, -2f, -1f, properties), (
                    new Properties()
                            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
            )
    );
    public static final Item REMNANT_SPEAR = register("remnant_spear",
            Item::new,
            new Properties()
                    .spear(ERToolMaterial.REMNANT, 1.15F, 1.2F, 0.4F, 2.5F, 7.0F, 5.5F, 5.1F, 8.75F, 4.6F)
                    .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );

    public static final Item FEATHERZEAL_SWORD = register("featherzeal_sword",
            Item::new,
            new Properties()
                    .sword(ERToolMaterial.FEATHERZEAL, 3f, -2.4f)
    );
    public static final Item FEATHERZEAL_PICKAXE = register("featherzeal_pickaxe",
            Item::new,
            new Properties()
                    .pickaxe(ERToolMaterial.FEATHERZEAL, 1f, -2.8f)
    );
    public static final AxeItem FEATHERZEAL_AXE = register("featherzeal_axe",
            (properties) -> new AxeItem(ERToolMaterial.FEATHERZEAL, 5f, -3.0f, properties), (
                    new Properties()
            )
    );
    public static final ShovelItem FEATHERZEAL_SHOVEL = register("featherzeal_shovel",
            (properties) -> new ShovelItem(ERToolMaterial.FEATHERZEAL, 1.5f, -3f, properties), (
                    new Properties()
            )
    );
    public static final HoeItem FEATHERZEAL_HOE = register("featherzeal_hoe",
            (properties) -> new HoeItem(ERToolMaterial.FEATHERZEAL, -2f, -1f, properties), (
                    new Properties()
            )
    );
    public static final Item FEATHERZEAL_SPEAR = register("featherzeal_spear",
            Item::new,
            new Properties()
                    .spear(ERToolMaterial.FEATHERZEAL, 1.15F, 1.2F, 0.4F, 2.5F, 7.0F, 5.5F, 5.1F, 8.75F, 4.6F)
                    .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );

    // Armor
    public static final Item REMNANT_HELMET = register("remnant_helmet",
            Item::new,
            new Properties()
                    .humanoidArmor(ERArmorMaterials.REMNANT, ArmorType.HELMET)
                    .attributes(ERArmorMaterials.createRemnantHelmetAttributes())
                    .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );
    public static final Item REMNANT_CHESTPLATE = register("remnant_chestplate",
            Item::new,
            new Properties()
                    .humanoidArmor(ERArmorMaterials.REMNANT, ArmorType.CHESTPLATE)
                    .attributes(ERArmorMaterials.createRemnantChestplateAttributes())
                    .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );
    public static final Item REMNANT_LEGGINGS = register("remnant_leggings",
            Item::new,
            new Properties()
                    .humanoidArmor(ERArmorMaterials.REMNANT, ArmorType.LEGGINGS)
                    .attributes(ERArmorMaterials.createRemnantLeggingsAttributes())
                    .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );
    public static final Item REMNANT_BOOTS = register("remnant_boots",
            Item::new,
            new Properties()
                    .humanoidArmor(ERArmorMaterials.REMNANT, ArmorType.BOOTS)
                    .attributes(ERArmorMaterials.createRemnantBootsAttributes())
                    .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );
    public static final Item REMNANT_HORSE_ARMOR = register("remnant_horse_armor",
            Item::new,
            new Properties()
                    .horseArmor(ERArmorMaterials.REMNANT)
                    .attributes(ERArmorMaterials.createRemnantAnimalArmorAttributes())
                    .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );
    public static final Item REMNANT_NAUTILUS_ARMOR = register("remnant_nautilus_armor",
            Item::new,
            new Properties()
                    .nautilusArmor(ERArmorMaterials.REMNANT)
                    .attributes(ERArmorMaterials.createRemnantAnimalArmorAttributes())
                    .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );

    public static final Item FEATHERZEAL_HELMET = register("featherzeal_helmet",
            Item::new,
            new Properties()
                    .humanoidArmor(ERArmorMaterials.FEATHERZEAL, ArmorType.HELMET)
                    .attributes(ERArmorMaterials.createFeatherzealHelmetAttributes())
                    .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );
    public static final Item FEATHERZEAL_CHESTPLATE = register("featherzeal_chestplate",
            Item::new,
            new Properties()
                    .humanoidArmor(ERArmorMaterials.FEATHERZEAL, ArmorType.CHESTPLATE)
                    .attributes(ERArmorMaterials.createFeatherzealChestplateAttributes())
                    .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );
    public static final Item FEATHERZEAL_LEGGINGS = register("featherzeal_leggings",
            Item::new,
            new Properties()
                    .humanoidArmor(ERArmorMaterials.FEATHERZEAL, ArmorType.LEGGINGS)
                    .attributes(ERArmorMaterials.createFeatherzealLeggingsAttributes())
                    .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );
    public static final Item FEATHERZEAL_BOOTS = register("featherzeal_boots",
            Item::new,
            new Properties()
                    .humanoidArmor(ERArmorMaterials.FEATHERZEAL, ArmorType.BOOTS)
                    .attributes(ERArmorMaterials.createFeatherzealBootsAttributes())
                    .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );
    public static final Item FEATHERZEAL_HORSE_ARMOR = register("featherzeal_horse_armor",
            Item::new,
            new Properties()
                    .horseArmor(ERArmorMaterials.FEATHERZEAL)
                    .attributes(ERArmorMaterials.createFeatherzealAnimalArmorAttributes())
                    .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );
    public static final Item FEATHERZEAL_NAUTILUS_ARMOR = register("featherzeal_nautilus_armor",
            Item::new,
            new Properties()
                    .nautilusArmor(ERArmorMaterials.FEATHERZEAL)
                    .attributes(ERArmorMaterials.createFeatherzealAnimalArmorAttributes())
                    .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );

    public static void init() {
    }

    private static @NotNull <T extends Item> T register(String name, @NotNull Function<Properties, Item> function, Item.@NotNull Properties properties) {
        return (T) Items.registerItem(ResourceKey.create(Registries.ITEM, EndReborn.id(name)), function, properties);
    }

    public static SmithingTemplateItem createRemnantUpgradeTemplate(Item.Properties properties) {
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

    public static SmithingTemplateItem createFeatherzealUpgradeTemplate(Item.Properties properties) {
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
