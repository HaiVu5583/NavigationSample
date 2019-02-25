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
//           MShop.start(activity);
            MShop.builder()
                .setUserId("1001")
                .setPhoneNumber("0977865062")
                .setName("Vũ Long Hải")
                .setAvatar("https://nerdist.com/wp-content/uploads/2016/09/20160930_n_nerdistnews_drstrangeinfinity_1x1.jpg")
                .start(activity)
        }
        return view
    }

}
