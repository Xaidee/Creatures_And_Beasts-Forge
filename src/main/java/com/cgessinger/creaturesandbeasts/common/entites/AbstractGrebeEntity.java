package com.cgessinger.creaturesandbeasts.common.entites;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;

public abstract class AbstractGrebeEntity extends AnimalEntity
{
	public static final Ingredient TEMPTATION_ITEMS = Ingredient.fromItems(Items.WHEAT_SEEDS, Items.MELON_SEEDS, Items.PUMPKIN_SEEDS, Items.BEETROOT_SEEDS);
	public float wingRotation;
	public float destPos;
	public float oFlapSpeed;
	public float oFlap;
	public float wingRotDelta = 1.0F;

	public AbstractGrebeEntity (EntityType<? extends AnimalEntity> type, World worldIn)
	{
		super(type, worldIn);
	}

	static public AttributeModifierMap.MutableAttribute setCustomAttributes()
	{
		return MobEntity.func_233666_p_();
	}

	@Override
	protected void registerGoals() {
		this.goalSelector.addGoal(0, new SwimGoal(this));
		this.goalSelector.addGoal(1, new PanicGoal(this, 1.0D));
		this.goalSelector.addGoal(3, new TemptGoal(this, 1.0D, false, TEMPTATION_ITEMS));
		this.goalSelector.addGoal(5, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
		this.goalSelector.addGoal(6, new LookAtGoal(this, PlayerEntity.class, 6.0F));
		this.goalSelector.addGoal(7, new LookRandomlyGoal(this));
	}

	@Override
	public void livingTick()
	{
		super.livingTick();
		this.oFlap = this.wingRotation;
		this.oFlapSpeed = this.destPos;
		this.destPos = (float) ((double) this.destPos + (double) (this.onGround ? -1 : 4) * 0.3D);
		this.destPos = MathHelper.clamp(this.destPos, 0.0F, 1.0F);
		if (!this.onGround && this.wingRotDelta < 1.0F)
		{
			this.wingRotDelta = 1.0F;
		}

		this.wingRotDelta = (float)(this.wingRotDelta * 0.9D);
		Vector3d vector3d = this.getMotion();
		if (!this.onGround && vector3d.y < 0.0D)
		{
			this.setMotion(vector3d.mul(1.0D, 0.6D, 1.0D));
		}

		this.wingRotation += this.wingRotDelta * 2.0F;
	}

	@Nullable
	@Override
	public AgeableEntity func_241840_a (ServerWorld p_241840_1_, AgeableEntity p_241840_2_)
	{
		return null;
	}
}
