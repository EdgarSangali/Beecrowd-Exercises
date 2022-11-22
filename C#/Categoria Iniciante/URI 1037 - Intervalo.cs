using System.Globalization;

double intervalo = double.Parse(Console.ReadLine(),CultureInfo.InvariantCulture);

if (intervalo > 75.00 && intervalo <=100.00) {
    Console.WriteLine("Intervalo (75,100]");
    Console.Read();
}

else if (intervalo > 50.00 && intervalo <=75.00) {
    Console.WriteLine("Intervalo (50,75]");
    Console.Read();
}

else if (intervalo > 25.00 && intervalo <=50.00) {
    Console.WriteLine("Intervalo (25,50]");
    Console.Read();
}

else if (intervalo >= 0.00 && intervalo <=25.00) {
    Console.WriteLine("Intervalo [0,25]");
    Console.Read();
}

else {
  Console.WriteLine("Fora de intervalo");
    Console.Read();  
}