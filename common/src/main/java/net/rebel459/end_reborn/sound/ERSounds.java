package net.rebel459.end_reborn.sound;

import net.rebel459.end_reborn.EndReborn;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.rebel459.unified.platform.UnifiedRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class ERSounds {

	static UnifiedRegistries.SoundEvents SOUNDS = UnifiedRegistries.SoundEvents.create(EndReborn.MOD_ID);

	public static final Supplier<SoundEvent> CRYSTALLINE_BLOCK_BREAK = SOUNDS.register("block.crystalline_block.break");
	public static final Supplier<SoundEvent> CRYSTALLINE_BLOCK_STEP = SOUNDS.register("block.crystalline_block.step");
	public static final Supplier<SoundEvent> CRYSTALLINE_BLOCK_PLACE = SOUNDS.register("block.crystalline_block.place");
	public static final Supplier<SoundEvent> CRYSTALLINE_BLOCK_HIT = SOUNDS.register("block.crystalline_block.hit");
	public static final Supplier<SoundEvent> CRYSTALLINE_BLOCK_FALL = SOUNDS.register("block.crystalline_block.fall");

	public static final Supplier<SoundEvent> RAW_CRYSTALLINE_BREAK = SOUNDS.register("block.raw_crystalline_block.break");
	public static final Supplier<SoundEvent> RAW_CRYSTALLINE_STEP = SOUNDS.register("block.raw_crystalline_block.step");
	public static final Supplier<SoundEvent> RAW_CRYSTALLINE_PLACE = SOUNDS.register("block.raw_crystalline_block.place");
	public static final Supplier<SoundEvent> RAW_CRYSTALLINE_HIT = SOUNDS.register("block.raw_crystalline_block.hit");
	public static final Supplier<SoundEvent> RAW_CRYSTALLINE_FALL = SOUNDS.register("block.raw_crystalline_block.fall");

	public static final Supplier<SoundEvent> PURPUR_BREAK = SOUNDS.register("block.purpur.break");
	public static final Supplier<SoundEvent> PURPUR_STEP = SOUNDS.register("block.purpur.step");
	public static final Supplier<SoundEvent> PURPUR_PLACE = SOUNDS.register("block.purpur.place");
	public static final Supplier<SoundEvent> PURPUR_HIT = SOUNDS.register("block.purpur.hit");
	public static final Supplier<SoundEvent> PURPUR_FALL = SOUNDS.register("block.purpur.fall");

	public static final Supplier<SoundEvent> END_IRON_ORE_BREAK = SOUNDS.register("block.end_iron_ore.break");
	public static final Supplier<SoundEvent> END_IRON_ORE_STEP = SOUNDS.register("block.end_iron_ore.step");
	public static final Supplier<SoundEvent> END_IRON_ORE_PLACE = SOUNDS.register("block.end_iron_ore.place");
	public static final Supplier<SoundEvent> END_IRON_ORE_HIT = SOUNDS.register("block.end_iron_ore.hit");
	public static final Supplier<SoundEvent> END_IRON_ORE_FALL = SOUNDS.register("block.end_iron_ore.fall");

	public static final Supplier<SoundEvent> MIRESTONE_IRON_ORE_BREAK = SOUNDS.register("block.mirestone_iron_ore.break");
	public static final Supplier<SoundEvent> MIRESTONE_IRON_ORE_STEP = SOUNDS.register("block.mirestone_iron_ore.step");
	public static final Supplier<SoundEvent> MIRESTONE_IRON_ORE_PLACE = SOUNDS.register("block.mirestone_iron_ore.place");
	public static final Supplier<SoundEvent> MIRESTONE_IRON_ORE_HIT = SOUNDS.register("block.mirestone_iron_ore.hit");
	public static final Supplier<SoundEvent> MIRESTONE_IRON_ORE_FALL = SOUNDS.register("block.mirestone_iron_ore.fall");

	public static void init() {}
}
