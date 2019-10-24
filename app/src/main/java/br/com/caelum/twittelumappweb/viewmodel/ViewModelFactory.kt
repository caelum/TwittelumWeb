package br.com.caelum.twittelumappweb.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.com.caelum.twittelumappweb.data.TweetRepository

object ViewModelFactory : ViewModelProvider.NewInstanceFactory() {

    private fun repository() = TweetRepository()

    override fun <T : ViewModel?> create(modelClass: Class<T>): T = TweetViewModel(repository()) as T

}