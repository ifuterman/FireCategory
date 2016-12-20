package ru.ppasoft.firecategory;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
//enum ENUM_VIEW_TYPE{MAIN_VIEW, PROJECT_VIEW};
public class MainActivityFragment extends ListFragment {
    public static FCDataManager dataManager;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        dataManager = new FCDataManager();
        dataManager.SwitchView(ENUM_VIEW_TYPE.PROJECTS_VIEW);
        setListAdapter(new FrameListAdapter(dataManager, this.getContext()));
        return view;
    }
}
