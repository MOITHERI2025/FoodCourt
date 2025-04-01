package com.example.foodcourt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.foodcourt.ui.theme.FoodCourtTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var timeOfDay by remember {
                mutableStateOf("")
            }
            var firstChoice by remember {
                mutableStateOf("")
            }
            var secondChoice by remember {
                mutableStateOf("")
            }
            var errorText by remember {
                mutableStateOf("")
            }

            Column {

                Text (text = "Food Court")

                OutlinedTextField(
                    value = timeOfDay,
                    onValueChange = { text -> timeOfDay = text }
                )


                Text (text = errorText)
                Text (text = firstChoice)
                Text (text = secondChoice )
                
                Row {
                    Button(
                        onClick = { /*TODO*/

                            if (timeOfDay == "morning") {
                                firstChoice = "1. Toasted Bread"
                                secondChoice = "2. Porridge"
                                errorText = "Meal Suggested:"
                            }
                            else if (timeOfDay == "mid-morning") {
                                firstChoice = "1. Fruit Bowl"
                                secondChoice = "2. Boiled Egg"
                                errorText = "Meal Suggested:"
                            }
                            else if (timeOfDay == "afternoon") {
                                firstChoice = "1. Sandwich"
                                secondChoice = "2. Burger"
                                errorText = "Meal Suggested:"
                            }
                            else if  (timeOfDay == "mid-afternoon") {
                                firstChoice = "1. Biscuits"
                                secondChoice = "2. Yogurt"
                                errorText = "Meal Suggested:"
                            }
                            else if (timeOfDay == "dinner") {
                                firstChoice = "1. Chicken Salad"
                                secondChoice = "2. Dumpling"
                                errorText = "Meal Suggested:"
                            }
                            else if (timeOfDay == "dinner-snack") {
                                firstChoice = "1. Ice-Cream"
                                secondChoice = "2. Cake"
                                errorText = "Meal Suggested:"
                            }
                            else {
                                firstChoice = "Invalid Input"
                                secondChoice = ""
                                errorText = "use lowercase letters"
                            }
                        }
                    ) {
                        Text(text = "Suggestion")
                    }
                    
                    Button(
                        onClick = { /*TODO*/
                            timeOfDay = ""
                            firstChoice = ""
                            secondChoice = ""
                            errorText = ""



                        }
                    ) {
                        Text(text = "Reset")
                        
                    }
                }

            }

        }
    }
}

