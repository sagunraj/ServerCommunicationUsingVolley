package np.com.sagunraj.serverexample;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class HomeActivity extends AppCompatActivity{
    DrawerLayout drawerLayout;
    Toolbar toolbarid;
    NavigationView navigationView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        drawerLayout = findViewById(R.id.drawerlayout);
        toolbarid = findViewById(R.id.toolbarid);
        navigationView = findViewById(R.id.navigationview);
        setSupportActionBar(toolbarid); //necessary for getSupportActionBar while adding Action Bar title
    }
}
