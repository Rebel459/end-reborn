package net.legacy.end_reborn;

import net.frozenblock.lib.shadow.org.jetbrains.annotations.NotNull;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorMaterials;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item.Properties;

import java.util.function.Function;

public final class ERGearItems {

    // Tools
    public static final SwordItem REMNANT_SWORD = register("remnant_sword", settings -> new SwordItem(ERToolMaterial.REMNANT, 3f, -2.4f, settings
            .stacksTo(1)
            .fireResistant()
    ));
    public static final PickaxeItem REMNANT_PICKAXE = register("remnant_pickaxe", settings -> new PickaxeItem(ERToolMaterial.REMNANT, 1f, -2.8f, settings
            .stacksTo(1)
            .fireResistant()
    ));
    public static final AxeItem REMNANT_AXE = register("remnant_axe", settings -> new AxeItem(ERToolMaterial.REMNANT, 6f, -3.1f, settings
            .stacksTo(1)
            .fireResistant()
    ));
    public static final ShovelItem REMNANT_SHOVEL = register("remnant_shovel", settings -> new ShovelItem(ERToolMaterial.REMNANT, 1.5f, -3f, settings
            .stacksTo(1)
            .fireResistant()
    ));
    public static final HoeItem REMNANT_HOE = register("remnant_hoe", settings -> new HoeItem(ERToolMaterial.REMNANT, -2f, -1f, settings
            .stacksTo(1)
            .fireResistant()
    ));

    // Armor
    public static final ArmorItem REMNANT_HELMET = register("remnant_helmet", settings -> new ArmorItem(ERArmorMaterials.REMNANT, ArmorType.HELMET, settings
            .stacksTo(1)
            .fireResistant()
    ));
    public static final ArmorItem REMNANT_CHESTPLATE = register("remnant_chestplate", settings -> new ArmorItem(ERArmorMaterials.REMNANT, ArmorType.CHESTPLATE, settings
            .stacksTo(1)
            .fireResistant()
    ));
    public static final ArmorItem REMNANT_LEGGINGS = register("remnant_leggings", settings -> new ArmorItem(ERArmorMaterials.REMNANT, ArmorType.LEGGINGS, settings
            .stacksTo(1)
            .fireResistant()
    ));
    public static final ArmorItem REMNANT_BOOTS = register("remnant_boots", settings -> new ArmorItem(ERArmorMaterials.REMNANT, ArmorType.BOOTS, settings
            .stacksTo(1)
            .fireResistant()
    ));

    public static final AnimalArmorItem REMNANT_HORSE_ARMOR = register("remnant_horse_armor", settings -> new AnimalArmorItem(ERArmorMaterials.REMNANT, AnimalArmorItem.BodyType.EQUESTRIAN, SoundEvents.HORSE_ARMOR, false, settings
            .stacksTo(1)
            .fireResistant()
    ));

    public static void init() {
    }

    private static @NotNull <T extends Item> T register(String name, @NotNull Function<Properties, Item> function) {
        return (T) Items.registerItem(ResourceKey.create(Registries.ITEM, ERConstants.id(name)), function);
    }

    private static Item register (String name) {
        return register(name, Item::new);
    }

    public static Function<Properties, Item> createBlockItemWithCustomItemName(Block block) {
        return properties -> new BlockItem(block, properties.useItemDescriptionPrefix());
    }

}
