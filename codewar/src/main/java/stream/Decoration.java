package stream;
@FunctionalInterface
public interface Decoration {

    void abst(); // Should be existed...
    default void decorationWithcurtains(){
        System.out.println("Decoration with Curtains ");
    }
    //test
    @Override
    public int hashCode();
}
