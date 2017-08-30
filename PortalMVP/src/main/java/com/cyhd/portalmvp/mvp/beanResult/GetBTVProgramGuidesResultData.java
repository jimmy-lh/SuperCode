package com.cyhd.portalmvp.mvp.beanResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created on 2017/7/13.
 */
public class GetBTVProgramGuidesResultData implements Serializable {

    /**
     * programGuide集合
     */
    private List<ProgramGuideList> programGuideList;

    public List<ProgramGuideList> getProgramGuideList() {
        return programGuideList;
    }

    public void setProgramGuideList(List<ProgramGuideList> programGuideList) {
        this.programGuideList = programGuideList;
    }

    @Override
    public String toString() {
        return "GetBTVProgramGuidesResultData{" +
                "programGuideList=" + programGuideList +
                '}';
    }
}
