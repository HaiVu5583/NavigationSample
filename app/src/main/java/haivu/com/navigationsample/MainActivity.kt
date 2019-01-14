package haivu.com.navigationsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI.setupWithNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        val bottomTab = findViewById<BottomNavigationView>(R.id.bottom_tab)
        val navController = Navigation.findNavController(this, R.id.navHostFragment)
        setupWithNavController(bottomTab, navController)
    }

    override fun onSupportNavigateUp() = Navigation.findNavController(this, R.id.navHostFragment).navigateUp()

}
