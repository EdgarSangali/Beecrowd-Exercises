﻿using System.Globalization;

string [] Produto1 = Console.ReadLine().Split(' ');
int Codigo1 = int.Parse(Produto1[0]);
int Quantidade1 = int.Parse(Produto1[1]);
double Preco1 = double.Parse(Produto1[2], CultureInfo.CreateSpecificCulture("en-US"));

string [] Produto2 = Console.ReadLine().Split(' ');
int Codigo2 = int.Parse(Produto2[0]);
int Quantidade2 = int.Parse(Produto2[1]);
double Preco2 = double.Parse(Produto2[2], CultureInfo.CreateSpecificCulture("en-US"));

double Total = (Quantidade1*Preco1) + (Quantidade2*Preco2);

Console.WriteLine("VALOR A PAGAR: R$ " + Total.ToString("F2",CultureInfo.CreateSpecificCulture("en-US")));
Console.Read();





