package Workers;

public class Worker implements WorkerInterf
{
    
    public int countCargo;
    public double movedDistance;
    public double countWeight;
    public int color;
    public int PosX;  //X pozice delnika
    public int PosY;  //Y pozice delnika
    public int indexCargo = -1; // index neseneho nakladu v poli nakladu (-1 = neneseme zadny naklad)
    
    //otestovano
    public Worker() 
    {
        //inicializujeme stavove promenne
        this.countCargo = 0;
        this.movedDistance = 0;
        this.countWeight = 0;
        this.PosX = 0;
        this.PosY = 0;
        this.color = globalVar.ZELENA; //zelena
        indexCargo = -1;
    }
    
    //otestovano
    //konstruktor umoznuje nastavit poc. pozici a barvu delnika
    public Worker(int pocX, int pocY, int col) 
    {
        //inicializujeme stavove promenne
        this.countCargo = 0;
        this.movedDistance = 0;
        this.countWeight = 0;
        this.PosX = pocX;
        this.PosY = pocY;
        this.color = col;
        indexCargo = -1;
    }
    
    //otestovano
    //metoda posune delnika na urcene pozice a pripocita uslou vzdalenost
    synchronized public void move(int x,int y)
    {
        this.movedDistance = this.movedDistance + distance(this.PosX,this.PosY,x,y);
        this.PosX = x;
        this.PosY = y;
    }
    
    //otestovano
    //metoda vrati true pokud na dane pozici je naklad - opacne false
    
    synchronized public boolean isCargo(int x, int y)
    {
        int i;
        boolean vrat = false;
        
        for(i=0;i<globalVar.databCargo.length;i++) //prochazime pole nakladu
        {
            if( (globalVar.databCargo[i].posX == x) && (globalVar.databCargo[i].posY == y) )
            {
                vrat = true;
                break;
            }
        }
        
        return vrat;
    }
    
    //otestovano
    //metoda "nalozi naklad" na aktualni pozici delnika (naklad akt.pos. musi byt)
    synchronized public void loadCargo()
    {
        int index;
        
        if(isCargo(this.PosX,this.PosY)) // je na pozici delnika naklad?
        {
            try
            {
                index = getIndexCargo(this.PosX,this.PosY); //ziskame index nakladu
                if(index > -1) // povedlo se (index neni -1)
                {
                    this.indexCargo = index;  //neseme naklad
                    globalVar.databCargo[index].color = globalVar.BILA; //naklad ma barvu pozadi (neni videt)
                    changeN(this.PosX,this.PosY,false);                 //pro sousedy uz tam naklad neni
                    
                }
                
            }
            catch(Exception e)
            {
                System.out.println("Chyba vyzvednuti nakladu");
                this.indexCargo = -1; //neco se nepovedlo delnik nic nenese
            }
        }
    }
    
    //metoda "slozi naklad" na aktualni pozici delnika - pozice musi byt bez nakladu
    synchronized public void unloadCargo()
    {
        if(!isCargo(this.PosX,this.PosY))   //na pozici nesmi byt naklad
        {
           try
           {
               //slozime naklad
               globalVar.databCargo[this.indexCargo].posX = this.PosX;  //souranice nakladu jsou stejne jako souradnice delnika
               globalVar.databCargo[this.indexCargo].posY = this.PosY;
               globalVar.databCargo[this.indexCargo].color = this.color; //naklad ziska barvu delnika
               this.makeN(this.PosX,this.PosY); // nakladu aktualizujeme sousedy
               this.changeN(this.PosX,this.PosY,true); //sousedum rekneme ze je tam novy naklad
               
               
               //delnik si zapocita naklad a vahu nakladu
               this.countCargo++;
               this.countWeight = this.countWeight + globalVar.databCargo[this.indexCargo].weight;
               this.indexCargo = -1; //delnik uz nenese zadny naklad
           }
           catch(Exception e)
           {
               
           }
        }
    }
    
    //otestovano
    //metoda vrati index nakladu na zadanych souradnicich - pokud na zadanych souradnicich
    //naklad neni vrati -1
    synchronized static public int getIndexCargo(int x, int y)
    {
        int i,vrat = -1;
        
        for(i=0;i<globalVar.databCargo.length;i++) //prochazime pole nakladu
        {
            if( (globalVar.databCargo[i].posX == x) && (globalVar.databCargo[i].posY == y) )
            {
                vrat = i;
                break;
            }
        }
        
        return vrat;
    }
    
    //otestovano
    //metoda pocita vzdalenost dvou bodu v rovine xy
    synchronized double distance(int x1, int y1, int x2, int y2)
    {
        
         return (Math.sqrt( (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2) )) ;
    }
   
