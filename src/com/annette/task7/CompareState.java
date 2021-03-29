package com.annette.task7;

public enum CompareState {
    FIRST_POINT_IS_CLOSER("First point is closer"),
    SECOND_POINT_IS_CLOSER("Second point is closer"),
    DESTINATION_IS_THE_SAME("Destination is the same"),
    SAME_POINT("It's the same point");
    private final String state;

    CompareState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
