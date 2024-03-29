package com.example.cookbook.data.dish

import androidx.core.content.edit
import com.example.cookbook.R
import com.example.cookbook.presentation.Application
import kotlinx.coroutines.flow.map

object DishRepository {

    private val preferences get() = Application.favoritePreferences


    val dishes
        get() = listOf(
            Dish(
                0,
                R.drawable.img_dish_ivlev_caesar_primary,
                R.string.ivlev_caesar_name,
                0,
                0,
                listOf(
                    Dish.Step(
                        R.drawable.img_dish_ivlev_caesar_primary,
                        R.string.ivlev_caesar_ingredients
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ivlev_caesar_step_1,
                        R.string.ivlev_caesar_step_1
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ivlev_caesar_step_2,
                        R.string.ivlev_caesar_step_2
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ivlev_caesar_step_3,
                        R.string.ivlev_caesar_step_3
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ivlev_caesar_step_4,
                        R.string.ivlev_caesar_step_4
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ivlev_caesar_step_5,
                        R.string.ivlev_caesar_step_5
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ivlev_caesar_step_6,
                        R.string.ivlev_caesar_step_6
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ivlev_caesar_primary,
                        R.string.ivlev_caesar_step_7
                    ),
                ),
                preferences.getBoolean("0", false)
            ),
            Dish(
                1,
                R.drawable.img_dish_ivlev_pasta_prawns_primary,
                R.string.ivlev_pasta_prawns_name,
                0,
                1,
                listOf(
                    Dish.Step(
                        R.drawable.img_dish_ivlev_pasta_prawns_primary,
                        R.string.ivlev_pasta_prawns_ingredients
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ivlev_pasta_prawns_step_1,
                        R.string.ivlev_pasta_prawns_step_1
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ivlev_pasta_prawns_step_2,
                        R.string.ivlev_pasta_prawns_step_2
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ivlev_pasta_prawns_step_3,
                        R.string.ivlev_pasta_prawns_step_3
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ivlev_pasta_prawns_step_4,
                        R.string.ivlev_pasta_prawns_step_4
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ivlev_pasta_prawns_step_5,
                        R.string.ivlev_pasta_prawns_step_5
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ivlev_pasta_prawns_step_6,
                        R.string.ivlev_pasta_prawns_step_6
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ivlev_pasta_prawns_primary,
                        R.string.ivlev_pasta_prawns_step_7
                    ),
                ),
                preferences.getBoolean("1", false)
            ),
            Dish(
                2,
                R.drawable.img_dish_ivlev_pasta_carbonara_primary,
                R.string.ivlev_pasta_carbonara_name,
                0,
                1,
                listOf(
                    Dish.Step(
                        R.drawable.img_dish_ivlev_pasta_carbonara_primary,
                        R.string.ivlev_pasta_carbonara_ingredients
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ivlev_pasta_carbonara_step_1,
                        R.string.ivlev_pasta_carbonara_step_1
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ivlev_pasta_carbonara_step_2,
                        R.string.ivlev_pasta_carbonara_step_2
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ivlev_pasta_carbonara_step_3,
                        R.string.ivlev_pasta_carbonara_step_3
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ivlev_pasta_carbonara_step_4,
                        R.string.ivlev_pasta_carbonara_step_4
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ivlev_pasta_carbonara_primary,
                        R.string.ivlev_pasta_carbonara_step_5
                    ),
                ),
                preferences.getBoolean("2", false)
            ),
            Dish(
                3,
                R.drawable.img_dish_ivlev_potato_waffels_primary,
                R.string.ivlev_potato_waffels_name,
                0,
                2,
                listOf(
                    Dish.Step(
                        R.drawable.img_dish_ivlev_potato_waffels_primary,
                        R.string.ivlev_potato_waffels_ingredients
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ivlev_potato_waffels_step_1,
                        R.string.ivlev_potato_waffels_step_1
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ivlev_potato_waffels_step_2,
                        R.string.ivlev_potato_waffels_step_2
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ivlev_potato_waffels_primary,
                        R.string.ivlev_potato_waffels_step_3
                    ),
                ),
                preferences.getBoolean("3", false)
            ),
            Dish(
                4,
                R.drawable.img_dish_ivlev_pancake_cake_primary,
                R.string.ivlev_pancake_cake_name,
                0,
                2,
                listOf(
                    Dish.Step(
                        R.drawable.img_dish_ivlev_pancake_cake_primary,
                        R.string.ivlev_pancake_cake_ingredients
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ivlev_pancake_cake_step_1,
                        R.string.ivlev_pancake_cake_step_1
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ivlev_pancake_cake_step_2,
                        R.string.ivlev_pancake_cake_step_2
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ivlev_pancake_cake_step_3,
                        R.string.ivlev_pancake_cake_step_3
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ivlev_pancake_cake_step_4,
                        R.string.ivlev_pancake_cake_step_4
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ivlev_pancake_cake_step_5,
                        R.string.ivlev_pancake_cake_step_5
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ivlev_pancake_cake_step_6,
                        R.string.ivlev_pancake_cake_step_6
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ivlev_pancake_cake_step_7,
                        R.string.ivlev_pancake_cake_step_7
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ivlev_pancake_cake_step_8,
                        R.string.ivlev_pancake_cake_step_8
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ivlev_pancake_cake_primary,
                        R.string.ivlev_pancake_cake_step_9
                    ),
                ),
                preferences.getBoolean("4", false)
            ),
            Dish(
                5,
                R.drawable.img_dish_ramsay_salad_mango_chicken_primary,
                R.string.ramsay_salad_mango_chicken_name,
                1,
                0,
                listOf(
                    Dish.Step(
                        R.drawable.img_dish_ramsay_salad_mango_chicken_primary,
                        R.string.ramsay_salad_mango_chicken_ingredients
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_salad_mango_chicken_step_1,
                        R.string.ramsay_salad_mango_chicken_step_1
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_salad_mango_chicken_step_2,
                        R.string.ramsay_salad_mango_chicken_step_2
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_salad_mango_chicken_step_3,
                        R.string.ramsay_salad_mango_chicken_step_3
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_salad_mango_chicken_step_4,
                        R.string.ramsay_salad_mango_chicken_step_4
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_salad_mango_chicken_primary,
                        R.string.ramsay_salad_mango_chicken_step_5
                    ),
                ),
                preferences.getBoolean("5", false)
            ),
            Dish(
                6,
                R.drawable.img_dish_ramsay_salad_tomato_primary,
                R.string.ramsay_salad_tomato_name,
                1,
                0,
                listOf(
                    Dish.Step(
                        R.drawable.img_dish_ramsay_salad_tomato_primary,
                        R.string.ramsay_salad_tomato_ingredients
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_salad_tomato_step_1,
                        R.string.ramsay_salad_tomato_step_1
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_salad_tomato_step_2,
                        R.string.ramsay_salad_tomato_step_2
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_salad_tomato_step_3,
                        R.string.ramsay_salad_tomato_step_3
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_salad_tomato_step_4,
                        R.string.ramsay_salad_tomato_step_4
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_salad_tomato_primary,
                        R.string.ramsay_salad_tomato_step_5
                    ),
                ),
                preferences.getBoolean("6", false)
            ),
            Dish(
                7,
                R.drawable.img_dish_ramsay_baked_pork_primary,
                R.string.ramsay_baked_pork_name,
                1,
                1,
                listOf(
                    Dish.Step(
                        R.drawable.img_dish_ramsay_baked_pork_primary,
                        R.string.ramsay_baked_pork_ingredients
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_baked_pork_step_1,
                        R.string.ramsay_baked_pork_step_1
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_baked_pork_step_2,
                        R.string.ramsay_baked_pork_step_2
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_baked_pork_step_3,
                        R.string.ramsay_baked_pork_step_3
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_baked_pork_step_4,
                        R.string.ramsay_baked_pork_step_4
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_baked_pork_step_5,
                        R.string.ramsay_baked_pork_step_5
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_baked_pork_step_6,
                        R.string.ramsay_baked_pork_step_6
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_baked_pork_primary,
                        R.string.ramsay_baked_pork_step_7
                    ),
                ),
                preferences.getBoolean("7", false)
            ),
            Dish(
                8,
                R.drawable.img_dish_ramsay_rabbit_fricassee_primary,
                R.string.ramsay_rabbit_fricassee_name,
                1,
                1,
                listOf(
                    Dish.Step(
                        R.drawable.img_dish_ramsay_rabbit_fricassee_primary,
                        R.string.ramsay_rabbit_fricassee_ingredients
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_rabbit_fricassee_step_1,
                        R.string.ramsay_rabbit_fricassee_step_1
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_rabbit_fricassee_step_2,
                        R.string.ramsay_rabbit_fricassee_step_2
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_rabbit_fricassee_step_3,
                        R.string.ramsay_rabbit_fricassee_step_3
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_rabbit_fricassee_primary,
                        R.string.ramsay_rabbit_fricassee_step_4
                    ),
                ),
                preferences.getBoolean("8", false)
            ),
            Dish(
                9,
                R.drawable.img_dish_ramsay_cocktail_primary,
                R.string.ramsay_cocktail_name,
                1,
                2,
                listOf(
                    Dish.Step(
                        R.drawable.img_dish_ramsay_cocktail_primary,
                        R.string.ramsay_cocktail_ingredients
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_cocktail_step_1,
                        R.string.ramsay_cocktail_step_1
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_cocktail_step_2,
                        R.string.ramsay_cocktail_step_2
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_cocktail_step_3,
                        R.string.ramsay_cocktail_step_3
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_cocktail_step_4,
                        R.string.ramsay_cocktail_step_4
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_cocktail_primary,
                        R.string.ramsay_cocktail_step_5
                    ),
                ),
                preferences.getBoolean("9", false)
            ),
            Dish(
                10,
                R.drawable.img_dish_ramsay_ice_cream_primary,
                R.string.ramsay_ice_cream_name,
                1,
                2,
                listOf(
                    Dish.Step(
                        R.drawable.img_dish_ramsay_ice_cream_primary,
                        R.string.ramsay_ice_cream_ingredients
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_ice_cream_step_1,
                        R.string.ramsay_ice_cream_step_1
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_ice_cream_step_2,
                        R.string.ramsay_ice_cream_step_2
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_ice_cream_step_3,
                        R.string.ramsay_ice_cream_step_3
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_ice_cream_primary,
                        R.string.ramsay_ice_cream_step_4
                    ),
                ),
                preferences.getBoolean("10", false)
            ),
            Dish(
                11,
                R.drawable.img_dish_ramsay_profiteroles_primary,
                R.string.ramsay_profiteroles_name,
                1,
                2,
                listOf(
                    Dish.Step(
                        R.drawable.img_dish_ramsay_profiteroles_primary,
                        R.string.ramsay_profiteroles_ingredients
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_profiteroles_step_1,
                        R.string.ramsay_profiteroles_step_1
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_profiteroles_step_2,
                        R.string.ramsay_profiteroles_step_2
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_profiteroles_step_3,
                        R.string.ramsay_profiteroles_step_3
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_profiteroles_step_4,
                        R.string.ramsay_profiteroles_step_4
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_profiteroles_step_5,
                        R.string.ramsay_profiteroles_step_5
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_profiteroles_step_6,
                        R.string.ramsay_profiteroles_step_6
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ramsay_profiteroles_primary,
                        R.string.ramsay_profiteroles_step_7
                    ),
                ),
                preferences.getBoolean("11", false)
            ),
            Dish(
                12,
                R.drawable.img_dish_ducasse_caesar_primary,
                R.string.ducasse_caesar_name,
                2,
                0,
                listOf(
                    Dish.Step(
                        R.drawable.img_dish_ducasse_caesar_primary,
                        R.string.ducasse_caesar_ingredients
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_caesar_step_1,
                        R.string.ducasse_caesar_step_1
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_caesar_step_2,
                        R.string.ducasse_caesar_step_2
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_caesar_step_3,
                        R.string.ducasse_caesar_step_3
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_caesar_step_4,
                        R.string.ducasse_caesar_step_4
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_caesar_step_5,
                        R.string.ducasse_caesar_step_5
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_caesar_primary,
                        R.string.ducasse_caesar_step_6
                    ),
                ),
                preferences.getBoolean("12", false)
            ),
            Dish(
                13,
                R.drawable.img_dish_ducasse_goat_cheese_primary,
                R.string.ducasse_goat_cheese_salad_name,
                2,
                0,
                listOf(
                    Dish.Step(
                        R.drawable.img_dish_ducasse_goat_cheese_primary,
                        R.string.ducasse_goat_cheese_salad_ingredients
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_goat_cheese_step_1,
                        R.string.ducasse_goat_cheese_salad_step_1
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_goat_cheese_step_2,
                        R.string.ducasse_goat_cheese_salad_step_2
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_goat_cheese_primary,
                        R.string.ducasse_goat_cheese_salad_step_3
                    ),
                ),
                preferences.getBoolean("13", false)
            ),
            Dish(
                14,
                R.drawable.img_dish_ducasse_pumpkin_puree_primary,
                R.string.ducasse_pumpkin_puree_name,
                2,
                1,
                listOf(
                    Dish.Step(
                        R.drawable.img_dish_ducasse_pumpkin_puree_primary,
                        R.string.ducasse_pumpkin_puree_ingredients
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_pumpkin_puree_step_1,
                        R.string.ducasse_pumpkin_puree_step_1
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_pumpkin_puree_step_2,
                        R.string.ducasse_pumpkin_puree_step_2
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_pumpkin_puree_step_3,
                        R.string.ducasse_pumpkin_puree_step_3
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_pumpkin_puree_primary,
                        R.string.ducasse_pumpkin_puree_step_4
                    ),
                ),
                preferences.getBoolean("14", false)
            ),
            Dish(
                15,
                R.drawable.img_dish_ducasse_steamed_rice_vegetables_primary,
                R.string.ducasse_steamed_rice_vegetables_name,
                2,
                1,
                listOf(
                    Dish.Step(
                        R.drawable.img_dish_ducasse_steamed_rice_vegetables_primary,
                        R.string.ducasse_steamed_rice_vegetables_ingredients
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_steamed_rice_vegetables_step_1,
                        R.string.ducasse_steamed_rice_vegetables_step_1
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_steamed_rice_vegetables_step_2,
                        R.string.ducasse_steamed_rice_vegetables_step_2
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_steamed_rice_vegetables_primary,
                        R.string.ducasse_steamed_rice_vegetables_step_3
                    ),
                ),
                preferences.getBoolean("15", false)
            ),
            Dish(
                16,
                R.drawable.img_dish_ducasse_steamed_rice_eggs_primary,
                R.string.ducasse_steamed_rice_eggs_name,
                2,
                1,
                listOf(
                    Dish.Step(
                        R.drawable.img_dish_ducasse_steamed_rice_eggs_primary,
                        R.string.ducasse_steamed_rice_eggs_ingredients
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_steamed_rice_eggs_step_1,
                        R.string.ducasse_steamed_rice_eggs_step_1
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_steamed_rice_eggs_step_2,
                        R.string.ducasse_steamed_rice_eggs_step_2
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_steamed_rice_eggs_step_3,
                        R.string.ducasse_steamed_rice_eggs_step_3
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_steamed_rice_eggs_step_4,
                        R.string.ducasse_steamed_rice_eggs_step_4
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_steamed_rice_eggs_primary,
                        R.string.ducasse_steamed_rice_eggs_step_5
                    ),
                ),
                preferences.getBoolean("16", false)
            ),
            Dish(
                17,
                R.drawable.img_dish_ducasse_plum_tart_primary,
                R.string.ducasse_plum_tart_name,
                2,
                2,
                listOf(
                    Dish.Step(
                        R.drawable.img_dish_ducasse_plum_tart_primary,
                        R.string.ducasse_plum_tart_ingredients
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_plum_tart_step_1,
                        R.string.ducasse_plum_tart_step_1
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_plum_tart_step_2,
                        R.string.ducasse_plum_tart_step_2
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_plum_tart_step_3,
                        R.string.ducasse_plum_tart_step_3
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_plum_tart_step_4,
                        R.string.ducasse_plum_tart_step_4
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_plum_tart_step_5,
                        R.string.ducasse_plum_tart_step_5
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_plum_tart_step_6,
                        R.string.ducasse_plum_tart_step_6
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_plum_tart_primary,
                        R.string.ducasse_plum_tart_step_7
                    ),
                ),
                preferences.getBoolean("17", false)
            ),
            Dish(
                18,
                R.drawable.img_dish_ducasse_ice_cream_primary,
                R.string.ducasse_ice_cream_name,
                2,
                2,
                listOf(
                    Dish.Step(
                        R.drawable.img_dish_ducasse_ice_cream_primary,
                        R.string.ducasse_ice_cream_ingredients
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_ice_cream_step_1,
                        R.string.ducasse_ice_cream_step_1
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_ice_cream_step_2,
                        R.string.ducasse_ice_cream_step_2
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_ice_cream_step_3,
                        R.string.ducasse_ice_cream_step_3
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_ice_cream_step_4,
                        R.string.ducasse_ice_cream_step_4
                    ),
                    Dish.Step(
                        R.drawable.img_dish_ducasse_ice_cream_primary,
                        R.string.ducasse_ice_cream_step_5
                    ),
                ),
                preferences.getBoolean("18", false)
            )
        )

    fun changeFavorite(id: Int) {
        preferences.edit(commit = true) {
            putBoolean(id.toString(), !preferences.getBoolean(id.toString(), false))
        }
    }
}