    //otestovano
    //metoda vrati index v poli nakladu nejblizsiho nakladu dane barvy od aktualni pozice delnika
    //pokud zadny prvek dane barvy neni vrati -1
    synchronized int nearestCargo(int barva)
    {
        int x,y,xmin,ymin,i,min = -1;
        
        for(i=0;i<globalVar.databCargo.length;i++)  //na zacatku je nejmensi prvni prvek pole nakladu o dane barve
        {
            if(globalVar.databCargo[i].color==barva)    //hledame prvni prvek ktery ma zadanou barvu
            {
                min = i;
            }
        }
        if(min!=-1) 
        {
            for(i=0;i<globalVar.databCargo.length;i++) //prochazime pole nakladu
            {
                x = globalVar.databCargo[i].posX;   // pozice aktualniho nakladu
                y = globalVar.databCargo[i].posY;
                xmin = globalVar.databCargo[min].posX;  //pozice nakladu s minimalni vzdalenosti od delnika
                ymin = globalVar.databCargo[min].posY;
                if( (distance(this.PosX,this.PosY,x,y) < distance(this.PosX,this.PosY,xmin,ymin)) && (globalVar.databCargo[i].color==barva) )
                {
                    min = i;
                }
            }
        }
        return min;
    }
    
    //otestovano
    //metoda vrati index v poli nakladu nejvzdalenejsiho nakladu od aktualni pozice delnika
    synchronized int farestCargo(int barva)
    {
        int x,y,xmax,ymax,i,max = -1;
        
        for(i=0;i<globalVar.databCargo.length;i++)  //na zacatku je nejvetsi prvni prvek pole nakladu o dane barve
        {
            if(globalVar.databCargo[i].color==barva)    //hledame prvni prvek ktery ma zadanou barvu
            {
                max = i;
            }
        }
        if(max!=-1) 
        {
            for(i=0;i<globalVar.databCargo.length;i++) //prochazime pole nakladu
            {
                x = globalVar.databCargo[i].posX;   // pozice aktualniho nakladu
                y = globalVar.databCargo[i].posY;
                xmax = globalVar.databCargo[max].posX;  //pozice nakladu s minimalni vzdalenosti od delnika
                ymax = globalVar.databCargo[max].posY;
                if( (distance(this.PosX,this.PosY,x,y) > distance(this.PosX,this.PosY,xmax,ymax)) && (globalVar.databCargo[i].color==barva) )
                {
                    max = i;
                }
            }
        }
        return max;
    }
    
    
    //otestovano
    //metoda prida/odstrani v sousedech naklad o souradnicich x,y
    synchronized static public void changeN(int x, int y,boolean pridat)
    {
       int i;
       
       i=getIndexCargo(x-1,y-1);  //index nakladu na souradnicich
       if(i!=-1) globalVar.databCargo[i].neighbours[2] = pridat;
       
       i=getIndexCargo(x,y-1);  //index nakladu na souradnicich
       if(i!=-1) globalVar.databCargo[i].neighbours[1] = pridat;
       
       i=getIndexCargo(x+1,y-1);  //index nakladu na souradnicich
       if(i!=-1) globalVar.databCargo[i].neighbours[0] = pridat;
       
       i=getIndexCargo(x+1,y);  //index nakladu na souradnicich
       if(i!=-1) globalVar.databCargo[i].neighbours[7] = pridat;
       
       i=getIndexCargo(x+1,y+1);  //index nakladu na souradnicich
       if(i!=-1) globalVar.databCargo[i].neighbours[6] = pridat;
       
       i=getIndexCargo(x,y+1);  //index nakladu na souradnicich
       if(i!=-1) globalVar.databCargo[i].neighbours[5] = pridat;
       
       i=getIndexCargo(x-1,y+1);  //index nakladu na souradnicich
       if(i!=-1) globalVar.databCargo[i].neighbours[4] = pridat;
       
       i=getIndexCargo(x-1,y);  //index nakladu na souradnicich
       if(i!=-1) globalVar.databCargo[i].neighbours[3] = pridat;
        
    }
    
