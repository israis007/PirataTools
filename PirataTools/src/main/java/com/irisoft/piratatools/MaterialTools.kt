package com.irisoft.piratatools

import android.content.res.ColorStateList
import androidx.annotation.NonNull
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MaterialTools {
    companion object {

        private val states = arrayOf(
            intArrayOf(android.R.attr.state_activated),
            intArrayOf(-android.R.attr.state_activated),
            intArrayOf(android.R.attr.state_active),
            intArrayOf(-android.R.attr.state_active),
            intArrayOf(android.R.attr.state_pressed),
            intArrayOf(-android.R.attr.state_pressed),
            intArrayOf(android.R.attr.state_empty),
            intArrayOf(-android.R.attr.state_empty),
            intArrayOf(android.R.attr.state_focused),
            intArrayOf(-android.R.attr.state_focused),
            intArrayOf(android.R.attr.state_checked),
            intArrayOf(-android.R.attr.state_checked),
            intArrayOf(android.R.attr.state_checkable),
            intArrayOf(-android.R.attr.state_checkable),
            intArrayOf(android.R.attr.state_enabled),
            intArrayOf(-android.R.attr.state_enabled),
            intArrayOf(android.R.attr.state_single),
            intArrayOf(-android.R.attr.state_single),
            intArrayOf(android.R.attr.state_window_focused),
            intArrayOf(-android.R.attr.state_window_focused)
        )

        fun setTextInputLayoutBoxStrokeColor(@NonNull textInputLayout: TextInputLayout, @NonNull colorNormal: Int){
            val colors = intArrayOf(
                colorNormal,
                colorNormal,
                colorNormal,
                colorNormal,
                colorNormal,
                colorNormal,
                colorNormal,
                colorNormal,
                colorNormal,
                colorNormal,
                colorNormal,
                colorNormal,
                colorNormal,
                colorNormal,
                colorNormal,
                colorNormal,
                colorNormal,
                colorNormal,
                colorNormal,
                colorNormal
            )

            textInputLayout.setBoxStrokeColorStateList(ColorStateList(states, colors))
        }

        fun setTextInputLayoutBoxStrokeColors(@NonNull textInputLayout: TextInputLayout, @NonNull colorNormal: Int, @NonNull colorActivated: Int){

            val colors = intArrayOf(
                colorNormal,
                colorActivated,
                colorNormal,
                colorActivated,
                colorNormal,
                colorActivated,
                colorNormal,
                colorActivated,
                colorNormal,
                colorActivated,
                colorNormal,
                colorActivated,
                colorNormal,
                colorActivated,
                colorNormal,
                colorActivated,
                colorNormal,
                colorActivated,
                colorNormal,
                colorActivated
            )

            textInputLayout.setBoxStrokeColorStateList(ColorStateList(states, colors))
        }

        fun setTextInputLayoutHintColors(@NonNull textInputLayout: TextInputLayout, @NonNull colorNormal: Int, @NonNull colorActivated: Int){
            val colors = intArrayOf(
                colorNormal,
                colorActivated,
                colorNormal,
                colorActivated,
                colorNormal,
                colorActivated,
                colorNormal,
                colorActivated,
                colorNormal,
                colorActivated,
                colorNormal,
                colorActivated,
                colorNormal,
                colorActivated,
                colorNormal,
                colorActivated,
                colorNormal,
                colorActivated,
                colorNormal,
                colorActivated
            )
            textInputLayout.hintTextColor = ColorStateList(states, colors)
        }

        fun setTextInputLayoutPasswordTint(@NonNull editText: TextInputEditText, @NonNull textInputLayout: TextInputLayout, @NonNull colorNormal: Int, @NonNull colorActivated: Int){
            editText.setOnFocusChangeListener { _, hasFocus ->
                val dra = textInputLayout.endIconDrawable!!
                dra.setTint(if (hasFocus) colorActivated else colorNormal)
            }
        }

    }
}