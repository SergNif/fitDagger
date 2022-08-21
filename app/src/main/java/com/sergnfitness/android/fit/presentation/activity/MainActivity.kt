package com.sergnfitness.android.fit.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.sergnfitness.android.fit.app.App
import com.sergnfitness.android.fit.databinding.ActivityMainBinding
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
//    git push -f origin main
    //    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

    @Inject
    lateinit var vmFactory: MainViewModelFactory
    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        (applicationContext as App).appComponent.inject(this)

        viewModel = ViewModelProvider(this,vmFactory).get(MainViewModel::class.java)


//        val logFragment: LoginFragment = LoginFragment()
//        val fragment: Fragment? = supportFragmentManager.findFragmentByTag(logFragment::class.java.simpleName)
//
//        if (fragment != logFragment){
//        supportFragmentManager.beginTransaction()
//            .add(LoginFragment,"Fragment Login",LoginFragment,LoginFragment::class.java.simpleName)
//
    }
}