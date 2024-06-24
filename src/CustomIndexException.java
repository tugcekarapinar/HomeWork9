public class CustomIndexException extends IndexOutOfBoundsException{

    public CustomIndexException(String errorMessage){
        super(errorMessage);
    }
}