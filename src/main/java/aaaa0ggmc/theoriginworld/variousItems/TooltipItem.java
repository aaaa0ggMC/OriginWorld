package aaaa0ggmc.theoriginworld.variousItems;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class TooltipItem extends Item {

    private String m_tid;
    private Formatting m_fmt;

    public TooltipItem(Settings settings,String translateId,Formatting fmt) {
        super(settings);
        m_tid = translateId;
        m_fmt = fmt;
    }

    public TooltipItem(Settings settings,String translateId) {
        this(settings, translateId, Formatting.WHITE);
    }

    @Override
    public void appendTooltip(ItemStack is, World wd, List<Text> tooltip, TooltipContext tc){
        tooltip.add(Text.translatable(m_tid).formatted(m_fmt));
    }
}
