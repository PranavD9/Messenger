package com.example.teminipro;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class SectionsPagerAdapter extends FragmentPagerAdapter {
    public SectionsPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:

                ChatsFragment chatsFragment = new ChatsFragment();
                return  chatsFragment;


            case 1:
                FriendsFragment friendsFragment = new FriendsFragment();
                return friendsFragment;

           // case 2:


            default:
                return  null;

        }


    }

    @Override
    public int getCount() {
        return 2;
    }

    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "CHATS";

            case 1:
                return "FRIENDS";



            default:
                return null;
        }
    }

}
