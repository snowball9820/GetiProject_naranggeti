package com.app.getiproject_naranggeti

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.app.getiproject_naranggeti.ui.theme.GetiProject_naranggetiTheme
import com.app.getiproject_naranggeti.ui.theme.Purple40


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Navi()

        }
    }
}

@Composable
fun Navi() {

    GetiProject_naranggetiTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Purple40
        ) {

            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "grade") {
                composable("start") {
                    StartScreen(navController)
                }
                composable("detect") {
                    DetectScreen(navController)
                }
                composable("login") {
                    LoginScreen(LoginViewModel(), {}, navController)
                }
                composable("Sign Up") {
                    SignupScreen(navController)
                }
                composable("customer") {
                    CustomerEvaluation(navController)
                }
                composable("grade") {
                    GradeScreen(navController)
                }
                composable("description"){
                    DescriptionScreen(navController)
                }
                composable("customerReviews"){
                    CustomerReviewScreen(navController)
                }
                composable("menu"){
                    MenuScreen(navController)
                }

            }
        }
    }
}

