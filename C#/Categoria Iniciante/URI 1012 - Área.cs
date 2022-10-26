using System.Globalization;

string [] Dimensoes = Console.ReadLine().Split(' ');
double A = double.Parse(Dimensoes[0],CultureInfo.CreateSpecificCulture("en-US"));
double B = double.Parse(Dimensoes[1],CultureInfo.CreateSpecificCulture("en-US"));
double C = double.Parse(Dimensoes[2],CultureInfo.CreateSpecificCulture("en-US"));
double pi = 3.14159;
double Triangulo = (A*C)/2;
double Circulo = Math.Pow(C,2) * pi;
double Trapezio = ((A+B)*C)/2;
double Quadrado = Math.Pow(B,2);
double Retangulo = A * B;

Console.WriteLine("TRIANGULO: " + Triangulo.ToString("F3", CultureInfo.CreateSpecificCulture("en-US")));
Console.Read();
Console.WriteLine("CIRCULO: " + Circulo.ToString("F3", CultureInfo.CreateSpecificCulture("en-US")));
Console.Read();
Console.WriteLine("TRAPEZIO: " + Trapezio.ToString("F3", CultureInfo.CreateSpecificCulture("en-US")));
Console.Read();
Console.WriteLine("QUADRADO: " + Quadrado.ToString("F3", CultureInfo.CreateSpecificCulture("en-US")));
Console.Read();
Console.WriteLine("RETANGULO: " + Retangulo.ToString("F3", CultureInfo.CreateSpecificCulture("en-US")));
Console.Read();

