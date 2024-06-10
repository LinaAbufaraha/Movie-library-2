public class MovieException extends Exception{

    public MovieException(){
        super();
    }

    public MovieException(String msg){
        super(msg);
    }

    public MovieException(String message, Throwable cause) {
        super(message, cause);
    }

    public MovieException(Throwable cause) {
        super(cause);
    }
}
