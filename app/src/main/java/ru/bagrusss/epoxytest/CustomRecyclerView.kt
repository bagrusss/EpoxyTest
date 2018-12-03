package ru.bagrusss.epoxytest

import android.content.Context
import android.os.Parcelable
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet
import android.util.Log

/**
 * Created by bagrusss on 03.12.2018
 */
class CustomRecyclerView @JvmOverloads constructor(context: Context,
                                                   attrs: AttributeSet? = null,
                                                   styles: Int = 0): RecyclerView(context, attrs, styles) {

    override fun onSaveInstanceState(): Parcelable? {
        Log.d(TAG, "onSaveInstanceState()")
        return super.onSaveInstanceState()
    }

    override fun onRestoreInstanceState(state: Parcelable?) {
        Log.d(TAG, "onRestoreInstanceState()")
        super.onRestoreInstanceState(state)
    }

    companion object {
        private const val TAG = "CustomRecyclerView"
    }

}