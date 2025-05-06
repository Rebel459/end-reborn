package net.legacy.end_reborn.sound;

import net.minecraft.world.level.block.SoundType;

public final class ERBlockSounds {

    public static final SoundType CRYSTALLINE_BLOCK = new SoundType(1F, 1F,
            ERSounds.CRYSTALLINE_BLOCK_BREAK,
            ERSounds.CRYSTALLINE_BLOCK_STEP,
            ERSounds.CRYSTALLINE_BLOCK_PLACE,
            ERSounds.CRYSTALLINE_BLOCK_HIT,
            ERSounds.CRYSTALLINE_BLOCK_FALL
    );
    public static final SoundType RAW_CRYSTALLINE_BLOCK = new SoundType(1F, 1F,
            ERSounds.RAW_CRYSTALLINE_BREAK,
            ERSounds.RAW_CRYSTALLINE_STEP,
            ERSounds.RAW_CRYSTALLINE_PLACE,
            ERSounds.RAW_CRYSTALLINE_HIT,
            ERSounds.RAW_CRYSTALLINE_FALL
    );
    public static final SoundType PURPUR = new SoundType(1F, 1F,
            ERSounds.PURPUR_BREAK,
            ERSounds.PURPUR_STEP,
            ERSounds.PURPUR_PLACE,
            ERSounds.PURPUR_HIT,
            ERSounds.PURPUR_FALL
    );
    public static final SoundType END_IRON_ORE = new SoundType(1F, 1F,
            ERSounds.END_IRON_ORE_BREAK,
            ERSounds.END_IRON_ORE_STEP,
            ERSounds.END_IRON_ORE_PLACE,
            ERSounds.END_IRON_ORE_HIT,
            ERSounds.END_IRON_ORE_FALL
    );
    public static final SoundType MIRESTONE_IRON_ORE = new SoundType(1F, 1F,
            ERSounds.MIRESTONE_IRON_ORE_BREAK,
            ERSounds.MIRESTONE_IRON_ORE_STEP,
            ERSounds.MIRESTONE_IRON_ORE_PLACE,
            ERSounds.MIRESTONE_IRON_ORE_HIT,
            ERSounds.MIRESTONE_IRON_ORE_FALL
    );

    public static void init() {
    }
}
