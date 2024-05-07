package com.example.middleexam

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable

@Composable
fun IndexPage(navController: NavHostController) {
    Column {
        NavigationBar {
            NavigationItem("商品", onClick = { navController.navigate("CommodityPage") })
            NavigationItem("装备", onClick = { navController.navigate("EquipmentPage") })
            NavigationItem("结束", onClick = { navController.navigate("EndPage") })
        }
    }
}

fun NavigationItem(s: String, onClick: () -> Unit) {


}
