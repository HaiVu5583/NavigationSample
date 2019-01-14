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
import com.mshopecommercesdk.MShopMainActivity
import com.vnpay.qr.activity.QRActivity
import com.vnpay.qr.utils.VNPAYTags
import haivu.com.librarytest.LibraryTestActivity
import haivu.com.navigationsample.R
import kotlinx.android.synthetic.main.main_fragment.*

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
            val intent = Intent(view.context, LibraryTestActivity::class.java)
            startActivity(intent)
//            Log.d("haivu", VNPAYTags.LANG_VN)
        }
        return view
    }

}
