
public class Spiele
{
    private String name;
    private int preis;
    private boolean verfuegbar;
    
    public Spiele(String name, int preis, boolean verfuebar)
    {
        setName(name);
        setPreis(preis);
        setVerfuegbar(verfuegbar);
    }
    
    public void setName(String neuName)
    {
        name = neuName;
    }
    
    public void setPreis(int neuPreis)
    {
        preis = neuPreis;
    }
    
    public void setVerfuegbar(boolean neuVerfuegbar)
    {
        verfuegbar = neuVerfuegbar;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getPreis()
    {
        return preis;
    }
    
    public boolean getVerfuegbar()
    {
        return verfuegbar;
    }
}