package br.com.caelum.twittelumappweb.modelo

data class Tweet(val mensagem: String,
                 val foto: String?) {

    override fun toString(): String {
        return mensagem
    }

}