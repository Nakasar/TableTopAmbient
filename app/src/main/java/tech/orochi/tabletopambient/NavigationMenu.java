package tech.orochi.tabletopambient;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/**
 * Created by Iperi on 24/05/2017.
 * Fragment du menu de navigation.
 */

public class NavigationMenu extends Fragment{

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.navigation_menu, container, false);
    }
}
