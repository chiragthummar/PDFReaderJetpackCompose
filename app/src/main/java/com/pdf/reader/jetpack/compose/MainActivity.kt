package com.pdf.reader.jetpack.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pdf.reader.jetpack.compose.ui.theme.PDFReaderJetpackComposeTheme
import com.pdf.reader.jetpack.compose.util.Screen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PDFReaderJetpackComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        val navController = rememberNavController()

                        RootNavHost(
                            navController = navController,
                            modifier = Modifier
                                .fillMaxHeight(),
                            startDestination = Screen.HomeScreen.route
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun RootNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    startDestination: String,
) {
    NavHost(
        navController = navController, startDestination = startDestination, modifier = modifier
    ) {
        composable(route = Screen.HomeScreen.route) {
            HomeScreen(navigateTo = {
                navController.navigate(it)
            })
        }

        composable(route = Screen.PDFViewScreen.route)
        {
            PDFViewerScreen(navigateUp = {
                navController.popBackStack()
            })
        }
    }
}
