package com.digitallibrary.routing

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.digitallibrary.ui.about_us.AboutUsScreen
import com.digitallibrary.ui.booksScreen.BooksScreen
import com.digitallibrary.ui.contact_us.ContactUsScreen
import com.digitallibrary.ui.detail.DetailScreen
import com.digitallibrary.ui.enquiryScreen.EnquiryScreen
import com.digitallibrary.ui.login.LoginScreen
import com.digitallibrary.ui.main.MainScreen
import com.digitallibrary.ui.register.RegisterScreen
import com.digitallibrary.ui.splash.SplashScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route
    ) {
        composable(route = Screen.SplashScreen.route) {
            SplashScreen(navController = navController)
        }
        composable(route = Screen.LoginScreen.route) {
            LoginScreen(navController = navController)
        }
        composable(route = Screen.RegisterScreen.route) {
            RegisterScreen(navController = navController)
        }
        composable(route = Screen.MainScreen.route) {
            MainScreen(navController = navController)
        }
        composable(route = Screen.BooksScreen.route +"/{pos}") {
            val pos = it.arguments?.getString("pos")
            if(pos!=null) {
                BooksScreen(navController = navController,pos = pos.toString().toInt())
            }

        }

        composable(route = Screen.DetailScreen.route +"/{name}" +"/{image}" +"/{detail}") {
            val name = it.arguments?.getString("name")
            val image = it.arguments?.getString("image")
            val detail = it.arguments?.getString("detail")
            if(name!=null && image!=null && detail!=null) {
                DetailScreen(navController = navController,name=name,image=image.toString().toInt(), details = detail)
            }

        }
        composable(route = Screen.ContactUsScreen.route) {
            ContactUsScreen(navController = navController)
        }
        composable(route = Screen.AboutUsScreen.route) {
            AboutUsScreen(navController = navController)
        }
        composable(route = Screen.EnquiryScreen.route) {
            EnquiryScreen(navController = navController)
        }

    }

}