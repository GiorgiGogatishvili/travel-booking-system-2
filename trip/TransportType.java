package trip;
public enum TransportType{
    AIR("Air",500),
    TAXI("Taxi",50);
    private String l;
    private int s;
    TransportType(String l,int s){
        this.l=l;this.s=s;
    }
    public String getLabel(){return l;} public int getSpeed(){return s;}
}