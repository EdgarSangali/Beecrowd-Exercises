string [] entradas = Console.ReadLine().Split(' ');
int hi = int.Parse(entradas[0]);
int mi = int.Parse(entradas[1]);
int hf = int.Parse(entradas[2]);
int mf = int.Parse(entradas[3]);
int instanteInicial = (hi*60) + mi;
int instanteFinal = (hf*60) + mf;
int duracao;

if (instanteInicial < instanteFinal)
{
    duracao = instanteFinal - instanteInicial;
}

else
{
    duracao = (24*60 - instanteInicial) + instanteFinal;
}

int duracaoHoras = duracao/60;
int duracaoMinutos = duracao % 60;

Console.WriteLine("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");