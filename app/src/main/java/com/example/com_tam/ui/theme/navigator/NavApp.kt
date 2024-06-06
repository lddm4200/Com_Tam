package com.example.com_tam.ui.theme.navigator

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.com_tam.ui.theme.screen.HistoryScreen
import com.example.com_tam.ui.theme.screen.HoTro
import com.example.com_tam.ui.theme.screen.HomeScreen
import com.example.com_tam.ui.theme.screen.LoginScreen
import com.example.com_tam.ui.theme.screen.ProfileScreen
import com.example.com_tam.ui.theme.screen.QuanLy
import com.example.com_tam.ui.theme.screen.Sign_inScreen
import com.example.com_tam.ui.theme.screen.StatisticsScreen
import com.example.com_tam.ui.theme.screen.WelcomeScreen
import com.example.com_tam.ui.theme.screen.XacNhanDonHang

@Composable
fun NavApp() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.FurnitureApp.route,
    ) {
        composable(Screen.WelcomeScreen.route) { WelcomeScreen() }
        composable(Screen.LoginScreen.route) { LoginScreen(navController) }
        composable(Screen.Sign_inScreen.route) { Sign_inScreen() }
        composable(Screen.HoTroScreen.route) { HoTro() }
        composable(Screen.XacNhanDHScreen.route) { XacNhanDonHang() }
        composable(Screen.ManagerScreen.route) { QuanLy() }
        composable(Screen.HomeScreen.route) { HomeScreen() }
        composable(Screen.HistoryScreen.route) { HistoryScreen() }
        composable(Screen.ProfileScreen.route) { ProfileScreen()}
        composable(Screen.StatisticScreen.route) { StatisticsScreen() }
        composable(Screen.FurnitureApp.route) { FurnitureApp(navController) }



    }
}