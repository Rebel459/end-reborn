package net.legacy.end_reborn;
import java.util.function.Function;

import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import org.jetbrains.annotations.NotNull;

public class ERBlocks {

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
    public static final Block RAW_CRYSTALLINE = register("raw_crystalline",
            Block::new,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .requiresCorrectToolForDrops()
                    .strength(3.0F)
                    .lightLevel(blockStatex -> 7)
                    .sound(SoundType.AMETHYST)
    );
    public static final Block CRYSTALLINE_BLOCK = register("crystalline_block",
            Block::new,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .requiresCorrectToolForDrops()
                    .strength(3.5F)
                    .lightLevel(blockStatex -> 14)
                    .sound(SoundType.AMETHYST)
    );
    public static final Block CRYSTALLINE_LAMP = register("crystalline_lamp",
            Block::new,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .requiresCorrectToolForDrops()
                    .strength(3.5F)
                    .lightLevel(blockStatex -> 14)
                    .sound(SoundType.AMETHYST)
    );
    public static final Block CRYSTALLINE_LANTERN = register("crystalline_lantern",
            LanternBlock::new,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .requiresCorrectToolForDrops()
                    .forceSolidOn()
                    .strength(3.5F)
                    .lightLevel(blockStatex -> 14)
                    .sound(SoundType.LANTERN)
                    .noOcclusion()
                    .pushReaction(PushReaction.DESTROY)
    );

    // Purpur and Ametrur
    public static final Block CUT_AMETRUR = register("cut_ametrur",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)
    );
    public static final Block CUT_AMETRUR_PILLAR = register("cut_ametrur_pillar",
            Block::new,
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
    public static final Block CHORUS_SIGN = register(
            "chorus_sign",
            properties -> new StandingSignBlock(WoodType.BAMBOO, properties),
            BlockBehaviour.Properties.of()
                    .mapColor(CHORUS_PLANKS.defaultMapColor())
                    .forceSolidOn()
                    .instrument(NoteBlockInstrument.BASS)
                    .noCollission()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block CHORUS_WALL_SIGN = register(
            "chorus_wall_sign",
            properties -> new WallSignBlock(WoodType.BAMBOO, properties),
            wallVariant(CHORUS_SIGN, true)
                    .mapColor(CHORUS_PLANKS.defaultMapColor())
                    .forceSolidOn()
                    .instrument(NoteBlockInstrument.BASS)
                    .noCollission()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block CHORUS_HANGING_SIGN = register(
            "chorus_hanging_sign",
            properties -> new CeilingHangingSignBlock(WoodType.BAMBOO, properties),
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_MAGENTA)
                    .forceSolidOn()
                    .instrument(NoteBlockInstrument.BASS)
                    .noCollission()
                    .strength(1.0F)
                    .ignitedByLava()
    );
    public static final Block CHORUS_WALL_HANGING_SIGN = register(
            "chorus_wall_hanging_sign",
            properties -> new WallHangingSignBlock(WoodType.BAMBOO, properties),
            wallVariant(CHORUS_HANGING_SIGN, true)
                    .mapColor(MapColor.COLOR_MAGENTA)
                    .forceSolidOn()
                    .instrument(NoteBlockInstrument.BASS)
                    .noCollission()
                    .strength(1.0F)
                    .ignitedByLava()
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
            properties -> new FenceGateBlock(WoodType.BAMBOO, properties),
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

    public static void init() {
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
