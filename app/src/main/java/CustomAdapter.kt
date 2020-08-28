import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.devoir.R

class CustomAdapter(private val context: Activity, private val pays: ArrayList<String>, private val capital: ArrayList<String>, private val annee: ArrayList<Int>):
    ArrayAdapter<String>(context, R.layout.custom_item, pays) {
    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.custom_item, null, true)

        val paysText = rowView.findViewById(R.id.pays) as TextView
        val capitalText = rowView.findViewById(R.id.capital) as TextView
        val anneeText = rowView.findViewById(R.id.annee) as TextView

        paysText.text = pays[position]
        capitalText.text= (capital[position])
        anneeText.text = annee[position].toString()

        return rowView

    }

    }