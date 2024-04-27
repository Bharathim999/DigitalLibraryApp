package com.digitallibrary.ui.main

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.digitallibrary.R
import com.digitallibrary.application.AppConfig.Companion.categoryList
import com.digitallibrary.routing.Screen
import com.digitallibrary.ui.drawer.DrawerBody
import com.digitallibrary.ui.drawer.DrawerHeader
import com.digitallibrary.ui.drawer.TopBar
import com.digitallibrary.ui.model.BooksModel
import com.digitallibrary.ui.model.CategoryModel
import com.digitallibrary.ui.restaurantPreference.RestaurantPreference
import com.digitallibrary.ui.theme.DigitalLibraryAppTheme
import com.digitallibrary.ui.theme.black
import com.digitallibrary.ui.theme.white
import com.digitallibrary.ui.theme.brown
import com.digitallibrary.utils.LibraryBorderField
import com.digitallibrary.utils.RoundedButton
import com.digitallibrary.utils.isValidEmail
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "MutableCollectionMutableState")
@Composable
fun MainScreen(navController: NavController) {
    val context = LocalContext.current
    val preferenceManager = remember {
        RestaurantPreference(context)
    }
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    var isLogout by remember { mutableStateOf(false) }

    val scrollState = rememberScrollState()



    DigitalLibraryAppTheme {
        androidx.compose.material.Scaffold(
            scaffoldState = scaffoldState,
            topBar = {
                TopBar(
                    navController = navController,
                    onNavigationIconClick = {
                        scope.launch {
                            scaffoldState.drawerState.open()
                        }
                    }
                )
            },
            modifier = Modifier.background(color = white),
            drawerContent = {
                DrawerHeader()
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = white)
                ) {
                    DrawerBody(onContact = {
                        navController.navigate(Screen.ContactUsScreen.route)
                        scope.launch {
                            scaffoldState.drawerState.close()
                        }
                    }, onAbout = {
                        navController.navigate(Screen.AboutUsScreen.route)
                        scope.launch {
                            scaffoldState.drawerState.close()
                        }
                    }, onLogout = {
                        isLogout = true
                        scope.launch {
                            scaffoldState.drawerState.close()
                        }
                    })
                }

            },
            backgroundColor = brown,
            contentColor = brown,
            drawerContentColor = white,
            drawerBackgroundColor = brown
        ) { paddingValues ->
            Modifier.padding(
                bottom = paddingValues.calculateBottomPadding()
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(white)
                    .padding(start = 10.dp, end = 10.dp)
            ) {
                LazyVerticalGrid(
                    columns = GridCells.Fixed(2),
                    contentPadding = PaddingValues(
                        start = 12.dp,
                        top = 16.dp,
                        end = 12.dp,
                        bottom = 16.dp
                    ),
                    content = {
                        items(categoryList.size) { index ->
                            Card(
                                modifier = Modifier
                                    .padding(10.dp)
                                    .fillMaxWidth()
                                    .height(200.dp)
                                    .clickable {
                                        navController.navigate(Screen.BooksScreen.route+ "/${index}")
                                    },
                                shape = RoundedCornerShape(10.dp),
                                colors = CardDefaults.cardColors(containerColor = Color.White),
                                elevation = CardDefaults.cardElevation(defaultElevation = 5.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = categoryList[index].image),
                                    contentDescription = "Image",
                                    contentScale = ContentScale.Fit,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(150.dp)
                                )
                                Text(
                                    categoryList[index].name,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(10.dp),
                                    style = TextStyle(color = Color.Black)
                                )
                                Spacer(modifier = Modifier.height(10.dp))

                            }
                        }
                    }
                )
            }
        }

        if (isLogout) {
            AlertDialog(
                onDismissRequest = {
                    isLogout = false
                },
                title = { Text(stringResource(id = R.string.app_name)) },
                text = { Text("Are you sure you want to logout ?") },
                confirmButton = {
                    RoundedButton(
                        text = "Logout",
                        textColor = white,
                        onClick = {
                            preferenceManager.saveData("isLogin", false)
                            navController.navigate(
                                Screen.LoginScreen.route
                            ) {
                                popUpTo(Screen.MainScreen.route) {
                                    inclusive = true
                                }
                            }
                            isLogout = false
                        }
                    )

                },
                dismissButton = {
                    RoundedButton(
                        text = "Cancel",
                        textColor = white,
                        onClick = { isLogout = false }
                    )
                }
            )
        }

    }


}

