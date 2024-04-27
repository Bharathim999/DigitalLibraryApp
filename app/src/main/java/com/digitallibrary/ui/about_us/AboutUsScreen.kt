package com.digitallibrary.ui.about_us

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
fun AboutUsScreen(navController: NavController) {
    val context = LocalContext.current
    val scrollState = rememberScrollState()
    DigitalLibraryAppTheme {
        Scaffold {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = brown)
                    .padding(top = 40.dp)
                    .verticalScroll(scrollState)
            ) {
                SmallTopAppBar(
                    title = {
                        Text(
                            text = "About Us", color = Color.White,
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
                    Text(
                        "A digital library is a collection of digital objects, such as books, magazines, audio recordings, video recordings and other documents that are accessible electronically.Digital libraries provide users with online access to a wide range of resources. They are often used by students for research or by professionals seeking to stay current on the latest developments in their field.Digital libraries can provide users with access to rare and out-of-print materials that might be difficult or impossible to locate in physical libraries. Digital libraries also offer a variety of search and sorting features, as well as social media-like features that can connect users with others to discuss topics.As digital libraries continue to evolve, new features such as multimedia content, data visualization tools and interactive experiences are being added to software to make digital libraries even more engaging and helpful.Digital libraries can be accessed from any computer or device with an internet connection, meaning that there is no need to physically visit the library or store materials to access them.Digital libraries are often used by public libraries, university libraries and private companies. Much of the software available is Open Source or free to use. Examples include the Digital Public Library of America, Open Library, the Internet Archive and Project Gutenberg.",
                        fontSize = 14.sp,
                        color = black,
                        modifier = Modifier
                            .padding(vertical = 10.dp, horizontal = 15.dp),

                        )


                }
            }
        }



    }
}