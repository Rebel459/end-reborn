package net.legacy.end_reborn.registry;
import java.util.function.Function;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityType;
import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.legacy.end_reborn.ERConstants;
import net.legacy.end_reborn.sound.ERBlockSounds;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.BlockFamilies;
import net.minecraft.data.BlockFamily;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import org.jetbrains.annotations.NotNull;

public class ERBlocks {
    public static final BlockSetType CHORUS_SET = BlockSetTypeBuilder.copyOf(BlockSetType.BAMBOO).register(ERConstants.id("chorus"));
    public static final WoodType CHORUS_WOOD_TYPE = WoodTypeBuilder.copyOf(WoodType.BAMBOO).register(ERConstants.id("chorus"), CHORUS_SET);

    // End Stone
    public static final Block CRACKED_END_STONE_BRICKS = register("cracked_end_stone_bricks",
            Block::new,
            Properties.ofFullCopy(Blocks.END_STONE_BRICKS)
    );

    public static final Block END_IRON_ORE = register("end_iron_ore",
            Block::new,
            Properties.ofFullCopy(Blocks.END_STONE)
    );

    // Remnant
    public static final Block REMNANT_BLOCK = register("remnant_block",
            Block::new,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GRAY)
                    .requiresCorrectToolForDrops()
                    .strength(50.0F, 1200.0F)
                    .sound(SoundType.NETHERITE_BLOCK)
    );
    public static final Block FORGOTTEN_REMAINS = register("forgotten_remains",
            Block::new,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GRAY)
                    .requiresCorrectToolForDrops()
                    .strength(30.0F, 1200.0F)
                    .sound(SoundType.ANCIENT_DEBRIS)
    );

    // Crystalline
    public static final Block RAW_CRYSTALLINE_BLOCK = register("raw_crystalline_block",
            Block::new,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .requiresCorrectToolForDrops()
                    .strength(3.0F)
                    .lightLevel(blockStatex -> 7)
                    .sound(ERBlockSounds.RAW_CRYSTALLINE_BLOCK)
    );
    public static final Block CRYSTALLINE_BLOCK = register("crystalline_block",
            Block::new,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .requiresCorrectToolForDrops()
                    .strength(3.5F)
                    .lightLevel(blockStatex -> 14)
                    .sound(ERBlockSounds.CRYSTALLINE_BLOCK)
    );
    public static final Block CRYSTALLINE_LAMP = register("crystalline_lamp",
            Block::new,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .requiresCorrectToolForDrops()
                    .strength(3.5F)
                    .lightLevel(blockStatex -> 14)
                    .sound(ERBlockSounds.CRYSTALLINE_BLOCK)
    );
    public static final Block CRYSTALLINE_LANTERN = register("crystalline_lantern",
            LanternBlock::new,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .requiresCorrectToolForDrops()
                    .forceSolidOn()
                    .strength(3.5F)
                    .lightLevel(blockStatex -> 14)
                    .sound(ERBlockSounds.CRYSTALLINE_BLOCK)
                    .noOcclusion()
                    .pushReaction(PushReaction.DESTROY)
    );

    // Purpur and Ametrur
    public static final Block CUT_AMETRUR = register("cut_ametrur",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)
    );
    public static final Block CUT_AMETRUR_PILLAR = register("cut_ametrur_pillar",
            RotatedPillarBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR)
    );
    public static final Block CUT_AMETRUR_STAIRS = register("cut_ametrur_stairs",
            properties -> new StairBlock(CUT_AMETRUR.defaultBlockState(), properties),
            Properties.ofFullCopy(CUT_AMETRUR)
    );
    public static final Block CUT_AMETRUR_SLAB = register("cut_ametrur_slab",
            SlabBlock::new,
            Properties.ofFullCopy(CUT_AMETRUR)
    );

    public static final Block PURPUR = register("purpur",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)
    );
    public static final Block AMETRUR = register("ametrur",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)
    );
    public static final BlockFamily FAMILY_AMETRUR = BlockFamilies.familyBuilder(CUT_AMETRUR)
            .slab(CUT_AMETRUR_SLAB)
            .stairs(CUT_AMETRUR_STAIRS)
            .getFamily();

    // Chorus Woodset
    public static final Block CHORUS_PLANKS = register("chorus_planks",
            Block::new,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_MAGENTA)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.BAMBOO_WOOD)
                    .ignitedByLava()
    );
    public static final Block CHORUS_MOSAIC = register("chorus_mosaic",
            Block::new,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_MAGENTA)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.BAMBOO_WOOD)
                    .ignitedByLava()
    );
    public static final Block CHORUS_BLOCK = register("chorus_block",
            RotatedPillarBlock::new,
            logProperties(
                    MapColor.COLOR_MAGENTA,
                    MapColor.COLOR_MAGENTA,
                    SoundType.BAMBOO_WOOD
            )
    );
    public static final Block STRIPPED_CHORUS_BLOCK = register("stripped_chorus_block",
            RotatedPillarBlock::new,
            logProperties(
                    MapColor.COLOR_MAGENTA,
                    MapColor.COLOR_MAGENTA,
                    SoundType.BAMBOO_WOOD
            )
    );
    public static final SignBlock CHORUS_SIGN = registerWithoutItem("chorus_sign",
            properties -> new StandingSignBlock(CHORUS_WOOD_TYPE, properties),
            Properties.ofFullCopy(Blocks.OAK_SIGN)
                    .mapColor(CHORUS_PLANKS.defaultMapColor())
    );
    public static final SignBlock CHORUS_WALL_SIGN = registerWithoutItem("chorus_wall_sign",
            properties -> new WallSignBlock(CHORUS_WOOD_TYPE, properties),
            Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)
                    .mapColor(CHORUS_PLANKS.defaultMapColor())
                    .overrideDescription(CHORUS_SIGN.getDescriptionId())
                    .overrideLootTable(CHORUS_SIGN.getLootTable())
    );
    public static final CeilingHangingSignBlock CHORUS_HANGING_SIGN = registerWithoutItem("chorus_hanging_sign",
            properties -> new CeilingHangingSignBlock(CHORUS_WOOD_TYPE, properties),
            Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)
                    .mapColor(CHORUS_PLANKS.defaultMapColor())
    );
    public static final WallHangingSignBlock CHORUS_WALL_HANGING_SIGN = registerWithoutItem("chorus_wall_hanging_sign",
            properties -> new WallHangingSignBlock(CHORUS_WOOD_TYPE, properties),
            Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)
                    .mapColor(CHORUS_PLANKS.defaultMapColor())
                    .overrideDescription(CHORUS_HANGING_SIGN.getDescriptionId())
                    .overrideLootTable(CHORUS_HANGING_SIGN.getLootTable())
    );
    public static final Block CHORUS_PRESSURE_PLATE = register(
            "chorus_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.BAMBOO, properties),
            BlockBehaviour.Properties.of()
                    .mapColor(CHORUS_PLANKS.defaultMapColor())
                    .forceSolidOn()
                    .instrument(NoteBlockInstrument.BASS)
                    .noCollission()
                    .strength(0.5F)
                    .ignitedByLava()
                    .pushReaction(PushReaction.DESTROY)
    );
    public static final Block CHORUS_TRAPDOOR = register(
            "chorus_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.BAMBOO, properties),
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_MAGENTA)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .noOcclusion()
                    .isValidSpawn(Blocks::never)
                    .ignitedByLava()
    );
    public static final Block CHORUS_BUTTON = register("chorus_button", properties -> new ButtonBlock(BlockSetType.BAMBOO, 30, properties), buttonProperties());
    public static final Block CHORUS_STAIRS = register("chorus_stairs",
            properties -> new StairBlock(CHORUS_PLANKS.defaultBlockState(), properties),
            Properties.ofFullCopy(CHORUS_PLANKS)
    );
    public static final Block CHORUS_SLAB = register("chorus_slab",
            SlabBlock::new,
            Properties.ofFullCopy(CHORUS_PLANKS)
    );
    public static final Block CHORUS_MOSAIC_STAIRS = register("chorus_mosaic_stairs",
            properties -> new StairBlock(CHORUS_PLANKS.defaultBlockState(), properties),
            Properties.ofFullCopy(CHORUS_PLANKS)
    );
    public static final Block CHORUS_MOSAIC_SLAB = register("chorus_mosaic_slab",
            SlabBlock::new,
            Properties.ofFullCopy(CHORUS_PLANKS)
    );
    public static final Block CHORUS_FENCE_GATE = register(
            "chorus_fence_gate",
            properties -> new FenceGateBlock(CHORUS_WOOD_TYPE, properties),
            BlockBehaviour.Properties.of()
                    .mapColor(CHORUS_PLANKS.defaultMapColor())
                    .forceSolidOn()
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .ignitedByLava()
    );
    public static final Block CHORUS_FENCE = register(
            "chorus_fence",
            FenceBlock::new,
            BlockBehaviour.Properties.of()
                    .mapColor(CHORUS_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.BAMBOO_WOOD)
                    .ignitedByLava()
    );
    public static final Block CHORUS_DOOR = register(
            "chorus_door",
            properties -> new DoorBlock(BlockSetType.BAMBOO, properties),
            BlockBehaviour.Properties.of()
                    .mapColor(CHORUS_PLANKS.defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .noOcclusion()
                    .ignitedByLava()
                    .pushReaction(PushReaction.DESTROY)
    );

    public static final BlockFamily FAMILY_CHORUS = BlockFamilies.familyBuilder(CHORUS_PLANKS)
            .button(CHORUS_BUTTON)
            .slab(CHORUS_SLAB)
            .stairs(CHORUS_STAIRS)
            .fence(CHORUS_FENCE)
            .fenceGate(CHORUS_FENCE_GATE)
            .pressurePlate(CHORUS_PRESSURE_PLATE)
            .sign(CHORUS_SIGN, CHORUS_WALL_SIGN)
            .door(CHORUS_DOOR)
            .trapdoor(CHORUS_TRAPDOOR)
            .recipeGroupPrefix("wooden")
            .recipeUnlockedBy("has_planks")
            .getFamily();

    public static final BlockFamily FAMILY_CHORUS_MOSAIC = BlockFamilies.familyBuilder(CHORUS_MOSAIC)
            .slab(CHORUS_MOSAIC_SLAB)
            .stairs(CHORUS_MOSAIC_STAIRS)
            .recipeGroupPrefix("wooden")
            .recipeUnlockedBy("has_planks")
            .getFamily();

    public static void init() {
    }

    private static void registerStrippable() {
        StrippableBlockRegistry.register(CHORUS_BLOCK, STRIPPED_CHORUS_BLOCK);
    }

    public static void registerBlockProperties() {
        var sign = (FabricBlockEntityType) BlockEntityType.SIGN;
        var hangingSign = (FabricBlockEntityType) BlockEntityType.HANGING_SIGN;

        sign.addSupportedBlock(CHORUS_SIGN);
        sign.addSupportedBlock(CHORUS_WALL_SIGN);

        hangingSign.addSupportedBlock(CHORUS_HANGING_SIGN);
        hangingSign.addSupportedBlock(CHORUS_WALL_HANGING_SIGN);

        registerStrippable();
        registerFlammability();
        registerFuels();
    }

    private static void registerFlammability() {
        var flammableBlockRegistry = FlammableBlockRegistry.getDefaultInstance();

        flammableBlockRegistry.add(CHORUS_BLOCK, 5, 5);
        flammableBlockRegistry.add(STRIPPED_CHORUS_BLOCK, 5, 5);

        flammableBlockRegistry.add(CHORUS_PLANKS, 5, 20);
        flammableBlockRegistry.add(CHORUS_MOSAIC, 5, 20);
        flammableBlockRegistry.add(CHORUS_STAIRS, 5, 20);
        flammableBlockRegistry.add(CHORUS_MOSAIC_STAIRS, 5, 20);
        flammableBlockRegistry.add(CHORUS_DOOR, 5, 20);
        flammableBlockRegistry.add(CHORUS_FENCE, 5, 20);
        flammableBlockRegistry.add(CHORUS_SLAB, 5, 20);
        flammableBlockRegistry.add(CHORUS_MOSAIC_SLAB, 5, 20);
        flammableBlockRegistry.add(CHORUS_FENCE_GATE, 5, 20);
        flammableBlockRegistry.add(CHORUS_PRESSURE_PLATE, 5, 20);
        flammableBlockRegistry.add(CHORUS_TRAPDOOR, 5, 20);
        flammableBlockRegistry.add(CHORUS_BUTTON, 5, 20);
        flammableBlockRegistry.add(CHORUS_SIGN, 5, 20);
        flammableBlockRegistry.add(CHORUS_WALL_SIGN, 5, 20);
        flammableBlockRegistry.add(CHORUS_HANGING_SIGN, 5, 20);
        flammableBlockRegistry.add(CHORUS_WALL_HANGING_SIGN, 5, 20);

    }

    private static void registerFuels() {
        FuelRegistryEvents.BUILD.register((builder, context) -> {
            builder.add(CHORUS_BLOCK.asItem(), 300);
            builder.add(STRIPPED_CHORUS_BLOCK.asItem(), 300);
            builder.add(CHORUS_PLANKS.asItem(), 300);
            builder.add(CHORUS_MOSAIC.asItem(), 300);
            builder.add(CHORUS_SLAB.asItem(), 150);
            builder.add(CHORUS_MOSAIC_SLAB.asItem(), 150);
            builder.add(CHORUS_STAIRS.asItem(), 300);
            builder.add(CHORUS_MOSAIC_STAIRS.asItem(), 300);
            builder.add(CHORUS_PRESSURE_PLATE.asItem(), 300);
            builder.add(CHORUS_BUTTON.asItem(), 100);
            builder.add(CHORUS_TRAPDOOR.asItem(), 300);
            builder.add(CHORUS_FENCE_GATE.asItem(), 300);
            builder.add(CHORUS_FENCE.asItem(), 300);
            builder.add(ERItems.CHORUS_SIGN, 300);
            builder.add(ERItems.CHORUS_HANGING_SIGN, 800);
            builder.add(ERItems.CHORUS_SPINE, 100);
        });

    }

    private static <T extends Block> @NotNull T registerWithoutItem(String path, Function<Properties, T> block, Properties properties) {
        ResourceLocation id = ERConstants.id(path);
        return doRegister(id, makeBlock(block, properties, id));
    }

    private static <T extends Block> @NotNull T register(String path, Function<Properties, T> block, Properties properties) {
        T registered = registerWithoutItem(path, block, properties);
        Items.registerBlock(registered);
        return registered;
    }

    private static <T extends Block> @NotNull T doRegister(ResourceLocation id, T block) {
        if (BuiltInRegistries.BLOCK.getOptional(id).isEmpty()) {
            return Registry.register(BuiltInRegistries.BLOCK, id, block);
        }
        throw new IllegalArgumentException("Block with id " + id + " is already in the block registry.");
    }

    private static <T extends Block> T makeBlock(@NotNull Function<Properties, T> function, @NotNull Properties properties, ResourceLocation id) {
        return function.apply(properties.setId(ResourceKey.create(Registries.BLOCK, id)));
    }

    public static BlockBehaviour.Properties logProperties(MapColor sideColor, MapColor topColor, SoundType sound) {
        return BlockBehaviour.Properties.of()
                .mapColor(blockState -> blockState.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? sideColor : topColor)
                .instrument(NoteBlockInstrument.BASS)
                .strength(2.0F)
                .sound(sound)
                .ignitedByLava();
    }

    private static BlockBehaviour.Properties wallVariant(Block baseBlock, boolean overrideDescription) {
        BlockBehaviour.Properties properties = baseBlock.properties();
        BlockBehaviour.Properties properties2 = BlockBehaviour.Properties.of().overrideLootTable(baseBlock.getLootTable());
        if (overrideDescription) {
            properties2 = properties2.overrideDescription(baseBlock.getDescriptionId());
        }

        return properties2;
    }

    public static BlockBehaviour.Properties buttonProperties() {
        return BlockBehaviour.Properties.of().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY);
    }
}
