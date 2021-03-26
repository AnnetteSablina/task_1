package com.annette.Task7;

import com.annette.Utilities.EnterValue;
import com.annette.Utilities.Mode;
import com.annette.Utilities.NegativeException;

import java.util.Locale;

public class EnterCoordinate {
    public static int enterCoordinate(CoordinateType coordinateType) {
        while (true) {
            try {
                return EnterValue.enterValue("Enter the "+ coordinateType.name().toLowerCase(Locale.ROOT)
                        +" coordinate", Mode.ANY);
            } catch (NegativeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
