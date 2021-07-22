package com.masai.licious.activities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.masai.licious.fragments.ChickenFragment;
import com.masai.licious.fragments.ColdcutsFragment;
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
                return MuttonFragment.newInstance();
            case 2:
                return ChickenFragment.newInstance();
            case 3:
                return EggsFragment.newInstance();
            case 4:
                return ColdcutsFragment.newInstance();
            case 5:
                return PrawnFragment.newInstance();
            case 6:
                return ReadyToCookFragment.newInstance();
            case 7:
                return SpreadsFragment.newInstance();
            case 8:
                return SaverFragment.newInstance();
            case 9:
                return KababFragment.newInstance();
        }
        return null;

    }

    @Override
    public int getItemCount() {
        return 10;
    }





}
