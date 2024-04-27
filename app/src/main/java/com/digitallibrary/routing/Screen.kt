package com.digitallibrary.routing

sealed class Screen(val route: String) {

    object SplashScreen: Screen("splash_screen")
    object LoginScreen: Screen("login_screen")
    object RegisterScreen: Screen("register_screen")
    object MainScreen: Screen("main_screen")
    object BooksScreen: Screen("books_screen")
    object DetailScreen: Screen("detail_screen")
    object ContactUsScreen: Screen("contact_us_screen")
    object AboutUsScreen: Screen("about_us_screen")
    object EnquiryScreen: Screen("enquiry_screen")

}