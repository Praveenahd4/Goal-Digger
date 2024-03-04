package com.hd.goaldigger.ui.screens.list

import androidx.compose.foundation.background
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hd.goaldigger.R
import com.hd.goaldigger.components.PriorityItem
import com.hd.goaldigger.data.Priority

@Composable
fun ListAppBar() {
    DefaultListAppBar(
        onSearchClicked = { }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DefaultListAppBar(onSearchClicked: () -> Unit) {
    TopAppBar(title = { Text(text = "Goals") },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.surfaceColorAtElevation(3.dp)
        ),
        actions = {
            ListAppBarActions(onSearchClicked)

        }
    )
}

@Composable
fun ListAppBarActions(onSearchClicked: () -> Unit) {
    SearchAction(onSearchClicked)
}

@Composable
fun SearchAction(
    onSearchClicked: () -> Unit
) {
    IconButton(onClick = { onSearchClicked() }
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = stringResource(id = R.string.search_action)
        )

    }
}

@Composable
fun SortAction(onSortClicked: (Priority) -> Unit) {

    var expanded by remember {
        mutableStateOf(false)
    }

    IconButton(onClick = { expanded = true }) {
        Icon(
            painter = painterResource(id = R.drawable.ic_filter_list),
            contentDescription = stringResource(
                id = R.string.filter_action
            )
        )
        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
//            DropdownMenuItem(
//                text = PriorityItem(priority = Priority.LOW),
//                onClick = {
//                    expanded = false
//                    onSortClicked(Priority.LOW)
//                }
//            )
//            DropdownMenuItem(
//                text = PriorityItem(priority = Priority.MEDIUM),
//                onClick = {
//                    expanded = false
//                    onSortClicked(Priority.MEDIUM)
//                }
//            )
//            DropdownMenuItem(
//                text = PriorityItem(priority = Priority.HIGH),
//                onClick = {
//                    expanded = false
//                    onSortClicked(Priority.HIGH)
//                }
//            )
//            DropdownMenuItem(
//                text = PriorityItem(priority = Priority.NONE),
//                onClick = {
//                    expanded = false
//                    onSortClicked(Priority.NONE)
//                }
//            )
        }
    }
}

@Composable
@Preview
private fun DefaultListAppBarPreview() {
    DefaultListAppBar(
        onSearchClicked = { }
    )
}