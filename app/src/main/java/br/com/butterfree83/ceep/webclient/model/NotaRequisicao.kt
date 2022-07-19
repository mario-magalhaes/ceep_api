package br.com.butterfree83.ceep.webclient.model

data class NotaRequisicao(
    val titulo: String,
    val descricao: String,
    val imagem: String? = null
)