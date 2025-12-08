package org.test.stuff.sound;

import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.test.stuff.Stuff;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTs =
       DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Stuff.MODID);

    public static void register(IEventBus eventBus) {
        SOUND_EVENTs.register(eventBus);
    }
}
