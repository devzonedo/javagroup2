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
public class NameException extends Exception {

    /**
     * Creates a new instance of <code>NameException</code> without detail
     * message.
     */
    public NameException() {
    }

    /**
     * Constructs an instance of <code>NameException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public NameException(String msg) {
        super(msg);
    }
}
