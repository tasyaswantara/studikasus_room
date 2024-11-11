/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.inventory.data


/**
 * Entity data class represents a single row in the database.
 */
class Item(
    val id: Int = 0,  // Infoermasi ID barang, default-nya 0
    val name: String, // Informasi Nama barang
    val price: Double, // Informasi Harga barang
    val quantity: Int // Informasi Jumlah barang yang tersedia
)
