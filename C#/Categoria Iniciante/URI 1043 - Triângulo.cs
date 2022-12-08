using System.Globalization;

string [] dimensoes = Console.ReadLine().Split(' ');
double A = double.Parse(dimensoes[0],CultureInfo.InvariantCulture);
double B = double.Parse(dimensoes[1],CultureInfo.InvariantCulture);
double C = double.Parse(dimensoes[2],CultureInfo.InvariantCulture);
double perimetro = A + B + C;
double area = ((A + B)* C) / 2;

if((A < B + C) && ( B < A + C) && (C < A + B))
{
    Console.WriteLine("Perimetro = " + perimetro.ToString("F1",CultureInfo.InvariantCulture));
    Console.Read();
}

else
{
    Console.WriteLine("Area = " + area.ToString("F1",CultureInfo.InvariantCulture));
    Console.Read();
}

