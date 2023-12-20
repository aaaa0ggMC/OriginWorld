package aaaa0ggmc.theoriginworld;

import aaaa0ggmc.theoriginworld.effects.Trainee;
import aaaa0ggmc.theoriginworld.variousItems.TooltipItem;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Formatting;

public class ModItems {
    public static final Item CHICKEN_CXK;

    static{
        CHICKEN_CXK = new TooltipItem(new Item.Settings().
                group(ItemGroup.FOOD).food(Foods.CHICKEN_CXK),
                "item.tow.chicken_cxk.tooltip", Formatting.YELLOW);
    }
}

class Foods{
    public static final FoodComponent CHICKEN_CXK = SimpleBuild(20,1.0f,new Trainee(),150);

    public static FoodComponent SimpleBuild(int hunger, float saturation, StatusEffect e,int dur){
       return new FoodComponent.Builder()
                .hunger(hunger)
                .saturationModifier(saturation)
                .statusEffect(
                        new StatusEffectInstance(e,dur,
                                1,false,false)
                ,1)
                .build();
    }
}
