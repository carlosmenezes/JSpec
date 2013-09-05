package com.fireball.jspec;

import java.util.function.Consumer;

/**
 *
 * @author Carlos Menezes a.k.a. FireBall
 */
class JSpec {
 
    public void it(String specName, SimpleSpec spec) {
        spec.execute();
    }
    
    
}
