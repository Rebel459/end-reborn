package net.rebel459.end_reborn.util.fabric;

import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public final class BlockSetTypeBuilder {
	private boolean openableByHand = true;
	private boolean openableByWindCharge = true;
	private boolean buttonActivatedByArrows = true;
	private BlockSetType.PressurePlateSensitivity pressurePlateActivationRule = BlockSetType.PressurePlateSensitivity.EVERYTHING;
	private SoundType soundType = SoundType.WOOD;
	private SoundEvent doorCloseSound = SoundEvents.WOODEN_DOOR_CLOSE;
	private SoundEvent doorOpenSound = SoundEvents.WOODEN_DOOR_OPEN;
	private SoundEvent trapdoorCloseSound = SoundEvents.WOODEN_TRAPDOOR_CLOSE;
	private SoundEvent trapdoorOpenSound = SoundEvents.WOODEN_TRAPDOOR_OPEN;
	private SoundEvent pressurePlateClickOffSound = SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF;
	private SoundEvent pressurePlateClickOnSound = SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON;
	private SoundEvent buttonClickOffSound = SoundEvents.WOODEN_BUTTON_CLICK_OFF;
	private SoundEvent buttonClickOnSound = SoundEvents.WOODEN_BUTTON_CLICK_ON;

	public BlockSetTypeBuilder openableByHand(boolean openableByHand) {
		this.openableByHand = openableByHand;
		return this;
	}

	public BlockSetTypeBuilder openableByWindCharge(boolean openableByWindCharge) {
		this.openableByWindCharge = openableByWindCharge;
		return this;
	}

	public BlockSetTypeBuilder buttonActivatedByArrows(boolean buttonActivatedByArrows) {
		this.buttonActivatedByArrows = buttonActivatedByArrows;
		return this;
	}

	public BlockSetTypeBuilder pressurePlateActivationRule(BlockSetType.PressurePlateSensitivity activationRule) {
		this.pressurePlateActivationRule = activationRule;
		return this;
	}

	public BlockSetTypeBuilder soundType(SoundType soundType) {
		this.soundType = soundType;
		return this;
	}

	public BlockSetTypeBuilder doorCloseSound(SoundEvent doorCloseSound) {
		this.doorCloseSound = doorCloseSound;
		return this;
	}

	public BlockSetTypeBuilder doorOpenSound(SoundEvent doorOpenSound) {
		this.doorOpenSound = doorOpenSound;
		return this;
	}

	public BlockSetTypeBuilder trapdoorCloseSound(SoundEvent trapdoorCloseSound) {
		this.trapdoorCloseSound = trapdoorCloseSound;
		return this;
	}

	public BlockSetTypeBuilder trapdoorOpenSound(SoundEvent trapdoorOpenSound) {
		this.trapdoorOpenSound = trapdoorOpenSound;
		return this;
	}

	public BlockSetTypeBuilder pressurePlateClickOffSound(SoundEvent pressurePlateClickOffSound) {
		this.pressurePlateClickOffSound = pressurePlateClickOffSound;
		return this;
	}

	public BlockSetTypeBuilder pressurePlateClickOnSound(SoundEvent pressurePlateClickOnSound) {
		this.pressurePlateClickOnSound = pressurePlateClickOnSound;
		return this;
	}

	public BlockSetTypeBuilder buttonClickOffSound(SoundEvent buttonClickOffSound) {
		this.buttonClickOffSound = buttonClickOffSound;
		return this;
	}

	public BlockSetTypeBuilder buttonClickOnSound(SoundEvent buttonClickOnSound) {
		this.buttonClickOnSound = buttonClickOnSound;
		return this;
	}

	public static BlockSetTypeBuilder copyOf(BlockSetTypeBuilder builder) {
		BlockSetTypeBuilder copy = new BlockSetTypeBuilder();
		copy.openableByHand(builder.openableByHand);
		copy.openableByWindCharge(builder.openableByWindCharge);
		copy.buttonActivatedByArrows(builder.buttonActivatedByArrows);
		copy.pressurePlateActivationRule(builder.pressurePlateActivationRule);
		copy.soundType(builder.soundType);
		copy.doorCloseSound(builder.doorCloseSound);
		copy.doorOpenSound(builder.doorOpenSound);
		copy.trapdoorCloseSound(builder.trapdoorCloseSound);
		copy.trapdoorOpenSound(builder.trapdoorOpenSound);
		copy.pressurePlateClickOffSound(builder.pressurePlateClickOffSound);
		copy.pressurePlateClickOnSound(builder.pressurePlateClickOnSound);
		copy.buttonClickOffSound(builder.buttonClickOffSound);
		copy.buttonClickOnSound(builder.buttonClickOnSound);
		return copy;
	}

	public static BlockSetTypeBuilder copyOf(BlockSetType setType) {
		BlockSetTypeBuilder copy = new BlockSetTypeBuilder();
		copy.openableByHand(setType.canOpenByHand());
		copy.openableByWindCharge(setType.canOpenByWindCharge());
		copy.buttonActivatedByArrows(setType.canButtonBeActivatedByArrows());
		copy.pressurePlateActivationRule(setType.pressurePlateSensitivity());
		copy.soundType(setType.soundType());
		copy.doorCloseSound(setType.doorClose());
		copy.doorOpenSound(setType.doorOpen());
		copy.trapdoorCloseSound(setType.trapdoorClose());
		copy.trapdoorOpenSound(setType.trapdoorOpen());
		copy.pressurePlateClickOffSound(setType.pressurePlateClickOff());
		copy.pressurePlateClickOnSound(setType.pressurePlateClickOn());
		copy.buttonClickOffSound(setType.buttonClickOff());
		copy.buttonClickOnSound(setType.buttonClickOn());
		return copy;
	}

	public BlockSetType register(Identifier id) {
		return BlockSetType.register(this.build(id));
	}

	public BlockSetType build(Identifier id) {
		return new BlockSetType(id.toString(), openableByHand, openableByWindCharge, buttonActivatedByArrows, pressurePlateActivationRule,
				soundType, doorCloseSound, doorOpenSound, trapdoorCloseSound, trapdoorOpenSound, pressurePlateClickOffSound, pressurePlateClickOnSound, buttonClickOffSound, buttonClickOnSound);
	}
}