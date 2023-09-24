package com.example.appandroid.view

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.widget.EditText
import com.example.appandroid.R

class AddModuleDialog(context: Context, private val listener: (String) -> Unit) {

    private val dialog: AlertDialog

    init {
        val builder = AlertDialog.Builder(context)
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.add_items, null)
        val editText = view.findViewById<EditText>(R.id.moduleName)

        builder.setView(view)
        builder.setPositiveButton("Ajouter") { _, _ ->
            val moduleName = editText.text.toString()
            if (moduleName.isNotEmpty()) {
                listener(moduleName)
            }
        }
        builder.setNegativeButton("Annuler", null)

        dialog = builder.create()
    }

    fun show() {
        dialog.show()
       }
}
