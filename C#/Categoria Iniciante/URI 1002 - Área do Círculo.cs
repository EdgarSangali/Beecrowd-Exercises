using System.Globalization;

double pi, raio, raioQuadrado, area;

pi = 3.14159;
raio = double.Parse(Console.ReadLine(),CultureInfo.CreateSpecificCulture("en-US"));
raioQuadrado = Math.Pow(raio,2);
area = raioQuadrado*pi;

Console.WriteLine("A=" + area.ToString("F4", CultureInfo.CreateSpecificCulture("en-US")));
Console.Read();
