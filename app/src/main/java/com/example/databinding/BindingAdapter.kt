package com.example.databinding

import android.view.View
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter


// Don't Forget to add Kotlin Kapt in Gradle
@BindingAdapter(value = ["color"])
fun setColor(view: View, color: MyColors?) {
    when (color) {
        MyColors.RED -> view.setBackgroundColor(ContextCompat.getColor(view.context, R.color.red))
        MyColors.GREEN -> view.setBackgroundColor(
            ContextCompat.getColor(
                view.context,
                R.color.green
            )
        )

        MyColors.BLUE -> view.setBackgroundColor(ContextCompat.getColor(view.context, R.color.blue))
        MyColors.MAGENTA -> view.setBackgroundColor(
            ContextCompat.getColor(
                view.context,
                R.color.magenta
            )
        )

        MyColors.MAGENTA_RED -> view.setBackgroundColor(
            ContextCompat.getColor(
                view.context,
                R.color.magentaRed
            )
        )

        MyColors.MAGENTA_GREEN -> view.setBackgroundColor(
            ContextCompat.getColor(
                view.context,
                R.color.magentaGreen
            )
        )

        else -> {}
    }
}