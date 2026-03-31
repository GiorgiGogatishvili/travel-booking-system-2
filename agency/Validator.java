package agency;
@FunctionalInterface public interface Validator<T>{
    boolean validate(T t);
}