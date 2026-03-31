package trip;
public enum ServiceLevel{
    BASIC(1),
    PREMIUM(2);
    private int m;
    ServiceLevel(int m){this.m=m;}
    public int getMultiplier(){return m;}
}