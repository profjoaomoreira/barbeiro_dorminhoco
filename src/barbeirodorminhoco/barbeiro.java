package barbeirodorminhoco;

public class barbeiro extends Thread 
{
private int id;
public barbeiro(int id)
{
this.id = id;
}
private void cortarCabelo()
{
System.out.println("Barbeiro cortando o cabelo");
try
{
sleep((int)(Math.random() * 1000));
}
catch(Exception e)
{
}
System.out.println("Barbeiro terminando");
}
public void run()
{
System.out.println(" Barbeiro chegou a barbearia");
while (true)
{
Main.clientes.P();
Main.mutex.P();
Main.waiting=Main.waiting+1;
Main.barbeiros.V();
Main.mutex.V();
cortarCabelo();
}
}
}