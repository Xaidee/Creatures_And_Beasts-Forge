package com.cgessinger.creaturesandbeasts.common.init;

import com.cgessinger.creaturesandbeasts.CreaturesAndBeasts;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSoundEventTypes
{
	public static DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CreaturesAndBeasts.MOD_ID);

	public static final RegistryObject<SoundEvent> LITTLE_GREBE_AMBIENT = SOUND_EVENTS.register("entity.little_grebe.ambient", () ->
			new SoundEvent(new ResourceLocation(CreaturesAndBeasts.MOD_ID, "entity.little_grebe.ambient"))
	);

	public static final RegistryObject<SoundEvent> LITTLE_GREBE_HURT= SOUND_EVENTS.register("entity.little_grebe.hurt", () ->
			new SoundEvent(new ResourceLocation(CreaturesAndBeasts.MOD_ID, "entity.little_grebe.hurt"))
	);

	public static final RegistryObject<SoundEvent> LITTLE_GREBE_CHICK_AMBIENT = SOUND_EVENTS.register("entity.little_grebe_chick.ambient", () ->
			new SoundEvent(new ResourceLocation(CreaturesAndBeasts.MOD_ID, "entity.little_grebe_chick.ambient"))
	);

	public static final RegistryObject<SoundEvent> CINDERSHELL_AMBIENT = SOUND_EVENTS.register("entity.cindershell.ambient", () ->
			new SoundEvent(new ResourceLocation(CreaturesAndBeasts.MOD_ID, "entity.cindershell.ambient"))
	);

	public static final RegistryObject<SoundEvent> CINDERSHELL_HURT = SOUND_EVENTS.register("entity.cindershell.hurt", () ->
			new SoundEvent(new ResourceLocation(CreaturesAndBeasts.MOD_ID, "entity.cindershell.hurt"))
	);

	public static final RegistryObject<SoundEvent> SPORELING_OVERWORLD_AMBIENT = SOUND_EVENTS.register("entity.sporeling_overworld.ambient", () ->
			new SoundEvent(new ResourceLocation(CreaturesAndBeasts.MOD_ID, "entity.sporeling_overworld.ambient"))
	);

	public static final RegistryObject<SoundEvent> SPORELING_OVERWORLD_HURT = SOUND_EVENTS.register("entity.sporeling_overworld.hurt", () ->
			new SoundEvent(new ResourceLocation(CreaturesAndBeasts.MOD_ID, "entity.sporeling_overworld.hurt"))
	);

	public static final RegistryObject<SoundEvent> SPORELING_NETHER_AMBIENT = SOUND_EVENTS.register("entity.sporeling_nether.ambient", () ->
			new SoundEvent(new ResourceLocation(CreaturesAndBeasts.MOD_ID, "entity.sporeling_nether.ambient"))
	);

	public static final RegistryObject<SoundEvent> SPORELING_NETHER_HURT = SOUND_EVENTS.register("entity.sporeling_nether.hurt", () ->
			new SoundEvent(new ResourceLocation(CreaturesAndBeasts.MOD_ID, "entity.sporeling_nether.hurt"))
	);

	public static final RegistryObject<SoundEvent> SPORELING_WARPED_AMBIENT = SOUND_EVENTS.register("entity.sporeling_warped.ambient", () ->
			new SoundEvent(new ResourceLocation(CreaturesAndBeasts.MOD_ID, "entity.sporeling_warped.ambient"))
	);

	public static final RegistryObject<SoundEvent> SPORELING_WARPED_HURT = SOUND_EVENTS.register("entity.sporeling_warped.hurt", () ->
			new SoundEvent(new ResourceLocation(CreaturesAndBeasts.MOD_ID, "entity.sporeling_warped.hurt"))
	);

	public static final RegistryObject<SoundEvent> SPORELING_BITE = SOUND_EVENTS.register("entity.sporeling.bite", () ->
			new SoundEvent(new ResourceLocation(CreaturesAndBeasts.MOD_ID, "entity.sporeling.bite"))
	);

	public static final RegistryObject<SoundEvent> LILYTAD_AMBIENT = SOUND_EVENTS.register("entity.lilytad.ambient", () ->
			new SoundEvent(new ResourceLocation(CreaturesAndBeasts.MOD_ID, "entity.lilytad.ambient"))
	);

	public static final RegistryObject<SoundEvent> LILYTAD_HURT = SOUND_EVENTS.register("entity.lilytad.hurt", () ->
			new SoundEvent(new ResourceLocation(CreaturesAndBeasts.MOD_ID, "entity.lilytad.hurt"))
	);

	public static final RegistryObject<SoundEvent> LILYTAD_DEATH = SOUND_EVENTS.register("entity.lilytad.death", () ->
			new SoundEvent(new ResourceLocation(CreaturesAndBeasts.MOD_ID, "entity.lilytad.death"))
	);

	public static final RegistryObject<SoundEvent> YETI_AMBIENT = SOUND_EVENTS.register("entity.yeti.ambient", () ->
			new SoundEvent(new ResourceLocation(CreaturesAndBeasts.MOD_ID, "entity.yeti.ambient"))
	);

	public static final RegistryObject<SoundEvent> YETI_HURT = SOUND_EVENTS.register("entity.yeti.hurt", () ->
			new SoundEvent(new ResourceLocation(CreaturesAndBeasts.MOD_ID, "entity.yeti.hurt"))
	);

	public static final RegistryObject<SoundEvent> YETI_STEP = SOUND_EVENTS.register("entity.yeti.step", () ->
			new SoundEvent(new ResourceLocation(CreaturesAndBeasts.MOD_ID, "entity.yeti.step"))
	);
}
