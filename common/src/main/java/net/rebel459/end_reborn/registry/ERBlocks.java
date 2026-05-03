package net.rebel459.end_reborn.registry;

import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.BlockFamilies;
import net.minecraft.data.BlockFamily;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.rebel459.end_reborn.EndReborn;
import net.rebel459.end_reborn.sound.ERBlockSounds;
import net.rebel459.end_reborn.util.fabric.BlockSetTypeBuilder;
import net.rebel459.end_reborn.util.fabric.WoodTypeBuilder;
import net.rebel459.unified.platform.UnifiedHelpers;
import net.rebel459.unified.platform.UnifiedRegistries;
import net.rebel459.unified.util.SuppliedBlock;
import org.jetbrains.annotations.NotNull;

import java.util.function.Function;
import java.util.function.Supplier;

public class ERBlocks {
    public static final BlockSetType CHORUS_SET = BlockSetTypeBuilder.copyOf(BlockSetType.BAMBOO).register(EndReborn.id("chorus"));
    public static final WoodType CHORUS_WOOD_TYPE = WoodTypeBuilder.copyOf(WoodType.BAMBOO).register(EndReborn.id("chorus"), CHORUS_SET);
    
    static UnifiedRegistries.Blocks BLOCKS = UnifiedRegistries.Blocks.create(EndReborn.MOD_ID);

