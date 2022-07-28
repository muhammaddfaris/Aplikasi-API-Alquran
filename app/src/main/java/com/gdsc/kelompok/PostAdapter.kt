package com.gdsc.kelompok

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gdsc.kelompok.databinding.ActivityMainBinding

class PostAdapter (private val list: ArrayList<PostResponse>): RecyclerView.Adapter<PostAdapter.PostViewHolder>(){
    inner class PostViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val tvText:TextView
        init {
            tvText = itemView.findViewById(R.id.tvText)
        }

        fun bind(postResponse: PostResponse){
            with(itemView){
                val text = "- Nama       : ${postResponse.nama}\n" +
                        "- Asma       : ${postResponse.asma}\n" +
                        "- Arti           : ${postResponse.arti}\n" +
                        "- Ayat          : ${postResponse.ayat}\n" +
                        "- Type         : ${postResponse.type}\n" +
                        "- Nomor     : ${postResponse.nomor}\n" +
                        "- Audio       : ${postResponse.audio}\n" +
                        "- Urut         : ${postResponse.urut}\n" +
                        "- Ket          : ${postResponse.keterangan}"
                tvText.text = text
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        return PostViewHolder(view)
    }

    override fun getItemCount(): Int = list.size


    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.bind(list[position])
    }
}