
package Workers;

public class WorkerMedium extends Worker implements Runnable
{
    Thread v;
    
    public WorkerMedium() 
    {
        super();
        v = new Thread(this,"WorkerBasic");
        v.setPriority(6);
        v.start();
    }
    
    public WorkerMedium(int pocX, int pocY, int col) 
    {
        super(pocX,pocY,col);
        v = new Thread(this,"WorkerBasic");
        v.setPriority(6);
        v.start();
    }
    
    public void run()   //chovani vlakna - chovani delnika
    {
        int index,x,y,i;
             
      while(true)
      {
        index = this.nearestCargo(globalVar.CERNA);    //najdeme nejblizsi naklad cerny (nepouzity naklad)
        
        if(index!=-1)    //je nejaky cerny naklad
        {
            x = globalVar.databCargo[index].posX; //mame jeho souradnice
            y = globalVar.databCargo[index].posY;
        
        
            this.move(x,y); //presuneme se na souradnice nakladu
        
        
            this.loadCargo();   //nalozime naklad
            
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException v)
            {
                System.out.println("Vyjimka: Delnik prerusen");
            }
        
            index = this.farestCargo(this.color);    //najdeme nejvzdalenejsi skupinu nakladu nasi barvy
        
            if(index!=-1)    //nasli jsme
            {
                x = this.findPlaceX(index); //mame souradnice nejblizsiho volneho souseda
                y = this.findPlaceY(index);
  
        
                if(x!=-1)    //nasli jsme nejakeho souseda volneho
                {
                    this.move(x,y); //presuneme se na souseda
                    this.unloadCargo(); //slozime naklad
                }
            }
         
        }
        try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException v)
            {
                System.out.println("Vyjimka: Prekreslovaci vlakno preruseno");
            }
      }   
        
        
        
    }
}
