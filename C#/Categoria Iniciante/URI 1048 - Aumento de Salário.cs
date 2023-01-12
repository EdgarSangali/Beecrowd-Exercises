using System.Globalization;

double salario = double.Parse(Console.ReadLine(),CultureInfo.InvariantCulture);
int percentual;
double reajuste;

if (salario > 0.00 && salario <= 400.00)
{
    percentual = 15;
    reajuste = (salario * percentual)/100.00;
    Console.WriteLine("Novo salario: " + (salario + reajuste).ToString("F2",CultureInfo.InvariantCulture));
    Console.WriteLine("Reajuste ganho: " + reajuste.ToString("F2",CultureInfo.InvariantCulture));
    Console.WriteLine("Em percentual: " + percentual + " %");
}

else if (salario > 400.00 && salario <= 800.00)
{
    percentual = 12;
    reajuste = (salario * percentual)/100.00;
    Console.WriteLine("Novo salario: " + (salario + reajuste).ToString("F2",CultureInfo.InvariantCulture));
    Console.WriteLine("Reajuste ganho: " + reajuste.ToString("F2",CultureInfo.InvariantCulture));
    Console.WriteLine("Em percentual: " + percentual + " %");
}

else if (salario > 800.00 && salario <= 1200.00)
{
    percentual = 10;
    reajuste = (salario * percentual)/100.00;
    Console.WriteLine("Novo salario: " + (salario + reajuste).ToString("F2",CultureInfo.InvariantCulture));
    Console.WriteLine("Reajuste ganho: " + reajuste.ToString("F2",CultureInfo.InvariantCulture));
    Console.WriteLine("Em percentual: " + percentual + " %");
}

else if (salario > 1200.00 && salario <= 2000.00)
{
    percentual = 7;
    reajuste = (salario * percentual)/100.00;
    Console.WriteLine("Novo salario: " + (salario + reajuste).ToString("F2",CultureInfo.InvariantCulture));
    Console.WriteLine("Reajuste ganho: " + reajuste.ToString("F2",CultureInfo.InvariantCulture));
    Console.WriteLine("Em percentual: " + percentual + " %");
}

else 
{
    percentual = 4;  
    reajuste = (salario * percentual)/100.00;
    Console.WriteLine("Novo salario: " + (salario + reajuste).ToString("F2",CultureInfo.InvariantCulture));
    Console.WriteLine("Reajuste ganho: " + reajuste.ToString("F2",CultureInfo.InvariantCulture));
    Console.WriteLine("Em percentual: " + percentual + " %");
}


