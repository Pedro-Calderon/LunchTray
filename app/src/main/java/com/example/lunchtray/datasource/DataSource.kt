/*
 * Copyright (C) 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.lunchtray.datasource

import com.example.lunchtray.model.MenuItem.AccompanimentItem
import com.example.lunchtray.model.MenuItem.EntreeItem
import com.example.lunchtray.model.MenuItem.SideDishItem


object DataSource {

    val entreeMenuItems = listOf(
        EntreeItem(
            name = "Pizza de Pepperoni",
            description = "Little Ceasers",
            price = 90.00,
        ),
        EntreeItem(
            name = " 10 Alitas",
            description = "Buffalo ",
            price = 140.00,
        ),
        EntreeItem(
            name = "Pizza de Queso",
            description = "Little Ceasers",
            price = 150.00,
        ),
        EntreeItem(
            name = "10 Alitas",
            description = "BBQ",
            price = 120.00,
        )
    )

    val sideDishMenuItems = listOf(
        SideDishItem(
            name = "Papas Fritas Bolzaza",
            description ="Sabritas",
            price = 60.00,
        ),
        SideDishItem(
            name = "Papas a la Francesa",
            description = "Plato Grande",
            price =50.00 ,
        ),SideDishItem(
            name = "Papas a la Francesa",
            description = "Plato Chico",
            price =45.00 ,
        ),
        SideDishItem(
            name = "Papas Picosas",
            description = "Papas marmoleadas, asadas y fritas en una mezcla de especias de la casa",
            price = 80.00,
        ),
        SideDishItem(
            name = "papas Asadas",
            description = "Sal, Limon, y Chile",
            price = 75.00,
        )
    )

    val accompanimentMenuItems = listOf(
        AccompanimentItem(
            name = "Coca Cola",
            description = "Bien Fria",
            price = 25.00,
        ),
        AccompanimentItem(
            name = "Limonada",
            description = "De limon natural y fresco",
            price = 15.00,
        ),
        AccompanimentItem(
            name = "Agua Natural",
            description = "Al tiempo",
            price = 11.00,
        )
    )
}
