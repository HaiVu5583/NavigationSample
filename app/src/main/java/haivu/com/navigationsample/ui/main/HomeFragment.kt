package haivu.com.navigationsample.ui.main

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
//import haivu.com.librarytest.LibraryTestActivity
import haivu.com.navigationsample.R
import com.mshopsdk.MShop;
import com.mshopsdk.MShopTags;
import android.app.Activity
import android.widget.Toast


class HomeFragment : Fragment() {

//    companion object {
//        fun newInstance() = HomeFragment()
//    }

//    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.home_fragment, container, false)
        val homeBtn = view.findViewById<Button>(R.id.homeBtn)
        homeBtn.setOnClickListener{view ->
//            Navigation.findNavController(view).navigate(R.id.mainFragment)
           MShop.start(activity);
        }
        return view
    }

}
