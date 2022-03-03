package servando.valdez.peliculas

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
//data
 class AdaptadorMovies:BaseAdapter{
    lateinit var context: Context
    var peliculas = ArrayList<Pelicula>()
    constructor(context: Context, pelis: ArrayList<Pelicula>){
        this.context = context
        this.peliculas = pelis
    }
    override fun getCount(): Int {
        return peliculas.size
    }

    override fun getItem(p0: Int): Any {
        return peliculas[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var pelicula:Pelicula = peliculas[p0]
        var inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var vista = inflator.inflate(R.layout.pelicula_view, null)

        var imagen = vista.findViewById(R.id.iv_pelicula) as ImageView
        var titulo = vista.findViewById(R.id.tv_nombre) as TextView

        imagen.setImageResource(pelicula.img)
        titulo.setText(pelicula.nombre)

        return vista
    }

}
