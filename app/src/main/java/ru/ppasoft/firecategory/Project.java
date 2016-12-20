package ru.ppasoft.firecategory;

/**
 * Created by ifuterman on 09.12.2016.
 * Class represents project object
 */

class Project {
    private String mProjectName;
    private String mProjectDescription;
    private String mCalculatedCategory;
    public void setProjectName(String mProjectName) {
        this.mProjectName = mProjectName;
    }

    public String getProjectName() {
        return mProjectName;
    }

    public void setProjectDescription(String mProjectDescription) {
        this.mProjectDescription = mProjectDescription;
    }

    public String getProjectDescription() {
        return mProjectDescription;
    }


}
