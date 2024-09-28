package com.Fadhil.wisata

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Fadhil.wisata.adapter.WisataAdapter
import com.Fadhil.wisata.model.ModelWisata
import com.Fadhil.wisata.model.WisataList

class MainActivity : AppCompatActivity() {

    private lateinit var rv_wisataHorizontal : RecyclerView
    private lateinit var rv_wisataVertikal : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        rv_wisataHorizontal = findViewById(R.id.rv_wisataHorizontal)
        rv_wisataVertikal = findViewById(R.id.rv_wisataVertikal)

        rv_wisataHorizontal.layoutManager = GridLayoutManager(this, 1, GridLayoutManager.HORIZONTAL, false)
        rv_wisataVertikal.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)

        val adapter = WisataAdapter(WisataList.getModel() as ArrayList<ModelWisata>, this)

        rv_wisataHorizontal.adapter = adapter
        rv_wisataVertikal.adapter = adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}