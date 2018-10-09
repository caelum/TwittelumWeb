package br.com.caelum.twittelumappweb.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import br.com.caelum.twittelumappweb.Carregador
import br.com.caelum.twittelumappweb.R
import br.com.caelum.twittelumappweb.modelo.Tweet
import kotlinx.android.synthetic.main.tweet_item.view.*

class TweetAdapter(private val tweets: List<Tweet>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val tweet = tweets[position]

        val inflater = LayoutInflater.from(parent?.context)
        val view = inflater.inflate(R.layout.tweet_item, parent, false)


        view.item_conteudo.text = tweet.mensagem

        tweet.foto?.let {
            view.item_foto.visibility = View.VISIBLE
            view.item_foto.setImageBitmap(Carregador.decodifica(it))
        }


        return view

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