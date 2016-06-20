package barbeirodorminhoco;

public class cliente extends Thread 
{
private int id;
public cliente (int id)
{
this.id = id;
}
private void cortarCabelo()
{
System.out.println("Cliente " + this.id + " cortando o cabelo");
}

public void run()
{
System.out.println("Cliente "+ this.id +" chegou a barbearia");
Main.mutex.P();
if ( Main.waiting < Main.MAXCLIENTES )
{
Main.waiting++;
Main.clientes.V();
Main.mutex.V();
Main.barbeiros.P();
cortarCabelo();
}
else
{
System.out.println("Barbearia Cheia! Cliente " + this.id + " indo embora");
Main.mutex.V();
}
}
}