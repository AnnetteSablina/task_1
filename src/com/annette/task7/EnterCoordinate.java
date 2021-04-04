package com.annette.task7;

import com.annette.utility.EnterValue;
import com.annette.utility.Mode;
import com.annette.utility.NegativeException;
import com.annette.utility.ZeroException;


public class EnterCoordinate {
    public static int enterCoordinate(CoordinateType coordinateType) {
        while (true) {
            try {
                return EnterValue.enterValue("Enter the "+ coordinateType.name().toLowerCase()
                        +" coordinate", Mode.ANY);
            } catch (NegativeException | ZeroException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
