package ru.bagrusss.epoxytest.list.horizontal

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.airbnb.epoxy.TypedEpoxyController

/**
 * Created by bagrusss on 03.12.2018
 */
class HorizontalController: TypedEpoxyController<List<String>>() {

    override fun buildModels(data: List<String>) {
        data.forEach {
            HorizontalItem(it).addTo(this)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(inState: Bundle?) {
        super.onRestoreInstanceState(inState)
    }

}