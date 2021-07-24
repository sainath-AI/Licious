package com.masai.licious.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.masai.licious.fragments.AlertFragment;

import com.masai.licious.fragments.OfferFragment;
public class PagerAdapeterView extends FragmentStateAdapter {

    public PagerAdapeterView(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return OfferFragment.newInstance();
            case 1:
                return AlertFragment.newInstance();

        }
        return null;

    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
