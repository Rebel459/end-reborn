package net.legacy.end_reborn.registry;

import net.legacy.end_reborn.ERConstants;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.item.*;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.component.DamageResistant;
import org.jetbrains.annotations.NotNull;

import java.util.function.Function;

import static net.minecraft.world.item.Items.registerItem;

public final class EREquipmentItems {

    // Tools
    public static final Item REMNANT_SWORD = register("remnant_sword", settings -> new Item(settings
            .stacksTo(1)
            .sword(ERToolMaterial.REMNANT, 3f, -2.4f)
            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    ));
    public static final Item REMNANT_PICKAXE = register("remnant_pickaxe", settings -> new Item(settings
            .stacksTo(1)
            .pickaxe(ERToolMaterial.REMNANT, 1f, -2.8f)
            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    ));
    public static final AxeItem REMNANT_AXE = register("remnant_axe", settings -> new AxeItem(ERToolMaterial.REMNANT, 5f, -3.0f, settings
            .stacksTo(1)
            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    ));
    public static final ShovelItem REMNANT_SHOVEL = register("remnant_shovel", settings -> new ShovelItem(ERToolMaterial.REMNANT, 1.5f, -3f, settings
            .stacksTo(1)
            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    ));
    public static final HoeItem REMNANT_HOE = register("remnant_hoe", settings -> new HoeItem(ERToolMaterial.REMNANT, -2f, -1f, settings
            .stacksTo(1)
            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    ));

    public static final Item FEATHERZEAL_SWORD = register("featherzeal_sword", settings -> new Item(settings
            .stacksTo(1)
            .sword(ERToolMaterial.FEATHERZEAL, 3f, -2.4f)
    ));
    public static final Item FEATHERZEAL_PICKAXE = register("featherzeal_pickaxe", settings -> new Item(settings
            .stacksTo(1)
            .pickaxe(ERToolMaterial.FEATHERZEAL, 1f, -2.8f)
    ));
    public static final AxeItem FEATHERZEAL_AXE = register("featherzeal_axe", settings -> new AxeItem(ERToolMaterial.FEATHERZEAL, 5f, -3.0f, settings
            .stacksTo(1)
    ));
    public static final ShovelItem FEATHERZEAL_SHOVEL = register("featherzeal_shovel", settings -> new ShovelItem(ERToolMaterial.FEATHERZEAL, 1.5f, -3f, settings
            .stacksTo(1)
    ));
    public static final HoeItem FEATHERZEAL_HOE = register("featherzeal_hoe", settings -> new HoeItem(ERToolMaterial.FEATHERZEAL, -2f, -1f, settings
            .stacksTo(1)
    ));

    public static void init() {
    }

    private static @NotNull <T extends Item> T register(String name, @NotNull Function<Properties, Item> function) {
        return (T) Items.registerItem(ResourceKey.create(Registries.ITEM, ERConstants.id(name)), function);
    }

    private static Item register (String name) {
        return register(name, Item::new);
    }
}
