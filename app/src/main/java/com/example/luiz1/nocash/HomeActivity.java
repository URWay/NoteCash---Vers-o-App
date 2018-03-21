package com.example.luiz1.nocash;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.luiz1.nocash.Adapter.CustomAdapter;
import com.example.luiz1.nocash.Model.Item;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    private List<Item> itemshome = new ArrayList<>();
    CustomAdapter adapter;

    private List<Item> itemspromo = new ArrayList<>();
    CustomAdapter adapter2;

//    public Handler mHandler;
//    public View ftView;
//    public boolean isLoading = false;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
//
//        LayoutInflater li  = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        ftView = li.inflate(R.layout.footer_view, null);


        initItem();


    }
//
//    public class MyHandler extends Handler{
//        @Override
//        public void handleMessage(Message msg) {
//         switch (msg.what){
//             case 0:
//                 // add loading aqui
//                 recyclerView.addFooterView(ftView);
//         }
//    }
//}
//
//

    private void initItem() {


        // 0 = Novo tipo, 1 = "Hot Type" 2 = Other Type
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));
        itemshome.add(new Item(0,"Novidade","UHU","http://media.comicbook.com/2016/06/suicide-squad-poster-186482.jpg"));


        adapter = new CustomAdapter(this, itemshome);
        recyclerView.setAdapter(adapter);
    }


    private void initPromo() {
        // 0 = Novo tipo, 1 = "Hot Type" 2 = Other Type

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        itemspromo.add(new Item(1,"Promoção","UHU","http://nerdista.com.br/wp-content/uploads/2016/04/akira_cover2.jpg"));
        itemspromo.add(new Item(1,"Promoção","UHU","http://nerdista.com.br/wp-content/uploads/2016/04/akira_cover2.jpg"));
        itemspromo.add(new Item(1,"Promoção","UHU","http://nerdista.com.br/wp-content/uploads/2016/04/akira_cover2.jpg"));
        itemspromo.add(new Item(1,"Promoção","UHU","http://nerdista.com.br/wp-content/uploads/2016/04/akira_cover2.jpg"));
        itemspromo.add(new Item(1,"Promoção","UHU","http://nerdista.com.br/wp-content/uploads/2016/04/akira_cover2.jpg"));
        itemspromo.add(new Item(1,"Promoção","UHU","http://nerdista.com.br/wp-content/uploads/2016/04/akira_cover2.jpg"));
        itemspromo.add(new Item(1,"Promoção","UHU","http://nerdista.com.br/wp-content/uploads/2016/04/akira_cover2.jpg"));
        itemspromo.add(new Item(1,"Promoção","UHU","http://nerdista.com.br/wp-content/uploads/2016/04/akira_cover2.jpg"));
        itemspromo.add(new Item(1,"Promoção","UHU","http://nerdista.com.br/wp-content/uploads/2016/04/akira_cover2.jpg"));
        itemspromo.add(new Item(1,"Promoção","UHU","http://nerdista.com.br/wp-content/uploads/2016/04/akira_cover2.jpg"));
        itemspromo.add(new Item(1,"Promoção","UHU","http://nerdista.com.br/wp-content/uploads/2016/04/akira_cover2.jpg"));
        itemspromo.add(new Item(1,"Promoção","UHU","http://nerdista.com.br/wp-content/uploads/2016/04/akira_cover2.jpg"));
        itemspromo.add(new Item(1,"Promoção","UHU","http://nerdista.com.br/wp-content/uploads/2016/04/akira_cover2.jpg"));
        itemspromo.add(new Item(1,"Promoção","UHU","http://nerdista.com.br/wp-content/uploads/2016/04/akira_cover2.jpg"));
        itemspromo.add(new Item(1,"Promoção","UHU","http://nerdista.com.br/wp-content/uploads/2016/04/akira_cover2.jpg"));
        itemspromo.add(new Item(1,"Promoção","UHU","http://nerdista.com.br/wp-content/uploads/2016/04/akira_cover2.jpg"));
        itemspromo.add(new Item(1,"Promoção","UHU","http://nerdista.com.br/wp-content/uploads/2016/04/akira_cover2.jpg"));
        itemspromo.add(new Item(1,"Promoção","UHU","http://nerdista.com.br/wp-content/uploads/2016/04/akira_cover2.jpg"));
        itemspromo.add(new Item(1,"Promoção","UHU","http://nerdista.com.br/wp-content/uploads/2016/04/akira_cover2.jpg"));
        itemspromo.add(new Item(1,"Promoção","UHU","http://nerdista.com.br/wp-content/uploads/2016/04/akira_cover2.jpg"));
        itemspromo.add(new Item(1,"Promoção","UHU","http://nerdista.com.br/wp-content/uploads/2016/04/akira_cover2.jpg"));
        itemspromo.add(new Item(1,"Promoção","UHU","http://nerdista.com.br/wp-content/uploads/2016/04/akira_cover2.jpg"));
        itemspromo.add(new Item(1,"Promoção","UHU","http://nerdista.com.br/wp-content/uploads/2016/04/akira_cover2.jpg"));
        itemspromo.add(new Item(1,"Promoção","UHU","http://nerdista.com.br/wp-content/uploads/2016/04/akira_cover2.jpg"));
        itemspromo.add(new Item(1,"Promoção","UHU","http://nerdista.com.br/wp-content/uploads/2016/04/akira_cover2.jpg"));
        itemspromo.add(new Item(1,"Promoção","UHU","http://nerdista.com.br/wp-content/uploads/2016/04/akira_cover2.jpg"));
        itemspromo.add(new Item(1,"Promoção","UHU","http://nerdista.com.br/wp-content/uploads/2016/04/akira_cover2.jpg"));
        itemspromo.add(new Item(1,"Promoção","UHU","http://nerdista.com.br/wp-content/uploads/2016/04/akira_cover2.jpg"));


        adapter2 = new CustomAdapter(this, itemspromo);
        recyclerView.setAdapter(adapter2);
    }





    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();



        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


        if (id == R.id.nav_home) {
            getSupportActionBar().setTitle("Home");
                initItem();
        } else if (id == R.id.nav_promo) {
            getSupportActionBar().setTitle("Promoções");
                initPromo();
        } else if (id == R.id.nav_recarga) {
            getSupportActionBar().setTitle("Recarga");
        } else if (id == R.id.nav_conta) {
            getSupportActionBar().setTitle("Minha Conta");
        } else if (id == R.id.nav_transac) {
            getSupportActionBar().setTitle("Minhas Transações");
        } else if (id == R.id.nav_login){
            getSupportActionBar().setTitle("Login");
        } else if (id == R.id.nav_about){
            getSupportActionBar().setTitle("Sobre nós");
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}