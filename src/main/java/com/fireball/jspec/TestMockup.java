package com.fireball.jspec;

import com.fireball.jspec.annotations.Describe;

/**
 *
 * @author Carlos Menezes a.k.a. FireBall
 */
public class TestMockup extends JSpec {
    
   @Describe("Testing something") 
   public void testingSomething() {
       
       
       it("pass when assertions is true", () -> {
           System.out.println("Blablabla"); 
       });
       
   }
    
    
}
