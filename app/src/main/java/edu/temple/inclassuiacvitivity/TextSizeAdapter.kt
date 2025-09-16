package edu.temple.inclassuiacvitivity

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.content.Context
import android.widget.TextView
import android.R.attr.textSize

class TextSizeAdapter(_context: Context, _array: Array<Int>) : BaseAdapter() {

    val array = _array
    val context = _context

    override fun getCount(): Int {
        return array.size
    }

    override fun getItem(position: Int): Any {
        return array[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?) =
        if (convertView != null) { convertView as TextView }
        else {
            TextView(context)
        }.apply {
            text = array[position].toString()
        }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        return getView(position, convertView, parent).apply {
            textSize = array[position].toFloat()
        }
    }
}