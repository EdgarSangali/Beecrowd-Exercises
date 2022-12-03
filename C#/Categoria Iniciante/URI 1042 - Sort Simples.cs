string [] valores = Console.ReadLine().Split(' ');
int A = int.Parse(valores[0]);
int B = int.Parse(valores[1]);
int C = int.Parse(valores[2]);

int min1, min2=0, min3=0;
min1 = Math.Min(A,Math.Min(B,C));

if(min1 == A) 
{
    min2 = Math.Min(B,C);
    min3 = Math.Max(B,C);
    Console.WriteLine(min1);
    Console.WriteLine(min2);
    Console.WriteLine(min3);
    Console.WriteLine("");
    Console.WriteLine(A);
    Console.WriteLine(B);
    Console.WriteLine(C);
    Console.Read();
}

if(min1 == B) 
{
    min2 = Math.Min(A,C);
    min3 = Math.Max(A,C);
    Console.WriteLine(min1);
    Console.WriteLine(min2);
    Console.WriteLine(min3);
    Console.WriteLine("");
    Console.WriteLine(A);
    Console.WriteLine(B);
    Console.WriteLine(C);
    Console.Read();
}

if(min1 == C) 
{
    min2 = Math.Min(A,B);
    min3 = Math.Max(A,B);
    Console.WriteLine(min1);
    Console.WriteLine(min2);
    Console.WriteLine(min3);
    Console.WriteLine("");
    Console.WriteLine(A);
    Console.WriteLine(B);
    Console.WriteLine(C);
    Console.Read();
}