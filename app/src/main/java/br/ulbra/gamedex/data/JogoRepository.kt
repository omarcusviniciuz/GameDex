package br.ulbra.gamedex.data

import br.ulbra.gamedex.model.Jogo

object JogoRepository {

    private const val STEAM = "https://cdn.cloudflare.steamstatic.com/steam/apps"

    private val jogos = listOf(
        Jogo(1, "Hollow Knight", "Aventura", 2017, 9.4, "$STEAM/367520/header.jpg",
            "Explore Hallownest, um reino subterrâneo em ruínas cheio de insetos, segredos e chefes difíceis."),
        Jogo(2, "Celeste", "Aventura", 2018, 9.2, "$STEAM/504230/header.jpg",
            "Ajude Madeline a escalar a montanha Celeste em fases de plataforma precisas e desafiadoras."),
        Jogo(3, "Terraria", "Aventura", 2011, 9.0, "$STEAM/105600/header.jpg",
            "Cave, construa e lute num mundo 2D gerado aleatoriamente, cheio de biomas e chefes."),
        Jogo(4, "Hades", "Ação", 2020, 9.3, "$STEAM/1145360/header.jpg",
            "Escape do submundo grego lutando com armas e poderes dados pelos deuses do Olimpo."),
        Jogo(5, "Cuphead", "Ação", 2017, 8.9, "$STEAM/268910/header.jpg",
            "Enfrente chefes em batalhas frenéticas, com visual inspirado nos desenhos animados dos anos 1930."),
        Jogo(6, "Dead Cells", "Ação", 2018, 8.8, "$STEAM/588650/header.jpg",
            "Explore um castelo que muda a cada partida, com combate rápido e morte permanente."),
        Jogo(7, "Vampire Survivors", "Ação", 2022, 8.6, "$STEAM/1794680/header.jpg",
            "Sobreviva a hordas de monstros enquanto suas armas atacam sozinhas e ficam mais fortes."),
        Jogo(8, "The Witcher 3: Wild Hunt", "RPG", 2015, 9.5, "$STEAM/292030/header.jpg",
            "Viva Geralt de Rívia, um caçador de monstros, num enorme mundo aberto cheio de escolhas."),
        Jogo(9, "Undertale", "RPG", 2015, 9.1, "$STEAM/391540/header.jpg",
            "Um RPG em que você pode vencer os inimigos sem lutar, e cada escolha muda a história."),
        Jogo(10, "Portal 2", "Puzzle", 2011, 9.5, "$STEAM/620/header.jpg",
            "Resolva quebra-cabeças com a arma de portais num laboratório controlado por uma IA sarcástica."),
        Jogo(11, "Baba Is You", "Puzzle", 2019, 8.7, "$STEAM/736260/header.jpg",
            "Mude as regras do jogo empurrando palavras pelo cenário para resolver cada fase."),
        Jogo(12, "Stardew Valley", "Simulação", 2016, 9.2, "$STEAM/413150/header.jpg",
            "Herde a fazenda do avô, plante, crie animais e conheça os moradores da cidade.")
    )

    fun listar(): List<Jogo> = jogos

    fun buscarPorId(id: Int): Jogo = jogos.first { it.id == id }
}
