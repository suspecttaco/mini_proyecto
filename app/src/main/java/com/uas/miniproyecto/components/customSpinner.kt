package com.uas.miniproyecto.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun CustomSpinner() {
    var expanded by remember { mutableStateOf(false) }
    var selectedText by remember { mutableStateOf("Seleccionar opcion") }

    Box(modifier = Modifier.fillMaxWidth()) {
        OutlinedTextField(
            value = selectedText,
            onValueChange = {},
            readOnly = true,
            modifier = Modifier.fillMaxWidth(),
            trailingIcon = {
                IconButton(onClick = {expanded = true}) {
                    Icon(Icons.Default.ArrowDropDown, contentDescription = null)
                }
            }
        )

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = {expanded = false}
        ) {
            DropdownMenuItem(
                text = { Text("Ingenieria de Software") },
                onClick = {
                    selectedText = "Ingenieria de Software"
                    expanded = false
                }
            )

            DropdownMenuItem(
                text = { Text("Ingenieria Civil") },
                onClick = {
                    selectedText = "Ingenieria Civil"
                    expanded = false
                }
            )

            DropdownMenuItem(
                text = { Text("Ingenieria en Procesos Industriales") },
                onClick = {
                    selectedText = "Ingenieria en Procesos Industriales"
                    expanded = false
                }
            )

            DropdownMenuItem(
                text = { Text("Ingenieria Geodesica") },
                onClick = {
                    selectedText = "Ingenieria Geodesica"
                    expanded = false
                }
            )
        }
    }
}