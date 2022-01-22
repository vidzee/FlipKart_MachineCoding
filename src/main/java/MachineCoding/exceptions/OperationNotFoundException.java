package MachineCoding.exceptions;

public class OperationNotFoundException extends Exception {
    private String name;

    public OperationNotFoundException(String name) {
        this.name = name;
    }

    @Override
    public String getMessage() {
        return "Operation " + name + " not found";
    }
}
