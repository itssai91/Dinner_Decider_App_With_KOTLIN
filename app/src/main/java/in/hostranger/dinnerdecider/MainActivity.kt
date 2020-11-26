package `in`.hostranger.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    var foodItems = arrayListOf("Chinese", "Italian", "Mexican", "Pizza", "Burger")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decide.setOnClickListener {
            val random = Random.nextInt(foodItems.count())
            textShow.text = foodItems[random]
        }

        addItems.setOnClickListener {
            val addedFoodItems = textInput.text.toString()
            foodItems.add(addedFoodItems)
            textInput.text.clear()
        }


    }
}