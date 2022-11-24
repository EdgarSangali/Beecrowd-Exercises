using System.Globalization;

string [] lanche = Console.ReadLine().Split(' ');
int codigo = int.Parse(lanche[0]);
int quantidade = int.Parse(lanche[1]);
double total;

if(codigo == 1) {
    total = quantidade * 4.00;
    Console.WriteLine("Total: R$ " + total.ToString("F2",CultureInfo.InvariantCulture));
    Console.Read();
}

else if(codigo == 2) {
     total = quantidade * 4.50;
   Console.WriteLine("Total: R$ " + total.ToString("F2",CultureInfo.InvariantCulture));
    Console.Read();
} 

else if(codigo == 3) {
     total = quantidade * 5.00;
   Console.WriteLine("Total: R$ " + total.ToString("F2",CultureInfo.InvariantCulture));
    Console.Read();
} 

else if(codigo == 4) {
     total = quantidade * 2.00;
   Console.WriteLine("Total: R$ " + total.ToString("F2",CultureInfo.InvariantCulture));
    Console.Read();
} 

else {
     total = quantidade * 1.50;
   Console.WriteLine("Total: R$ " + total.ToString("F2",CultureInfo.InvariantCulture));
    Console.Read();
}