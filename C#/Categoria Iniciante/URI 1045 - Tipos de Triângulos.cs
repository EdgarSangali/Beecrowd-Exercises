using System.Globalization;

string [] entradas = Console.ReadLine().Split(' ');
float N1 = float.Parse(entradas[0],CultureInfo.InvariantCulture);
float N2 = float.Parse(entradas[1],CultureInfo.InvariantCulture);
float N3 = float.Parse(entradas[2],CultureInfo.InvariantCulture);
double A = 0, B = 0, C = 0;

if (Math.Max(N1 , N2) > N3)
{
    A = Math.Max(N1, N2);
    if ( A > Math.Max(N2 , N3))
    {
        B = Math.Max(N2, N3);
        C = Math.Min(N2, N3);
    }

    else 
    {
        B = Math.Max (N1 , N3);
        C = Math.Min ( N1, N3);
    }
}

else
{
    A = N3;
    B = Math.Max(N1, N2);
    C = Math.Min (N1, N2);
}

if (A >= B + C)
{
    Console.WriteLine("NAO FORMA TRIANGULO");
}

else
{
    if ( Math.Pow (A , 2) == Math.Pow (B, 2) + Math.Pow (C, 2))
    {
        Console.WriteLine("TRIANGULO RETANGULO");
    }

    else if (Math.Pow (A , 2) > Math.Pow (B, 2) + Math.Pow (C, 2))
    {
       Console.WriteLine("TRIANGULO OBTUSANGULO");
    }

    else
    {
        Console.WriteLine("TRIANGULO ACUTANGULO");
    }

    if (A == B && B == C)
    {
        Console.WriteLine("TRIANGULO EQUILATERO");
    }
    else if (A == B || A == C || B == C)
    {
        Console.WriteLine("TRIANGULO ISOSCELES");
    }
}