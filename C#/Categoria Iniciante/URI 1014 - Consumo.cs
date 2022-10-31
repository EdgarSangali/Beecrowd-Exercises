using System.Globalization;

int X = int.Parse(Console.ReadLine());
double Y = double.Parse(Console.ReadLine(),CultureInfo.InvariantCulture);
double consumo = X/Y;

Console.WriteLine(consumo.ToString("F3",CultureInfo.InvariantCulture) + " km/l");
Console.Read();



