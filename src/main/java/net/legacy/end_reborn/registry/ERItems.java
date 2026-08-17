package net.legacy.end_reborn.registry;

import net.legacy.end_reborn.ERConstants;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.AnimalArmorItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.SmithingTemplateItem;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.legacy.end_reborn.item.ERBoatItem;
import net.legacy.end_reborn.entity.ChorusChestRaft;
import net.legacy.end_reborn.entity.ChorusRaft;
import org.jetbrains.annotations.NotNull;

import java.util.function.Function;

public final class ERItems {

    // Items
    public static final Item REMNANT_INGOT = register("remnant_ingot",
            Item::new,
            new Item.Properties()
                    .stacksTo(64)
                    .fireResistant()
    );
    public static final Item REMNANT_SCRAP = register("remnant_scrap",
            Item::new,
            new Item.Properties()
                    .stacksTo(64)
                    .fireResistant()
    );
    public static final SmithingTemplateItem REMNANT_UPGRADE_SMITHING_TEMPLATE = register("remnant_upgrade_smithing_template",
            ERItems::createRemnantUpgradeTemplate,
            new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
    );
    public static final Item FEATHERZEAL_INGOT = register("featherzeal_ingot",
            Item::new,
            new Item.Properties()
                    .stacksTo(64)
    );
    public static final Item FEATHERZEAL_SCRAP = register("featherzeal_scrap",
            Item::new,
            new Item.Properties()
                    .stacksTo(64)
    );
    public static final SmithingTemplateItem FEATHERZEAL_UPGRADE_SMITHING_TEMPLATE = register("featherzeal_upgrade_smithing_template",
            ERItems::createFeatherzealUpgradeTemplate,
            new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
    );
    public static final Item CHORUS_SPINE = register("chorus_spine",
            Item::new,
            new Item.Properties()
                    .stacksTo(64)
    );
    public static final Item CRYSTALLINE_SHARD = register("crystalline_shard",
            Item::new,
            new Item.Properties()
                    .stacksTo(64)
    );

    // Boats
    public static final Item CHORUS_RAFT = register("chorus_raft",
            properties -> new ERBoatItem((level, pos) -> createBoat(EREntityTypes.CHORUS_RAFT, level, pos), properties),
            new Item.Properties()
                    .stacksTo(1)
    );
    public static final Item CHORUS_CHEST_RAFT = register("chorus_chest_raft",
            properties -> new ERBoatItem((level, pos) -> createBoat(EREntityTypes.CHORUS_CHEST_RAFT, level, pos), properties),
            new Item.Properties()
                    .stacksTo(1)
    );

    // Signs
    public static final Item CHORUS_SIGN = register("chorus_sign",
            properties -> new SignItem(properties, ERBlocks.CHORUS_SIGN, ERBlocks.CHORUS_WALL_SIGN),
            new Item.Properties()
                    .stacksTo(16)
    );
    public static final Item CHORUS_HANGING_SIGN = register("chorus_hanging_sign",
            properties -> new HangingSignItem(ERBlocks.CHORUS_HANGING_SIGN, ERBlocks.CHORUS_WALL_HANGING_SIGN, properties),
            new Item.Properties()
                    .stacksTo(16)
    );

    // Block Items
    public static final Item REMNANT_BLOCK = registerBlockItem("remnant_block",
            ERBlocks.REMNANT_BLOCK,
            new Item.Properties()
                    .fireResistant()
    );
    public static final Item FORGOTTEN_REMAINS = registerBlockItem("forgotten_remains",
            ERBlocks.FORGOTTEN_REMAINS,
            new Item.Properties()
                    .fireResistant()
    );

    // Armor
    public static final Item REMNANT_HELMET = register("remnant_helmet",
            properties -> new ArmorItem(ERArmorMaterials.REMNANT, ArmorItem.Type.HELMET, properties),
            new Item.Properties()
                    .stacksTo(1)
                    .fireResistant()
                    .durability(ArmorItem.Type.HELMET.getDurability(ERArmorMaterials.DURABILITY))
                    .attributes(ERArmorMaterials.createRemnantHelmetAttributes())
    );
    public static final Item REMNANT_CHESTPLATE = register("remnant_chestplate",
            properties -> new ArmorItem(ERArmorMaterials.REMNANT, ArmorItem.Type.CHESTPLATE, properties),
            new Item.Properties()
                    .stacksTo(1)
                    .fireResistant()
                    .durability(ArmorItem.Type.CHESTPLATE.getDurability(ERArmorMaterials.DURABILITY))
                    .attributes(ERArmorMaterials.createRemnantChestplateAttributes())
    );
    public static final Item REMNANT_LEGGINGS = register("remnant_leggings",
            properties -> new ArmorItem(ERArmorMaterials.REMNANT, ArmorItem.Type.LEGGINGS, properties),
            new Item.Properties()
                    .stacksTo(1)
                    .fireResistant()
                    .durability(ArmorItem.Type.LEGGINGS.getDurability(ERArmorMaterials.DURABILITY))
                    .attributes(ERArmorMaterials.createRemnantLeggingsAttributes())
    );
    public static final Item REMNANT_BOOTS = register("remnant_boots",
            properties -> new ArmorItem(ERArmorMaterials.REMNANT, ArmorItem.Type.BOOTS, properties),
            new Item.Properties()
                    .stacksTo(1)
                    .fireResistant()
                    .durability(ArmorItem.Type.BOOTS.getDurability(ERArmorMaterials.DURABILITY))
                    .attributes(ERArmorMaterials.createRemnantBootsAttributes())
    );
    public static final Item REMNANT_HORSE_ARMOR = register("remnant_horse_armor",
            properties -> new AnimalArmorItem(ERArmorMaterials.REMNANT, AnimalArmorItem.BodyType.EQUESTRIAN, false, properties),
            new Item.Properties()
                    .stacksTo(1)
                    .fireResistant()
                    .attributes(ERArmorMaterials.createRemnantHorseArmorAttributes())
    );

