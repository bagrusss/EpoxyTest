package ru.bagrusss.epoxytest.list.horizontal

import android.databinding.ViewDataBinding
import com.airbnb.epoxy.DataBindingEpoxyModel
import ru.bagrusss.epoxytest.R
import ru.bagrusss.epoxytest.databinding.HorizontalItemBinding


/**
 * Created by bagrusss on 03.12.2018
 */
class HorizontalItem(private val data: String) : DataBindingEpoxyModel() {

    init {
        id(data)
    }

    override fun setDataBindingVariables(binding: ViewDataBinding?) {
        val binding = binding as HorizontalItemBinding
        binding.data.text = data
    }

    override fun getDefaultLayout() = R.layout.horizontal_item

}