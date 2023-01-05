


package netscape.js;


public class JSException extends RuntimeException {
    private static final long serialVersionUID = 2778103758223661489L;


    public JSException() {
    }


    public JSException(String s) {
        super(s);
    }


    public JSException(Throwable t) {
        super(t);
    }
}