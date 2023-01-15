string tipo = Console.ReadLine();
string especie = Console.ReadLine();
string alimentacao = Console.ReadLine();

if (tipo == "vertebrado")
{
    if(especie == "ave") 
    {
        if(alimentacao == "carnivoro")
        {
            Console.WriteLine("aguia");
        }
        else if(alimentacao == "onivoro")
        {
            Console.WriteLine("pomba");
        }
    }
    else if (especie == "mamifero")
    {
        if (alimentacao == "onivoro")
        {
            Console.WriteLine("homem");
        }
        else if (alimentacao == "herbivoro")
        {
            Console.WriteLine("vaca");
        }
    }
}
    else if (tipo == "invertebrado")
    {
        if (especie == "inseto")
        {
            if(alimentacao == "hematofago")
            {
                Console.WriteLine("pulga");
            }
            else if (alimentacao == "herbivoro")
            {
                Console.WriteLine("lagarta");
            }
        }
        else if( especie == "anelideo")
        {
            if(alimentacao == "hematofago")
            {
                Console.WriteLine("sanguessuga");
            }
            else if(alimentacao == "onivoro")
            {
                Console.WriteLine("minhoca");
            }
        }
    }