    //otestovano
    //metoda vyrobi nakladu na danych pozicich x,y sousedy
    synchronized static public void makeN(int x,int y)
    {
        int index,i;
        
        index = getIndexCargo(x,y); //index nakladu na zadanych pozicich
        if(index!=1)    //naklad tam opravdu je
        {
            i=getIndexCargo(x-1,y-1);  //index nakladu na souradnicich
            if(i!=-1) globalVar.databCargo[index].neighbours[6] = true; //je tam
            else globalVar.databCargo[index].neighbours[6] = false; //neni tam
            
            i=getIndexCargo(x,y-1);  //index nakladu na souradnicich
            if(i!=-1) globalVar.databCargo[index].neighbours[5] = true;
            else globalVar.databCargo[index].neighbours[5] = false;
            
            i=getIndexCargo(x+1,y-1);  //index nakladu na souradnicich
            if(i!=-1) globalVar.databCargo[index].neighbours[4] = true;
            else globalVar.databCargo[index].neighbours[4] = false;
       
            i=getIndexCargo(x+1,y);  //index nakladu na souradnicich
            if(i!=-1) globalVar.databCargo[index].neighbours[3] = true;
            else globalVar.databCargo[index].neighbours[3] = false;
       
            i=getIndexCargo(x+1,y+1);  //index nakladu na souradnicich
            if(i!=-1) globalVar.databCargo[index].neighbours[2] = true;
            else globalVar.databCargo[index].neighbours[2] = false;
       
            i=getIndexCargo(x,y+1);  //index nakladu na souradnicich
            if(i!=-1) globalVar.databCargo[index].neighbours[1] = true;
            else globalVar.databCargo[index].neighbours[1] = false;
       
            i=getIndexCargo(x-1,y+1);  //index nakladu na souradnicich
            if(i!=-1) globalVar.databCargo[index].neighbours[0] = true;
            else globalVar.databCargo[index].neighbours[0] = false;
       
            i=getIndexCargo(x-1,y);  //index nakladu na souradnicich
            if(i!=-1) globalVar.databCargo[index].neighbours[7] = true;
            else globalVar.databCargo[index].neighbours[7] = false;
        }
        
        MainClass.orez(); //orezem
    }
    
    //metoda vrati x-vou souradnici prvniho volneho souseda nakladu(index), pokud nenajde vrati -1
    synchronized static public int findPlaceX(int index)
    {
        int i,find=-1,vrat=-1;
        
        try
        {
            for(i=0;i<8;i++)    //prochazime pole sousedu zadaneho nakladu
            {
                if(!globalVar.databCargo[index].neighbours[i]) //neni obsazeno
                {
                    find = i; //zapamatujeme si index pole
                    break; //nemusime hledat dal
                }
            }
        
            if(find!=-1)    //misto jsme nasli
            {
                switch(find)
                {
                    case 0:
                        vrat = globalVar.databCargo[index].posX - 1;
                        break;
                    case 1:
                        vrat = globalVar.databCargo[index].posX;
                        break;
                    case 2:
                        vrat = globalVar.databCargo[index].posX + 1;
                        break;
                    case 3:
                        vrat = globalVar.databCargo[index].posX + 1;
                        break;
                    case 4:
                        vrat = globalVar.databCargo[index].posX + 1;
                        break;
                    case 5:
                        vrat = globalVar.databCargo[index].posX;
                        break;
                    case 6:
                        vrat = globalVar.databCargo[index].posX - 1;
                        break;
                    case 7:
                        vrat = globalVar.databCargo[index].posX - 1;
                        break;
                    default: vrat = -1;
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Jsme mimo pole");
        }
        
        return vrat;
    }
    
    synchronized static public int findPlaceY(int index)
    {
       int i,find=-1,vrat=-1;
        
        try
        {
            for(i=0;i<8;i++)    //prochazime pole sousedu zadaneho nakladu
            {
                if(!globalVar.databCargo[index].neighbours[i]) //neni obsazeno
                {
                    find = i; //zapamatujeme si index pole
                    break; //nemusime hledat dal
                }
            }
        
            if(find!=-1)    //misto jsme nasli
            {
                switch(find)
                {
                    case 0:
                        vrat = globalVar.databCargo[index].posY + 1;
                        break;
                    case 1:
                        vrat = globalVar.databCargo[index].posY + 1;
                        break;
                    case 2:
                        vrat = globalVar.databCargo[index].posY + 1;
                        break;
                    case 3:
                        vrat = globalVar.databCargo[index].posY;
                        break;
                    case 4:
                        vrat = globalVar.databCargo[index].posY - 1;
                        break;
                    case 5:
                        vrat = globalVar.databCargo[index].posY - 1;
                        break;
                    case 6:
                        vrat = globalVar.databCargo[index].posY - 1;
                        break;
                    case 7:
                        vrat = globalVar.databCargo[index].posY;
                        break;
                    default: vrat = -1;
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Jsme mimo pole");
        }
        
        return vrat;
    }
    
}
