package barbeirodorminhoco;

public class semaforo 
{
private int value;
public semaforo(int v) 
{
value=v;
}
public synchronized void P()
{
while(value<=0)
{
try
{
wait();
}
catch (Exception e)
{
}
}
value--;
}
public synchronized void V()
{
++value;
notify(); //acorda proccesso
}

}
