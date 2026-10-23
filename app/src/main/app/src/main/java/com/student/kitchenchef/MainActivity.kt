// Burada sizin kendi package adınız yazacak (Dokunmayın)
package com.sizin.paket.adiniz 

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.sizin.paket.adiniz.ui.theme.KitchenChefTheme // Burası projenizin adıyla oluşan tema adıdır

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KitchenChefTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Ana ekranımızı burada çağırıyoruz
                    RecipeListScreen() 
                }
            }
        }
    }
}
