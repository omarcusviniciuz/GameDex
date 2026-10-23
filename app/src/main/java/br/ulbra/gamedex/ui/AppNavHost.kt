package br.ulbra.gamedex.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination =
            Lista,
        modifier = modifier
    ) {
        // Rota tipada para a Lista do Catálogo
        composable<Lista> {
            CatalogoScreen(
                onJogoClick = { id ->
                    navController.navigate(Detalhe(id))
                }
            )
        }

        // Rota tipada para o Detalhe do Jogo selecionado
        composable<Detalhe> { backStackEntry ->
            val rota = backStackEntry.toRoute<Detalhe>()
            DetalheScreen(
                jogoId = rota.jogoId,
                onVoltar = {
                    navController.popBackStack()
                }
            )
        }
    }
}
