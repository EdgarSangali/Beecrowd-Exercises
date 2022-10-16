using System.Globalization;

double A, B, C, Media;

A = double.Parse(Console.ReadLine(),CultureInfo.CreateSpecificCulture("en-US"));
B = double.Parse(Console.ReadLine(),CultureInfo.CreateSpecificCulture("en-US"));
C = double.Parse(Console.ReadLine(),CultureInfo.CreateSpecificCulture("en-US"));

Media = ((A*2) + (B*3) + (C*5))/10;

Console.WriteLine("MEDIA = " + Media.ToString("F1",CultureInfo.CreateSpecificCulture("en-US")));
Console.Read();