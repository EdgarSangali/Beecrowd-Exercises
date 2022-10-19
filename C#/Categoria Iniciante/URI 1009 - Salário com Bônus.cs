using System.Globalization;

string nome = Console.ReadLine();
double salario = double.Parse(Console.ReadLine(),CultureInfo.CreateSpecificCulture("en-US"));
double vendas = double.Parse(Console.ReadLine(),CultureInfo.CreateSpecificCulture("en-US"));

double salarioLiquido = salario+(vendas*0.15);

Console.WriteLine("TOTAL = R$ " + salarioLiquido.ToString("F2",CultureInfo.CreateSpecificCulture("en-US")));
Console.Read();