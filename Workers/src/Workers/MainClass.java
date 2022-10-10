/*
 * Main.java
 *
 * Created on 23. prosinec 2007, 14:33
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Workers;

/**
 *
 * @author zrzavp2
 */
public class MainClass {
    
    public static void initCargo()
    {
         int i, j, k, ranPosX, ranPosY;
         boolean nb0, nb1, nb2, nb3, nb4, nb5, nb6, nb7, posObs = false;

        
        for(i=0;i<(globalVar.SIZE);i++) //inicizalizace nakladu
        {
            globalVar.databCargo[i] = new Cargo();
            do{
                ranPosX = (int) (Math.random()*(globalVar.MAXX-1));
                ranPosY = (int) (Math.random()*(globalVar.MAXY-1));
                
                for (j=0;j<i;j++)  //kontrola zda je pozice jiz obsazena
                {
                    if ((globalVar.databCargo[j].posX == ranPosX)&&(globalVar.databCargo[j].posY == ranPosY)){ 
                        posObs = true;
                        break;
                    }
                    else posObs = false;
                }
            }while(posObs);
            globalVar.databCargo[i].posX   = ranPosX;
            globalVar.databCargo[i].posY   = ranPosY;
            globalVar.databCargo[i].weight = (int) (Math.random()*globalVar.MAXWEIGHT);
        }
        
        for(i=0;i<(globalVar.SIZE);i++) //inicializace sousedu nakladu
        {
            nb0=false; nb1=false; nb2=false; nb3=false; nb4=false; nb5=false; nb6=false; nb7=false;
            
            for (j=0;j<(globalVar.SIZE-1);j++)  //zjisteni zda je na pozici souseda naklad
            {
                if ((globalVar.databCargo[j].posX == globalVar.databCargo[i].posX-1)
                        &&(globalVar.databCargo[j].posY == globalVar.databCargo[i].posY+1)) nb0 = true;
                if ((globalVar.databCargo[j].posX == globalVar.databCargo[i].posX)
                        &&(globalVar.databCargo[j].posY == globalVar.databCargo[i].posY+1)) nb1 = true;
                if ((globalVar.databCargo[j].posX == globalVar.databCargo[i].posX+1)
                        &&(globalVar.databCargo[j].posY == globalVar.databCargo[i].posY+1)) nb2 = true;
                if ((globalVar.databCargo[j].posX == globalVar.databCargo[i].posX+1)
                        &&(globalVar.databCargo[j].posY == globalVar.databCargo[i].posY)) nb3 = true;
                if ((globalVar.databCargo[j].posX == globalVar.databCargo[i].posX+1)
                        &&(globalVar.databCargo[j].posY == globalVar.databCargo[i].posY-1)) nb4 = true;
                if ((globalVar.databCargo[j].posX == globalVar.databCargo[i].posX)
                        &&(globalVar.databCargo[j].posY == globalVar.databCargo[i].posY-1)) nb5 = true;
                if ((globalVar.databCargo[j].posX == globalVar.databCargo[i].posX-1)
                        &&(globalVar.databCargo[j].posY == globalVar.databCargo[i].posY-1)) nb6 = true;
                if ((globalVar.databCargo[j].posX == globalVar.databCargo[i].posX-1)
                        &&(globalVar.databCargo[j].posY == globalVar.databCargo[i].posY)) nb7 = true;
            }
            
            globalVar.databCargo[i].neighbours[0] = nb0;
            globalVar.databCargo[i].neighbours[1] = nb1;
            globalVar.databCargo[i].neighbours[2] = nb2;
            globalVar.databCargo[i].neighbours[3] = nb3;
            globalVar.databCargo[i].neighbours[4] = nb4;
            globalVar.databCargo[i].neighbours[5] = nb5;
            globalVar.databCargo[i].neighbours[6] = nb6;
            globalVar.databCargo[i].neighbours[7] = nb7;
        }
    }
    
     //metoda zaridi aby naklady na krajich meli sousedy pres mrizku obsazene
    public static void orez()
    {
        int i,index;
        
        for(i=0;i<globalVar.MAXX;i++)  //jedeme po hornim okraji
        {
            index = Worker.getIndexCargo(i,0); //zkusime ziskat index nakladu na pozici
            if(index!=-1)   //naklad tam je
            {
                globalVar.databCargo[index].neighbours[6] = true; //horni sousede jso obsazeny (je tam zed mrizky)
                globalVar.databCargo[index].neighbours[5] = true;
                globalVar.databCargo[index].neighbours[4] = true;
            }
        }
        
        for(i=0;i<globalVar.MAXY;i++)  //jedeme po pravym okraji
        {
            index = Worker.getIndexCargo(globalVar.MAXX-1,i); //zkusime ziskat index nakladu na pozici
            if(index!=-1)   //naklad tam je
            {
                globalVar.databCargo[index].neighbours[4] = true; //pravy sousede jsou obsazeny (je tam zed mrizky)
                globalVar.databCargo[index].neighbours[3] = true;
                globalVar.databCargo[index].neighbours[2] = true;
            }
        }
        
        for(i=0;i<globalVar.MAXY;i++)  //jedeme po levym okraji
        {
            index = Worker.getIndexCargo(0,i); //zkusime ziskat index nakladu na pozici
            if(index!=-1)   //naklad tam je
            {
                globalVar.databCargo[index].neighbours[6] = true; //levy sousede jsou obsazeny (je tam zed mrizky)
                globalVar.databCargo[index].neighbours[7] = true;
                globalVar.databCargo[index].neighbours[0] = true;
            }
        }
        
        for(i=0;i<globalVar.MAXX;i++)  //jedeme po dolnim okraji
        {
            index = Worker.getIndexCargo(i,globalVar.MAXY-1); //zkusime ziskat index nakladu na pozici
            if(index!=-1)   //naklad tam je
            {
                globalVar.databCargo[index].neighbours[0] = true;//dolni soused je obsazeny (je tam zed mrizky)
                globalVar.databCargo[index].neighbours[1] = true;
                globalVar.databCargo[index].neighbours[2] = true;
            }
        }
    }
    
    public static void main(String[] args) 
    {
        
        initCargo();
        orez();
        HelocopEngineFactoryII helocop = new HelocopEngineFactoryII();
        helocop.setVisible(true);
        Thread.currentThread().setPriority(10);
        
        globalVar.databCargo[0].color = globalVar.ZELENA;
        globalVar.databCargo[1].color = globalVar.CERVENA;
        globalVar.databCargo[2].color = globalVar.MODRA;
        
        while(true)
        {
            try
            {
                helocop.prekresli();
                Thread.sleep(50);
            }
            catch(InterruptedException v)
            {
                System.out.println("Vyjimka: Prekreslovaci vlakno preruseno");
            }
        }
        
    }
    
}