    public static final Item FEATHERZEAL_HELMET = register("featherzeal_helmet",
            properties -> new ArmorItem(ERArmorMaterials.FEATHERZEAL, ArmorItem.Type.HELMET, properties),
            new Item.Properties()
                    .stacksTo(1)
                    .durability(ArmorItem.Type.HELMET.getDurability(ERArmorMaterials.DURABILITY))
                    .attributes(ERArmorMaterials.createFeatherzealHelmetAttributes())
    );
    public static final Item FEATHERZEAL_CHESTPLATE = register("featherzeal_chestplate",
            properties -> new ArmorItem(ERArmorMaterials.FEATHERZEAL, ArmorItem.Type.CHESTPLATE, properties),
            new Item.Properties()
                    .stacksTo(1)
                    .durability(ArmorItem.Type.CHESTPLATE.getDurability(ERArmorMaterials.DURABILITY))
                    .attributes(ERArmorMaterials.createFeatherzealChestplateAttributes())
    );
    public static final Item FEATHERZEAL_LEGGINGS = register("featherzeal_leggings",
            properties -> new ArmorItem(ERArmorMaterials.FEATHERZEAL, ArmorItem.Type.LEGGINGS, properties),
            new Item.Properties()
                    .stacksTo(1)
                    .durability(ArmorItem.Type.LEGGINGS.getDurability(ERArmorMaterials.DURABILITY))
                    .attributes(ERArmorMaterials.createFeatherzealLeggingsAttributes())
    );
    public static final Item FEATHERZEAL_BOOTS = register("featherzeal_boots",
            properties -> new ArmorItem(ERArmorMaterials.FEATHERZEAL, ArmorItem.Type.BOOTS, properties),
            new Item.Properties()
                    .stacksTo(1)
                    .durability(ArmorItem.Type.BOOTS.getDurability(ERArmorMaterials.DURABILITY))
                    .attributes(ERArmorMaterials.createFeatherzealBootsAttributes())
    );
    public static final Item FEATHERZEAL_HORSE_ARMOR = register("featherzeal_horse_armor",
            properties -> new AnimalArmorItem(ERArmorMaterials.FEATHERZEAL, AnimalArmorItem.BodyType.EQUESTRIAN, false, properties),
            new Item.Properties()
                    .stacksTo(1)
                    .attributes(ERArmorMaterials.createFeatherzealHorseArmorAttributes())
    );

    public static void init() {
    }

    private static Boat createBoat(net.minecraft.world.entity.EntityType<? extends Boat> type, Level level, Vec3 position) {
        Boat boat = type.create(level);
        if (boat == null) {
            throw new IllegalStateException("Unable to create " + type);
        }
        boat.setPos(position);
        return boat;
    }

    private static @NotNull <T extends Item> T register(String name, @NotNull Function<Item.Properties, Item> function, Item.@NotNull Properties properties) {
        return (T) Items.registerItem(ResourceKey.create(Registries.ITEM, ERConstants.id(name)), function.apply(properties));
    }

    private static Item registerBlockItem(String name, net.minecraft.world.level.block.Block block, Item.Properties properties) {
        return Items.registerItem(ResourceKey.create(Registries.ITEM, ERConstants.id(name)), new BlockItem(block, properties));
    }

    public static SmithingTemplateItem createRemnantUpgradeTemplate(Item.Properties properties) {
        return new SmithingTemplateItem(
                Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, "smithing_template.remnant_upgrade.applies_to"))).withStyle(ChatFormatting.BLUE),
                Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, "smithing_template.remnant_upgrade.ingredients"))).withStyle(ChatFormatting.BLUE),
                Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, "remnant_upgrade_smithing_template"))).withStyle(ChatFormatting.GRAY),
                Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, "smithing_template.remnant_upgrade.base_slot_description"))),
                Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, "smithing_template.remnant_upgrade.additions_slot_description"))),
                SmithingTemplateItem.createNetheriteUpgradeIconList(),
                SmithingTemplateItem.createNetheriteUpgradeMaterialList()
        );
    }

    public static SmithingTemplateItem createFeatherzealUpgradeTemplate(Item.Properties properties) {
        return new SmithingTemplateItem(
                Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, "smithing_template.featherzeal_upgrade.applies_to"))).withStyle(ChatFormatting.BLUE),
                Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, "smithing_template.featherzeal_upgrade.ingredients"))).withStyle(ChatFormatting.BLUE),
                Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, "featherzeal_upgrade_smithing_template"))).withStyle(ChatFormatting.GRAY),
                Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, "smithing_template.featherzeal_upgrade.base_slot_description"))),
                Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, "smithing_template.featherzeal_upgrade.additions_slot_description"))),
                SmithingTemplateItem.createNetheriteUpgradeIconList(),
                SmithingTemplateItem.createNetheriteUpgradeMaterialList()
        );
    }
}
