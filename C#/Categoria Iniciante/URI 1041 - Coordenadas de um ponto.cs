using System.Globalization;

string [] coordenadas = Console.ReadLine().Split(' ');
double x = double.Parse(coordenadas[0],CultureInfo.InvariantCulture);
double y = double.Parse(coordenadas[1],CultureInfo.InvariantCulture);

if (x == 0 & y==0) 
{
    Console.WriteLine("Origem");
    Console.Read();
}

else if (x != 0 & y==0) 
{
    Console.WriteLine("Eixo X");
    Console.Read();
}

else if (x == 0 & y!=0) 
{
    Console.WriteLine("Eixo Y");
    Console.Read();
}

else if (x > 0 & y > 0) 
{
    Console.WriteLine("Q1");
    Console.Read();
}

else if (x < 0 & y > 0) 
{
    Console.WriteLine("Q2");
    Console.Read();
}

else if (x < 0 & y < 0) 
{
    Console.WriteLine("Q3");
    Console.Read();
}

else 
{
    Console.WriteLine("Q4");
    Console.Read();
}