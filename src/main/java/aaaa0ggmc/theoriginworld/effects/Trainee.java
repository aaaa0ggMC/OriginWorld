package aaaa0ggmc.theoriginworld.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;


public class Trainee extends StatusEffect {

    private boolean m_inited = false;

    private boolean m_valid = true;

    public Trainee() {
        super(StatusEffectCategory.BENEFICIAL, 0xeeeeee);
    }

    @Override
    public boolean canApplyUpdateEffect(int dur,int amp){
        if(dur != 150){
            m_valid = false;
        }
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity le,int amp){
        if((le instanceof PlayerEntity player)){
            if(!m_inited) {
                m_inited = true;
                if(!m_valid)player.sendMessage(Text.translatable("tip.tow.invalidDur").formatted(Formatting.RED));
                else player.sendMessage(Text.translatable("tip.tow.traineeText").formatted(Formatting.YELLOW));
            }
            if(m_valid)player.addExperience(4);
        }
    }
}
