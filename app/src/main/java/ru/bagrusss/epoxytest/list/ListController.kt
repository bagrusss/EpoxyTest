package ru.bagrusss.epoxytest.list

import android.support.v7.widget.RecyclerView
import com.airbnb.epoxy.TypedEpoxyController
import ru.bagrusss.epoxytest.Data
import ru.bagrusss.epoxytest.list.horizontal.HorizontalModel

/**
 * Created by bagrusss on 03.12.2018
 */
class ListController : TypedEpoxyController<Data>() {

    override fun buildModels(data: Data) {
        HorizontalModel(data.horizontalItems).addTo(this)

        data.items.forEach {
            ItemModel(it).addTo(this)
        }
    }

    override fun onDetachedFromRecyclerView(recyclerView: RecyclerView) {
        super.onDetachedFromRecyclerView(recyclerView)
    }
}