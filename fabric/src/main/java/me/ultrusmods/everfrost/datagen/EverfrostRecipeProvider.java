package me.ultrusmods.everfrost.datagen;

import me.ultrusmods.everfrost.registry.EverfrostItems;
import me.ultrusmods.everfrost.tag.EverFrostItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.flag.FeatureFlags;

import java.util.concurrent.CompletableFuture;

public class EverfrostRecipeProvider extends RecipeProvider {
    public EverfrostRecipeProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(packOutput, completableFuture);
    }

    @Override
    public void buildRecipes(RecipeOutput recipeOutput) {
        generateRecipes(recipeOutput, EverfrostBlockFamilies.MYRTLE_PLANKS, FeatureFlags.VANILLA_SET);
        planksFromLogs(recipeOutput, EverfrostItems.MYRTLE_PLANKS, EverFrostItemTags.MYRTLE_LOGS, 4);

    }
}
