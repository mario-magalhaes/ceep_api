package br.com.butterfree83.ceep.webclient.services

import br.com.butterfree83.ceep.webclient.model.NotaRequisicao
import br.com.butterfree83.ceep.webclient.model.NotaResposta
import retrofit2.Response
import retrofit2.http.*

interface NotaService {

    @GET("notas")
    suspend fun buscaTodas(): List<NotaResposta>

    @PUT("notas/{id}")
    suspend fun salva(@Path("id") id: String,
              @Body nota: NotaRequisicao): Response<NotaResposta>

    @DELETE("notas/{id}")
    suspend fun remove(@Path("id") id: String): Response<Void>

}