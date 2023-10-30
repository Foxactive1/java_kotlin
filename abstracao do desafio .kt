data class ConteudoEducacional(val titulo: String, val descricao: String)

data class Formacao(val nome: String, val nivel: String, val conteudos: List<ConteudoEducacional>) {
    fun matricularAluno(aluno: Aluno) {
        // Lógica de matrícula do aluno na formação
        println("${aluno.nome} foi matriculado na formação $nome")
    }
}

data class Aluno(val nome: String)

fun main() {
    val conteudo1 = ConteudoEducacional("Introdução à Programação", "Aprenda os conceitos básicos de programação.")
    val conteudo2 = ConteudoEducacional("Banco de Dados", "Conheça os fundamentos de bancos de dados.")
    val conteudo3 = ConteudoEducacional("Desenvolvimento Web", "Aprenda a criar aplicativos web.")

    val formacao = Formacao("Formação Desenvolvedor Web", "Intermediário", listOf(conteudo1, conteudo2, conteudo3))

    val aluno1 = Aluno("Alice")
    val aluno2 = Aluno("Bob")

    formacao.matricularAluno(aluno1)
    formacao.matricularAluno(aluno2)
}
