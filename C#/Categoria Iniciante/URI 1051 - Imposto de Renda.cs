using System.Globalization;

double salario = double.Parse(Console.ReadLine(),CultureInfo.InvariantCulture);
double resto = 0, calculo = 0;

if (salario <= 2000.00)
{
    Console.WriteLine("Isento");
}
else 
{
    if (salario > 2000.00 && salario <=3000.00)
    {
        salario += -2000.00;
        calculo = (salario*8.00)/100.00;
    }
    else if (salario > 3000.00 && salario <= 4500.00)
    {
        resto = 1000.00;
        calculo = (resto * 8.00)/100.00;
        salario += -3000.00;
        calculo += (salario*18.00)/100.00;
    }
    else
    {
        resto = 1000.00;
        calculo = (resto * 8.00)/100.00;
        resto = 1500.00;
        calculo += (resto * 18.00)/100.00;
        salario += -4500.00;
        calculo += (salario * 28.00) / 100.00;
    }
    Console.WriteLine("R$ " + calculo.ToString("F2",CultureInfo.InvariantCulture));
} 