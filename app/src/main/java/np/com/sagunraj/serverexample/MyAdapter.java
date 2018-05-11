package np.com.sagunraj.serverexample;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;

public class MyAdapter extends FragmentStatePagerAdapter {
    public MyAdapter(FragmentActivity activity, FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new AudioFragment();
        }
        else if(position==1){
            return new VideoFragment();
        }
        else if(position==2){
            return new ImageFragment();
        }
        else{
            return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return "Audio";
        }
        else if(position==1){
            return "Video";
        }
        else if(position==2){
            return "Pictures";
        }
        else{
            return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
