package ru.netology.shoppinglist.domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItemForId(shopItemId: Int): ShopItem{
        return shopListRepository.getShopItemForId(shopItemId)
    }
}