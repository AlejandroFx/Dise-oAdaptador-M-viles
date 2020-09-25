package com.alex.diseoadaptador

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CardAdapter (private val cards: List<CardClass>) : RecyclerView.Adapter<CardAdapter.CardHolder>() {
    class CardHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        fun OnBind(card: CardClass) {
        val image= view.findViewById<ImageView>(R.id.image)
        val title=view.findViewById<TextView>(R.id.text)
        val content= view.findViewById<TextView>(R.id.content)


        image.setImageResource(card.image)
        title.text= card.title
        content.text= card.content

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardHolder {
       val layoutInflater= LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.card_80s, parent, false )
        return  CardHolder(view)
    }

    override fun getItemCount(): Int {
        return cards.size
    }

    override fun onBindViewHolder(cardHolder: CardHolder, position: Int) {
        val card= cards[position]
        cardHolder.OnBind(card)
    }
}