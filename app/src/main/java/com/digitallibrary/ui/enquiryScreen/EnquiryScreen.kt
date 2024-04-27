package com.digitallibrary.ui.enquiryScreen

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.digitallibrary.R
import com.digitallibrary.ui.theme.DigitalLibraryAppTheme
import com.digitallibrary.ui.theme.black
import com.digitallibrary.ui.theme.white
import com.digitallibrary.ui.theme.brown
import com.digitallibrary.utils.LibraryBorderField
import com.digitallibrary.utils.RoundedButton
import com.digitallibrary.utils.isValidEmail

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun EnquiryScreen(navController: NavController) {
    val context = LocalContext.current
    val scrollState = rememberScrollState()
    var name by remember { mutableStateOf("") }
    var isBooked by remember { mutableStateOf(false) }
    var email by remember { mutableStateOf("") }
    var libraryId by remember { mutableStateOf("") }
    var message by remember { mutableStateOf("") }
    DigitalLibraryAppTheme {
        Scaffold {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = brown)
                    .padding(top = 40.dp)
            ) {
                SmallTopAppBar(
                    title = {
                        Text(
                            text = "Enquiry", color = Color.White,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            style = TextStyle(fontWeight = FontWeight.SemiBold, fontSize = 18.sp)
                        )
                    },
                    navigationIcon = {
                        IconButton(
                            onClick = {
                                navController.navigateUp()
                            }
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.ArrowBack,
                                tint = Color.White,
                                contentDescription = "Back"
                            )
                        }
                    },
                    colors = TopAppBarDefaults.smallTopAppBarColors(
                        containerColor = brown,
                        titleContentColor = Color.White
                    )
                )

                Column(modifier = Modifier.fillMaxSize().background(color = white)) {

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(20.dp)
                    ) {

                        Spacer(modifier = Modifier.height(10.dp))

                        LibraryBorderField(
                            value = name,
                            onValueChange = { text ->
                                name = text
                            },
                            placeholder = "Enter name",
                            keyboardType = KeyboardType.Text,
                        )

                        Spacer(modifier = Modifier.height(10.dp))
                        LibraryBorderField(
                            value = email,
                            onValueChange = { text ->
                                email = text
                            },
                            placeholder = "Enter email",
                            keyboardType = KeyboardType.Email,
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        LibraryBorderField(
                            value = libraryId,
                            onValueChange = { text ->
                                libraryId = text
                            },
                            placeholder = "Enter library id",
                            keyboardType = KeyboardType.Number,
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        LibraryBorderField(
                            value = message,
                            onValueChange = { text ->
                                message = text
                            },
                            placeholder = "Enter message",
                            keyboardType = KeyboardType.Text,
                        )

                        Spacer(modifier = Modifier.height(20.dp))
                        RoundedButton(
                            text = "Submit",
                            textColor = white,
                            onClick = {
                                if (name.isNotEmpty()) {
                                    if (email.isNotEmpty()) {
                                        if (!isValidEmail(email.toString().trim())) {
                                            if (libraryId.isNotEmpty()) {
                                                if (message.isNotEmpty()) {
                                                    isBooked = true

                                                } else {
                                                    Toast.makeText(
                                                        context,
                                                        "Please enter message.",
                                                        Toast.LENGTH_LONG
                                                    ).show()
                                                }

                                            } else {
                                                Toast.makeText(
                                                    context,
                                                    "Please enter library id.",
                                                    Toast.LENGTH_LONG
                                                ).show()
                                            }
                                        } else {
                                            Toast.makeText(
                                                context,
                                                "Please enter email.",
                                                Toast.LENGTH_LONG
                                            ).show()
                                        }
                                    } else {
                                        Toast.makeText(
                                            context,
                                            "Please enter valid email.",
                                            Toast.LENGTH_LONG
                                        ).show()
                                    }
                                } else {
                                    Toast.makeText(
                                        context,
                                        "Please enter name.",
                                        Toast.LENGTH_LONG
                                    ).show()
                                }
                            }
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                }
            }
        }
        if (isBooked) {
            AlertDialog(
                onDismissRequest = {
                    isBooked = false
                },
                title = { Text(stringResource(id = R.string.app_name)) },
                text = { Text("Your booking is successfully.") },
                confirmButton = {
                    RoundedButton(
                        text = "Ok",
                        textColor = white,
                        onClick = {
                            navController.navigateUp()
                            isBooked = false
                        }
                    )
                },
                dismissButton = {}
            )
        }


    }
}