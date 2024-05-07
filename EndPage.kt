package com.example.middleexam

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable
fun EndPage(navController: NavHostController) {
    Column {
        Button(
            modifier = Modifier.padding(16.dp),
            onClick = {
                // 显示"考试结束"
            }
        ) {
            Text("Exam Over")
        }
    }
}

object Modifier {
    fun padding(dp: Any): Any {
        TODO("Not yet implemented")
    }

}

fun Text(s: String) {
    TODO("Not yet implemented")
}

fun Button(modifier: Any, onClick: () -> Unit, function: () -> Unit) {

}
