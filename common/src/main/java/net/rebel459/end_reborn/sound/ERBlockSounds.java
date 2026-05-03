package net.rebel459.end_reborn.sound;

import net.minecraft.world.level.block.SoundType;

public final class ERBlockSounds {
    
    public static final SoundType CRYSTALLINE_BLOCK = new SoundType(1F, 1F,
            ERSounds.CRYSTALLINE_BLOCK_BREAK.get(),
            ERSounds.CRYSTALLINE_BLOCK_STEP.get(),
            ERSounds.CRYSTALLINE_BLOCK_PLACE.get(),
            ERSounds.CRYSTALLINE_BLOCK_HIT.get(),
            ERSounds.CRYSTALLINE_BLOCK_FALL.get()
    );
    public static final SoundType RAW_CRYSTALLINE_BLOCK = new SoundType(1F, 1F,
            ERSounds.RAW_CRYSTALLINE_BREAK.get(),
            ERSounds.RAW_CRYSTALLINE_STEP.get(),
            ERSounds.RAW_CRYSTALLINE_PLACE.get(),
            ERSounds.RAW_CRYSTALLINE_HIT.get(),
            ERSounds.RAW_CRYSTALLINE_FALL.get()
    );
    public static final SoundType PURPUR = new SoundType(1F, 1F,
            ERSounds.PURPUR_BREAK.get(),
            ERSounds.PURPUR_STEP.get(),
            ERSounds.PURPUR_PLACE.get(),
            ERSounds.PURPUR_HIT.get(),
            ERSounds.PURPUR_FALL.get()
    );
    public static final SoundType END_IRON_ORE = new SoundType(1F, 1F,
            ERSounds.END_IRON_ORE_BREAK.get(),
            ERSounds.END_IRON_ORE_STEP.get(),
            ERSounds.END_IRON_ORE_PLACE.get(),
            ERSounds.END_IRON_ORE_HIT.get(),
            ERSounds.END_IRON_ORE_FALL.get()
    );
    public static final SoundType MIRESTONE_IRON_ORE = new SoundType(1F, 1F,
            ERSounds.MIRESTONE_IRON_ORE_BREAK.get(),
            ERSounds.MIRESTONE_IRON_ORE_STEP.get(),
            ERSounds.MIRESTONE_IRON_ORE_PLACE.get(),
            ERSounds.MIRESTONE_IRON_ORE_HIT.get(),
            ERSounds.MIRESTONE_IRON_ORE_FALL.get()
    );

    public static void init() {
    }
}
