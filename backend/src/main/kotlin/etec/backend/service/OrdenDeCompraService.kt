package etec.backend.service

data class Item(
    val nombre: String,
    val precio: Int
)

class OrdenDeCompra() {
    val items = mutableListOf<Item>()
    fun agregarItem(unItem: Item) {
        TODO("por implemento")
    }

    fun calcularTotal(): Int {
        return this.items.sumOf { it.precio }
    }
}
