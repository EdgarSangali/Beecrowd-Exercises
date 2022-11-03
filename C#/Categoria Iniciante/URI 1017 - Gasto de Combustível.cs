using System.Globalization;

double rendimento = 12;
double tempo = double.Parse(Console.ReadLine());
double velocidade = double.Parse(Console.ReadLine());
double consumoCombustível = (tempo*velocidade)/rendimento;

Console.WriteLine(consumoCombustível.ToString("F3",CultureInfo.InvariantCulture));
Console.Read();