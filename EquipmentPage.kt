package com.example.middleexam

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable

@Composable
fun EquipmentPage(
    equipmentList: List<Equipment>,
    onAdd: () -> Unit,
    onEdit: (Equipment) -> Unit,
    onDelete: (Equipment) -> Unit,
    navController: NavHostController
) {
    Column {
        // 装备列表展示
        // 增删改操作按钮
    }
}

interface NavHostController {
    fun navigate(s: String) {

    }

}
