package com.alex.diseoadaptador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycle_view= findViewById<RecyclerView>(R.id.recycle_view)
        val cardAdapter = CardAdapter(createCards())

        recycle_view.layoutManager= LinearLayoutManager(this)
        recycle_view.adapter= cardAdapter

        cardAdapter.notifyDataSetChanged()
    }

    fun  createCards(): List<CardClass>{
        val cards= mutableListOf<CardClass>()
        cards.add(
            CardClass(
                R.drawable.ic_cyndi_lauper,
                "Cindy Lauper",
                "Fue considerada una de las voces de la generación de los ochenta por MTV. " +
                        "Su atípico estilo personal conectaba con los adolescentes y eso aseguraba que los éxitos fueran en aumento." +
                        " No es de extrañar que algunos de sus temas todavía sean abanderados por toda una generación. "
            )
        )

        cards.add(
            CardClass(
                R.drawable.ic_blondie,
                "Blondie",
                "Blondie es una banda estadounidense formada en 1974. A lo largo de sus dos períodos han utilizado diversos géneros, " +
                        "siendo identificados generalmente dentro del new wave, Matt Katz-Bohen en teclados y sintetizadores y Tommy Kessler en la guitarra."
            )
        )

        cards.add(
            CardClass(
                R.drawable.ic_ac_dc,
                "AC/DC",
                "AC/DC es un grupo de hard rock australiano formado en los 80's en Sídney, Australia, por los hermanos escoceses Malcolm y Angus "
            )
        )

        cards.add(
            CardClass(
                R.drawable.ic_madonna_like_a_prayer,
                "Madona",
                " Sus álbumes fueron de los más valorados y vendidos, por eso no es de extrañar que fuera la cantante femenina que más vendiera en los 80. " +
                        "“Like a Virgin”, “La Isla Bonita” y “Like a Prayer” son solo algunos de sus mayores éxitos.  "
            )
        )

        return cards
    }
}