package com.dhobi.backend.model;

import java.util.Optional;

public class MGettingDashBoardData {
    private int code ;
    private MDashBoard mDashBoard;

    public MDashBoard getmDashBoard() {
        return mDashBoard;
    }

    public void setmDashBoard(MDashBoard mDashBoard) {
        this.mDashBoard = mDashBoard;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
