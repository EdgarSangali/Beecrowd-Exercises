using System.Globalization;


double A, B, MEDIA;

A = double.Parse(Console.ReadLine(),CultureInfo.CreateSpecificCulture("en-US"));
B = double.Parse(Console.ReadLine(),CultureInfo.CreateSpecificCulture("en-US"));

MEDIA = ((A*3.5) + (B*7.5))/11;

Console.WriteLine("MEDIA = " + MEDIA.ToString("F5",CultureInfo.CreateSpecificCulture("en-US")));
Console.Read();