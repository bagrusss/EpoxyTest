package ru.bagrusss.epoxytest.list.horizontal

import android.databinding.ViewDataBinding
import com.airbnb.epoxy.DataBindingEpoxyModel
import ru.bagrusss.epoxytest.R
import ru.bagrusss.epoxytest.databinding.HorizontalListBinding

/**
 * Created by bagrusss on 03.12.2018
 */
class HorizontalModel(private val items: List<String>) : DataBindingEpoxyModel() {

    private val controller = HorizontalController()

    init {
        id(defaultLayout)
    }

    override fun getDefaultLayout() = R.layout.horizontal_list

    override fun setDataBindingVariables(binding: ViewDataBinding) {
        val binding = binding as HorizontalListBinding
        binding.horizontalItems.adapter = controller.adapter
        controller.setData(items)
    }

    override fun onViewDetachedFromWindow(holder: DataBindingHolder) {
        super.onViewDetachedFromWindow(holder)
    }

    override fun shouldSaveViewState() = true

}