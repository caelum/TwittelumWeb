package br.com.caelum.twittelumappweb.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import br.com.caelum.twittelumappweb.Carregador
import br.com.caelum.twittelumappweb.databinding.TweetItemBinding
import br.com.caelum.twittelumappweb.modelo.Tweet

class TweetAdapter(private val tweets: List<Tweet>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val tweet = tweets[position]

        val inflater = LayoutInflater.from(parent?.context)
        val binding = TweetItemBinding.inflate(inflater, parent, false)

        binding.itemConteudo.text = tweet.mensagem

        tweet.foto?.let {
            binding.itemFoto.visibility = View.VISIBLE
            binding.itemFoto.setImageBitmap(Carregador.decodifica(it))
        }

        return binding.root

    }

    override fun getItem(position: Int): Any {
        return tweets[position]
    }

    override fun getItemId(position: Int): Long {

        return position.toLong()
    }

    override fun getCount(): Int {
        return tweets.size
    }
}
