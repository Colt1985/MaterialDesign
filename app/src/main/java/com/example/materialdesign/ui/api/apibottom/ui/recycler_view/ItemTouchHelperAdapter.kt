package com.example.materialdesign.ui.api.apibottom.ui.recycler_view

interface ItemTouchHelperAdapter {
    fun onItemMove(fromPosition: Int, toPosition: Int)
    fun onItemDismiss(position: Int)
}