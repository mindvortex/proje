package com.example.jewishbear.gamerlobby;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * Created by jewishbear on 11/20/2016.
 */

public class RegionsActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regions_activity);


        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout2);
        mToggle = new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view2);
        navigationView.setNavigationItemSelectedListener(this);







    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if(mToggle.onOptionsItemSelected(item)){

            return true;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {


        int id = item.getItemId();
        if(id==R.id.nav_homepage){
            Intent intent = new Intent(RegionsActivity.this,HomeActivity.class);
            startActivity(intent);

        }
        if (id==R.id.nav_profile){

            Intent intent = new Intent(RegionsActivity.this,ProfileActivity.class);
            startActivity(intent);
        }
        if (id==R.id.nav_regions){

        }






        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawerLayout2);
        drawer.closeDrawer(GravityCompat.START);
        return true;




    }
}
