package com.example.myapplication

import android.content.Intent
import android.content.Intent.EXTRA_TEXT
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val premierBouton: Button = findViewById(R.id.BoutonValider)
        val saisie : EditText = findViewById(R.id.saisie)
        var vueText : TextView = findViewById(R.id.textView)

        premierBouton.setOnClickListener {
            if (saisie.text.contains("afficher nouveau textView")) {
                val layoutPrincipal: ConstraintLayout = findViewById(R.id.main)
                vueText = TextView(this)
                layoutPrincipal.addView(vueText)
            }
            vueText.text = saisie.text
        }
        val prochainBouton: Button = findViewById(R.id.suivant)
        prochainBouton.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            intent.putExtra(EXTRA_TEXT, vueText.text.toString())
            startActivity(intent)
    }
}
}