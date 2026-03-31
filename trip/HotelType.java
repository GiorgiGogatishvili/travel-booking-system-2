package trip;

public enum HotelType{
    LUXURY(5,true),
    STANDARD(3,false);
    private int stars;
    private boolean breakfast;
    HotelType(int s,boolean b){
        stars=s;
        breakfast=b;
    }
    public int getStars(){return stars;}
    public boolean isBreakfast(){return breakfast;} }