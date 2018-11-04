package com.epm.recipe.persistence;

import com.epm.recipe.domain.Recipe;

import java.util.List;

public interface RecipeRepository {
    List<Recipe> findAll();
    Recipe findById(long id);
    void create(Recipe recipe);
    void update(Recipe recipe);
    void delete(long id);

}
