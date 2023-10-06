package com.wipro.kotlin.oo.hierarchy

class Item(var id: Int = 0, var itemName: String = "")
class Product(var id: Int = 0, var name: String = "", var item: Item? = null)

class OrderService {
    fun findAll(): String {
        return "orders"
    }
}

class OrderController(var orderService: OrderService? = null) {
    fun findAll(): String? {
        return orderService?.findAll()
    }
}

fun main() {
    var orderCtrl = OrderController(OrderService())
    println(orderCtrl.findAll())

    orderCtrl = OrderController()
    println(orderCtrl.findAll())

    var product = Product(item = Item())
    println("Product ID ${product.id}")
    println("Product Name ${product.name}")
    println("Item ID ${product.item?.id}")
    println("Item Name ${product.item?.itemName}")

    product = Product(
        item = Item(
            id = 100,
            itemName = "Phone"
        ), id = 1, name = "IPHONE"
    )
    println("Product ID ${product.id}")
    println("Product Name ${product.name}")
    println("Item ID ${product.item?.id}")
    println("Item Name ${product.item?.itemName}")

}