# 🎮 GameDex — Catálogo de Jogos (AP2 - Android & Jetpack Compose)

Projeto desenvolvido para a avaliação **AP2** da disciplina de Desenvolvimento Mobile Android com **Kotlin + Jetpack Compose**.

---

## 👥 Integrantes do Grupo
- **Nome do Integrante 1** - Matrícula: XXXXXXX
- **Nome do Integrante 2** - Matrícula: XXXXXXX
- *(Opcional)* **Nome do Integrante 3** - Matrícula: XXXXXXX

---

## 📌 Tema Escolhido
- **Tema:** Catálogo de Jogos (GameDex)
- **Fonte de dados:** Dados estáticos no código com imagens oficiais da Steam CDN (proporção 460 × 215 px).

---

## 📱 Screenshots do App Rodando

| Tela 1 — Catálogo (Lista) | Tela 2 — Detalhes do Jogo |
|:---:|:---:|
| ![Tela de Catálogo](docs/screenshot_catalogo.png) | ![Tela de Detalhe](docs/screenshot_detalhe.png) |

> 💡 **Nota:** Para adicionar os prints antes de enviar para o professor:
> 1. Execute o app no emulador do Android Studio ou no seu celular.
> 2. Tire um print da tela de catálogo e outro da tela de detalhes de um jogo.
> 3. Crie a pasta `docs/` e salve os prints como `screenshot_catalogo.png` e `screenshot_detalhe.png`.

---

## 🛠️ Premissas Atendidas (P1 a P5)

| Premissa | Status | Implementação |
|:---|:---:|:---|
| **P1 — Duas telas com navegação** | ✅ Concluído | Navegação implementada com **Navigation Compose** e **rotas tipadas** (`@Serializable object Lista` e `@Serializable data class Detalhe(val jogoId: Int)`). As telas recebem callbacks/lambdas (`onJogoClick` e `onVoltar`), mantendo baixo acoplamento e sem passar o `navController` diretamente. |
| **P2 — Dados próprios no código** | ✅ Concluído | `data class Jogo` com 7 campos (`id`, `titulo`, `genero`, `ano`, `nota`, `imagemUrl`, `descricao`). Repositório `JogoRepository` contendo 12 jogos com URLs testadas da Steam e métodos `listar()` e `buscarPorId(id: Int)`. |
| **P3 — Imagens reais** | ✅ Concluído | Carregamento assíncrono via **Coil** (`AsyncImage`) tanto na lista quanto no detalhe, aplicando `aspectRatio(460f / 215f)` e `ContentScale.Crop` para não distorcer. Permissão `<uses-permission android:name="android.permission.INTERNET" />` ativa no `AndroidManifest.xml`. |
| **P4 — Lista eficiente com card próprio** | ✅ Concluído | `LazyColumn` configurada com `key = { it.id }` para reciclagem eficiente. Card próprio `JogoCard` exibindo imagem de cabeçalho, título, nota em estrelas, chip de categoria/gênero e ano de lançamento. |
| **P5 — Material 3 com identidade** | ✅ Concluído | Utilização de `Scaffold`, `TopAppBar` com cores e tipografia personalizadas em ambas as telas, e paleta customizada no `GameDexTheme` (Indigo/Teal/Dark Midnight) com suporte a Dark Mode e Light Mode. |

---

## 📂 Estrutura do Projeto

```text
app/src/main/java/br/ulbra/gamedex/
├── MainActivity.kt               # Ponto de entrada configurando o GameDexTheme e AppNavHost
├── model/
│   └── Jogo.kt                   # Data class com os atributos do jogo (P2)
├── data/
│   └── JogoRepository.kt         # Repositório com os 12 jogos cadastrados (P2)
└── ui/
    ├── Rotas.kt                  # Definição das rotas tipadas (@Serializable) (P1)
    ├── AppNavHost.kt             # Configuração do NavHost e controle de rotas
    ├── JogoCard.kt               # Card customizado da lista (P3, P4)
    ├── CatalogoScreen.kt         # Tela 1: Scaffold, TopAppBar e LazyColumn
    ├── DetalheScreen.kt          # Tela 2: Detalhe completo, scroll vertical e voltar
    └── theme/
        ├── Color.kt              # Paleta de cores exclusiva do projeto (P5)
        ├── Theme.kt              # Tema Material 3 com cores customizadas
        └── Type.kt               # Configurações tipográficas
```

---

## 🚀 Como Executar o Projeto

1. Abra o **Android Studio**.
2. Selecione **Open** e navegue até a pasta deste projeto.
3. Aguarde o Gradle sincronizar as dependências.
4. Escolha um emulador ou conecte um smartphone Android via depuração USB.
5. Clique em **Run** (ícone verde de play `▶`) ou utilize o atalho `Shift + F10`.
