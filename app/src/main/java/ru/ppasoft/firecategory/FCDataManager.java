package ru.ppasoft.firecategory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ifuterman on 20.12.2016.
 * class for representation data model
 */

class FCDataManager {

    private ENUM_VIEW_TYPE enumViewType;
    private ArrayList<Project> projetsList;
    private ArrayList<Room> roomsList;
    private List currentList;


    FCDataManager(){
        projetsList = new ArrayList<>();
        roomsList = new ArrayList<>();
    }
    void SwitchView(ENUM_VIEW_TYPE viewType) {
        enumViewType = viewType;
        switch (enumViewType)
        {
            case PROJECTS_VIEW:
            {currentList = projetsList;}
            case ROOMS_VIEW:
            {currentList = roomsList;}
        }
    }
    public ENUM_VIEW_TYPE getEnumViewType() {
        return enumViewType;
    }
    int getCurrentViewItemsCount(){return currentList.size();}
    Object getCurrentViewItem(int position){return currentList.get(position);}
    long getCurrenViewItemID(int position){return currentList.indexOf(getCurrentViewItem(position));}

}
