package ru.netology.shoppinglist.domain

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun removeShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItemForId(shopItem: Int): ShopItem

    fun getShopList(): List<ShopItem>
}