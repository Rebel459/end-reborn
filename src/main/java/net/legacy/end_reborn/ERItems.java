package net.legacy.end_reborn;

import net.frozenblock.lib.shadow.org.jetbrains.annotations.NotNull;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item.Properties;

import java.util.function.Function;

import static net.minecraft.world.item.Items.registerBlock;

public final class ERItems {

    // Items
    public static final Item REMNANT_INGOT = register("remnant_ingot",
            Item::new,
            new Properties()
                    .stacksTo(64)
    );
    public static final Item REMNANT_SCRAP = register("remnant_scrap",
            Item::new,
            new Properties()
                    .stacksTo(64)
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
    public static final SmithingTemplateItem REMNANT_UPGRADE_SMITHING_TEMPLATE = register("remnant_upgrade_smithing_template",
            ERItems::createRemnantUpgradeTemplate,
            new Properties()
                    .stacksTo(64)
                    .rarity(Rarity.UNCOMMON)
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

    public static final Item CHORUS_SIGN = registerBlock(ERBlocks.CHORUS_SIGN,
            (block, properties) -> new SignItem(block, ERBlocks.CHORUS_WALL_SIGN, properties),
            new Item.Properties().stacksTo(16)
    );
    public static final Item CHORUS_HANGING_SIGN = registerBlock(ERBlocks.CHORUS_HANGING_SIGN,
            (block, properties) -> new HangingSignItem(block, ERBlocks.CHORUS_WALL_HANGING_SIGN, properties),
            new Item.Properties().stacksTo(16)
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
}
