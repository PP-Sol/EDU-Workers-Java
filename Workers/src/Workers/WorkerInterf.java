package Workers;

public interface WorkerInterf 
{
    public void move(int x, int y);
    public boolean isCargo(int x, int y);
    public void loadCargo();
    public void unloadCargo();
}
