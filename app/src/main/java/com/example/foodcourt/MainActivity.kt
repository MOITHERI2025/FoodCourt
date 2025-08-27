package com.example.foodcourt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

            Column(
                //it aligns the colomn
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize(),
            ) {

                Text (
                    text = "Food Court",
                    modifier = Modifier,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Black


                )
                            //input box
                            OutlinedTextField(
                                value = timeOfDay,
                                onValueChange = { text -> timeOfDay = text },
                                placeholder = { Text(text = "e.g. mornin")}
                            )

                            //spacer
                            Spacer(modifier = Modifier.size(30.dp))

                            Text (
                                text = errorText,
                                modifier = Modifier,
                                color = Color.Red
                            )
                            Spacer(modifier = Modifier.size(30.dp))

                            Text (text = firstChoice)
                            Text (text = secondChoice)

                            Spacer(modifier = Modifier.size(30.dp))

                            Row {
                                //suggest button
                                Button(
                                    onClick = { /*TODO*/

                            //if statement for food selection
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
                        //reset
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

