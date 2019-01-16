package haivu.com.navigationsample

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.util.Log
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.mshopsdk.MShop;
import com.mshopsdk.MShopTags;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        val bottomTab = findViewById<BottomNavigationView>(R.id.bottom_tab)
        val navController = Navigation.findNavController(this, R.id.navHostFragment)
        setupWithNavController(bottomTab, navController)
    }

    override fun onSupportNavigateUp() = Navigation.findNavController(this, R.id.navHostFragment).navigateUp()

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Log.d("haivu", requestCode.toString())
        Log.d("haivu", requestCode.toString())
        if (requestCode === MShopTags.REQUEST_MSHOP_CODE && resultCode === Activity.RESULT_OK && data != null) {
            val responseMShop = data.getStringExtra(MShopTags.MSHOP_RESPONSE_TAG)
            Toast.makeText(applicationContext, responseMShop, Toast.LENGTH_SHORT).show();
        }
    }
}