    public static final SuppliedBlock END_IRON_ORE = BLOCKS.register("end_iron_ore",
            Block::new,
            () -> Properties.of()
                    .mapColor(MapColor.SAND)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 9.0F)
                    .sound(ERBlockSounds.END_IRON_ORE)
    );
    public static final SuppliedBlock MIRESTONE_IRON_ORE = BLOCKS.register("mirestone_iron_ore",
            Block::new,
            () -> Properties.of()
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(6.0F, 9.0F)
                    .sound(ERBlockSounds.MIRESTONE_IRON_ORE)
    );

    // Remnant
    public static final SuppliedBlock REMNANT_BLOCK = BLOCKS.registerWithoutItem("remnant_block",
            Block::new,
            () -> Properties.of()
                    .mapColor(MapColor.COLOR_GRAY)
                    .requiresCorrectToolForDrops()
                    .strength(50.0F, 1200.0F)
                    .sound(SoundType.NETHERITE_BLOCK)
    );
    public static final SuppliedBlock FORGOTTEN_REMAINS = BLOCKS.registerWithoutItem("forgotten_remains",
            Block::new,
            () -> Properties.of()
                    .mapColor(MapColor.COLOR_GRAY)
                    .requiresCorrectToolForDrops()
                    .strength(30.0F, 1200.0F)
                    .sound(SoundType.ANCIENT_DEBRIS)
    );

    // Featherzeal
    public static final SuppliedBlock FEATHERZEAL_BLOCK = BLOCKS.register("featherzeal_block",
            Block::new,
            () -> Properties.of()
                    .mapColor(MapColor.COLOR_GREEN)
                    .requiresCorrectToolForDrops()
                    .strength(50.0F, 1200.0F)
                    .sound(SoundType.NETHERITE_BLOCK)
    );
    public static final SuppliedBlock TIMELOST_FRAGMENTS = BLOCKS.register("timelost_fragments",
            Block::new,
            () -> Properties.of()
                    .mapColor(MapColor.COLOR_BLUE)
                    .requiresCorrectToolForDrops()
                    .strength(30.0F, 1200.0F)
                    .sound(SoundType.ANCIENT_DEBRIS)
    );

    // Crystalline
    public static final SuppliedBlock RAW_CRYSTALLINE_BLOCK = BLOCKS.register("raw_crystalline_block",
            Block::new,
            () -> Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .requiresCorrectToolForDrops()
                    .strength(3.0F)
                    .lightLevel(blockStatex -> 7)
                    .sound(ERBlockSounds.RAW_CRYSTALLINE_BLOCK)
    );
    public static final SuppliedBlock CRYSTALLINE_BLOCK = BLOCKS.register("crystalline_block",
            Block::new,
            () -> Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .requiresCorrectToolForDrops()
                    .strength(3.5F)
                    .lightLevel(blockStatex -> 14)
                    .sound(ERBlockSounds.CRYSTALLINE_BLOCK)
    );
    public static final SuppliedBlock CRYSTALLINE_LAMP = BLOCKS.register("crystalline_lamp",
            Block::new,
            () -> Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .requiresCorrectToolForDrops()
                    .strength(3.5F)
                    .lightLevel(blockStatex -> 14)
                    .sound(ERBlockSounds.CRYSTALLINE_BLOCK)
    );
    public static final SuppliedBlock CRYSTALLINE_LANTERN = BLOCKS.register("crystalline_lantern",
            LanternBlock::new,
            () -> Properties.of()
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
    public static final SuppliedBlock CUT_AMETRUR = BLOCKS.register("cut_ametrur",
            Block::new,
            () -> Properties.ofFullCopy(Blocks.PURPUR_BLOCK)
    );
    public static final SuppliedBlock CUT_AMETRUR_PILLAR = BLOCKS.register("cut_ametrur_pillar",
            RotatedPillarBlock::new,
            () -> Properties.ofFullCopy(Blocks.PURPUR_PILLAR)
    );
    public static final SuppliedBlock CUT_AMETRUR_STAIRS = BLOCKS.register("cut_ametrur_stairs",
            properties -> new StairBlock(CUT_AMETRUR.defaultBlockState(), properties),
            () -> Properties.ofFullCopy(CUT_AMETRUR.get())
    );
    public static final SuppliedBlock CUT_AMETRUR_SLAB = BLOCKS.register("cut_ametrur_slab",
            SlabBlock::new,
            () -> Properties.ofFullCopy(CUT_AMETRUR.get())
    );

    public static final SuppliedBlock PURPUR = BLOCKS.register("purpur",
            Block::new,
            () -> Properties.of()
                    .mapColor(MapColor.COLOR_MAGENTA)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
                    .sound(ERBlockSounds.PURPUR)
    );
    public static final SuppliedBlock AMETRUR = BLOCKS.register("ametrur",
            Block::new,
            () -> Properties.of()
                    .mapColor(MapColor.COLOR_PURPLE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
                    .sound(ERBlockSounds.PURPUR)
    );

    // Chorus Woodset
    public static final SuppliedBlock CHORUS_PLANKS = BLOCKS.register("chorus_planks",
            Block::new,
            () -> Properties.of()
                    .mapColor(MapColor.COLOR_MAGENTA)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.BAMBOO_WOOD)
                    .ignitedByLava()
    );
    public static final SuppliedBlock CHORUS_MOSAIC = BLOCKS.register("chorus_mosaic",
            Block::new,
            () -> Properties.of()
                    .mapColor(MapColor.COLOR_MAGENTA)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.BAMBOO_WOOD)
                    .ignitedByLava()
    );
    public static final SuppliedBlock CHORUS_BLOCK = BLOCKS.register("chorus_block",
            RotatedPillarBlock::new,
            logProperties(
                    MapColor.COLOR_MAGENTA,
                    MapColor.COLOR_MAGENTA,
                    SoundType.BAMBOO_WOOD
            )
    );
    public static final SuppliedBlock STRIPPED_CHORUS_BLOCK = BLOCKS.register("stripped_chorus_block",
            RotatedPillarBlock::new,
            logProperties(
                    MapColor.COLOR_MAGENTA,
                    MapColor.COLOR_MAGENTA,
                    SoundType.BAMBOO_WOOD
            )
    );
    public static final SuppliedBlock CHORUS_SHELF = BLOCKS.register("chorus_shelf",
            ShelfBlock::new,
            () -> Properties.of()
                    .mapColor(MapColor.COLOR_MAGENTA)
                    .instrument(NoteBlockInstrument.BASS)
                    .sound(SoundType.SHELF)
                    .ignitedByLava().strength(2.0F, 3.0F),
            BlockEntityType.SHELF
    );

    public static final SuppliedBlock CHORUS_SIGN = BLOCKS.registerWithoutItem("chorus_sign",
            properties -> new StandingSignBlock(CHORUS_WOOD_TYPE, properties),
            () -> Properties.ofFullCopy(Blocks.OAK_SIGN)
                    .mapColor(CHORUS_PLANKS.get().defaultMapColor()),
            BlockEntityType.SIGN
    );
    public static final SuppliedBlock CHORUS_WALL_SIGN = BLOCKS.registerWithoutItem("chorus_wall_sign",
            properties -> new WallSignBlock(CHORUS_WOOD_TYPE, properties),
            () -> Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)
                    .mapColor(CHORUS_PLANKS.get().defaultMapColor())
                    .overrideDescription(CHORUS_SIGN.get().getDescriptionId())
                    .overrideLootTable(CHORUS_SIGN.get().getLootTable()),
            BlockEntityType.SIGN
    );
    public static final SuppliedBlock CHORUS_HANGING_SIGN = BLOCKS.registerWithoutItem("chorus_hanging_sign",
            properties -> new CeilingHangingSignBlock(CHORUS_WOOD_TYPE, properties),
            () -> Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)
                    .mapColor(CHORUS_PLANKS.get().defaultMapColor()),
            BlockEntityType.HANGING_SIGN
    );
    public static final SuppliedBlock CHORUS_WALL_HANGING_SIGN = BLOCKS.registerWithoutItem("chorus_wall_hanging_sign",
            properties -> new WallHangingSignBlock(CHORUS_WOOD_TYPE, properties),
            () -> Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)
                    .mapColor(CHORUS_PLANKS.get().defaultMapColor())
                    .overrideDescription(CHORUS_HANGING_SIGN.get().getDescriptionId())
                    .overrideLootTable(CHORUS_HANGING_SIGN.get().getLootTable()),
            BlockEntityType.HANGING_SIGN
    );
    public static final SuppliedBlock CHORUS_PRESSURE_PLATE = BLOCKS.register(
            "chorus_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.BAMBOO, properties),
            () -> Properties.of()
                    .mapColor(CHORUS_PLANKS.get().defaultMapColor())
                    .forceSolidOn()
                    .instrument(NoteBlockInstrument.BASS)
                    .noCollision()
                    .strength(0.5F)
                    .ignitedByLava()
                    .pushReaction(PushReaction.DESTROY)
    );
    public static final SuppliedBlock CHORUS_TRAPDOOR = BLOCKS.register(
            "chorus_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.BAMBOO, properties),
            () -> Properties.of()
                    .mapColor(MapColor.COLOR_MAGENTA)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .noOcclusion()
                    .isValidSpawn(((_, _, _, _) -> false))
                    .ignitedByLava()
    );
    public static final SuppliedBlock CHORUS_BUTTON = BLOCKS.register("chorus_button", properties -> new ButtonBlock(BlockSetType.BAMBOO, 30, properties), buttonProperties());
    public static final SuppliedBlock CHORUS_STAIRS = BLOCKS.register("chorus_stairs",
            properties -> new StairBlock(CHORUS_PLANKS.defaultBlockState(), properties),
            () -> Properties.ofFullCopy(CHORUS_PLANKS.get())
    );
    public static final SuppliedBlock CHORUS_SLAB = BLOCKS.register("chorus_slab",
            SlabBlock::new,
            () -> Properties.ofFullCopy(CHORUS_PLANKS.get())
    );
    public static final SuppliedBlock CHORUS_MOSAIC_STAIRS = BLOCKS.register("chorus_mosaic_stairs",
            properties -> new StairBlock(CHORUS_PLANKS.defaultBlockState(), properties),
            () -> Properties.ofFullCopy(CHORUS_PLANKS.get())
    );
    public static final SuppliedBlock CHORUS_MOSAIC_SLAB = BLOCKS.register("chorus_mosaic_slab",
            SlabBlock::new,
            () -> Properties.ofFullCopy(CHORUS_PLANKS.get())
    );
    public static final SuppliedBlock CHORUS_FENCE_GATE = BLOCKS.register(
            "chorus_fence_gate",
            properties -> new FenceGateBlock(CHORUS_WOOD_TYPE, properties),
            () -> Properties.of()
                    .mapColor(CHORUS_PLANKS.get().defaultMapColor())
                    .forceSolidOn()
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .ignitedByLava()
    );
    public static final SuppliedBlock CHORUS_FENCE = BLOCKS.register(
            "chorus_fence",
            FenceBlock::new,
            () -> Properties.of()
                    .mapColor(CHORUS_PLANKS.get().defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.BAMBOO_WOOD)
                    .ignitedByLava()
    );
    public static final SuppliedBlock CHORUS_DOOR = BLOCKS.register(
            "chorus_door",
            properties -> new DoorBlock(BlockSetType.BAMBOO, properties),
            () -> Properties.of()
                    .mapColor(CHORUS_PLANKS.get().defaultMapColor())
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .noOcclusion()
                    .ignitedByLava()
                    .pushReaction(PushReaction.DESTROY)
    );

    public static void init() {}

    private static void registerStrippable() {
        UnifiedHelpers.BLOCK_CONVERSIONS.addStrippable(CHORUS_BLOCK.get(), STRIPPED_CHORUS_BLOCK.get());
    }

    public static void registerBlockProperties() {
        registerStrippable();
        registerFlammability();
        registerFuels();
    }

    private static void registerFlammability() {
        FireBlock fire = (FireBlock) Blocks.FIRE;

        fire.setFlammable(CHORUS_BLOCK.get(), 5, 5);
        fire.setFlammable(STRIPPED_CHORUS_BLOCK.get(), 5, 5);

        fire.setFlammable(CHORUS_PLANKS.get(), 5, 20);
        fire.setFlammable(CHORUS_MOSAIC.get(), 5, 20);
        fire.setFlammable(CHORUS_STAIRS.get(), 5, 20);
        fire.setFlammable(CHORUS_MOSAIC_STAIRS.get(), 5, 20);
        fire.setFlammable(CHORUS_DOOR.get(), 5, 20);
        fire.setFlammable(CHORUS_FENCE.get(), 5, 20);
        fire.setFlammable(CHORUS_SLAB.get(), 5, 20);
        fire.setFlammable(CHORUS_MOSAIC_SLAB.get(), 5, 20);
        fire.setFlammable(CHORUS_FENCE_GATE.get(), 5, 20);
        fire.setFlammable(CHORUS_PRESSURE_PLATE.get(), 5, 20);
        fire.setFlammable(CHORUS_TRAPDOOR.get(), 5, 20);
        fire.setFlammable(CHORUS_BUTTON.get(), 5, 20);
        fire.setFlammable(CHORUS_SIGN.get(), 5, 20);
        fire.setFlammable(CHORUS_WALL_SIGN.get(), 5, 20);
        fire.setFlammable(CHORUS_HANGING_SIGN.get(), 5, 20);
        fire.setFlammable(CHORUS_WALL_HANGING_SIGN.get(), 5, 20);
        fire.setFlammable(CHORUS_SHELF.get(), 30, 20);

    }

    private static void registerFuels() {
        UnifiedHelpers.DATA_COMPONENTS.addFurnaceFuel(CHORUS_BLOCK, 300);
        UnifiedHelpers.DATA_COMPONENTS.addFurnaceFuel(STRIPPED_CHORUS_BLOCK, 300);
        UnifiedHelpers.DATA_COMPONENTS.addFurnaceFuel(CHORUS_PLANKS, 300);
        UnifiedHelpers.DATA_COMPONENTS.addFurnaceFuel(CHORUS_MOSAIC, 300);
        UnifiedHelpers.DATA_COMPONENTS.addFurnaceFuel(CHORUS_SLAB, 150);
        UnifiedHelpers.DATA_COMPONENTS.addFurnaceFuel(CHORUS_MOSAIC_SLAB, 150);
        UnifiedHelpers.DATA_COMPONENTS.addFurnaceFuel(CHORUS_STAIRS, 300);
        UnifiedHelpers.DATA_COMPONENTS.addFurnaceFuel(CHORUS_MOSAIC_STAIRS, 300);
        UnifiedHelpers.DATA_COMPONENTS.addFurnaceFuel(CHORUS_PRESSURE_PLATE, 300);
        UnifiedHelpers.DATA_COMPONENTS.addFurnaceFuel(CHORUS_BUTTON, 100);
        UnifiedHelpers.DATA_COMPONENTS.addFurnaceFuel(CHORUS_TRAPDOOR, 300);
        UnifiedHelpers.DATA_COMPONENTS.addFurnaceFuel(CHORUS_FENCE_GATE, 300);
        UnifiedHelpers.DATA_COMPONENTS.addFurnaceFuel(CHORUS_FENCE, 300);
        UnifiedHelpers.DATA_COMPONENTS.addFurnaceFuel(CHORUS_SHELF, 300);
        UnifiedHelpers.DATA_COMPONENTS.addFurnaceFuel(ERItems.CHORUS_SIGN, 300);
        UnifiedHelpers.DATA_COMPONENTS.addFurnaceFuel(ERItems.CHORUS_HANGING_SIGN, 800);
        UnifiedHelpers.DATA_COMPONENTS.addFurnaceFuel(ERItems.CHORUS_SPINE, 100);

    }

    public static Supplier<Properties> logProperties(MapColor sideColor, MapColor topColor, SoundType sound) {
        return () -> Properties.of()
                .mapColor(blockState -> blockState.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? sideColor : topColor)
                .instrument(NoteBlockInstrument.BASS)
                .strength(2.0F)
                .sound(sound)
                .ignitedByLava();
    }

    public static Supplier<Properties> buttonProperties() {
        return () -> Properties.of().noCollision().strength(0.5F).pushReaction(PushReaction.DESTROY);
    }
}
