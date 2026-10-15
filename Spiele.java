
public class Spiele
{
    private String name;
    private int price;
    private boolean avaible;
    private String publisher;
    
    
    public Spiele(String name, int preis, boolean verfuebar)
    {
        setName(name);
        setPreis(preis);
        setVerfuegbar(avaible);
        setPublisher(publisher);
    }
    
    public void setName(String neuName)
    {
        name = neuName;
    }
    
    public void setPreis(int neuPreis)
    {
        price = neuPreis;
    }
    
    public void setVerfuegbar(boolean neuVerfuegbar)
    {
        avaible = neuVerfuegbar;
    }
    
    public void setPublisher(String neuPublisher)
    {
        publisher = neuPublisher;    
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getPreis()
    {
        return price;
    }
    
    public boolean getVerfuegbar()
    {
        return avaible;
    }
    
    public String getPublisher()
    {
        return publisher;
    }
}