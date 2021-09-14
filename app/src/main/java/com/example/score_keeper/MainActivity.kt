package com.example.score_keeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var scorePlayer1: Int = 0
    var scorePlayer2: Int = 0

    lateinit var tvscore1: TextView
    lateinit var tvscore2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvscore1 = findViewById(R.id.tvscore1)
        tvscore2 = findViewById(R.id.tvscore2)

        val ivplus1: ImageView = findViewById(R.id.ivplus1)
        ivplus1.setOnClickListener{
            scorePlayer1++
            tvscore1.text = scorePlayer1.toString()
        }

        val ivminus1: ImageView = findViewById(R.id.ivminus1)
        ivminus1.setOnClickListener{
            if (scorePlayer1>=1)
            scorePlayer1--
            tvscore1.text = scorePlayer1.toString()
        }

        val ivplus2: ImageView = findViewById(R.id.ivplus2)
        ivplus2.setOnClickListener {
            scorePlayer2++
            tvscore2.text = scorePlayer2.toString()
        }

        val ivminus2: ImageView = findViewById(R.id.ivminus2)
        ivminus2.setOnClickListener{
            if (scorePlayer2>=1)
            scorePlayer2--
            tvscore2.text = scorePlayer2.toString()
        }



    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId)
        {
            R.id.menuhome -> Toast.makeText(this, "Home Menu Clicked", Toast.LENGTH_LONG).show()
            R.id.menureset -> reset()
            R.id.menulogout -> Toast.makeText(this, "Logout Clicked", Toast.LENGTH_LONG).show()
        }
        return true
    }

    private fun reset() {
        scorePlayer1=0
        tvscore1.text = "0"

        scorePlayer2=0
        tvscore2.text = "0"

    }
}