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
    public static final SwordItem COPPER_SWORD = register("copper_sword", settings -> new SwordItem(ERToolMaterial.COPPER, 3f, -2.4f, settings
            .stacksTo(1)
            .durability(190)
    ));
    public static final PickaxeItem COPPER_PICKAXE = register("copper_pickaxe", settings -> new PickaxeItem(ERToolMaterial.COPPER, 1f, -2.8f, settings
            .stacksTo(1)
            .durability(190)
    ));
    public static final AxeItem COPPER_AXE = register("copper_axe", settings -> new AxeItem(ERToolMaterial.COPPER, 6f, -3.1f, settings
            .stacksTo(1)
            .durability(190)
    ));
    public static final ShovelItem COPPER_SHOVEL = register("copper_shovel", settings -> new ShovelItem(ERToolMaterial.COPPER, 1.5f, -3f, settings
            .stacksTo(1)
            .durability(190)
    ));
    public static final HoeItem COPPER_HOE = register("copper_hoe", settings -> new HoeItem(ERToolMaterial.COPPER, -2f, -1f, settings
            .stacksTo(1)
            .durability(190)
    ));

    public static final SwordItem ROSE_SWORD = register("rose_sword", settings -> new SwordItem(ERToolMaterial.ROSE, 3f, -2.4f, settings
            .stacksTo(1)
            .durability(281)
            .fireResistant()
    ));
    public static final PickaxeItem ROSE_PICKAXE = register("rose_pickaxe", settings -> new PickaxeItem(ERToolMaterial.ROSE, 1f, -2.8f, settings
            .stacksTo(1)
            .durability(281)
            .fireResistant()
    ));
    public static final AxeItem ROSE_AXE = register("rose_axe", settings -> new AxeItem(ERToolMaterial.ROSE, 6f, -3.1f, settings
            .stacksTo(1)
            .durability(281)
            .fireResistant()
    ));
    public static final ShovelItem ROSE_SHOVEL = register("rose_shovel", settings -> new ShovelItem(ERToolMaterial.ROSE, 1.5f, -3f, settings
            .stacksTo(1)
            .durability(281)
            .fireResistant()
    ));
    public static final HoeItem ROSE_HOE = register("rose_hoe", settings -> new HoeItem(ERToolMaterial.ROSE, -2f, -1f, settings
            .stacksTo(1)
            .durability(281)
            .fireResistant()
    ));

    // Armor
    public static final ArmorItem COPPER_HELMET = register("copper_helmet", settings -> new ArmorItem(ERArmorMaterials.COPPER, ArmorType.HELMET, settings
            .stacksTo(1)
    ));
    public static final ArmorItem COPPER_CHESTPLATE = register("copper_chestplate", settings -> new ArmorItem(ERArmorMaterials.COPPER, ArmorType.CHESTPLATE, settings
            .stacksTo(1)
    ));
    public static final ArmorItem COPPER_LEGGINGS = register("copper_leggings", settings -> new ArmorItem(ERArmorMaterials.COPPER, ArmorType.LEGGINGS, settings
            .stacksTo(1)
    ));
    public static final ArmorItem COPPER_BOOTS = register("copper_boots", settings -> new ArmorItem(ERArmorMaterials.COPPER, ArmorType.BOOTS, settings
            .stacksTo(1)
    ));
    public static final AnimalArmorItem COPPER_HORSE_ARMOR = register("copper_horse_armor", settings -> new AnimalArmorItem(ERArmorMaterials.COPPER, AnimalArmorItem.BodyType.EQUESTRIAN, SoundEvents.HORSE_ARMOR, false, settings
            .stacksTo(1)
    ));

    public static final ArmorItem ROSE_HELMET = register("rose_helmet", settings -> new ArmorItem(ERArmorMaterials.ROSE, ArmorType.HELMET, settings
            .stacksTo(1)
            .fireResistant()
    ));
    public static final ArmorItem ROSE_CHESTPLATE = register("rose_chestplate", settings -> new ArmorItem(ERArmorMaterials.ROSE, ArmorType.CHESTPLATE, settings
            .stacksTo(1)
            .fireResistant()
    ));
    public static final ArmorItem ROSE_LEGGINGS = register("rose_leggings", settings -> new ArmorItem(ERArmorMaterials.ROSE, ArmorType.LEGGINGS, settings
            .stacksTo(1)
            .fireResistant()
    ));
    public static final ArmorItem ROSE_BOOTS = register("rose_boots", settings -> new ArmorItem(ERArmorMaterials.ROSE, ArmorType.BOOTS, settings
            .stacksTo(1)
            .fireResistant()
    ));
    public static final AnimalArmorItem ROSE_HORSE_ARMOR = register("rose_horse_armor", settings -> new AnimalArmorItem(ERArmorMaterials.ROSE, AnimalArmorItem.BodyType.EQUESTRIAN, SoundEvents.HORSE_ARMOR, false, settings
            .stacksTo(1)
            .fireResistant()
    ));

    public static final AnimalArmorItem NETHERITE_HORSE_ARMOR = register("netherite_horse_armor", settings -> new AnimalArmorItem(ArmorMaterials.NETHERITE, AnimalArmorItem.BodyType.EQUESTRIAN, SoundEvents.HORSE_ARMOR, false, settings
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
