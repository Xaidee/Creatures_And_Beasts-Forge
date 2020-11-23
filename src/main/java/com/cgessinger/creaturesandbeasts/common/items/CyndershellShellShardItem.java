package com.cgessinger.creaturesandbeasts.common.items;

import com.cgessinger.creaturesandbeasts.CreaturesAndBeasts;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CyndershellShellShardItem extends Item
{
	public CyndershellShellShardItem ()
	{
		super(new Item.Properties().group(CreaturesAndBeasts.TAB));
	}

	@Override
	public int getBurnTime (ItemStack itemStack)
	{
		return 6400;
	}
}
