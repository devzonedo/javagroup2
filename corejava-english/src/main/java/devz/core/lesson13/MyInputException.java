/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devz.core.lesson13;

/**
 *
 * @author devzo
 */
public class MyInputException extends Exception {

    /**
     * Creates a new instance of <code>MyInputException</code> without detail
     * message.
     */
    public MyInputException() {
    }

    /**
     * Constructs an instance of <code>MyInputException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public MyInputException(String msg) {
        super(msg);
    }
}
