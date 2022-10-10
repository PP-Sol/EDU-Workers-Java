package Workers;


public class Cargo 
{
    int posX;
    int posY;
    int weight;
    int color;
    boolean neighbours[] = new boolean [8];


    public Cargo() 
    {
        posX = 0;
        posY = 0;
        weight = 0;
        color = globalVar.CERNA; //cerna 
    }
    
    public Cargo(int x,int y,int weight,int col)
    {
        if(x<0) x = 0;
        if(y<0) y = 0;
        if(weight<0) weight = 0;
        
        posX = x;
        posY = y;
        weight = weight;
        color = col;
    }
    
}
