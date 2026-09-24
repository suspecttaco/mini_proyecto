package com.uas.miniproyecto

import androidx.compose.material3.FloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.keepScreenOn
import androidx.compose.ui.platform.LocalContext
import com.uas.miniproyecto.data.PreferencesManager

@Composable
fun FormScreen() {
    val context = LocalContext.current
    val preferencesManager = remember { PreferencesManager(context) }

    var studentId by remember { mutableStateOf("") }
    var fullName by remember { mutableStateOf("") }
    var degree by remember { mutableStateOf("") }
    var shift by remember { mutableStateOf(false) }
    var status by remember { mutableStateOf(false) }
    var darkTheme by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        studentId = preferencesManager.getStudentId()
        fullName = preferencesManager.getFullName()
        degree = preferencesManager.getDegree()
        shift = preferencesManager.getShift()
        status = preferencesManager.getStatus()
        darkTheme = preferencesManager.getDarkThemeFlag()
    }


}