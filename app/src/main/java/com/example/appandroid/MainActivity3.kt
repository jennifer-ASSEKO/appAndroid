package com.example.appandroid
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.appandroid.model.ModuleData
import com.example.appandroid.view.ModuleAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity3 : AppCompatActivity() {
    private lateinit var addsBtn: Button
    private lateinit var moduleList: ArrayList<ModuleData>
    private lateinit var moduleAdapter: ModuleAdapter
    private lateinit var recv: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        /**set list*/
        moduleList = ArrayList()
        /**set find id*/
        addsBtn = findViewById(R.id.addingBtn)
        recv = findViewById(R.id.mRecycler)

        /**Set adapter*/
        moduleAdapter = ModuleAdapter(this, moduleList)
        /**SetRecycler view Adapter*/
        recv.adapter = moduleAdapter
        recv.layoutManager = LinearLayoutManager(this)
        /**set dialog*/
        addsBtn.setOnClickListener { addInfo()}

        }


    private fun addInfo() {
        val inflter = LayoutInflater.from(this)
        val v = inflter.inflate(R.layout.add_items, null)
        /**Set view*/
        val moduleName = v.findViewById<EditText>(R.id.moduleName)

        val addDialog = AlertDialog.Builder(this)
        addDialog.setView(v)
        addDialog.setPositiveButton("Ok"){
                dialog,_->
                val names  = moduleName.text.toString()
                moduleList.add(ModuleData("Name:$names"))
                moduleAdapter.notifyDataSetChanged()
                Toast.makeText(this,"Adding Module Information Sucess",Toast.LENGTH_LONG).show()
                dialog.dismiss()

        }

        addDialog.setNegativeButton("Cancel"){
            dialog,_->
            dialog.dismiss()
            Toast.makeText(this,"Cancel",Toast.LENGTH_LONG).show()

        }
        addDialog.create()
        addDialog.show()
    }

}





