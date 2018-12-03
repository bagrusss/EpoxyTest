package ru.bagrusss.epoxytest.list

import android.databinding.ViewDataBinding
import com.airbnb.epoxy.DataBindingEpoxyModel
import ru.bagrusss.epoxytest.R
import ru.bagrusss.epoxytest.databinding.ItemBinding

/**
 * Created by bagrusss on 03.12.2018
 */
class ItemModel(private val text: String) : DataBindingEpoxyModel() {

    init {
        id(text)
    }

    override fun getDefaultLayout() = R.layout.item

    override fun setDataBindingVariables(binding: ViewDataBinding) {
        val binding = binding as ItemBinding
        binding.text.text = text
    }


}