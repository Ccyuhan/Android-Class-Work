data class Commodity(
    val id: Int,
    val name: String,
    val price: Double,
    val quantity: Int,
    val description: String
)

data class Equipment(
    val equipmentId: Int,
    val equipmentName: String,
    val equipmentType: String,
    val capacity: Int,
    val status: String
)

val commodityList = listOf(
    Commodity(1, "商品 1", 10.0, 5, "描述 1"),
    Commodity(2, "商品 2", 15.0, 3, "描述 2"),
    Commodity(3, "商品 3", 20.0, 8, "描述 3"),
    Commodity(4, "商品 4", 25.0, 2, "描述 4"),
    Commodity(5, "商品 5", 30.0, 6, "描述 5")
)

val equipmentList = listOf(
    Equipment(1, "装备 1", "类型 1", 100, "良好"),
    Equipment(2, "装备 2", "类型 2", 150, "损坏"),
    Equipment(3, "装备 3", "类型 3", 200, "正常"),
    Equipment(4, "装备 4", "类型 4", 250, "维修中"),
    Equipment(5, "装备 5", "类型 5", 300, "可用")
)