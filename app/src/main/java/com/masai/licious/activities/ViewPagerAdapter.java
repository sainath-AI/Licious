package com.masai.licious.activities;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.masai.licious.fragments.ChickenFragment;
import com.masai.licious.fragments.ColdCutsFragment;
import com.masai.licious.fragments.EggsFragment;
import com.masai.licious.fragments.FishFragment;
import com.masai.licious.fragments.KababFragment;
import com.masai.licious.fragments.MuttonFragment;
import com.masai.licious.fragments.PrawnFragment;
import com.masai.licious.fragments.ReadyToCookFragment;
import com.masai.licious.fragments.SaverFragment;
import com.masai.licious.fragments.SpreadsFragment;

public class ViewPagerAdapter extends FragmentStateAdapter  {

    public ViewPagerAdapter(@NonNull  FragmentManager fragmentManager, @NonNull  Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return FishFragment.newInstance();
            case 1:
                return ChickenFragment.newInstance();
            case 2:
                return MuttonFragment.newInstance();
            case 3:
                return ColdCutsFragment.newInstance();
            case 4:
                return EggsFragment.newInstance();
            case 5:
                return PrawnFragment.newInstance();
            case 6:
                return KababFragment.newInstance();
            case 7:
                return SaverFragment.newInstance();
            case 8:
                return ReadyToCookFragment.newInstance();
            case 9:
                return SpreadsFragment.newInstance();
        }
        return null;

    }

    @Override
    public int getItemCount() {
        return 10;
    }





}
