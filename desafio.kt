// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()


    fun matricular(usuario: Usuario) {
       // TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")

        if (!inscritos.contains(usuario)){
            inscritos.add(usuario)
            println("matricula relizada com sucesso para $usuario na formação $nome")
        }else{
            println("$usuario ja matriculado : $nome ")
        }
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
   // TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")

    val usuario1 = Usuario()
    val usuario2 = Usuario()

    val conteudo1 = ConteudoEducacional("conteudo1 ")
    val conteudo2 = ConteudoEducacional("conteudo2 ")


    val formacao1 = Formacao("Formacação1 ", listOf(conteudo1 , conteudo2))

    formacao1.matricular(usuario1)
    formacao1.matricular(usuario2)
    formacao1.matricular(usuario1)
}
