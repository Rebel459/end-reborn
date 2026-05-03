package net.rebel459.end_reborn.registry;

import net.rebel459.end_reborn.EndReborn;
import net.minecraft.resources.Identifier;
import net.rebel459.unified.platform.UnifiedPlatform;

public class ERRegistryAliases {

    public static void init() {
        if (UnifiedPlatform.isModLoaded("farmersdelight")) {
            ERItems.ITEMS.addAlias(Identifier.fromNamespaceAndPath("farmersknives", "remnant_knife"), EndReborn.id("remnant_knife"));
            ERItems.ITEMS.addAlias(Identifier.fromNamespaceAndPath("farmersknives", "featherzeal_knife"), EndReborn.id("featherzeal_knife"));
        }
    }

    private static void rename(String oldName, String newName) {
        ERItems.ITEMS.addAlias(EndReborn.id(oldName), EndReborn.id(newName));
    }
}