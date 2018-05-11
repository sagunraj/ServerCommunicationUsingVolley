package np.com.sagunraj.serverexample;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.astuetz.PagerSlidingTabStrip;

public class SwipableFragment extends Fragment {
    ViewPager viewPager;
    PagerSlidingTabStrip pagertab;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_swipable, null);
        viewPager = view.findViewById(R.id.viewpager);
        pagertab = view.findViewById(R.id.pager_tabs);
        FragmentManager fm = getChildFragmentManager();
        viewPager.setAdapter(new MyAdapter(getActivity(), fm));
        pagertab.setViewPager(viewPager);
        return view;
    }
}
