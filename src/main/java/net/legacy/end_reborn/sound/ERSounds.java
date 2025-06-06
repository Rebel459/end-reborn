package net.legacy.end_reborn.sound;

import net.legacy.end_reborn.ERConstants;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import org.jetbrains.annotations.NotNull;

public class ERSounds {
	public static final SoundEvent CRYSTALLINE_BLOCK_BREAK = register("block.crystalline_block.break");
	public static final SoundEvent CRYSTALLINE_BLOCK_STEP = register("block.crystalline_block.step");
	public static final SoundEvent CRYSTALLINE_BLOCK_PLACE = register("block.crystalline_block.place");
	public static final SoundEvent CRYSTALLINE_BLOCK_HIT = register("block.crystalline_block.hit");
	public static final SoundEvent CRYSTALLINE_BLOCK_FALL = register("block.crystalline_block.fall");

	public static final SoundEvent RAW_CRYSTALLINE_BREAK = register("block.raw_crystalline_block.break");
	public static final SoundEvent RAW_CRYSTALLINE_STEP = register("block.raw_crystalline_block.step");
	public static final SoundEvent RAW_CRYSTALLINE_PLACE = register("block.raw_crystalline_block.place");
	public static final SoundEvent RAW_CRYSTALLINE_HIT = register("block.raw_crystalline_block.hit");
	public static final SoundEvent RAW_CRYSTALLINE_FALL = register("block.raw_crystalline_block.fall");

	public static final SoundEvent PURPUR_BREAK = register("block.purpur.break");
	public static final SoundEvent PURPUR_STEP = register("block.purpur.step");
	public static final SoundEvent PURPUR_PLACE = register("block.purpur.place");
	public static final SoundEvent PURPUR_HIT = register("block.purpur.hit");
	public static final SoundEvent PURPUR_FALL = register("block.purpur.fall");

	public static final SoundEvent END_IRON_ORE_BREAK = register("block.end_iron_ore.break");
	public static final SoundEvent END_IRON_ORE_STEP = register("block.end_iron_ore.step");
	public static final SoundEvent END_IRON_ORE_PLACE = register("block.end_iron_ore.place");
	public static final SoundEvent END_IRON_ORE_HIT = register("block.end_iron_ore.hit");
	public static final SoundEvent END_IRON_ORE_FALL = register("block.end_iron_ore.fall");

	public static final SoundEvent MIRESTONE_IRON_ORE_BREAK = register("block.mirestone_iron_ore.break");
	public static final SoundEvent MIRESTONE_IRON_ORE_STEP = register("block.mirestone_iron_ore.step");
	public static final SoundEvent MIRESTONE_IRON_ORE_PLACE = register("block.mirestone_iron_ore.place");
	public static final SoundEvent MIRESTONE_IRON_ORE_HIT = register("block.mirestone_iron_ore.hit");
	public static final SoundEvent MIRESTONE_IRON_ORE_FALL = register("block.mirestone_iron_ore.fall");

	@NotNull
	private static SoundEvent register(@NotNull String string) {
		ResourceLocation resourceLocation = ERConstants.id(string);
		return Registry.register(BuiltInRegistries.SOUND_EVENT, resourceLocation, SoundEvent.createVariableRangeEvent(resourceLocation));
	}

	private static Holder.@NotNull Reference<SoundEvent> registerForHolder(String id) {
		return registerForHolder(ERConstants.id(id));
	}

	private static Holder.@NotNull Reference<SoundEvent> registerForHolder(ResourceLocation id) {
		return registerForHolder(id, id);
	}

	private static Holder.@NotNull Reference<SoundEvent> registerForHolder(ResourceLocation id, ResourceLocation soundId) {
		return Registry.registerForHolder(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(soundId));
	}

	public static void init() {}
}
