package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class TextSizeAdapter(_context: Context, _numbers: Array<Int>) : BaseAdapter() {

    val context = _context
    val numbers = _numbers
    override fun getCount(): Int {
        return numbers.size
    }

    override fun getItem(position: Int): Any {
        return numbers[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        TODO("Not yet implemented")
    }

}