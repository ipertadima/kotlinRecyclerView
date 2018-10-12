package google.co.id.basicrecyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.viewholder_main.view.*

/**
 * Created by pertadima on 12,October,2018
 */

class MainAdapter(val data: List<String>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        //------ ini untuk multiple rows
//        return if (viewType % 2 == 0) {
//            ViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.viewholder_main2, p0, false))
//        } else {
//            ViewHolder2(LayoutInflater.from(p0.context).inflate(R.layout.viewholder_main, p0, false))
//        }


        return ViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.viewholder_main2, p0, false))
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ViewHolder -> {
                holder.bindView(data[position])
            }
            is ViewHolder2 -> {
                holder.bindView(data[position])
            }
        }
    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val textMain = view.text_main?.let {
            it
        }

        fun bindView(data: String) {
            textMain?.text = data
        }
    }

    class ViewHolder2(view: View) : RecyclerView.ViewHolder(view) {
        private val textMain = view.text_main?.let {
            it
        }

        fun bindView(data: String) {
            textMain?.text = data
        }
    }
}