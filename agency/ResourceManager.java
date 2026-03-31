package agency;
public class ResourceManager
        implements AutoCloseable{
    public void useResource(){System.out.println("Using");}
    public void close(){System.out.println("Closed");}
}