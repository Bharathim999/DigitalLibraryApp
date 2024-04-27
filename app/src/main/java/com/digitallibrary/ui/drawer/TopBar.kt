package com.digitallibrary.ui.drawer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.digitallibrary.R
import com.digitallibrary.routing.Screen
import com.digitallibrary.ui.theme.black
import com.digitallibrary.ui.theme.brown
import com.digitallibrary.ui.theme.white

@Composable
fun TopBar(
    navController: NavController,
    onNavigationIconClick: () -> Unit,
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    if (currentRoute == null || currentRoute == Screen.LoginScreen.route) {
        return
    }

    TopAppBar(
        title = {
            Text(text = stringResource(id = R.string.app_name), color = white)
        },
        modifier = androidx.compose.ui.Modifier
            .background(brown)
            .padding(top = 45.dp),
        navigationIcon = {
            IconButton(onClick = onNavigationIconClick) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = null,
                    tint = white
                )
            }
        },
        backgroundColor = brown
    )
}