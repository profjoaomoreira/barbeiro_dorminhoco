/*http://www.ic.unicamp.br/~islene/mc514/barbeiro/barbeiro.pdf
http://www.inf.ufsc.br/~bosco/ensino/ine5645/Lab3.pdf
*/

package barbeirodorminhoco;

public class Main 
{

static final int MAXCLIENTES = 5;
static semaforo clientes = new semaforo(0);
static semaforo barbeiros = new semaforo(0);
static semaforo mutex = new semaforo(1);
static int waiting = 0,cont;
static cliente cli[]=new cliente [10];

public Main() 
{
}

public static void main(String[] args) 
{

barbeiro b1 = new barbeiro(1);
b1.start();
for(cont=0;cont<10;cont++)
cli[cont]=new cliente(cont);

for(cont=0;cont<10;cont++)
cli[cont].start();
}

}
