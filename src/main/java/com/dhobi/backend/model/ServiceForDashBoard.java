package com.dhobi.backend.model;

import com.dhobi.backend.Repository.DashBoardRepositries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ServiceForDashBoard {
    @Autowired
    DashBoardRepositries dashBoardRepositries;
    public MGettingDashBoardData serviceForDashBoard() {
        MGettingDashBoardData mGettingDashBoardData = new MGettingDashBoardData();
        MDashBoard mDashBoard = dashBoardRepositries.findAll().get(0);

        if (mDashBoard !=null)
        {
            mGettingDashBoardData.setCode(200);
            mGettingDashBoardData.setmDashBoard(mDashBoard);
            return mGettingDashBoardData;
        }
        else
        {
            mGettingDashBoardData.setCode(500);
            mGettingDashBoardData.setmDashBoard(mDashBoard);
            return mGettingDashBoardData;
        }
    }

}
