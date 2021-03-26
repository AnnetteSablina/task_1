package com.annette.utility;

import java.io.IOException;

public class NegativeException extends IOException {
    public NegativeException(String message) {
        super(message);
    }
}
