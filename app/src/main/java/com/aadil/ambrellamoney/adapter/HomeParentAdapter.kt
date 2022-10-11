package com.aadil.ambrellamoney.adapter

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.aadil.ambrellamoney.R
import com.aadil.ambrellamoney.activity.HomeActivity
import com.aadil.ambrellamoney.modal.DataModal

class HomeParentAdapter(
    /*internal var activity: FragmentActivity,
    private var items: ArrayList<DataModal>,*/
) /*: RecyclerView.Adapter<HomeParentAdapter.ViewHolder>() */{


    /*override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context)
                .inflate(R.layout., parent, false)

        return ViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val budget = items[position]

        holder.username.setOnClickListener {
            val intent = Intent(activity, HomeActivity::class.java)
            intent.putExtra("load", "UserProfile")
            activity.startActivity(intent)
        }

        holder.userimg.setImageResource(budget.modelIntA)
        holder.username.text = budget.modelA
        holder.userid.text = budget.modelB

    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val userimg = itemView.findViewById(R.id.user_img) as ImageView
        val username = itemView.findViewById(R.id.txt_user_name) as TextView
        val userid = itemView.findViewById(R.id.txt_user_id) as TextView
    }*/
}