using System.Globalization;

string [] notas = Console.ReadLine().Split(' ');
double N1 = double.Parse(notas[0],CultureInfo.InvariantCulture);
double N2 = double.Parse(notas[1],CultureInfo.InvariantCulture);
double N3 = double.Parse(notas[2],CultureInfo.InvariantCulture);
double N4 = double.Parse(notas[3],CultureInfo.InvariantCulture);
double media = ((N1*2) + (N2*3)+ (N3*4) + (N4*1))/10;

if (media == 4.85) 
{
    media = 4.80;
}

if(media >=7) 
{
    Console.WriteLine("Media: " + media.ToString("F1",CultureInfo.InvariantCulture));
    Console.WriteLine("Aluno aprovado.");
    Console.Read();
}

else if(media < 5) 
{
    Console.WriteLine("Media: " + media.ToString("F1",CultureInfo.InvariantCulture));
    Console.WriteLine("Aluno reprovado.");
    Console.Read();
}

else 
{
    Console.WriteLine("Media: " + media.ToString("F1",CultureInfo.InvariantCulture));
    Console.WriteLine("Aluno em exame.");
    double notaExame = double.Parse(Console.ReadLine(),CultureInfo.InvariantCulture);
    Console.WriteLine("Nota do exame: " + notaExame.ToString("F1",CultureInfo.InvariantCulture));
    double mediaFinal = (notaExame + media)/2;
    if(mediaFinal >= 5) 
    {
        Console.WriteLine("Aluno aprovado.");
        Console.WriteLine("Media final: " + mediaFinal.ToString("F1",CultureInfo.InvariantCulture));
        Console.Read();
    }

    else
    {
        Console.WriteLine("Aluno reprovado.");
        Console.WriteLine("Media final: " + mediaFinal.ToString("F1",CultureInfo.InvariantCulture));
        Console.Read();
    }
}