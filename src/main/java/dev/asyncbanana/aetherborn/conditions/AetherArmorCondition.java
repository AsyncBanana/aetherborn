
package dev.asyncbanana.aetherborn.conditions;

import io.github.apace100.apoli.power.factory.condition.ConditionFactory;
import io.github.apace100.apoli.registry.ApoliRegistries;
import io.github.apace100.calio.data.SerializableData;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class AetherArmorCondition {

    @SuppressWarnings("unchecked")
    public static void register() {
        register(new ConditionFactory<>(new Identifier("aetherborn","aether_armor"), new SerializableData(),
                (data, stack) -> {
                    if(stack.getItem() instanceof ArmorItem && Registry.ITEM.getId(stack.getItem()).getNamespace()!="the_aether") {
                        return true;
                    }
                    return false;
                }));
    }

    private static void register(ConditionFactory<ItemStack> conditionFactory) {
        Registry.register(ApoliRegistries.ITEM_CONDITION, conditionFactory.getSerializerId(), conditionFactory);
    }
}