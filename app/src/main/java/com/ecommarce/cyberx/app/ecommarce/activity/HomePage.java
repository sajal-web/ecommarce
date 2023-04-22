package com.ecommarce.cyberx.app.ecommarce.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.ecommarce.cyberx.app.ecommarce.R;
import com.ecommarce.cyberx.app.ecommarce.databinding.ActivityHomePageBinding;
import com.ecommarce.cyberx.app.ecommarce.fragments.ArtistFragment;
import com.ecommarce.cyberx.app.ecommarce.fragments.CatagoryFragment;
import com.ecommarce.cyberx.app.ecommarce.fragments.ExhibitionFragment;
import com.ecommarce.cyberx.app.ecommarce.fragments.HomeFragment;
import com.ecommarce.cyberx.app.ecommarce.fragments.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomePage extends AppCompatActivity {
        BottomNavigationView bottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        bottomNavigation = findViewById(R.id.bottomNavigation);
        bottomNavigation.setOnNavigationItemSelectedListener(selectedListener);

        HomeFragment fragment=new HomeFragment();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.content,fragment,"");
        fragmentTransaction.commit();
    }
    private BottomNavigationView.OnNavigationItemSelectedListener selectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            switch (menuItem.getItemId()) {

                case R.id.home_nev:
                    HomeFragment fragment = new HomeFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.content, fragment, "");
                    fragmentTransaction.commit();
                    return true;

                case R.id.category_nev:
                    CatagoryFragment catagoryFragment = new CatagoryFragment();
                    FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction1.replace(R.id.content, catagoryFragment);
                    fragmentTransaction1.commit();
                    return true;

                case R.id.artist_nev:
                    ArtistFragment artistFragment = new ArtistFragment();
                    FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction2.replace(R.id.content, artistFragment);
                    fragmentTransaction2.commit();
                    return true;

                case R.id.exhibition_nev:
                    ExhibitionFragment exhibitionFragment = new ExhibitionFragment();
                    FragmentTransaction fragmentTransaction3 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction3.replace(R.id.content, exhibitionFragment);
                    fragmentTransaction3.commit();
                    return true;

                case R.id.profile_nev:
                    ProfileFragment profileFragment = new ProfileFragment();
                    FragmentTransaction fragmentTransaction4 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction4.replace(R.id.content, profileFragment);
                    fragmentTransaction4.commit();
                    return true;


//                case R.id.nav_users:
//                    actionBar.setTitle("Users");
//                    UsersFragment fragment2 = new UsersFragment();
//                    FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
//                    fragmentTransaction2.replace(R.id.content, fragment2, "");
//                    fragmentTransaction2.commit();
//                    return true;
//
//                case R.id.nav_chat:
//                    actionBar.setTitle("Chats");
//                    ChatListFragment listFragment = new ChatListFragment();
//                    FragmentTransaction fragmentTransaction3 = getSupportFragmentManager().beginTransaction();
//                    fragmentTransaction3.replace(R.id.content, listFragment, "");
//                    fragmentTransaction3.commit();
//                    return true;
//
//                case R.id.nav_addblogs:
//                    actionBar.setTitle("Add Blogs");
//                    AddBlogsFragment fragment4 = new AddBlogsFragment();
//                    FragmentTransaction fragmentTransaction4 = getSupportFragmentManager().beginTransaction();
//                    fragmentTransaction4.replace(R.id.content, fragment4, "");
//                    fragmentTransaction4.commit();
//                    return true;
            }
            return false;
        }
    };
}