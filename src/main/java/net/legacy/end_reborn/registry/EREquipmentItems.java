package net.legacy.end_reborn.registry;

import net.legacy.end_reborn.ERConstants;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.DamageResistant;
import org.jetbrains.annotations.NotNull;

public final class EREquipmentItems {

    // Tools
    public static final Item REMNANT_SWORD = register("remnant_sword", new Properties().sword(ERToolMaterial.REMNANT, 3f, -2.4f)
            .stacksTo(1)
            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );
    public static final Item REMNANT_PICKAXE = register("remnant_pickaxe", new Properties().pickaxe(ERToolMaterial.REMNANT, 1f, -2.8f)
            .stacksTo(1)
            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );
    public static final Item REMNANT_AXE = register("remnant_axe", new Properties().axe(ERToolMaterial.REMNANT, 5f, -3.0f)
            .stacksTo(1)
            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );
    public static final Item REMNANT_SHOVEL = register("remnant_shovel", new Properties().shovel(ERToolMaterial.REMNANT, 1.5f, -3f)
            .stacksTo(1)
            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );
    public static final Item REMNANT_HOE = register("remnant_hoe", new Properties().hoe(ERToolMaterial.REMNANT, -2f, -1f)
            .stacksTo(1)
            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
    );

    public static final Item FEATHERZEAL_SWORD = register("featherzeal_sword", new Properties().sword(ERToolMaterial.FEATHERZEAL, 3f, -2.4f)
            .stacksTo(1)
    );
    public static final Item FEATHERZEAL_PICKAXE = register("featherzeal_pickaxe", new Properties().pickaxe(ERToolMaterial.FEATHERZEAL, 1f, -2.8f)
            .stacksTo(1)
    );
    public static final Item FEATHERZEAL_AXE = register("featherzeal_axe", new Properties().axe(ERToolMaterial.FEATHERZEAL, 5f, -3.0f)
            .stacksTo(1)
    );
    public static final Item FEATHERZEAL_SHOVEL = register("featherzeal_shovel", new Properties().shovel(ERToolMaterial.FEATHERZEAL, 1.5f, -3f)
            .stacksTo(1)
    );
    public static final Item FEATHERZEAL_HOE = register("featherzeal_hoe", new Properties().hoe(ERToolMaterial.FEATHERZEAL, -2f, -1f)
            .stacksTo(1)
    );

    public static void init() {
    }

    private static @NotNull Item register(String name, @NotNull Properties properties) {
        return Items.registerItem(ResourceKey.create(Registries.ITEM, ERConstants.id(name)), Item::new, properties);
    }

}
